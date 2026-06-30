package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class me implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.oe f199504d;

    public me(com.tencent.mm.ui.chatting.component.oe oeVar) {
        this.f199504d = oeVar;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        com.tencent.mm.ui.chatting.component.oe oeVar = this.f199504d;
        if (oeVar.f199640e || m0Var == null || l0Var == null || l0Var.f454410a == null || (arrayList = l0Var.f454412c) == null || arrayList.isEmpty()) {
            return;
        }
        yb5.d dVar = oeVar.f198580d;
        java.lang.String str = dVar.f460716k;
        java.lang.String x17 = dVar.x();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            java.lang.String y07 = f9Var.y0();
            java.lang.String Q0 = f9Var.Q0();
            if (y07 != null && Q0 != null && str != null && kotlin.jvm.internal.o.b(str, y07) && kotlin.jvm.internal.o.b(Q0, x17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HasSentMsgComponent", "has sent msg from " + y07 + ", to " + Q0);
                boolean z17 = true;
                oeVar.f199640e = true;
                long longExtra = oeVar.f198580d.g().getIntent().getLongExtra("from_create_group_exit_type", 0L);
                int intExtra = oeVar.f198580d.g().getIntent().getIntExtra("from_create_group_scene", 0);
                if (!(longExtra == 5 || longExtra == 6) && longExtra != 7) {
                    z17 = false;
                }
                if (z17) {
                    pm0.v.K(null, new com.tencent.mm.ui.chatting.component.ne(oeVar, longExtra, intExtra));
                    return;
                }
                return;
            }
        }
    }
}
