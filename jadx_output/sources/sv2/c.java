package sv2;

/* loaded from: classes10.dex */
public final class c extends pv2.n {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413260e;

    /* renamed from: f, reason: collision with root package name */
    public final int f413261f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f413262g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.storage.x80 draftItem, int i17) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413260e = draftItem;
        this.f413261f = i17;
        this.f413262g = "Finder.FinderDraftWaitStage";
    }

    @Override // pv2.g
    public int a() {
        return 100;
    }

    @Override // pv2.a
    public void c() {
        com.tencent.mars.xlog.Log.i(this.f413262g, "wait, reason:" + this.f413261f + ", localId:" + this.f413260e.field_localId);
    }
}
