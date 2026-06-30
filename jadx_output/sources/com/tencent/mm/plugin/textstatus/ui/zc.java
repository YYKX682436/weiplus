package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class zc extends com.tencent.mm.plugin.textstatus.ui.uc {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f174483b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f174484c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f174485d;

    /* renamed from: e, reason: collision with root package name */
    public int f174486e;

    /* renamed from: f, reason: collision with root package name */
    public int f174487f;

    /* renamed from: g, reason: collision with root package name */
    public mj4.l f174488g;

    /* renamed from: h, reason: collision with root package name */
    public mj4.e f174489h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter, com.tencent.mm.view.RefreshLoadMoreLayout refreahLayout) {
        super(adapter);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(refreahLayout, "refreahLayout");
        this.f174483b = refreahLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f174484c = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f174485d = arrayList2;
        arrayList.clear();
        arrayList2.clear();
        ai4.m0 m0Var = ai4.m0.f5173a;
        arrayList.addAll(m0Var.D());
        arrayList2.addAll(m0Var.d());
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "NotificationMsgLoader init: unReadLikeSize=" + arrayList.size() + ", unReadCommentSize=" + arrayList2.size());
        this.f174486e = 0;
        this.f174487f = 0;
        android.view.View inflate = com.tencent.mm.ui.id.b(adapter.b0().getContext()).inflate(com.tencent.mm.R.layout.czq, (android.view.ViewGroup) adapter.b0(), false);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gbq)).setText(com.tencent.mm.R.string.frz);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(inflate, "textstatus_notif_more_button");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(inflate, 8, 28809);
        int c17 = m0Var.O().c();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "readCount:" + c17 + ' ');
        if (c17 > 0) {
            inflate.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.yc(this, adapter, in5.n0.P(adapter, inflate, Integer.MAX_VALUE, false, 4, null)));
        }
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.uc
    public boolean a() {
        return this.f174486e < this.f174484c.size() || this.f174487f < this.f174485d.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4 A[EDGE_INSN: B:56:0x00f4->B:53:0x00f4 BREAK  A[LOOP:0: B:2:0x0002->B:31:0x00f0], SYNTHETIC] */
    @Override // com.tencent.mm.plugin.textstatus.ui.uc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.zc.b():void");
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.uc
    public void c() {
    }
}
