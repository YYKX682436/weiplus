package gx0;

/* loaded from: classes5.dex */
public final class z7 implements com.tencent.maas.moviecomposing.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277272b;

    public z7(gx0.w8 w8Var, java.lang.String str) {
        this.f277271a = w8Var;
        this.f277272b = str;
    }

    @Override // com.tencent.maas.moviecomposing.j
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.maas.instamovie.base.MJError.MaasEC maasEC;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startExporting: cancelExporting errorCode ");
        sb6.append((mJError == null || (maasEC = mJError.f48175ec) == null) ? null : java.lang.Integer.valueOf(maasEC.getErrorCode()));
        sb6.append(" message ");
        sb6.append(mJError != null ? mJError.message : null);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", sb6.toString());
        gx0.w8.k7(this.f277271a, this.f277272b);
    }
}
