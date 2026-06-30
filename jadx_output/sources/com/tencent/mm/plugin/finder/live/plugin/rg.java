package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rg implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114137e;

    public rg(android.view.View view, kotlin.jvm.internal.h0 h0Var) {
        this.f114136d = view;
        this.f114137e = h0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f114136d.setBackground((android.graphics.drawable.Drawable) this.f114137e.f310123d);
    }
}
