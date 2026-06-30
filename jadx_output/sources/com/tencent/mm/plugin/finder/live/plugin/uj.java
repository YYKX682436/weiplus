package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class uj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(android.view.ViewGroup viewGroup) {
        super(0);
        this.f114570d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f114570d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new vg2.b0(context, viewGroup);
    }
}
