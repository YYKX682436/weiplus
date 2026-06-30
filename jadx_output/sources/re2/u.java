package re2;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.w f394488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394490f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(re2.w wVar, yz5.l lVar, yz5.l lVar2) {
        super(1);
        this.f394488d = wVar;
        this.f394489e = lVar;
        this.f394490f = lVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String mergedFilePath = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(mergedFilePath, "mergedFilePath");
        re2.w wVar = this.f394488d;
        yz5.l lVar = this.f394489e;
        yz5.l lVar2 = this.f394490f;
        re2.s sVar = new re2.s(wVar, lVar, lVar2);
        re2.t tVar = new re2.t(wVar, lVar2);
        wVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.CoLiveAvatarMerger", "doUpload: path=".concat(mergedFilePath));
        kotlinx.coroutines.l.d(wVar.f394499e, null, null, new re2.p(mergedFilePath, wVar, sVar, tVar, null), 3, null);
        return jz5.f0.f302826a;
    }
}
