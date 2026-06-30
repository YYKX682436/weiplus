package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class k2 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.l2 f138093a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.plugin.fts.ui.l2 l2Var, android.os.Looper looper) {
        super(looper);
        this.f138093a = l2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        com.tencent.mm.plugin.fts.ui.l2 l2Var = this.f138093a;
        if (l2Var.f138110y || l2Var.getCount() <= 0) {
            return;
        }
        ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f137769c = true;
        ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).m0();
        l2Var.notifyDataSetChanged();
    }
}
