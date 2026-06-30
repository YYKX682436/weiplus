package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class p2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205228e;

    public p2(com.tencent.mm.ui.chatting.viewitems.o2 o2Var, com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f205227d = f9Var;
        this.f205228e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.storage.f9 f9Var = this.f205227d;
        if (f9Var.k2()) {
            l15.c cVar = new l15.c();
            java.lang.String U1 = f9Var.U1();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (U1 == null) {
                U1 = "";
            }
            cVar.fromXml(U1, true);
            if (cVar.k() != null) {
                v05.b k17 = cVar.k();
                if (k17.getInteger(k17.f368365d + 6) == 19) {
                    dk5.m2.f234731a.a(f9Var.Q0(), f9Var, true);
                    this.f205228e.L(true);
                }
            }
            com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
            this.f205228e.L(true);
        }
    }
}
