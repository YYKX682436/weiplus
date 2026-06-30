package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public final class yj extends android.view.TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f212593a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(android.graphics.Rect bounds, android.view.View delegateView) {
        super(bounds, delegateView);
        kotlin.jvm.internal.o.g(bounds, "bounds");
        kotlin.jvm.internal.o.g(delegateView, "delegateView");
        this.f212593a = delegateView;
    }
}
