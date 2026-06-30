package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class sc implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.tc f210741a;

    public sc(com.tencent.mm.ui.tools.tc tcVar) {
        this.f210741a = tcVar;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f210741a.f210780d.f210226n;
        if (favVideoView != null) {
            favVideoView.f();
        }
    }
}
