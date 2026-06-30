package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class vf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(android.view.ViewGroup viewGroup) {
        super(0);
        this.f114714d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f114714d;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(viewGroup.getContext());
        return java.lang.Integer.valueOf((a17.f197136b - com.tencent.mm.ui.bl.c(viewGroup.getContext())) - com.tencent.mm.ui.bl.h(viewGroup.getContext()));
    }
}
