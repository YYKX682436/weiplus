package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class pb implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ya f205246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205248f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lb f205249g;

    public pb(com.tencent.mm.ui.chatting.viewitems.lb lbVar, com.tencent.mm.ui.chatting.viewitems.ya yaVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f205249g = lbVar;
        this.f205246d = yaVar;
        this.f205247e = dVar;
        this.f205248f = f9Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        long longValue;
        java.lang.String str;
        com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem;
        com.tencent.mm.ui.chatting.viewitems.ya yaVar = this.f205246d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        try {
            longValue = ((java.lang.Long) yaVar.f206051b.getTag(com.tencent.mm.R.id.bon)).longValue();
            str = (java.lang.String) yaVar.f206051b.getTag(com.tencent.mm.R.id.rfh);
            msgQuoteItem = (com.tencent.mm.plugin.msgquote.model.MsgQuoteItem) yaVar.f206052c.getTag();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV long click msgId:%s  referfromscene:%s", java.lang.Long.valueOf(longValue), java.lang.Integer.valueOf(msgQuoteItem.f149490o));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV long click Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        if (msgQuoteItem.f149490o == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV msgQuoteItem.referfromscene == 1, long click disable:%s", java.lang.Long.valueOf(longValue));
            yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        ((com.tencent.mm.ui.chatting.component.bj) ((sb5.o1) this.f205247e.f460708c.a(sb5.o1.class))).n0(view, new com.tencent.mm.ui.chatting.viewitems.ob(this, view, longValue, str, msgQuoteItem));
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
