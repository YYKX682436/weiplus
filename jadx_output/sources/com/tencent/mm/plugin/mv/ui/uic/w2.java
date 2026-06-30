package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class w2 implements gk4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151511a;

    public w2(fm3.u uVar) {
        this.f151511a = uVar;
    }

    @Override // gk4.u
    public void onPause() {
        fm3.u uVar = this.f151511a;
        if (uVar.f264142v > 0) {
            uVar.f264143w += c01.id.c() - uVar.f264142v;
            uVar.f264142v = 0L;
        }
    }

    @Override // gk4.u
    public void onResume() {
        fm3.u uVar = this.f151511a;
        if (uVar.f264142v > 0) {
            uVar.f264143w += c01.id.c() - uVar.f264142v;
        }
        uVar.f264142v = c01.id.c();
    }
}
