package fr4;

/* loaded from: classes5.dex */
public final class c0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fr4.g0 f265807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragment f265810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f265813g;

    public c0(fr4.g0 g0Var, java.lang.String str, java.lang.String str2, com.tencent.mm.ui.MMFragment mMFragment, java.lang.String str3, java.lang.String str4, boolean z17) {
        this.f265807a = g0Var;
        this.f265808b = str;
        this.f265809c = str2;
        this.f265810d = mMFragment;
        this.f265811e = str3;
        this.f265812f = str4;
        this.f265813g = z17;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("W1w.W1wPersonalMsgService", "W1w identity change liteapp failed");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "W1w identity change liteapp opened successfully");
        fr4.g0 g0Var = this.f265807a;
        vu4.d dVar = vu4.d.f440300p;
        java.lang.String str = this.f265808b;
        java.lang.String str2 = this.f265809c;
        com.tencent.mm.ui.MMFragment mMFragment = this.f265810d;
        java.lang.String stringExtra = mMFragment != null ? mMFragment.getStringExtra("key_w1w_refer_session_id") : null;
        java.lang.String stringExtra2 = mMFragment != null ? mMFragment.getStringExtra("key_w1w_refer_ext_info") : null;
        this.f265807a.getClass();
        g0Var.cj(dVar, str, str2, stringExtra, stringExtra2, mr4.a.c(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE), vu4.e.f440307f, mr4.a.a("message_input:message_input"), this.f265811e, this.f265812f, this.f265813g ? vu4.g.f440324f : vu4.g.f440323e);
    }
}
