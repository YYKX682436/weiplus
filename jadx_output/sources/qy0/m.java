package qy0;

/* loaded from: classes5.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.m implements yz5.a {
    public m(java.lang.Object obj) {
        super(0, obj, qy0.d0.class, "performNext", "performNext()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qy0.d0 d0Var = (qy0.d0) this.receiver;
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "performNext music: " + d0Var.V6());
        boolean z17 = d0Var.W6().f69770f;
        com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = d0Var.f367583y;
        if (z17) {
            if (d0Var.b7(m7Var)) {
                kotlinx.coroutines.l.d(d0Var.getMainScope(), null, null, new py0.o(d0Var, null), 3, null);
            } else {
                d0Var.Z6(false, "");
                d0Var.getContext().finish();
            }
        } else if (d0Var.V6() || d0Var.b7(m7Var)) {
            kotlinx.coroutines.l.d(d0Var.getMainScope(), null, null, new py0.o(d0Var, null), 3, null);
        } else {
            d0Var.Y6();
        }
        return jz5.f0.f302826a;
    }
}
