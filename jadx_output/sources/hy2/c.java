package hy2;

/* loaded from: classes.dex */
public final class c implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hy2.f f286052a;

    public c(hy2.f fVar) {
        this.f286052a = fVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String string;
        android.app.Activity context = this.f286052a.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[3];
        java.lang.String str3 = "";
        if (V6 == null || (str2 = V6.getString(1)) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_context_id", str2);
        if (V6 != null && (string = V6.getString(2)) != null) {
            str3 = string;
        }
        lVarArr[1] = new jz5.l("finder_tab_context_id", str3);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6 != null ? V6.getInteger(5) : 0));
        return kz5.c1.k(lVarArr);
    }
}
