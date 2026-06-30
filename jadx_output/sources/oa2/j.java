package oa2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa2.w f343820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.r03 f343821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(oa2.w wVar, r45.r03 r03Var) {
        super(0);
        this.f343820d = wVar;
        this.f343821e = r03Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.rz6 rz6Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        oa2.w wVar = this.f343820d;
        android.app.Activity context = wVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        java.lang.String stringExtra = wVar.getActivity().getIntent().getStringExtra("key_finder_user_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        boolean z17 = stringExtra.length() == 0;
        java.lang.String str = null;
        r45.r03 r03Var = this.f343821e;
        if (z17) {
            r45.r23 r23Var = (r45.r23) r03Var.getCustom(23);
            stringExtra = (r23Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) r23Var.getCustom(0)) == null) ? null : finderContact.getUsername();
        }
        jz5.l[] lVarArr = new jz5.l[5];
        r45.r23 r23Var2 = (r45.r23) r03Var.getCustom(23);
        if (r23Var2 != null && (rz6Var = (r45.rz6) r23Var2.getCustom(1)) != null) {
            str = rz6Var.f385320d;
        }
        lVarArr[0] = new jz5.l("templateid", str);
        lVarArr[1] = new jz5.l("finder_tab_context_id", V6.getString(2));
        lVarArr[2] = new jz5.l("finder_context_id", V6.getString(1));
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5)));
        lVarArr[4] = new jz5.l("finder_username", stringExtra);
        return kz5.c1.k(lVarArr);
    }
}
