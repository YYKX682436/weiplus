package qo1;

/* loaded from: classes5.dex */
public final /* synthetic */ class b1 extends kotlin.jvm.internal.m implements yz5.a {
    public b1(java.lang.Object obj) {
        super(0, obj, qo1.c1.class, "buildRestoreTaskInfo", "buildRestoreTaskInfo()I", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        qo1.c1 c1Var = (qo1.c1) this.receiver;
        java.lang.Object obj = c1Var.f365492r;
        com.tencent.wechat.aff.affroam.g gVar = obj instanceof com.tencent.wechat.aff.affroam.g ? (com.tencent.wechat.aff.affroam.g) obj : null;
        if (gVar == null) {
            i17 = 256;
        } else {
            com.tencent.wechat.aff.affroam.h1 b17 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.b(gVar.f215829d);
            if (b17 == null) {
                i17 = 257;
            } else {
                kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                b17.b(0L, java.lang.System.currentTimeMillis(), new qo1.y0(f0Var, c1Var, new qo1.a1(f0Var, c1Var, b17)));
                i17 = 0;
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
