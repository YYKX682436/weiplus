package com.tencent.mm.plugin.profile;

@j95.b
/* loaded from: classes11.dex */
public class p2 extends i95.w {

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.storage.z3 f153578e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f153579f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f153580g;

    /* renamed from: d, reason: collision with root package name */
    public ur3.a f153581d = null;

    public static ur3.a Ai() {
        gm0.j1.b().c();
        com.tencent.mm.plugin.profile.p2 p2Var = (com.tencent.mm.plugin.profile.p2) i95.n0.c(com.tencent.mm.plugin.profile.p2.class);
        if (p2Var.f153581d == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.plugin.profile.p2.class) {
                if (p2Var.f153581d == null) {
                    p2Var.f153581d = new ur3.a(c01.d9.b().s());
                }
            }
        }
        return p2Var.f153581d;
    }

    public static void Bi(android.content.Intent intent, int i17, int i18, java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.profile.o2(intent, i17, i18, str), 100L);
    }

    public static int wi(android.content.Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("CONTACT_INFO_UI_SOURCE", 0);
        }
        return 0;
    }
}
