package q85;

/* loaded from: classes3.dex */
public final class g implements com.tencent.mm.pluginsdk.ui.tools.a4, n0.e4 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.List f360801o = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f360802d;

    /* renamed from: e, reason: collision with root package name */
    public final int f360803e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.jj4 f360804f;

    /* renamed from: g, reason: collision with root package name */
    public final int f360805g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f360806h;

    /* renamed from: i, reason: collision with root package name */
    public pk4.d f360807i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f360808m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f360809n;

    public g(android.content.Context context, java.lang.String snsId, int i17, r45.jj4 media, int i18, com.tencent.mm.sdk.coroutines.LifecycleScope scope) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f360802d = snsId;
        this.f360803e = i17;
        this.f360804f = media;
        this.f360805g = i18;
        this.f360806h = scope;
        f360801o.size();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // n0.e4
    public void b() {
        com.tencent.mars.xlog.Log.i("MiscroMsg.PlayerState", "onRemembered snsId:" + this.f360802d);
        r45.jj4 media = this.f360804f;
        kotlin.jvm.internal.o.g(media, "media");
        this.f360809n = null;
    }

    @Override // n0.e4
    public void c() {
        d();
    }

    @Override // n0.e4
    public void d() {
        v65.i.b(this.f360806h, null, new q85.f(this, null), 1, null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        pk4.d dVar;
        com.tencent.mars.xlog.Log.i("MiscroMsg.PlayerState", "onPrepared snsId:" + this.f360802d + " isPlay:" + this.f360808m);
        if (!this.f360808m || (dVar = this.f360807i) == null) {
            return;
        }
        dVar.start();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
