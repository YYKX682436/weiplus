package t03;

/* loaded from: classes11.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f414493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t03.k0 k0Var) {
        super(1);
        this.f414493d = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = (com.tencent.thumbplayer.api.ITPPlayer) obj;
        long propertyLong = iTPPlayer != null ? iTPPlayer.getPropertyLong(205) : 0L;
        int videoWidth = iTPPlayer != null ? iTPPlayer.getVideoWidth() : 0;
        int videoHeight = iTPPlayer != null ? iTPPlayer.getVideoHeight() : 0;
        t03.k0 k0Var = this.f414493d;
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "setInputContentInfo, size:[" + videoWidth + ", " + videoHeight + "], rotate:" + propertyLong);
        k0Var.f414467i.m(videoWidth, videoHeight, (int) propertyLong);
        yz5.a aVar = k0Var.f414474s;
        if (aVar != null) {
            ((t03.a0) aVar).invoke();
        }
        return jz5.f0.f302826a;
    }
}
