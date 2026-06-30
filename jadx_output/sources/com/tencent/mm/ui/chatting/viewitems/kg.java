package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class kg implements r35.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f204332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204333b;

    public kg(com.tencent.mm.ui.chatting.viewitems.zf zfVar, java.lang.ref.WeakReference weakReference, com.tencent.mm.storage.f9 f9Var) {
        this.f204332a = weakReference;
        this.f204333b = f9Var;
    }

    @Override // r35.q3
    public void onFinish() {
        com.tencent.mm.ui.chatting.viewitems.qf qfVar = (com.tencent.mm.ui.chatting.viewitems.qf) this.f204332a.get();
        if (qfVar == null) {
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.sf sfVar = qfVar.f205359j;
        sfVar.f205265c.setVisibility(0);
        if (com.tencent.mm.plugin.brandservice.ui.timeline.j3.a(this.f204333b.getMsgId(), 0).equals(te5.t.c(null))) {
            sfVar.f205521f.setImageResource(com.tencent.mm.R.drawable.f481205n4);
        } else {
            sfVar.f205521f.setImageResource(com.tencent.mm.R.drawable.f481206n5);
        }
    }

    @Override // r35.q3
    public void onStart() {
    }
}
