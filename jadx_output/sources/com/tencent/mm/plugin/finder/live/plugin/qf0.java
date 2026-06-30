package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qf0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f114001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf0(android.view.View view, int i17) {
        super(0);
        this.f114000d = view;
        this.f114001e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f114000d;
        view.setBackground(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.drawable.f481763a71, this.f114001e));
        return jz5.f0.f302826a;
    }
}
