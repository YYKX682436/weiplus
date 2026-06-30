package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class tc implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.xc f124232a;

    public tc(com.tencent.mm.plugin.finder.profile.uic.xc xcVar) {
        this.f124232a = xcVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[2];
        android.app.Activity context = this.f124232a.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int i17 = 0;
        lVarArr[0] = new jz5.l("parententerscene", nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().getInteger(8)) : null);
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("ProfilePublish");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("ProfilePublish");
        if (I0 != null && L0 != null && ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true)) {
            i17 = 1;
        }
        lVarArr[1] = new jz5.l("is_red_dot", java.lang.Integer.valueOf(i17));
        return kz5.c1.k(lVarArr);
    }
}
