package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class sl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q11.b f205528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.tl f205529e;

    public sl(com.tencent.mm.ui.chatting.viewitems.tl tlVar, q11.b bVar) {
        this.f205529e = tlVar;
        this.f205528d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f205529e.f205613a.f205873k.setImageBitmap(this.f205528d.f359534d);
    }
}
