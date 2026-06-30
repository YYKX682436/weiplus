package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class j4 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f199251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.o4 f199252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199253f;

    public j4(android.view.View view, com.tencent.mm.ui.chatting.component.o4 o4Var, java.lang.String str) {
        this.f199251d = view;
        this.f199252e = o4Var;
        this.f199253f = str;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f199251d.removeOnAttachStateChangeListener(this);
        this.f199252e.f199620e.remove(this.f199253f);
    }
}
