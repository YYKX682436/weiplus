package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class db implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ya f203782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ab f203785g;

    public db(com.tencent.mm.ui.chatting.viewitems.ab abVar, com.tencent.mm.ui.chatting.viewitems.ya yaVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f203785g = abVar;
        this.f203782d = yaVar;
        this.f203783e = dVar;
        this.f203784f = f9Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.tencent.mm.ui.chatting.viewitems.ya yaVar = this.f203782d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        try {
            long longValue = ((java.lang.Long) yaVar.f206051b.getTag(com.tencent.mm.R.id.bon)).longValue();
            java.lang.String str = (java.lang.String) yaVar.f206051b.getTag(com.tencent.mm.R.id.rfh);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV long click msgId:%s", java.lang.Long.valueOf(longValue));
            ((com.tencent.mm.ui.chatting.component.bj) ((sb5.o1) this.f203783e.f460708c.a(sb5.o1.class))).n0(view, new com.tencent.mm.ui.chatting.viewitems.cb(this, view, longValue, str, (com.tencent.mm.plugin.msgquote.model.MsgQuoteItem) yaVar.f206052c.getTag()));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV long click Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
