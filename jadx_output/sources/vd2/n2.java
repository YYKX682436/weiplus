package vd2;

/* loaded from: classes9.dex */
public final class n2 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f435818b;

    /* renamed from: a, reason: collision with root package name */
    public static final vd2.n2 f435817a = new vd2.n2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f435819c = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f435820d = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f435821e = jz5.h.b(vd2.m2.f435808d);

    public static final java.lang.String a(vd2.n2 n2Var, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        n2Var.getClass();
        try {
            str = (java.lang.String) com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null).get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        } catch (java.lang.Exception unused) {
        }
        return str == null ? "" : str;
    }
}
