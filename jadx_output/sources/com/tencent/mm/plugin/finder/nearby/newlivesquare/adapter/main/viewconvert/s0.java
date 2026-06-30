package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class s0 implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t0 f121929d;

    public s0(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t0 t0Var) {
        this.f121929d = t0Var;
    }

    @Override // oa.c
    public void h0(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
    }

    @Override // oa.c
    public void l4(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f343778a;
        if (obj instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r0) {
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r0 r0Var = (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r0) obj;
            this.f121929d.getClass();
            android.widget.TextView textView = r0Var.f121911d;
            if (textView != null) {
                android.view.View view = r0Var.f121909b.f343783f;
                kotlin.jvm.internal.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5_Night_Mode));
            }
            r0Var.a(false);
        }
    }

    @Override // oa.c
    public void u1(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f343778a;
        if (obj instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r0) {
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r0 r0Var = (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r0) obj;
            this.f121929d.getClass();
            android.widget.TextView textView = r0Var.f121911d;
            if (textView != null) {
                android.view.View view = r0Var.f121909b.f343783f;
                kotlin.jvm.internal.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9_Night_Mode));
            }
            r0Var.a(true);
        }
    }
}
