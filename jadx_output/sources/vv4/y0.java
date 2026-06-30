package vv4;

/* loaded from: classes4.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI f440521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f440522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440524g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f440525h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f440526i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI, int i17, java.lang.String str, java.lang.String str2, int i18, long j17) {
        super(0);
        this.f440521d = webSearchSnsImageLoadingUI;
        this.f440522e = i17;
        this.f440523f = str;
        this.f440524g = str2;
        this.f440525h = i18;
        this.f440526i = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI = this.f440521d;
        int intExtra = webSearchSnsImageLoadingUI.getIntent().getIntExtra("key_source", 0);
        com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct();
        chatImageWebSearchActionStruct.r(webSearchSnsImageLoadingUI.f181674n);
        chatImageWebSearchActionStruct.f55628f = intExtra;
        chatImageWebSearchActionStruct.f55627e = this.f440522e;
        switch (intExtra) {
            case 11:
            case 12:
            case 13:
            case 14:
                chatImageWebSearchActionStruct.f55629g = 83;
                break;
            case 15:
            case 16:
                chatImageWebSearchActionStruct.f55629g = webSearchSnsImageLoadingUI.f181671h;
                break;
            case 17:
                chatImageWebSearchActionStruct.f55629g = webSearchSnsImageLoadingUI.f181671h;
                break;
            case 18:
            case 19:
            case 20:
            case 21:
                chatImageWebSearchActionStruct.f55629g = 100;
                break;
            default:
                chatImageWebSearchActionStruct.f55629g = 81;
                break;
        }
        chatImageWebSearchActionStruct.q("");
        chatImageWebSearchActionStruct.p("");
        chatImageWebSearchActionStruct.t(this.f440523f);
        chatImageWebSearchActionStruct.s(kk.k.e(this.f440524g));
        chatImageWebSearchActionStruct.f55636n = this.f440525h;
        chatImageWebSearchActionStruct.f55635m = this.f440526i;
        chatImageWebSearchActionStruct.k();
        su4.k3.m(chatImageWebSearchActionStruct);
        return jz5.f0.f302826a;
    }
}
