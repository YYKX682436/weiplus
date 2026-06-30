package yw;

/* loaded from: classes9.dex */
public final class d1 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f466302b;

    public d1(java.lang.String str, yz5.l lVar) {
        this.f466301a = str;
        this.f466302b = lVar;
    }

    @Override // c01.o8
    public final void a(java.lang.String retUsername, boolean z17) {
        kotlin.jvm.internal.o.g(retUsername, "retUsername");
        yw.h1 h1Var = yw.h1.f466332a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "flush contact callback, username: %s, success: %b", retUsername, java.lang.Boolean.valueOf(z17));
        java.lang.String str = this.f466301a;
        boolean b17 = kotlin.jvm.internal.o.b(str, retUsername);
        yz5.l lVar = this.f466302b;
        if (!b17 || !z17) {
            java.lang.String str2 = this.f466301a;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            lVar.invoke(new com.tencent.pigeon.biz_base.ContactInfo(str2, null, bool, bool, java.lang.Boolean.TRUE, 2, null));
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null) {
            java.lang.String str3 = this.f466301a;
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            lVar.invoke(new com.tencent.pigeon.biz_base.ContactInfo(str3, c01.a2.e(str), java.lang.Boolean.valueOf(n17.r2()), java.lang.Boolean.valueOf(n17.w2()), java.lang.Boolean.valueOf(c01.e2.P(n17))));
        } else {
            java.lang.String str4 = this.f466301a;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            lVar.invoke(new com.tencent.pigeon.biz_base.ContactInfo(str4, null, bool2, bool2, java.lang.Boolean.TRUE, 2, null));
        }
    }
}
