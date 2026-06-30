package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q0 f112090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f112091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var, yz5.a aVar) {
        super(0);
        this.f112090d = q0Var;
        this.f112091e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.q0 q0Var = this.f112090d;
        mm2.h v17 = q0Var.v1();
        android.view.ViewParent parent = v17 != null ? v17.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(q0Var.v1());
        }
        mm2.h v18 = q0Var.v1();
        if (v18 != null) {
            v18.setOnVideoSizeChange(q0Var.f113945u);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        mm2.h v19 = q0Var.v1();
        android.widget.FrameLayout frameLayout = q0Var.f113942r;
        frameLayout.addView(v19, layoutParams);
        frameLayout.requestLayout();
        this.f112091e.invoke();
        return jz5.f0.f302826a;
    }
}
