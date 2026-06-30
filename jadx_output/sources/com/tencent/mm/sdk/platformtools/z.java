package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f193105a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f193106b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f193107c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f193108d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f193109e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f193110f;

    /* renamed from: h, reason: collision with root package name */
    public static int f193112h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f193113i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f193114j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f193115k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f193116l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f193117m;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f193118n;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f193119o;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f193120p;

    /* renamed from: q, reason: collision with root package name */
    public static int f193121q;

    /* renamed from: r, reason: collision with root package name */
    public static int f193122r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f193123s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.z1 f193124t = new com.tencent.mm.sdk.platformtools.z1();

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f193111g;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String f193125u = f193111g;

    public static java.lang.String a() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = f193105a;
        java.lang.String str3 = f193107c;
        java.lang.String str4 = f193109e;
        sb6.append(java.lang.String.format("[b.ver] %s\n", com.tencent.mm.sdk.platformtools.y.a(f193125u, lp0.a.f320249c)));
        sb6.append(java.lang.String.format("[tag  ] %s\n", com.tencent.mm.sdk.platformtools.y.a(str2, lp0.a.f320252f)));
        sb6.append(java.lang.String.format("[time ] %s\n", com.tencent.mm.sdk.platformtools.y.a(str3, lp0.a.f320251e)));
        sb6.append(java.lang.String.format("[cmd  ] %s\n", com.tencent.mm.sdk.platformtools.y.a(f193108d, lp0.a.f320253g)));
        sb6.append(java.lang.String.format("[rev  ] %s\n", com.tencent.mm.sdk.platformtools.y.a(str4, lp0.a.f320248b)));
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (!(!"false".equalsIgnoreCase(lp0.a.f320247a))) {
            str = "disabled";
        } else if (lp0.a.f320254h == null) {
            str = lp0.a.f320248b;
        } else {
            str = lp0.a.f320248b + "." + lp0.a.f320254h;
        }
        objArr[0] = str;
        sb6.append(java.lang.String.format("[p.rev] %s\n", objArr));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = f193115k ? "arm64-v8a" : "armeabi-v7a";
        sb6.append(java.lang.String.format("[eabi ] %s\n", objArr2));
        sb6.append(java.lang.String.format("[feature_id] %s\n", f193124t.a("FEATURE_ID")));
        return sb6.toString();
    }
}
