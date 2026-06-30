package u46;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f424659a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f424660b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f424661c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f424662d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f424663e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f424664f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f424665g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f424666h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f424667i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f424668j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f424669k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ java.lang.Class f424670l;

    static {
        java.lang.String.valueOf('.');
        java.lang.String.valueOf('$');
        java.util.HashMap hashMap = new java.util.HashMap();
        f424659a = hashMap;
        java.lang.Class cls = java.lang.Boolean.TYPE;
        java.lang.Class cls2 = f424663e;
        if (cls2 == null) {
            cls2 = b("java.lang.Boolean");
            f424663e = cls2;
        }
        hashMap.put(cls, cls2);
        java.lang.Class cls3 = java.lang.Byte.TYPE;
        java.lang.Class cls4 = f424664f;
        if (cls4 == null) {
            cls4 = b("java.lang.Byte");
            f424664f = cls4;
        }
        hashMap.put(cls3, cls4);
        java.lang.Class cls5 = java.lang.Character.TYPE;
        java.lang.Class cls6 = f424665g;
        if (cls6 == null) {
            cls6 = b("java.lang.Character");
            f424665g = cls6;
        }
        hashMap.put(cls5, cls6);
        java.lang.Class cls7 = java.lang.Short.TYPE;
        java.lang.Class cls8 = f424666h;
        if (cls8 == null) {
            cls8 = b("java.lang.Short");
            f424666h = cls8;
        }
        hashMap.put(cls7, cls8);
        java.lang.Class cls9 = java.lang.Integer.TYPE;
        java.lang.Class cls10 = f424667i;
        if (cls10 == null) {
            cls10 = b("java.lang.Integer");
            f424667i = cls10;
        }
        hashMap.put(cls9, cls10);
        java.lang.Class cls11 = java.lang.Long.TYPE;
        java.lang.Class cls12 = f424668j;
        if (cls12 == null) {
            cls12 = b("java.lang.Long");
            f424668j = cls12;
        }
        hashMap.put(cls11, cls12);
        java.lang.Class cls13 = java.lang.Double.TYPE;
        java.lang.Class cls14 = f424669k;
        if (cls14 == null) {
            cls14 = b("java.lang.Double");
            f424669k = cls14;
        }
        hashMap.put(cls13, cls14);
        java.lang.Class cls15 = java.lang.Float.TYPE;
        java.lang.Class cls16 = f424670l;
        if (cls16 == null) {
            cls16 = b("java.lang.Float");
            f424670l = cls16;
        }
        hashMap.put(cls15, cls16);
        java.lang.Class cls17 = java.lang.Void.TYPE;
        hashMap.put(cls17, cls17);
        f424660b = new java.util.HashMap();
        for (java.lang.Class cls18 : hashMap.keySet()) {
            java.lang.Class cls19 = (java.lang.Class) f424659a.get(cls18);
            if (!cls18.equals(cls19)) {
                f424660b.put(cls19, cls18);
            }
        }
        f424661c = new java.util.HashMap();
        f424662d = new java.util.HashMap();
        a("int", "I");
        a(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN, "Z");
        a("float", "F");
        a("long", "J");
        a("short", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH);
        a("byte", "B");
        a("double", "D");
        a("char", "C");
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        f424661c.put(str, str2);
        f424662d.put(str2, str);
    }

    public static /* synthetic */ java.lang.Class b(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e17) {
            throw new java.lang.NoClassDefFoundError(e17.getMessage());
        }
    }
}
