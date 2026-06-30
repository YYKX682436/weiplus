package com.tencent.mm.pluginsdk.ui.otherway.halfscreen;

/* loaded from: classes3.dex */
public final class i extends wm3.a implements wm3.m {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f190959d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f190960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f190959d = "MicroMsg.BaseBottomSheetOpenWayEnhance";
        this.f190960e = jz5.h.b(new com.tencent.mm.pluginsdk.ui.otherway.halfscreen.h(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.elm;
    }

    @Override // wm3.m
    public boolean i() {
        em.p2 p2Var = (em.p2) ((jz5.n) this.f190960e).getValue();
        if (p2Var.f254704c == null) {
            p2Var.f254704c = (androidx.recyclerview.widget.RecyclerView) p2Var.f254702a.findViewById(com.tencent.mm.R.id.un7);
        }
        return !p2Var.f254704c.canScrollVertically(-1);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new com.tencent.mm.pluginsdk.ui.otherway.halfscreen.g(this));
        }
    }
}
