package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class h0 extends com.tencent.mm.ui.chatting.b6 {

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View.OnClickListener f204070g;

    public h0(yb5.d dVar, android.view.View.OnClickListener onClickListener) {
        super(dVar);
        this.f204070g = onClickListener;
    }

    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f204070g.onClick(view);
    }
}
