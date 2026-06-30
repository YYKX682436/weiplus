package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public final class j9 extends com.tencent.mm.ui.chatting.component.a implements yn.e, androidx.lifecycle.y {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f199259g = kz5.c0.i(new xn5.c0("com.tencent.mm.ui.base.EllipsizeTextView", null, 5, null, 10, null), new xn5.c0("com.tencent.mm.ui.widget.MMPinProgressBtn", null, 20, null, 10, null), new xn5.c0("com.tencent.mm.ui.widget.MMTextView", null, 20, null, 10, null), new xn5.c0("com.tencent.mm.ui.MMImageView", null, 20, null, 10, null), new xn5.c0("com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", null, 20, null, 10, null), new xn5.c0("com.tencent.mm.ui.base.MaskLayout", null, 20, null, 10, null), new xn5.c0("com.tencent.mm.ui.base.AnimImageView", null, 20, null, 10, null));

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.b0 f199260e = new com.tencent.mm.ui.chatting.component.i9(this);

    /* renamed from: f, reason: collision with root package name */
    public boolean f199261f = true;

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        this.f199260e.i(androidx.lifecycle.n.DESTROYED);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d context) {
        kotlin.jvm.internal.o.g(context, "context");
        androidx.lifecycle.b0 b0Var = this.f199260e;
        b0Var.i(androidx.lifecycle.n.INITIALIZED);
        b0Var.i(androidx.lifecycle.n.CREATED);
        for (xn5.c0 cache : f199259g) {
            if (xn5.q0.f455702a.b().a() != null) {
                kotlin.jvm.internal.o.g(cache, "cache");
                pm0.v.N("X2C_VIEW_THREAD", false, new xn5.p1(cache, this));
            }
        }
        if (xn5.q0.f455702a.b().a() != null) {
            pm0.v.N("X2C_VIEW_THREAD", false, xn5.m1.f455696d);
        }
        super.L(context);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        if (this.f199261f) {
            xn5.z b17 = xn5.q0.f455702a.b().b();
            android.app.Activity g17 = this.f198580d.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            b17.d(g17, this, "ChattingFragment");
            this.f199261f = false;
        }
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f199260e;
    }
}
