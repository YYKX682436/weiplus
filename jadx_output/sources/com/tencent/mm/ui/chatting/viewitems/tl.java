package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class tl implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.vl f205613a;

    public tl(com.tencent.mm.ui.chatting.viewitems.wl wlVar, com.tencent.mm.ui.chatting.viewitems.vl vlVar) {
        this.f205613a = vlVar;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        this.f205613a.f205873k.post(new com.tencent.mm.ui.chatting.viewitems.sl(this, bVar));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
