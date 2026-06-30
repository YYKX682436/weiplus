package io2;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io2.i f293476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(io2.i iVar) {
        super(1);
        this.f293476d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse resp = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        resp.getHasMore();
        io2.i iVar = this.f293476d;
        iVar.getClass();
        if (!resp.getHasMore()) {
            iVar.f().f293493c.setEnableRefresh(false);
            iVar.f().f293493c.setEnableLoadMore(false);
        }
        iVar.f().a(false);
        if (iVar.c().x() == 0 && iVar.f293477d.getDataListJustForAdapter().size() == 0 && resp.getPullType() != 1000) {
            io2.p f17 = iVar.f();
            f17.a(false);
            f17.f293496f.setVisibility(0);
        } else {
            io2.p f18 = iVar.f();
            f18.a(false);
            f18.f293496f.setVisibility(8);
        }
        iVar.c().notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
