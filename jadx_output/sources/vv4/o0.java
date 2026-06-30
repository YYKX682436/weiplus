package vv4;

/* loaded from: classes4.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI f440483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f440484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440485g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f440486h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f440487i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(java.lang.String str, com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI, int i17, java.lang.String str2, int i18, long j17) {
        super(0);
        this.f440482d = str;
        this.f440483e = webSearchImageLoadingUI;
        this.f440484f = i17;
        this.f440485g = str2;
        this.f440486h = i18;
        this.f440487i = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI = this.f440483e;
        long longExtra = webSearchImageLoadingUI.getIntent().getLongExtra("key_msg_id", 0L);
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(webSearchImageLoadingUI.getIntent().getStringExtra("key_msg_talker"), longExtra);
        com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct();
        chatImageWebSearchActionStruct.r(java.lang.String.valueOf(java.lang.Long.valueOf(n17.I0())));
        chatImageWebSearchActionStruct.f55628f = webSearchImageLoadingUI.getIntent().getIntExtra("key_source", 0);
        chatImageWebSearchActionStruct.f55627e = this.f440484f;
        chatImageWebSearchActionStruct.f55629g = 67;
        chatImageWebSearchActionStruct.q("");
        chatImageWebSearchActionStruct.p("");
        if (com.tencent.mm.storage.z3.R4(n17.Q0())) {
            chatImageWebSearchActionStruct.f55632j = 2;
        } else {
            chatImageWebSearchActionStruct.f55632j = 1;
        }
        chatImageWebSearchActionStruct.t(this.f440485g);
        chatImageWebSearchActionStruct.s(kk.k.e(this.f440482d));
        chatImageWebSearchActionStruct.f55636n = this.f440486h;
        chatImageWebSearchActionStruct.f55635m = this.f440487i;
        chatImageWebSearchActionStruct.k();
        su4.k3.m(chatImageWebSearchActionStruct);
        return jz5.f0.f302826a;
    }
}
