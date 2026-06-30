package zg0;

/* loaded from: classes8.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final zg0.p2 f472748a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f472749b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f472750c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f472751d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f472752e;

    /* renamed from: f, reason: collision with root package name */
    public int f472753f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f472754g;

    public k2(zg0.p2 webViewOptions, boolean z17, boolean z18, boolean z19, boolean z27, int i17, boolean z28) {
        kotlin.jvm.internal.o.g(webViewOptions, "webViewOptions");
        this.f472748a = webViewOptions;
        this.f472749b = z17;
        this.f472750c = z18;
        this.f472751d = z19;
        this.f472752e = z27;
        this.f472753f = i17;
        this.f472754g = z28;
    }

    public /* synthetic */ k2(zg0.p2 p2Var, boolean z17, boolean z18, boolean z19, boolean z27, int i17, boolean z28, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? new zg0.p2(new android.content.Intent()) : p2Var, (i18 & 2) != 0 ? false : z17, (i18 & 4) != 0 ? true : z18, (i18 & 8) == 0 ? z19 : true, (i18 & 16) != 0 ? false : z27, (i18 & 32) != 0 ? 0 : i17, (i18 & 64) == 0 ? z28 : false);
    }
}
