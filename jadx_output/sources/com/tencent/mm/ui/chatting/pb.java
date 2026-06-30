package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class pb implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.tb f202090a;

    public pb(com.tencent.mm.ui.chatting.tb tbVar) {
        this.f202090a = tbVar;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        com.tencent.mm.ui.chatting.tb tbVar = this.f202090a;
        tbVar.f202714g = true;
        em.i1 i1Var = tbVar.f202711d;
        if (i1Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        i1Var.b().removeCallbacks(tbVar.f202715h);
        em.i1 i1Var2 = tbVar.f202711d;
        if (i1Var2 != null) {
            i1Var2.b().postDelayed(tbVar.f202715h, 150L);
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }
}
