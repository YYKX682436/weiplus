package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class f0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.h0 f200909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f200910f;

    public f0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.gallery.h0 h0Var, androidx.recyclerview.widget.k3 k3Var) {
        this.f200908d = f9Var;
        this.f200909e = h0Var;
        this.f200910f = k3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLongClick] :: long clicked with msgId: ");
        com.tencent.mm.storage.f9 f9Var = this.f200908d;
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
        com.tencent.mars.xlog.Log.i("EmojiHistoryListAdapter", sb6.toString());
        com.tencent.mm.ui.chatting.gallery.h0 h0Var = this.f200909e;
        if (h0Var.f200973f) {
            de5.a.f229396a.k(14, 7, 8);
        } else {
            de5.a.f(de5.a.f229396a, 14, 8, 0, 0, 12, null);
        }
        new com.tencent.mm.ui.tools.s6(h0Var.f200971d).a(this.f200910f.itemView, com.tencent.mm.ui.chatting.gallery.d0.f200848d, new com.tencent.mm.ui.chatting.gallery.e0(f9Var, h0Var), null);
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
