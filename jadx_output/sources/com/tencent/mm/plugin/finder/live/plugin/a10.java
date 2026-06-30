package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class a10 implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.f10 f111781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f111782b;

    public a10(com.tencent.mm.plugin.finder.live.plugin.f10 f10Var, int i17) {
        this.f111781a = f10Var;
        this.f111782b = i17;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View v17, n3.g3 insets) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(insets, "insets");
        this.f111781a.z1(this.f111782b);
        return n3.l1.i(v17, insets);
    }
}
