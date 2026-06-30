package rl2;

/* loaded from: classes4.dex */
public final class e extends be2.d {

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f397192e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397193f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l75.k0 db6) {
        super(db6, ce2.m.f40785p, "FinderLiveConfig", dm.m4.f238449g);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = ce2.m.f40785p;
        this.f397192e = db6;
        this.f397193f = "select * from FinderLiveConfig ";
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var) {
        ce2.m item = (ce2.m) f0Var;
        kotlin.jvm.internal.o.g(item, "item");
        boolean replace = super.replace(item);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveConfigStorage", "insert " + item.field_key + ", ret:" + replace);
        return replace;
    }
}
