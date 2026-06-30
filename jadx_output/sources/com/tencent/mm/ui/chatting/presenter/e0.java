package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.h0 f202188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202189e;

    public e0(com.tencent.mm.ui.chatting.presenter.h0 h0Var, java.util.List list) {
        this.f202188d = h0Var;
        this.f202189e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment = this.f202188d.f202238g;
        if (emojiHistoryListFragment != null) {
            java.util.List dataList = this.f202189e;
            kotlin.jvm.internal.o.g(dataList, "dataList");
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListFragment", "[onDataBatchLoaded] :: batch added dataList size: " + dataList.size());
            if (emojiHistoryListFragment.f200551t == null) {
                return;
            }
            emojiHistoryListFragment.f200555x = false;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = dataList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((zb5.c) next).f471310c == 0) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() < 50) {
                emojiHistoryListFragment.f200554w = true;
            }
            com.tencent.mm.ui.chatting.gallery.h0 h0Var = emojiHistoryListFragment.f200549r;
            if (h0Var != null) {
                int size = ((java.util.ArrayList) h0Var.f200974g).size();
                ((java.util.ArrayList) h0Var.f200974g).addAll(dataList);
                h0Var.notifyItemRangeInserted(size, ((java.util.ArrayList) h0Var.f200974g).size());
            }
        }
    }
}
