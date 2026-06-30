package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class nf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pe f199590d;

    public nf(com.tencent.mm.ui.chatting.component.pe peVar) {
        this.f199590d = peVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HeaderComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.pe peVar = this.f199590d;
        if (com.tencent.mm.storage.z3.p4(peVar.f198580d.x())) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", peVar.f198580d.x());
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 2);
            intent.putExtra("chat_from_scene", peVar.f198580d.k());
            j45.l.n(peVar.f198580d.g(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 213);
            q41.f.a(peVar.f198580d.x(), 4, 0);
            c00.u3 u3Var = (c00.u3) i95.n0.c(c00.u3.class);
            java.lang.String x17 = peVar.f198580d.x();
            b00.a0 a0Var = (b00.a0) u3Var;
            a0Var.cj(x17, "ecs_kf_session_shop_title", "view_clk", a0Var.Ni(x17));
        } else if (com.tencent.mm.storage.z3.H4(peVar.f198580d.x())) {
            bi4.w0 w0Var = (bi4.w0) i95.n0.c(bi4.w0.class);
            android.app.Activity context = peVar.f198580d.g();
            java.lang.String x18 = peVar.f198580d.x();
            ki4.x xVar = (ki4.x) w0Var;
            xVar.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            hi4.m.f281555f.d(x18, 160);
            mj4.w Ai = xVar.Ai(x18);
            if (Ai != null) {
                if (ai4.m0.f5173a.M(x18) != null) {
                    ki4.x.wi(xVar, new jz5.l(Ai.field_sessionId, Ai.field_userName), null, null, false, 8, null);
                    ki4.g0.f308132a.b(context, Ai.field_userName, "chat", null);
                }
            }
        } else {
            com.tencent.mm.ui.chatting.component.pe.m0(peVar);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HeaderComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
