package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wg implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114929e;

    public wg(android.view.View view, kotlin.jvm.internal.h0 h0Var) {
        this.f114928d = view;
        this.f114929e = h0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f114928d.setBackground((android.graphics.drawable.Drawable) this.f114929e.f310123d);
    }
}
