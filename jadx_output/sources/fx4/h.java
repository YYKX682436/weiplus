package fx4;

/* loaded from: classes11.dex */
public final class h implements com.tencent.wechat.iam.biz.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fx4.a f267154a;

    public h(fx4.a aVar) {
        this.f267154a = aVar;
    }

    @Override // com.tencent.wechat.iam.biz.m
    public final void a(com.tencent.wechat.iam.biz.k kVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSpecialPlayListAsync result ");
        sb6.append(kVar != null);
        com.tencent.mars.xlog.Log.i("AudioPlayLaterHelper", sb6.toString());
        fx4.j.f267156a = kVar;
        fx4.a aVar = this.f267154a;
        if (kVar != null) {
            kotlin.jvm.internal.o.d(kVar);
            kVar.b(new fx4.g(aVar));
        } else if (aVar != null) {
            aVar.a(true);
        }
    }
}
