package zl2;

/* loaded from: classes2.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff0.z f473974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f473976f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(ff0.z zVar, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f473974d = zVar;
        this.f473975e = str;
        this.f473976f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPickImageColorFinished pickColorResult: ");
        ff0.z zVar = this.f473974d;
        sb6.append(zVar);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
        if (zVar != null) {
            ff0.z zVar2 = new ff0.z(zVar.f261595a | (-16777216), zVar.f261596b | (-16777216), zVar.f261597c | (-16777216));
            ((java.util.HashMap) zl2.r4.f473959j).put(this.f473975e, zVar2);
            this.f473976f.invoke(zVar2);
        }
        return jz5.f0.f302826a;
    }
}
