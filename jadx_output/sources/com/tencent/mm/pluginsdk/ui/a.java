package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.AbstractVideoView f189888d;

    public a(com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView) {
        this.f189888d = abstractVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView = this.f189888d;
        android.widget.LinearLayout linearLayout = abstractVideoView.f189745n;
        if (linearLayout == null || linearLayout.getVisibility() == 8) {
            return;
        }
        abstractVideoView.f189745n.setVisibility(8);
    }
}
