package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class cb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f203711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f203712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msgquote.model.MsgQuoteItem f203714g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.db f203715h;

    public cb(com.tencent.mm.ui.chatting.viewitems.db dbVar, android.view.View view, long j17, java.lang.String str, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        this.f203715h = dbVar;
        this.f203711d = view;
        this.f203712e = j17;
        this.f203713f = str;
        this.f203714g = msgQuoteItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.db dbVar = this.f203715h;
        com.tencent.mm.ui.chatting.viewitems.dc.e(dbVar.f203783e, dbVar.f203785g, dbVar.f203784f, this.f203711d, this.f203712e, this.f203713f, this.f203714g, ty.q0.f422749d);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
