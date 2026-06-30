package io2;

/* loaded from: classes2.dex */
public final class i implements fs2.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader f293477d;

    /* renamed from: e, reason: collision with root package name */
    public io2.p f293478e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f293479f;

    public i(com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader loader) {
        kotlin.jvm.internal.o.g(loader, "loader");
        this.f293477d = loader;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter c() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f293479f;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter;
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    public final io2.p f() {
        io2.p pVar = this.f293478e;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // fs2.a
    public void onDetach() {
        this.f293477d.unregister(f().f293497g);
    }
}
