package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class yo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f206092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lp f206093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f206094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sb5.k2 f206095g;

    public yo(com.tencent.mm.ui.chatting.viewitems.dp dpVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.lp lpVar, yb5.d dVar, sb5.k2 k2Var) {
        this.f206092d = f9Var;
        this.f206093e = lpVar;
        this.f206094f = dVar;
        this.f206095g = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = this.f206092d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "voice fast trans text click, msgId:%s", java.lang.Long.valueOf(f9Var.getMsgId()));
        com.tencent.mm.ui.chatting.viewitems.mp.d(this.f206093e.getAdapterPosition(), this.f206094f, f9Var, this.f206095g, true);
        com.tencent.mm.ui.chatting.viewitems.dp.e0(2, f9Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
