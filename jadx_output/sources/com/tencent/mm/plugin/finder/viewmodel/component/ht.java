package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class ht extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f134670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar) {
        super(0);
        this.f134670d = ptVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = this.f134670d;
        androidx.appcompat.app.AppCompatActivity activity = ptVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.po poVar = (com.tencent.mm.plugin.finder.viewmodel.component.po) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.po.class);
        if (poVar != null) {
            poVar.P6();
        }
        if (fp.h.c(30)) {
            ptVar.getActivity().getWindow().setDecorFitsSystemWindows(true);
        }
        ptVar.getActivity().getWindow().getDecorView().setOnApplyWindowInsetsListener(null);
        ptVar.getActivity().getWindow().getDecorView().requestApplyInsets();
        return jz5.f0.f302826a;
    }
}
