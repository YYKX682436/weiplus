package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes11.dex */
public class ge implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.fe f204033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il4.b f204034e;

    public ge(com.tencent.mm.ui.chatting.viewitems.fe feVar, il4.b bVar) {
        this.f204033d = feVar;
        this.f204034e = bVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        com.tencent.mm.ui.chatting.viewitems.fe.c(this.f204033d.f203962b, this.f204034e.f292099e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
