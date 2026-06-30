package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class i4 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.q4 f134693a;

    public i4(com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var) {
        this.f134693a = q4Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var = this.f134693a;
        android.app.Activity context = q4Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        lVarArr[0] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
        pf5.u uVar = pf5.u.f353936a;
        lVarArr[1] = new jz5.l("finder_context_id", java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(q4Var.getContext()).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p));
        lVarArr[2] = new jz5.l("finder_tab_context_id", java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(q4Var.getContext()).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135386r));
        androidx.appcompat.app.AppCompatActivity activity = q4Var.getActivity();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(mMFinderUI != null ? mMFinderUI.getD() : 74));
        lVarArr[4] = new jz5.l("ref_commentscene", java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(q4Var.getContext()).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135379m));
        return kz5.c1.k(lVarArr);
    }
}
