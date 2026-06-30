package mf1;

/* loaded from: classes7.dex */
public class a implements mf1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mf1.k f326022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mf1.h f326023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf1.c f326025e;

    public a(mf1.c cVar, java.lang.String str, mf1.k kVar, mf1.h hVar, java.lang.String str2) {
        this.f326025e = cVar;
        this.f326021a = str;
        this.f326022b = kVar;
        this.f326023c = hVar;
        this.f326024d = str2;
    }

    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketError url is %s ,error is %s,taskId=%s", this.f326024d, str, this.f326021a);
        mf1.c cVar = this.f326025e;
        mf1.k kVar = this.f326022b;
        cVar.i(kVar);
        cVar.h(kVar);
        ((yc1.o) this.f326023c).c("exception " + str);
    }
}
