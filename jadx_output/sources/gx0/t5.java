package gx0;

/* loaded from: classes5.dex */
public final class t5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f276977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(com.tencent.mm.modelbase.i iVar, gx0.w8 w8Var, java.lang.String str) {
        super(1);
        this.f276977d = iVar;
        this.f276978e = w8Var;
        this.f276979f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        com.tencent.mm.modelbase.i iVar = this.f276977d;
        if (iVar != null) {
            iVar.dead();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("extractJianTongKuanMetadata: cancelExporting message ");
        sb6.append(th6 != null ? th6.getMessage() : null);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", sb6.toString());
        gx0.w8.k7(this.f276978e, this.f276979f);
        return jz5.f0.f302826a;
    }
}
