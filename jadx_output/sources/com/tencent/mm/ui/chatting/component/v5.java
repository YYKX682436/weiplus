package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public class v5 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f200117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.c6 f200118f;

    public v5(com.tencent.mm.ui.chatting.component.c6 c6Var, com.tencent.mm.storage.f9 f9Var, java.util.HashSet hashSet) {
        this.f200118f = c6Var;
        this.f200116d = f9Var;
        this.f200117e = hashSet;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        com.tencent.mm.storage.f9 f9Var = this.f200116d;
        java.lang.String z07 = f9Var.z0();
        if (z07 == null || !z07.equals(r1Var.f445529a)) {
            return;
        }
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        java.lang.String str = r1Var.f445529a;
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null || !h17.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "downloadVideoAndFav failed, msgId: %d, fileName: %s", java.lang.Long.valueOf(f9Var.getMsgId()), str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "downloadVideoAndFav succeed, msgId: %d, fileName: %s", java.lang.Long.valueOf(f9Var.getMsgId()), str);
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(this);
        java.lang.Long valueOf = java.lang.Long.valueOf(f9Var.getMsgId());
        java.util.HashSet hashSet = this.f200117e;
        hashSet.remove(valueOf);
        this.f200118f.a(hashSet);
    }
}
