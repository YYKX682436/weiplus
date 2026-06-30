package nf4;

/* loaded from: classes4.dex */
public final class p extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f336878e = {l75.n0.getCreateSQLs(nf4.o.f336877v, "StoryVideoCacheInfo")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f336879f = "MicroMsg.StoryVideoCacheStorage";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f336880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l75.k0 db6) {
        super(db6, nf4.o.f336877v, "StoryVideoCacheInfo", dm.fb.f236938m);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = nf4.o.f336877v;
        this.f336880d = db6;
    }

    public final boolean D0(nf4.o item) {
        kotlin.jvm.internal.o.g(item, "item");
        return super.update(item, new java.lang.String[0]);
    }

    public void y0() {
        com.tencent.mars.xlog.Log.i(f336879f, "dropTable " + this.f336880d.delete("StoryVideoCacheInfo", null, null));
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean insert(nf4.o item) {
        kotlin.jvm.internal.o.g(item, "item");
        return super.insert(item);
    }
}
