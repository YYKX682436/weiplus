package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class g9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        super(0);
        this.f123733d = obVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123733d;
        boolean z17 = obVar.b7().f130822r;
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        if (z17) {
            android.app.Activity context = obVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "description_fold", 1, null, false, null, 56, null);
        } else {
            android.app.Activity context2 = obVar.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar2 != null ? nyVar2.V6() : null, "description_unfold", 1, null, false, null, 56, null);
        }
        return jz5.f0.f302826a;
    }
}
