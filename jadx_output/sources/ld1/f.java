package ld1;

/* loaded from: classes7.dex */
public class f implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f318060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f318061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ld1.h f318062c;

    public f(ld1.h hVar, com.tencent.luggage.sdk.jsapi.component.service.y yVar, int i17) {
        this.f318062c = hVar;
        this.f318060a = yVar;
        this.f318061b = i17;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.e("Luggage.JsApiReportPageData", "reportwxaappexpose cgi failed, message = %s", obj);
        this.f318060a.a(this.f318061b, this.f318062c.o("fail:cgi fail"));
    }
}
