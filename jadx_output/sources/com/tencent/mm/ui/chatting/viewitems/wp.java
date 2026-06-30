package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class wp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.q f205955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.xp f205956f;

    public wp(com.tencent.mm.ui.chatting.viewitems.xp xpVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.adapter.q qVar) {
        this.f205956f = xpVar;
        this.f205954d = f9Var;
        this.f205955e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = this.f205954d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.z0())) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.chatting.v0 p07 = ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) this.f205956f.f206004s.f460708c.a(sb5.q2.class))).p0();
        int adapterPosition = this.f205955e.getAdapterPosition();
        if (f9Var == null) {
            p07.getClass();
        } else {
            p07.h();
            java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(4115, null);
            if (bool == null || !bool.booleanValue()) {
                c01.d9.b().p().w(4115, java.lang.Boolean.TRUE);
                p07.f202771q.Z(com.tencent.mm.R.raw.icons_filled_ear, com.tencent.mm.R.color.f478496g, p07.f202772r.getString(com.tencent.mm.R.string.b4s), 4000L);
            }
            if (((sl.j) p07.f202765h).c() && f9Var.getMsgId() == p07.f202766i) {
                p07.J(true);
            } else {
                p07.f(f9Var);
                if (f9Var.A0() == 0 && !w21.x0.n(f9Var)) {
                    p07.e(adapterPosition + 1);
                }
                p07.s();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
