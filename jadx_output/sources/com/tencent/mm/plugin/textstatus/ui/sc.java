package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class sc extends com.tencent.mm.plugin.textstatus.ui.uc {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f174289b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f174290c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f174291d;

    /* renamed from: e, reason: collision with root package name */
    public int f174292e;

    /* renamed from: f, reason: collision with root package name */
    public int f174293f;

    /* renamed from: g, reason: collision with root package name */
    public mj4.l f174294g;

    /* renamed from: h, reason: collision with root package name */
    public mj4.e f174295h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter, com.tencent.mm.view.RefreshLoadMoreLayout refreahLayout) {
        super(adapter);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(refreahLayout, "refreahLayout");
        this.f174289b = refreahLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f174290c = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f174291d = arrayList2;
        arrayList.clear();
        arrayList2.clear();
        ai4.m0 m0Var = ai4.m0.f5173a;
        arrayList.addAll(m0Var.B());
        arrayList2.addAll(m0Var.w());
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "AllMsgLoader init: allLikeSize=" + arrayList.size() + ", allCommentSize=" + arrayList2.size());
        this.f174292e = 0;
        this.f174293f = 0;
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.uc
    public boolean a() {
        return this.f174292e < this.f174290c.size() || this.f174293f < this.f174291d.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef A[EDGE_INSN: B:54:0x00ef->B:51:0x00ef BREAK  A[LOOP:0: B:2:0x0002->B:31:0x00eb], SYNTHETIC] */
    @Override // com.tencent.mm.plugin.textstatus.ui.uc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.sc.b():void");
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.uc
    public void c() {
    }
}
