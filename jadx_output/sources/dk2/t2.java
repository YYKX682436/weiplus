package dk2;

/* loaded from: classes.dex */
public final class t2 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f234098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f234099c;

    public t2(dk2.r4 r4Var, yz5.l lVar, yz5.p pVar) {
        this.f234097a = r4Var;
        this.f234098b = lVar;
        this.f234099c = pVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f234097a.f234009d, "[WeCoin] initEngine onFailed");
        yz5.p pVar = this.f234099c;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i(this.f234097a.f234009d, "[WeCoin] initEngine onSuccess");
        yz5.l lVar = this.f234098b;
        if (lVar != null) {
            lVar.invoke(bool);
        }
    }
}
