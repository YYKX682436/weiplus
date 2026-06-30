package fr4;

/* loaded from: classes11.dex */
public final class b0 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.s f265803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f265804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragment f265805c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265806d;

    public b0(com.tencent.mm.plugin.lite.s sVar, android.content.Context context, com.tencent.mm.ui.MMFragment mMFragment, java.lang.String str) {
        this.f265803a = sVar;
        this.f265804b = context;
        this.f265805c = mMFragment;
        this.f265806d = str;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        if (!kotlin.jvm.internal.o.b("changeW1wPersonalMsgIdentityAction", str)) {
            return true;
        }
        try {
            com.tencent.mm.plugin.lite.s sVar = this.f265803a;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            android.content.Context context = this.f265804b;
            kotlin.jvm.internal.o.d(context);
            com.tencent.mm.ui.MMFragment mMFragment = this.f265805c;
            kotlin.jvm.internal.o.d(mMFragment);
            fr4.r.b(sVar, j17, (org.json.JSONObject) obj, i17, context, mMFragment, this.f265806d);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("W1w.W1wPersonalMsgService", "Failed to handle identity change action", e17);
            return true;
        }
    }
}
