package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class ob implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f205171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msgquote.model.MsgQuoteItem f205173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.pb f205174h;

    public ob(com.tencent.mm.ui.chatting.viewitems.pb pbVar, android.view.View view, long j17, java.lang.String str, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        this.f205174h = pbVar;
        this.f205170d = view;
        this.f205171e = j17;
        this.f205172f = str;
        this.f205173g = msgQuoteItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.pb pbVar = this.f205174h;
        com.tencent.mm.ui.chatting.viewitems.dc.e(pbVar.f205247e, pbVar.f205249g, pbVar.f205248f, this.f205170d, this.f205171e, this.f205172f, this.f205173g, ty.q0.f422749d);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
