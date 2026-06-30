package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class h0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f200971d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f200972e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f200973f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f200974g;

    public h0(android.content.Context context, java.lang.String mTalker, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(mTalker, "mTalker");
        this.f200971d = context;
        this.f200972e = mTalker;
        this.f200973f = z17;
        this.f200974g = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f200974g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((zb5.c) this.f200974g.get(i17)).f471310c;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (((zb5.c) ((java.util.ArrayList) this.f200974g).get(i17)).f471310c != 0) {
            if (((zb5.c) ((java.util.ArrayList) this.f200974g).get(i17)).f471310c == 1) {
                ((com.tencent.mm.ui.chatting.gallery.w) holder).f201527d.setText(((zb5.c) ((java.util.ArrayList) this.f200974g).get(i17)).f471311d);
                return;
            }
            return;
        }
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = ((zb5.c) ((java.util.ArrayList) this.f200974g).get(i17)).f471308a;
        com.tencent.mm.storage.f9 f9Var = ((zb5.c) ((java.util.ArrayList) this.f200974g).get(i17)).f471309b;
        com.tencent.mm.ui.chatting.gallery.p0 p0Var = (com.tencent.mm.ui.chatting.gallery.p0) holder;
        com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView rTChattingEmojiView = p0Var.f201258d;
        if (rTChattingEmojiView.getChildCount() == 0) {
            rTChattingEmojiView.a();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            rTChattingEmojiView.addView(rTChattingEmojiView.f190826m, layoutParams);
            rTChattingEmojiView.setChattingEmojiMaxSize(rTChattingEmojiView.getLayoutParams().width);
        }
        com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView rTChattingEmojiView2 = p0Var.f201258d;
        com.tencent.mm.storage.f9 f9Var2 = ((zb5.c) ((java.util.ArrayList) this.f200974g).get(i17)).f471309b;
        kotlin.jvm.internal.o.d(f9Var2);
        rTChattingEmojiView2.c(emojiInfo, f9Var2.getMsgId(), true, true);
        holder.itemView.setOnLongClickListener(new com.tencent.mm.ui.chatting.gallery.f0(f9Var, this, holder));
        holder.itemView.setOnClickListener(new com.tencent.mm.ui.chatting.gallery.g0(f9Var, emojiInfo, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.efl, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new com.tencent.mm.ui.chatting.gallery.p0(inflate);
        }
        if (i17 != 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.efi, parent, false);
            kotlin.jvm.internal.o.d(inflate2);
            return new com.tencent.mm.ui.chatting.gallery.v(inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.efk, parent, false);
        kotlin.jvm.internal.o.d(inflate3);
        return new com.tencent.mm.ui.chatting.gallery.w(inflate3);
    }

    public final boolean x(long j17) {
        if (pt0.f0.f358209b1.k(this.f200972e, j17) != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("EmojiHistoryListAdapter", "[checkIsMsgValid] msgId: " + j17 + " not found, may have been deleted");
        android.content.Context context = this.f200971d;
        db5.e1.t(context, context.getString(com.tencent.mm.R.string.p5z), context.getString(com.tencent.mm.R.string.jz9), null);
        java.util.Iterator it = ((java.util.ArrayList) this.f200974g).iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            com.tencent.mm.storage.f9 f9Var = ((zb5.c) it.next()).f471309b;
            if (f9Var != null && f9Var.getMsgId() == j17) {
                break;
            }
            i17++;
        }
        ((java.util.ArrayList) this.f200974g).removeIf(new com.tencent.mm.ui.chatting.gallery.b0(j17));
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.mm.ui.chatting.gallery.c0(this, i17));
        return false;
    }
}
