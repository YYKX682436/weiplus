package js2;

/* loaded from: classes2.dex */
public final class b implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final int f301507d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f301508e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f301509f;

    /* renamed from: g, reason: collision with root package name */
    public final int f301510g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f301511h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f301512i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f301513m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f301514n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f301515o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f301516p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f301517q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f301518r;

    public b(int i17, java.lang.String wording, boolean z17, int i18, boolean z18, boolean z19, yz5.a aVar, boolean z27, boolean z28, java.lang.String str, java.lang.String str2, yz5.l lVar, int i19, kotlin.jvm.internal.i iVar) {
        boolean z29 = (i19 & 16) != 0 ? true : z18;
        boolean z37 = (i19 & 32) != 0 ? false : z19;
        yz5.a aVar2 = (i19 & 64) != 0 ? null : aVar;
        boolean z38 = (i19 & 128) != 0 ? false : z27;
        boolean z39 = (i19 & 256) == 0 ? z28 : false;
        java.lang.String str3 = (i19 & 512) != 0 ? "" : str;
        java.lang.String str4 = (i19 & 1024) == 0 ? str2 : "";
        yz5.l lVar2 = (i19 & 2048) == 0 ? lVar : null;
        kotlin.jvm.internal.o.g(wording, "wording");
        this.f301507d = i17;
        this.f301508e = wording;
        this.f301509f = z17;
        this.f301510g = i18;
        this.f301511h = z29;
        this.f301512i = z37;
        this.f301513m = aVar2;
        this.f301514n = z38;
        this.f301515o = z39;
        this.f301516p = str3;
        this.f301517q = str4;
        this.f301518r = lVar2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return js2.b.class.hashCode();
    }
}
