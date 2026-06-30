package eu0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f256715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gu0.k2 k2Var) {
        super(0);
        this.f256715d = k2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gu0.k2 k2Var = this.f256715d;
        if (k2Var != null) {
            com.tencent.mars.xlog.Log.i("MJCC.Session", "onMusicPanelOpen: stop playback");
            k2Var.f275734j = true;
            k2Var.w();
        }
        return jz5.f0.f302826a;
    }
}
