package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pk0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.vk0 f113904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk0(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.vk0 vk0Var) {
        super(0);
        this.f113903d = viewGroup;
        this.f113904e = vk0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f113903d.findViewById(com.tencent.mm.R.id.s5r);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ok0(this.f113904e));
        return findViewById;
    }
}
