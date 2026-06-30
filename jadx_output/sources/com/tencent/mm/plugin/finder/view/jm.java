package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class jm implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.km f132450d;

    public jm(com.tencent.mm.plugin.finder.view.km kmVar) {
        this.f132450d = kmVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        kk4.b player = this.f132450d.f132512t.getPlayer();
        if (player != null) {
            ((kk4.v) player).C(true);
        }
    }

    @Override // f25.f
    public void onResume() {
        kk4.b player = this.f132450d.f132512t.getPlayer();
        if (player != null) {
            ((kk4.v) player).C(false);
        }
    }

    @Override // f25.f
    public void onStop() {
        kk4.b player = this.f132450d.f132512t.getPlayer();
        if (player != null) {
            ((kk4.v) player).C(true);
        }
    }
}
