package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ls implements com.tencent.mm.plugin.finder.view.js {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f132615a;

    public ls(android.view.View.OnClickListener onClickListener) {
        this.f132615a = onClickListener;
    }

    @Override // com.tencent.mm.plugin.finder.view.js
    public boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View.OnClickListener onClickListener = this.f132615a;
        if (onClickListener == null) {
            return false;
        }
        onClickListener.onClick(view);
        return false;
    }
}
