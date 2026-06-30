package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.h0 f200771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CopyOnWriteArraySet f200772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200773f;

    public a0(com.tencent.mm.ui.chatting.gallery.h0 h0Var, java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, com.tencent.mm.storage.f9 f9Var) {
        this.f200771d = h0Var;
        this.f200772e = copyOnWriteArraySet;
        this.f200773f = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialog, int i17) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        com.tencent.mars.xlog.Log.i("EmojiHistoryListAdapter", "delete message");
        de5.a aVar = de5.a.f229396a;
        com.tencent.mm.ui.chatting.gallery.h0 h0Var = this.f200771d;
        aVar.b(19, h0Var.f200973f);
        com.tencent.mm.ui.chatting.i3.a(h0Var.f200971d, this.f200772e, new com.tencent.mm.ui.chatting.gallery.z(h0Var, this.f200773f));
    }
}
