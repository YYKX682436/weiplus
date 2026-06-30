package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ni implements in5.x {
    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        ms2.e eVar = (ms2.e) holder.f293125i;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.assist.i0.gl((com.tencent.mm.plugin.finder.assist.i0) c17, context, ms2.a.a(eVar.f330973d), bw5.ar0.TingScene_FinderProfileCategory, false, false, 24, null);
    }
}
