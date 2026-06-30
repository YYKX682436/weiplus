package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public final class n2 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.o2 f138125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.plugin.fts.ui.o2 o2Var, android.os.Looper looper) {
        super(looper);
        this.f138125a = o2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.what == 1) {
            com.tencent.mm.plugin.fts.ui.o2 o2Var = this.f138125a;
            if (o2Var.f138136u || o2Var.getCount() <= 0) {
                return;
            }
            ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f137769c = true;
            ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).m0();
            o2Var.notifyDataSetChanged();
        }
    }
}
