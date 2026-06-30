package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class tp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zf4.o f205627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.up f205628f;

    public tp(com.tencent.mm.ui.chatting.viewitems.up upVar, com.tencent.mm.storage.f9 f9Var, zf4.o oVar) {
        this.f205628f = upVar;
        this.f205626d = f9Var;
        this.f205627e = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindConfirm$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.e1.n(this.f205628f.f205723s.g(), com.tencent.mm.R.string.k_9, com.tencent.mm.R.string.k_a, new com.tencent.mm.ui.chatting.viewitems.sp(this), null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindConfirm$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
