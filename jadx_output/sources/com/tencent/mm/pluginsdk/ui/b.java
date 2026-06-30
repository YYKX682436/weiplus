package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.AbstractVideoView f189902d;

    public b(com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView) {
        this.f189902d = abstractVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView = this.f189902d;
        try {
            abstractVideoView.W(0);
            abstractVideoView.X(abstractVideoView.isPlaying());
        } catch (java.lang.Throwable unused) {
        }
    }
}
