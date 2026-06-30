package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ha implements wl5.u {

    /* renamed from: a, reason: collision with root package name */
    public final wl5.x f204098a;

    public ha(wl5.x xVar) {
        this.f204098a = xVar;
    }

    @Override // wl5.u
    public void a() {
        wl5.x xVar = this.f204098a;
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
