package com.tencent.mm.ui.component;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/ui/component/Sample$SampleFragment", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class Sample$SampleFragment extends com.tencent.mm.ui.component.UIComponentFragment {
    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{pf5.j.class, pf5.k.class, pf5.m.class, pf5.l.class});
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        yj0.a.a("com/tencent/mm/ui/component/Sample$SampleFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        yj0.a.h(this, "com/tencent/mm/ui/component/Sample$SampleFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((pf5.k) pf5.z.f353948a.b(this).a(pf5.k.class)).getClass();
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.o.f(requireContext, "requireContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(requireContext instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((pf5.m) zVar.a((androidx.appcompat.app.AppCompatActivity) requireContext).a(pf5.m.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        yj0.a.a("com/tencent/mm/ui/component/Sample$SampleFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/ui/component/Sample$SampleFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }
}
