package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class k0 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment f201090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f201091d;

    public k0(com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment, kotlin.jvm.internal.f0 f0Var) {
        this.f201090c = emojiHistoryListFragment;
        this.f201091d = f0Var;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        java.util.List list;
        com.tencent.mm.ui.chatting.gallery.h0 h0Var = this.f201090c.f200549r;
        if (h0Var == null || (list = h0Var.f200974g) == null) {
            return 1;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (i17 < arrayList.size() && ((zb5.c) arrayList.get(i17)).f471310c != 0) {
            return this.f201091d.f310116d;
        }
        return 1;
    }
}
