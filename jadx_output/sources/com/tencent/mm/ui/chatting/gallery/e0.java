package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class e0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.h0 f200888e;

    public e0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.gallery.h0 h0Var) {
        this.f200887d = f9Var;
        this.f200888e = h0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.storage.f9 f9Var = this.f200887d;
        if (f9Var != null) {
            com.tencent.mm.ui.chatting.gallery.h0 h0Var = this.f200888e;
            h0Var.getClass();
            com.tencent.mars.xlog.Log.i("EmojiHistoryListAdapter", "[handleSelectedItem] index: " + i17 + ", msgId: " + f9Var.getMsgId());
            boolean z17 = h0Var.f200973f;
            android.content.Context context = h0Var.f200971d;
            if (i17 != 0) {
                if (i17 != 1) {
                    return;
                }
                if (z17) {
                    de5.a.f229396a.k(18, 7, 8);
                } else {
                    de5.a.f(de5.a.f229396a, 18, 8, 0, 0, 12, null);
                }
                com.tencent.mars.xlog.Log.i("EmojiHistoryListAdapter", "[handleDel] msgId: " + f9Var.getMsgId());
                if (h0Var.x(f9Var.getMsgId())) {
                    java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
                    copyOnWriteArraySet.add(tg3.l1.a(f9Var));
                    db5.e1.A(context, context.getString(com.tencent.mm.R.string.bav), "", context.getString(com.tencent.mm.R.string.boo), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.chatting.gallery.a0(h0Var, copyOnWriteArraySet, f9Var), null);
                    return;
                }
                return;
            }
            if (z17) {
                de5.a.f229396a.k(17, 7, 8);
            } else {
                de5.a.f(de5.a.f229396a, 17, 8, 0, 0, 12, null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[goToChattingUI] username: ");
            java.lang.String str = h0Var.f200972e;
            sb6.append(str);
            sb6.append(", msgId: ");
            sb6.append(f9Var.getMsgId());
            com.tencent.mars.xlog.Log.i("EmojiHistoryListAdapter", sb6.toString());
            if (h0Var.x(f9Var.getMsgId())) {
                if (!com.tencent.mm.storage.z3.R4(str)) {
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
                    if (n17 == null || !n17.r2()) {
                        if (n17 == null) {
                            com.tencent.mars.xlog.Log.w("EmojiHistoryListAdapter", "[gotoChattingUIWithPosition] contact is null! username:%s", str);
                        } else {
                            com.tencent.mars.xlog.Log.w("EmojiHistoryListAdapter", "[gotoChattingUIWithPosition] isContact not ! username:%s", str);
                        }
                        db5.e1.t(context, context.getString(com.tencent.mm.R.string.hy6), context.getString(com.tencent.mm.R.string.jz9), null);
                        return;
                    }
                } else if (((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(str) == null) {
                    com.tencent.mars.xlog.Log.w("EmojiHistoryListAdapter", "[gotoChattingUIWithPosition] member is null! username:%s", str);
                    db5.e1.t(context, context.getString(com.tencent.mm.R.string.hy6), context.getString(com.tencent.mm.R.string.jz9), null);
                    return;
                }
                android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", f9Var.getMsgId());
                kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
                putExtra.setClass(context, com.tencent.mm.ui.chatting.ChattingUI.class);
                android.content.Context context2 = h0Var.f200971d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(putExtra);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter", "goToChattingUI", "(Ljava/lang/String;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter", "goToChattingUI", "(Ljava/lang/String;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }
}
