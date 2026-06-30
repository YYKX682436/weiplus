package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class np implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.q f204948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.up f204949f;

    public np(com.tencent.mm.ui.chatting.viewitems.up upVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.adapter.q qVar) {
        this.f204949f = upVar;
        this.f204947d = f9Var;
        this.f204948e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindConfirm$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = this.f204947d;
        if (x51.t1.b(f9Var.z0())) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindConfirm$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) this.f204949f.f205723s.f460708c.a(sb5.q2.class))).p0().j(this.f204948e.getAdapterPosition(), f9Var);
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindConfirm$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
