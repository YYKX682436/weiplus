package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f113143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(boolean z17, android.view.ViewGroup viewGroup) {
        super(0);
        this.f113143d = z17;
        this.f113144e = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f113143d;
        android.view.ViewGroup viewGroup = this.f113144e;
        if (!z17) {
            viewGroup.setAlpha(1.0f);
        }
        viewGroup.setVisibility(0);
        return jz5.f0.f302826a;
    }
}
