package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ug implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114561e;

    public ug(android.view.View view, kotlin.jvm.internal.h0 h0Var) {
        this.f114560d = view;
        this.f114561e = h0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f114560d.setBackground((android.graphics.drawable.Drawable) this.f114561e.f310123d);
    }
}
