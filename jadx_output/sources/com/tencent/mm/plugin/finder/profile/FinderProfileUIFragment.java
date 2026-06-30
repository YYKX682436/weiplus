package com.tencent.mm.plugin.finder.profile;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfileUIFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderReportFragment;", "Lrd2/c;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileUIFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment implements rd2.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f123295n = kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class, com.tencent.mm.plugin.finder.profile.uic.o0.class, com.tencent.mm.plugin.finder.profile.uic.ob.class, com.tencent.mm.plugin.finder.profile.uic.f4.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.m8.class)), com.tencent.mm.plugin.finder.profile.uic.d6.class, com.tencent.mm.plugin.finder.viewmodel.component.h.class, sr2.l5.class, hy2.f.class, com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.class});

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment, com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0, reason: from getter */
    public java.util.Set getF123295n() {
        return this.f123295n;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment
    public int s0() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("finder_username") : null;
        kotlin.jvm.internal.o.d(string);
        android.os.Bundle arguments2 = getArguments();
        boolean z17 = false;
        java.lang.Boolean valueOf = arguments2 != null ? java.lang.Boolean.valueOf(arguments2.getBoolean("KEY_FINDER_SELF_FLAG", false)) : null;
        kotlin.jvm.internal.o.d(valueOf);
        boolean booleanValue = valueOf.booleanValue();
        android.content.Context context = getContext();
        if (kotlin.jvm.internal.o.b(string, context != null ? xy2.c.e(context) : null) && booleanValue) {
            z17 = true;
        }
        return z17 ? 33 : 32;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment
    public int t0() {
        return 3;
    }
}
