package re2;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.w f394480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394482f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(re2.w wVar, yz5.l lVar, yz5.l lVar2) {
        super(1);
        this.f394480d = wVar;
        this.f394481e = lVar;
        this.f394482f = lVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String remoteUrl = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(remoteUrl, "remoteUrl");
        re2.w wVar = this.f394480d;
        re2.q qVar = new re2.q(wVar, this.f394481e, remoteUrl);
        re2.r rVar = new re2.r(wVar, this.f394482f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doReport: objectId=");
        long j17 = wVar.f394495a;
        sb6.append(j17);
        sb6.append(", url=");
        sb6.append(r26.p0.E0(remoteUrl, 80));
        com.tencent.mars.xlog.Log.i("Finder.CoLiveAvatarMerger", sb6.toString());
        re2.m mVar = new re2.m(qVar);
        re2.n nVar = new re2.n(rVar);
        com.tencent.mars.xlog.Log.i("Finder.CoLiveRequestHelper", "mergeAvatars: objectId=" + j17 + ", url=" + r26.p0.E0(remoteUrl, 80));
        new ek2.s(remoteUrl, j17, new re2.c1(j17, mVar, nVar)).l();
        return jz5.f0.f302826a;
    }
}
