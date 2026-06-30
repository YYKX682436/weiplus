package gx0;

/* loaded from: classes5.dex */
public final class l7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276670e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(gx0.w8 w8Var, java.lang.String str) {
        super(1);
        this.f276669d = w8Var;
        this.f276670e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareExport: cancelExporting message ");
        sb6.append(th6 != null ? th6.getMessage() : null);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", sb6.toString());
        gx0.w8.k7(this.f276669d, this.f276670e);
        return jz5.f0.f302826a;
    }
}
