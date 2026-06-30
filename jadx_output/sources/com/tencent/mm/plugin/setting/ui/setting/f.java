package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f161013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mv.e0 f161014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z17, mv.e0 e0Var) {
        super(0);
        this.f161013d = z17;
        this.f161014e = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f161013d) {
            java.util.Set<com.tencent.mm.plugin.setting.ui.setting.b> set = com.tencent.mm.plugin.setting.ui.setting.g.f161056e;
            kotlin.jvm.internal.o.f(set, "access$getStatusProviders$p(...)");
            for (com.tencent.mm.plugin.setting.ui.setting.b bVar : set) {
                com.tencent.mm.plugin.setting.ui.setting.g gVar = com.tencent.mm.plugin.setting.ui.setting.g.f161052a;
                kotlin.jvm.internal.o.d(bVar);
                mv.e0 e0Var = this.f161014e;
                kotlin.jvm.internal.o.d(e0Var);
                int a17 = e0Var.f331496c == mv.f0.f331506i ? com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.adg) : com.tencent.mm.plugin.setting.ui.setting.g.f161053b;
                boolean z17 = ((nv.v1) com.tencent.mm.plugin.setting.ui.setting.g.f161057f).f340403f;
                java.lang.String str = e0Var.f331497d;
                if (z17) {
                    bVar.b(str, java.lang.Integer.valueOf(a17));
                } else {
                    bVar.b(str + ' ' + e0Var.f331498e + '%', java.lang.Integer.valueOf(a17));
                }
            }
        } else {
            java.util.Set<com.tencent.mm.plugin.setting.ui.setting.b> set2 = com.tencent.mm.plugin.setting.ui.setting.g.f161056e;
            kotlin.jvm.internal.o.f(set2, "access$getStatusProviders$p(...)");
            for (com.tencent.mm.plugin.setting.ui.setting.b bVar2 : set2) {
                com.tencent.mm.plugin.setting.ui.setting.g gVar2 = com.tencent.mm.plugin.setting.ui.setting.g.f161052a;
                kotlin.jvm.internal.o.d(bVar2);
                gVar2.b(bVar2);
            }
        }
        return jz5.f0.f302826a;
    }
}
