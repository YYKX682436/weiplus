package xn2;

/* loaded from: classes2.dex */
public final class y implements cw2.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455587a;

    public y(xn2.p0 p0Var) {
        this.f455587a = p0Var;
    }

    @Override // cw2.b8
    public boolean a() {
        return true;
    }

    @Override // cw2.b8
    public dw2.b0 b() {
        xn2.x xVar = new xn2.x();
        xn2.p0 p0Var = this.f455587a;
        p0Var.B = xVar;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.f fVar = p0Var.B;
        kotlin.jvm.internal.o.d(fVar);
        return new com.tencent.mm.plugin.finder.megavideo.topstory.flow.b(fVar);
    }

    @Override // cw2.b8
    public boolean c() {
        return true;
    }

    @Override // cw2.b8
    public androidx.recyclerview.widget.RecyclerView d() {
        xn2.b bVar = this.f455587a.f455547e;
        kotlin.jvm.internal.o.d(bVar);
        return ((xn2.f1) bVar).getRecyclerView();
    }

    @Override // cw2.b8
    public com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer getData() {
        return this.f455587a.j().getDataListJustForAdapter();
    }
}
