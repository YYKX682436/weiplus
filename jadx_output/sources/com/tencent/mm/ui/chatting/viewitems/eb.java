package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class eb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ya f203864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ab f203866f;

    public eb(com.tencent.mm.ui.chatting.viewitems.ab abVar, com.tencent.mm.ui.chatting.viewitems.ya yaVar, yb5.d dVar) {
        this.f203866f = abVar;
        this.f203864d = yaVar;
        this.f203865e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.ui.chatting.viewitems.ya yaVar = this.f203864d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            long longValue = ((java.lang.Long) yaVar.f206051b.getTag(com.tencent.mm.R.id.bon)).longValue();
            java.lang.String str = (java.lang.String) yaVar.f206051b.getTag(com.tencent.mm.R.id.rfh);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV click msgId:%s", java.lang.Long.valueOf(longValue));
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem = (com.tencent.mm.plugin.msgquote.model.MsgQuoteItem) yaVar.f206052c.getTag();
            if (yaVar.f206055f.getVisibility() == 0) {
                view = yaVar.f206055f;
            }
            com.tencent.mm.ui.chatting.viewitems.dc.d(this.f203865e, this.f203864d, this.f203866f, view, longValue, str, msgQuoteItem);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV click Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
