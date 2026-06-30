package du3;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.m f243604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(du3.m mVar) {
        super(1);
        this.f243604d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAddTextPlugin", "setOnVisibleChangeCallback " + booleanValue, null);
        du3.m mVar = this.f243604d;
        if (booleanValue) {
            ((hk0.u0) ((jz5.n) mVar.f243657p).getValue()).d7(3, java.lang.Boolean.TRUE);
        } else {
            ((hk0.u0) ((jz5.n) mVar.f243657p).getValue()).d7(3, java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
