package mz0;

/* loaded from: classes5.dex */
public final /* synthetic */ class y extends kotlin.jvm.internal.m implements yz5.a {
    public y(java.lang.Object obj) {
        super(0, obj, mz0.b2.class, "onBack", "onBack()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.b2 b2Var = (mz0.b2) this.receiver;
        b2Var.getClass();
        vt3.l lVar = vt3.l.f440005a;
        com.tencent.mars.xlog.Log.i("AssetInfoStatistics", "removeAllMedia");
        lVar.c(new vt3.g(5));
        b2Var.getContext().finish();
        return jz5.f0.f302826a;
    }
}
