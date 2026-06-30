package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207771e;

    public j2(com.tencent.mm.ui.conversation.o2 o2Var, java.lang.String str, java.lang.String str2) {
        this.f207770d = str;
        this.f207771e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(0L, this.f207770d).f348581i;
        if (linkedList.size() == 0) {
            return;
        }
        ot0.s0 s0Var = (ot0.s0) linkedList.getFirst();
        if (android.text.TextUtils.isEmpty(s0Var.f348762e)) {
            return;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(s0Var.f348762e, s0Var.f348770o, 92, this.f207771e, new java.lang.Object[0]);
    }
}
