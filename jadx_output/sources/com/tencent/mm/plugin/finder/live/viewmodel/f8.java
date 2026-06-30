package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class f8 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.h8 f117093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f117094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.g8 f117095c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f117096d;

    public f8(com.tencent.mm.plugin.finder.live.viewmodel.h8 h8Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.live.viewmodel.g8 g8Var, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        this.f117093a = h8Var;
        this.f117094b = s0Var;
        this.f117095c = g8Var;
        this.f117096d = mMSwitchBtn;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mm.plugin.finder.live.viewmodel.h8 h8Var = this.f117093a;
        boolean D = r4Var.D(z17, h8Var.f117132d);
        com.tencent.mm.plugin.finder.live.viewmodel.g8 g8Var = this.f117095c;
        if (!D) {
            g8Var.f117117e.invoke(h8Var, java.lang.Boolean.valueOf(z17));
            return;
        }
        android.content.Context context = this.f117094b.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r4Var.g3(context, h8Var.f117132d, new com.tencent.mm.plugin.finder.live.viewmodel.e8(g8Var, h8Var, z17, this.f117096d));
    }
}
