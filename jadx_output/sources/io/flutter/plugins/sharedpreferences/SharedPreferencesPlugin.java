package io.flutter.plugins.sharedpreferences;

/* loaded from: classes8.dex */
public class SharedPreferencesPlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi {
    private static final java.lang.String BIG_INTEGER_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy";
    private static final java.lang.String DOUBLE_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";
    private static final java.lang.String LIST_IDENTIFIER = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
    private static final java.lang.String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
    private static final java.lang.String TAG = "SharedPreferencesPlugin";
    private io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder listEncoder;
    private android.content.SharedPreferences preferences;

    /* loaded from: classes4.dex */
    public static class ListEncoder implements io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder {
        @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
        public java.util.List<java.lang.String> decode(java.lang.String str) {
            try {
                return (java.util.List) new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(android.util.Base64.decode(str, 0))).readObject();
            } catch (java.io.IOException | java.lang.ClassNotFoundException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }

        @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
        public java.lang.String encode(java.util.List<java.lang.String> list) {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
    }

    public SharedPreferencesPlugin() {
        this(new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.ListEncoder());
    }

    private java.util.Map<java.lang.String, java.lang.Object> getAllPrefs(java.lang.String str, java.util.Set<java.lang.String> set) {
        java.util.Map<java.lang.String, ?> all = this.preferences.getAll();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str2 : all.keySet()) {
            if (str2.startsWith(str) && (set == null || set.contains(str2))) {
                hashMap.put(str2, transformPref(str2, all.get(str2)));
            }
        }
        return hashMap;
    }

    private void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, android.content.Context context) {
        this.preferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        try {
            io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.setup(binaryMessenger, this);
        } catch (java.lang.Exception unused) {
        }
    }

    private java.lang.Object transformPref(java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            java.lang.String str2 = (java.lang.String) obj;
            if (str2.startsWith(LIST_IDENTIFIER)) {
                return this.listEncoder.decode(str2.substring(40));
            }
            if (str2.startsWith(BIG_INTEGER_PREFIX)) {
                return new java.math.BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith(DOUBLE_PREFIX)) {
                return java.lang.Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof java.util.Set) {
            java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Set) obj);
            this.preferences.edit().remove(str).putString(str, LIST_IDENTIFIER + this.listEncoder.encode(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    public java.lang.Boolean clear(java.lang.String str, java.util.List<java.lang.String> list) {
        android.content.SharedPreferences.Editor edit = this.preferences.edit();
        java.util.Map<java.lang.String, ?> all = this.preferences.getAll();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((java.lang.String) it.next());
        }
        return java.lang.Boolean.valueOf(edit.commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    public java.util.Map<java.lang.String, java.lang.Object> getAll(java.lang.String str, java.util.List<java.lang.String> list) {
        return getAllPrefs(str, list == null ? null : new java.util.HashSet(list));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.setup(flutterPluginBinding.getBinaryMessenger(), null);
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    public java.lang.Boolean remove(java.lang.String str) {
        return java.lang.Boolean.valueOf(this.preferences.edit().remove(str).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    public java.lang.Boolean setBool(java.lang.String str, java.lang.Boolean bool) {
        return java.lang.Boolean.valueOf(this.preferences.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    public java.lang.Boolean setDouble(java.lang.String str, java.lang.Double d17) {
        java.lang.String d18 = java.lang.Double.toString(d17.doubleValue());
        return java.lang.Boolean.valueOf(this.preferences.edit().putString(str, DOUBLE_PREFIX + d18).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    public java.lang.Boolean setInt(java.lang.String str, java.lang.Long l17) {
        return java.lang.Boolean.valueOf(this.preferences.edit().putLong(str, l17.longValue()).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    public java.lang.Boolean setString(java.lang.String str, java.lang.String str2) {
        if (str2.startsWith(LIST_IDENTIFIER) || str2.startsWith(BIG_INTEGER_PREFIX) || str2.startsWith(DOUBLE_PREFIX)) {
            throw new java.lang.RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return java.lang.Boolean.valueOf(this.preferences.edit().putString(str, str2).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    public java.lang.Boolean setStringList(java.lang.String str, java.util.List<java.lang.String> list) {
        return java.lang.Boolean.valueOf(this.preferences.edit().putString(str, LIST_IDENTIFIER + this.listEncoder.encode(list)).commit());
    }

    public SharedPreferencesPlugin(io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder sharedPreferencesListEncoder) {
        this.listEncoder = sharedPreferencesListEncoder;
    }
}
