package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class kw implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f134994a;

    public kw(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        this.f134994a = sxVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f134994a;
        android.app.Activity context = sxVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(sxVar.f135943y));
        lVarArr[1] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        return kz5.c1.k(lVarArr);
    }
}
