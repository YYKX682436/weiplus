package com.tencent.mm.ui.chatting.component;

/* loaded from: classes14.dex */
public final class o implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.v f199603d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f199604e;

    public o(com.tencent.mm.ui.chatting.component.v statefulStatInfo) {
        kotlin.jvm.internal.o.g(statefulStatInfo, "statefulStatInfo");
        this.f199603d = statefulStatInfo;
        this.f199604e = "AppMsgWxaViewAttachStateChangeListener#" + statefulStatInfo.f200101a.f199454a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        this.f199603d.f200101a.b(null);
    }

    public java.lang.String toString() {
        return this.f199604e;
    }
}
