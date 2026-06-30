package so2;

/* loaded from: classes2.dex */
public final class s extends in5.w implements com.tencent.mm.plugin.finder.feed.model.internal.r0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f410582d;

    /* renamed from: e, reason: collision with root package name */
    public int f410583e;

    /* renamed from: f, reason: collision with root package name */
    public int f410584f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f410585g;

    /* renamed from: h, reason: collision with root package name */
    public int f410586h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f410587i;

    public s(java.lang.CharSequence tipStr, int i17, int i18, java.lang.Object obj, int i19, kotlin.jvm.internal.i iVar) {
        if ((i19 & 1) != 0) {
            tipStr = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f8x);
            kotlin.jvm.internal.o.f(tipStr, "getString(...)");
        }
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        obj = (i19 & 8) != 0 ? null : obj;
        kotlin.jvm.internal.o.g(tipStr, "tipStr");
        this.f410582d = tipStr;
        this.f410583e = i17;
        this.f410584f = i18;
        this.f410585g = obj;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return -1;
    }
}
