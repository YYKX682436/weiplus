package v22;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.m f432830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f432831e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v22.m mVar, long j17) {
        super(1);
        this.f432830d = mVar;
        this.f432831e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        v22.m mVar = this.f432830d;
        java.lang.String str = mVar.f432833g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(mVar.d());
        sb6.append(" mix end: ");
        v22.g gVar = mVar.f432832f;
        sb6.append(gVar.f432816d);
        sb6.append(' ');
        sb6.append(booleanValue);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.util.Iterator it = ((java.util.ArrayList) gVar.f432817e.f432793a).iterator();
        while (it.hasNext()) {
            ((av3.a) it.next()).b();
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        mVar.f432835i = java.lang.System.currentTimeMillis() - this.f432831e;
        if (booleanValue) {
            v22.m.e(mVar, true);
            mVar.b(fp0.u.f265290f);
        } else {
            v22.m.e(mVar, false);
            mVar.b(fp0.u.f265291g);
        }
        return jz5.f0.f302826a;
    }
}
