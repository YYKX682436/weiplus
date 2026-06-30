package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class q implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.c0 f121270d;

    public q(com.tencent.mm.plugin.finder.member.preview.c0 c0Var) {
        this.f121270d = c0Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (i17 >= 0) {
            com.tencent.mm.plugin.finder.member.preview.c0 c0Var = this.f121270d;
            if (i17 >= c0Var.Q.size()) {
                return;
            }
            java.util.ArrayList arrayList = c0Var.Q;
            if (arrayList.get(i17) instanceof jo2.b) {
                db5.t7.m(c0Var.getContext(), c0Var.getString(com.tencent.mm.R.string.emv));
                return;
            }
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            c0Var.W6(arrayList, (so2.j5) obj, i17, 0);
        }
    }
}
