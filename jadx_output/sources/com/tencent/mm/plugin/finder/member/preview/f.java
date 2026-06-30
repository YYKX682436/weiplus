package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class f implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.k f121212d;

    public f(com.tencent.mm.plugin.finder.member.preview.k kVar) {
        this.f121212d = kVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.member.preview.k kVar = this.f121212d;
        if (kVar.f121249q == 0) {
            db5.t7.m(kVar.getContext(), kVar.getContext().getResources().getString(com.tencent.mm.R.string.emv));
        } else {
            db5.t7.m(kVar.getContext(), kVar.getContext().getResources().getString(com.tencent.mm.R.string.emu));
        }
    }
}
