package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f189908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.AbstractVideoView f189909e;

    public c(com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView, int i17) {
        this.f189909e = abstractVideoView;
        this.f189908d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView = this.f189909e;
        abstractVideoView.D = true;
        int i17 = this.f189908d;
        abstractVideoView.W(i17);
        abstractVideoView.a(i17, true);
        abstractVideoView.D = false;
    }
}
