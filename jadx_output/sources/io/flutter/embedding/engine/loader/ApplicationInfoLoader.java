package io.flutter.embedding.engine.loader;

/* loaded from: classes13.dex */
public final class ApplicationInfoLoader {
    public static final java.lang.String NETWORK_POLICY_METADATA_KEY = "io.flutter.network-policy";
    public static final java.lang.String PUBLIC_AUTOMATICALLY_REGISTER_PLUGINS_METADATA_KEY = "io.flutter.automatically-register-plugins";
    public static final java.lang.String PUBLIC_AOT_SHARED_LIBRARY_NAME = io.flutter.embedding.engine.loader.FlutterLoader.class.getName().concat(".aot-shared-library-name");
    public static final java.lang.String PUBLIC_VM_SNAPSHOT_DATA_KEY = io.flutter.embedding.engine.loader.FlutterLoader.class.getName().concat(".vm-snapshot-data");
    public static final java.lang.String PUBLIC_ISOLATE_SNAPSHOT_DATA_KEY = io.flutter.embedding.engine.loader.FlutterLoader.class.getName().concat(".isolate-snapshot-data");
    public static final java.lang.String PUBLIC_FLUTTER_ASSETS_DIR_KEY = io.flutter.embedding.engine.loader.FlutterLoader.class.getName().concat(".flutter-assets-dir");
    public static java.lang.String customAotSharedLibraryPath = null;

    private static android.content.pm.ApplicationInfo getApplicationInfo(android.content.Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    private static boolean getBoolean(android.os.Bundle bundle, java.lang.String str, boolean z17) {
        return bundle == null ? z17 : bundle.getBoolean(str, z17);
    }

    private static java.lang.String getNetworkPolicy(android.content.pm.ApplicationInfo applicationInfo, android.content.Context context) {
        int i17;
        android.os.Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i17 = bundle.getInt(NETWORK_POLICY_METADATA_KEY, 0)) <= 0) {
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(i17);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    if (xml.getName().equals("domain-config")) {
                        parseDomainConfig(xml, jSONArray, false);
                    }
                }
            }
            return jSONArray.toString();
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
            return null;
        }
    }

    private static java.lang.String getString(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, null);
    }

    public static io.flutter.embedding.engine.loader.FlutterApplicationInfo load(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = getApplicationInfo(context);
        java.lang.String str = customAotSharedLibraryPath;
        if (str == null) {
            str = getString(applicationInfo.metaData, PUBLIC_AOT_SHARED_LIBRARY_NAME);
        }
        return new io.flutter.embedding.engine.loader.FlutterApplicationInfo(str, getString(applicationInfo.metaData, PUBLIC_VM_SNAPSHOT_DATA_KEY), getString(applicationInfo.metaData, PUBLIC_ISOLATE_SNAPSHOT_DATA_KEY), getString(applicationInfo.metaData, PUBLIC_FLUTTER_ASSETS_DIR_KEY), getNetworkPolicy(applicationInfo, context), applicationInfo.nativeLibraryDir, getBoolean(applicationInfo.metaData, PUBLIC_AUTOMATICALLY_REGISTER_PLUGINS_METADATA_KEY, true));
    }

    private static void parseDomain(android.content.res.XmlResourceParser xmlResourceParser, org.json.JSONArray jSONArray, boolean z17) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 4) {
            throw new java.lang.IllegalStateException("Expected text");
        }
        java.lang.String trim = xmlResourceParser.getText().trim();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONArray2.put(trim);
        jSONArray2.put(attributeBooleanValue);
        jSONArray2.put(z17);
        jSONArray.put(jSONArray2);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 3) {
            throw new java.lang.IllegalStateException("Expected end of domain tag");
        }
    }

    private static void parseDomainConfig(android.content.res.XmlResourceParser xmlResourceParser, org.json.JSONArray jSONArray, boolean z17) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z17);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    parseDomain(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    parseDomainConfig(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    skipTag(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    private static void skipTag(android.content.res.XmlResourceParser xmlResourceParser) {
        java.lang.String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlResourceParser.getName() == name) {
                return;
            } else {
                eventType = xmlResourceParser.next();
            }
        }
    }
}
