package km4;

/* loaded from: classes11.dex */
public final class h implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f309284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f309285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f309286c;

    public h(yz5.l lVar, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f309284a = lVar;
        this.f309285b = c0Var;
        this.f309286c = h0Var;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAdHelper", "prerender WeApp fail, errCode:" + i17 + ", errMsg:" + str);
        km4.l.c(this.f309284a, this.f309285b, this.f309286c, com.tencent.pigeon.ting.TingADErrorCode.OPEN_FAIL);
        km4.l.f309296a.a(12, null);
    }

    @Override // l81.v0
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAdHelper", "prerender WeApp success!");
    }
}
