package df2;

/* loaded from: classes3.dex */
public final class pq implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f231107d;

    public pq(df2.ar arVar) {
        this.f231107d = arVar;
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        df2.ar arVar = this.f231107d;
        arVar.getClass();
        com.tencent.mars.xlog.Log.i(arVar.f229737m, "on animate end");
    }

    @Override // ym5.w1
    public void d(com.tencent.mm.view.MMPAGView mMPAGView) {
        java.lang.String str = this.f231107d.f229737m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on animate progress = ");
        sb6.append(mMPAGView != null ? java.lang.Double.valueOf(mMPAGView.getProgress()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }
}
