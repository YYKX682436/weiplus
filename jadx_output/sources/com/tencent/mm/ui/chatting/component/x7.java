package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class x7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y7 f200221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200222e;

    public x7(com.tencent.mm.ui.chatting.component.y7 y7Var, java.lang.String str) {
        this.f200221d = y7Var;
        this.f200222e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.component.y7 y7Var = this.f200221d;
        y7Var.f200285e.size();
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) y7Var.f200285e).entrySet()) {
            long longValue = ((java.lang.Number) entry.getKey()).longValue();
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) entry.getValue();
            java.lang.String V1 = f9Var.V1();
            if (V1 == null) {
                V1 = "";
            }
            java.lang.String Q0 = f9Var.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).mj("group_status_icon", "view_unexp", new xe0.n0(V1, Q0, this.f200222e, java.lang.String.valueOf(longValue)));
        }
    }
}
