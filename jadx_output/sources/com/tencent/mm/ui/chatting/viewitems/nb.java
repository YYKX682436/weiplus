package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class nb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ya f204910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lb f204912f;

    public nb(com.tencent.mm.ui.chatting.viewitems.lb lbVar, com.tencent.mm.ui.chatting.viewitems.ya yaVar, yb5.d dVar) {
        this.f204912f = lbVar;
        this.f204910d = yaVar;
        this.f204911e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.ui.chatting.viewitems.ya yaVar = this.f204910d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            long longValue = ((java.lang.Long) yaVar.f206051b.getTag(com.tencent.mm.R.id.bon)).longValue();
            java.lang.String str = (java.lang.String) yaVar.f206051b.getTag(com.tencent.mm.R.id.rfh);
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem = (com.tencent.mm.plugin.msgquote.model.MsgQuoteItem) yaVar.f206052c.getTag();
            if (msgQuoteItem != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV click msgId:%s  referfromscene:%s", java.lang.Long.valueOf(longValue), java.lang.Integer.valueOf(msgQuoteItem.f149490o));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV click msgId:%s  msgQuoteItem == null", java.lang.Long.valueOf(longValue));
            }
            if (yaVar.f206055f.getVisibility() == 0) {
                view = yaVar.f206055f;
            }
            com.tencent.mm.ui.chatting.viewitems.dc.d(this.f204911e, this.f204910d, this.f204912f, view, longValue, str, msgQuoteItem);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV click Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
