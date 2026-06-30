package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.AbstractVideoView f190886d;

    public l(com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView) {
        this.f190886d = abstractVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView = this.f190886d;
        android.widget.LinearLayout linearLayout = abstractVideoView.f189745n;
        if (linearLayout == null || linearLayout.getVisibility() == 0) {
            return;
        }
        abstractVideoView.f189745n.setVisibility(0);
    }
}
