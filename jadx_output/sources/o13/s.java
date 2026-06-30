package o13;

/* loaded from: classes12.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final o13.r f342255a = new o13.r(19968, 40869);

    /* renamed from: b, reason: collision with root package name */
    public static final o13.r f342256b = new o13.r(40870, 40907);

    /* renamed from: c, reason: collision with root package name */
    public static final o13.r f342257c = new o13.r(13312, 19893);

    /* renamed from: d, reason: collision with root package name */
    public static final o13.r f342258d = new o13.r(131072, 173782);

    /* renamed from: e, reason: collision with root package name */
    public static final o13.r f342259e = new o13.r(173824, 177972);

    /* renamed from: f, reason: collision with root package name */
    public static final o13.r f342260f = new o13.r(177984, 178205);

    /* renamed from: g, reason: collision with root package name */
    public static final o13.r f342261g = new o13.r(65, 90);

    /* renamed from: h, reason: collision with root package name */
    public static final o13.r f342262h = new o13.r(97, 122);

    /* renamed from: i, reason: collision with root package name */
    public static final o13.r f342263i = new o13.r(48, 57);

    /* renamed from: j, reason: collision with root package name */
    public static final q13.b f342264j = new q13.b();

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.HashMap f342265k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashMap f342266l = new java.util.HashMap();

    public static boolean a(char c17) {
        return f342255a.a(c17) || f342256b.a(c17) || f342257c.a(c17) || f342258d.a(c17) || f342259e.a(c17) || f342260f.a(c17);
    }

    public static boolean b(char c17) {
        return f342261g.a(c17) || f342262h.a(c17);
    }

    public static final java.lang.String c(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (char c17 : str.toCharArray()) {
            if (a(c17)) {
                java.lang.String str2 = (java.lang.String) f342265k.get(java.lang.String.valueOf(c17));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    stringBuffer.append(str2);
                }
            }
            stringBuffer.append(c17);
        }
        return stringBuffer.toString();
    }
}
