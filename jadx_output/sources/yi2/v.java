package yi2;

/* loaded from: classes10.dex */
public final class v extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f462591d;

    public v(yi2.i0 i0Var) {
        this.f462591d = i0Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorWidget", "onAppBackground activity=" + str);
        pm0.v.X(new yi2.t(this.f462591d));
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorWidget", "onAppForeground activity=" + str);
        pm0.v.X(new yi2.u(this.f462591d));
    }
}
