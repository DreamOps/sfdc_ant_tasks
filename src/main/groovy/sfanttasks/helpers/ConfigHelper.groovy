package sfanttasks.helpers

import groovy.json.JsonSlurperClassic

class ConfigHelper {

	static def getCleanupConfig(def cleanupConfigFile) {
		(cleanupConfigFile) ? new JsonSlurperClassic().parse(new File(cleanupConfigFile))
			: defaultCleanupConfig
	}

	static def getPackageConfig(def packageConfigFile) {
		(packageConfigFile) ? new JsonSlurperClassic().parse(new File(packageConfigFile))
			: defaultPackageConfig
	}

	static def getNegativeConfig(def negativeConfigFile) {
		(negativeConfigFile) ? new JsonSlurperClassic().parse(new File(negativeConfigFile))
			: defaultNegativeConfig
	}

	private static final def defaultCleanupConfig = [
		'object': [
			'fields': [
				'field': 'fullName',
				'matches': '^.+__.+__.{1,3}$'
			],
			'validationRules': [
				'field': 'fullName',
				'matches': '^.+__.+__.{1,3}$'
			],
			'webLinks': [
				'field': 'fullName',
				'matches': '^.+__.+__.{1,3}$'
			],
			'listViews': [
				'field': 'fullName',
				'matches': '^.*$'
			]
		],
		'profile': [
			'applicationVisibilities': [
				'field': 'application',
				'matches': '^.+__.+__.{1,3}$'
			],
			'fieldPermissions': [
				'field': 'field',
				'matches': '^(.+__.+__.{1,3}\\..+|.+\\..+__.+__.{1,3})$'
			],
			'objectPermissions': [
				'field': 'object',
				'matches': '^.+__.+__.{1,3}$'
			],
			'recordTypeVisibilities': [
				'field': 'recordType',
				'matches': '^(.+__.+__.{1,3}\\..+|.+\\..+__.+__.{1,3})$'
			],
			'tabVisibilities': [
				'tab': 'fullName',
				'matches': '^.+__.+__.{1,3}$'
			]
		],
		'permissionset': [
			'applicationVisibilities': [
				'field': 'application',
				'matches': '^.+__.+__.{1,3}$'
			],
			'fieldPermissions': [
				'field': 'field',
				'matches': '^(.+__.+__.{1,3}\\..+|.+\\..+__.+__.{1,3})$'
			],
			'objectPermissions': [
				'field': 'object',
				'matches': '^.+__.+__.{1,3}$'
			],
			'recordTypeVisibilities': [
				'field': 'recordType',
				'matches': '^(.+__.+__.{1,3}\\..+|.+\\..+__.+__.{1,3})$'
			],
			'tabVisibilities': [
				'tab': 'fullName',
				'matches': '^.+__.+__.{1,3}$'
			]
		]
	]

	private static final def defaultPackageConfig = [
		'version': '37.0',
		'dirs': [
			'applications': [
				'xmlTag': 'CustomApplication',
				'acceptsAsterisk': true
			],
			'appMenus': [
				'xmlTag': 'AppMenu',
				'acceptsAsterisk': true
			],
			'approvalProcesses': [
				'xmlTag': 'ApprovalProcess',
				'acceptsAsterisk': true
			],
			'assignmentRules': [
				'xmlTag': 'AssignmentRules',
				'acceptsAsterisk': true
			],
			'aura': [
				'xmlTag': 'AuraDefinitionBundle',
				'acceptsAsterisk': true
			],
			'autoResponseRules': [
				'xmlTag': 'AutoResponseRules',
				'acceptsAsterisk': true
			],
			'cachePartitions': [
				'xmlTag': 'PlatformCachePartitions',
				'acceptsAsterisk': true
			],
			'classes': [
				'xmlTag': 'ApexClass',
				'acceptsAsterisk': true
			],
			'communities': [
				'xmlTag': 'Community',
				'acceptsAsterisk': true
			],
			'components': [
				'xmlTag': 'ApexComponent',
				'acceptsAsterisk': true
			],
			'corsWhitelistOrigins': [
				'xmlTag': 'CorsWhitelistOrigin',
				'acceptsAsterisk': true
			],
			'customApplicationComponents': [
				'xmlTag': 'CustomApplicationComponent',
				'acceptsAsterisk': true
			],
			'customPermissions': [
				'xmlTag': 'CustomPermission',
				'acceptsAsterisk': true
			],
			'dashboards': [
				'xmlTag': 'Dashboard',
				'acceptsAsterisk': false,
				'extension': '.dashboard'
			],
			'datacategorygroups': [
				'xmlTag': 'DataCategoryGroup',
				'acceptsAsterisk': true
			],
			'delegateGroups': [
				'xmlTag': 'DelegateGroup',
				'acceptsAsterisk': true
			],
			'documents': [
				'xmlTag': 'Document',
				'acceptsAsterisk': false,
				'excludeExtension': '-meta.xml'
			],
			'email': [
				'xmlTag': 'EmailTemplate',
				'acceptsAsterisk': false,
				'extension': '.email'
			],
			'flows': [
				'xmlTag': 'Flow',
				'acceptsAsterisk': true
			],
			'groups': [
				'xmlTag': 'Group',
				'acceptsAsterisk': true
			],
			'homePageComponents': [
				'xmlTag': 'HomePageComponent',
				'acceptsAsterisk': true
			],
			'homePageLayouts': [
				'xmlTag': 'HomePageLayout',
				'acceptsAsterisk': true
			],
			'moderation': [
				'xmlTag': 'KeywordList',
				'acceptsAsterisk': true
			],
			'labels': [
				'xmlTag': 'CustomLabels',
				'acceptsAsterisk': true
			],
			'layouts': [
				'xmlTag': 'Layout',
				'acceptsAsterisk': false,
				'extension': '.layout'
			],
			'letterhead': [
				'xmlTag': 'Letterhead',
				'acceptsAsterisk': false,
				'extension': '.letter'
			],
			'matchingRules': [
				'xmlTag': 'MatchingRule',
				'acceptsAsterisk': true
			],
			'milestoneTypes': [
				'xmlTag': 'MilestoneType',
				'acceptsAsterisk': true
			],
			'pathAssistants': [
				'xmlTag': 'PathAssistant',
				'acceptsAsterisk': true
			],
			'milestoneTypes': [
				'xmlTag': 'MilestoneType',
				'acceptsAsterisk': true
			],
			'objects': [
				'xmlTag': 'CustomObject',
				'acceptsAsterisk': false,
				'extension': '.object'
			],
			'objectTranslations': [
				'xmlTag': 'CustomObjectTranslation',
				'acceptsAsterisk': true
			],
			'pages': [
				'xmlTag': 'ApexPage',
				'acceptsAsterisk': true
			],
			'permissionsets': [
				'xmlTag': 'PermissionSet',
				'acceptsAsterisk': true
			],
			'portals': [
				'xmlTag': 'Portal',
				'acceptsAsterisk': true
			],
			'postTemplates': [
				'xmlTag': 'PostTemplate',
				'acceptsAsterisk': true
			],
			'profiles': [
				'xmlTag': 'Profile',
				'acceptsAsterisk': false,
				'extension': '.profile'
			],
			'queues': [
				'xmlTag': 'Queue',
				'acceptsAsterisk': true
			],
			'quickActions': [
				'xmlTag': 'QuickAction',
				'acceptsAsterisk': true
			],
			'reports': [
				'xmlTag': 'Report',
				'acceptsAsterisk': false,
				'extension': '.report'
			],
			'reportTypes': [
				'xmlTag': 'ReportType',
				'acceptsAsterisk': true
			],
			'roles': [
				'xmlTag': 'Role',
				'acceptsAsterisk': true
			],
			'settings': [
				'xmlTag': 'Settings',
				'acceptsAsterisk': true
			],
			'sharingRules': [
				'xmlTag': 'SharingRules',
				'acceptsAsterisk': true
			],
			'staticresources': [
				'xmlTag': 'StaticResource',
				'acceptsAsterisk': true
			],
			'synonymDictionaries': [
				'xmlTag': 'StaticDictionary',
				'acceptsAsterisk': true
			],
			'tabs': [
				'xmlTag': 'CustomTab',
				'acceptsAsterisk': true
			],
			'translations': [
				'xmlTag': 'Translations',
				'acceptsAsterisk': true
			],
			'triggers': [
				'xmlTag': 'ApexTrigger',
				'acceptsAsterisk': true
			],
			'weblinks': [
				'xmlTag': 'CustomPageWebLink',
				'acceptsAsterisk': true
			],
			'workflows': [
				'xmlTag': 'Workflow',
				'acceptsAsterisk': false,
				'extension': '.workflow'
			]
		]
	]

	private static final def defaultNegativeConfig = [
		'applicationVisibilities': [
			'id': 'application',
			'negativeNodeTemplate': '''
	<applicationVisibilities>
		<application></application>
		<default>false</default>
		<visible>false</visible>
	</applicationVisibilities>
'''
		],
		'classAccesses': [
			'id': 'apexClass',
			'negativeNodeTemplate': '''
	<classAccesses>
		<apexClass></apexClass>
		<enabled>false</enabled>
	</classAccesses>
'''
		],
		'customPermissions': [
			'id': 'name',
			'negativeNodeTemplate': '''
	<customPermissions>
		<enabled>false</enabled>
		<name></name>
	</customPermissions>
'''
		],
		'externalDataSourceAccesses': [
			'id': 'externalDataSource',
			'negativeNodeTemplate': '''
	<externalDataSourceAccesses>
		<enabled>false</enabled>
		<externalDataSource></externalDataSource>
	</externalDataSourceAccesses>
'''
		],
		'fieldPermissions': [
			'id': 'field',
			'negativeNodeTemplate': '''
	<fieldPermissions>
		<editable>false</editable>
		<field></field>
		<readable>false</readable>
	</fieldPermissions>
'''
		],
		'objectPermissions': [
			'id': 'object',
			'negativeNodeTemplate': '''
	<objectPermissions>
		<allowCreate>false</allowCreate>
		<allowDelete>false</allowDelete>
		<allowEdit>false</allowEdit>
		<allowRead>false</allowRead>
		<modifyAllRecords>false</modifyAllRecords>
		<object></object>
		<viewAllRecords>false</viewAllRecords>
	</objectPermissions>
'''
		],
		'pageAccesses': [
			'id': 'apexPage',
			'negativeNodeTemplate': '''
	<pageAccesses>
		<apexPage></apexPage>
		<enabled>false</enabled>
	</pageAccesses>
'''
		],
		'recordTypeVisibilities': [
			'id': 'recordType',
			'negativeNodeTemplate': '''
	<recordTypeVisibilities>
		<default>false</default>
		<recordType></recordType>
		<visible>false</visible>
	</recordTypeVisibilities>
'''
		],
		'tabVisibilities': [
			'id': 'tab',
			'negativeNodeTemplate': '''
	<tabVisibilities>
		<tab></tab>
		<visibility>DefaultOff</visibility>
	</tabVisibilities>
'''
		],
		'userPermissions': [
			'id': 'name',
			'negativeNodeTemplate': '''
	<userPermissions>
		<enabled>false</enabled>
		<name></name>
	</userPermissions>
'''
		]
	]
}