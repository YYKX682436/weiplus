package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f173801d;

    public d1(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f173801d = weImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion.expand$default(com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE, this.f173801d, 50, 50, 50, 50, false, 32, null);
    }
}
