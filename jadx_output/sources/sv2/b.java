package sv2;

/* loaded from: classes10.dex */
public final class b extends pv2.l {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413252e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f413253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413252e = draftItem;
        this.f413253f = "Finder.FinderDraftSuccessStage";
    }

    @Override // pv2.g
    public int a() {
        return 100;
    }

    @Override // pv2.a
    public void c() {
        com.tencent.mars.xlog.Log.i(this.f413253f, "succ, localId:" + this.f413252e.field_localId);
    }
}
