package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class wn implements wl5.u {

    /* renamed from: a, reason: collision with root package name */
    public final wl5.x f205952a;

    public wn(wl5.x xVar) {
        this.f205952a = xVar;
    }

    @Override // wl5.u
    public void a() {
        wl5.x xVar = this.f205952a;
        if (xVar.f447167l) {
            xVar.n(java.lang.Boolean.FALSE);
            return;
        }
        xVar.k();
        xVar.N = true;
        xVar.f();
        xVar.M = true;
        xVar.g();
        xVar.h();
    }
}
