package td1;

/* loaded from: classes4.dex */
public final class d implements com.tencent.mm.plugin.appbrand.appusage.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f417597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f417598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f417599c;

    public d(yz5.l lVar, long j17, com.tencent.mm.ipcinvoker.r rVar) {
        this.f417597a = lVar;
        this.f417598b = j17;
        this.f417599c = rVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetRecentUsageList", "fetchNextPageFromServer  success=" + z17 + " errorMsg=" + str);
        if (z17) {
            this.f417597a.invoke(java.lang.Long.valueOf(this.f417598b));
        } else {
            kotlin.jvm.internal.o.d(str);
            this.f417599c.a(new com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result("", -1000, str));
        }
    }
}
