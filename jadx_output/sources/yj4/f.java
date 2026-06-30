package yj4;

/* loaded from: classes11.dex */
public final class f extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public qj4.k f462697d;

    /* renamed from: e, reason: collision with root package name */
    public final iy1.c f462698e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f462697d = qj4.k.f363924g;
        this.f462698e = iy1.c.StatusPublishEditPage;
    }

    public final void O6(qj4.j clickOption) {
        kotlin.jvm.internal.o.g(clickOption, "clickOption");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        qj4.j jVar = qj4.j.f363917e;
        if (clickOption != jVar) {
            linkedHashMap.put("status_edit_2ensure_panel_opt", java.lang.Integer.valueOf(clickOption.f363921d));
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = activity instanceof com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity ? (com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity) activity : null;
        bi4.d1 d1Var = textStatusEditActivity != null ? textStatusEditActivity.f173613x1 : null;
        jz5.l[] lVarArr = new jz5.l[2];
        java.lang.String str = d1Var != null ? d1Var.G : null;
        if (str == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("status_clipostid", str);
        java.lang.String str2 = d1Var != null ? d1Var.f354941h : null;
        lVarArr[1] = new jz5.l("status_sessionid", str2 != null ? str2 : "");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("status_edit_2ensure_panel", clickOption != jVar ? "view_clk" : "view_exp", kz5.c1.m(kz5.c1.k(lVarArr), linkedHashMap), 33629);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            cy1.a aVar = (cy1.a) rVar;
            aVar.Zj(getActivity(), this.f462698e.f295859d);
            aVar.ik(getActivity(), 12, 33629);
            aVar.Ai(getActivity(), new yj4.e(this));
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = activity instanceof com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity ? (com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity) activity : null;
        if (textStatusEditActivity != null) {
            android.view.View view = textStatusEditActivity.btnBack;
            if (view == null) {
                kotlin.jvm.internal.o.o("btnBack");
                throw null;
            }
            cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar2.pk(view, "status_page_x");
            dy1.r ik6 = aVar2.ik(view, 40, 33629);
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity2 = activity2 instanceof com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity ? (com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity) activity2 : null;
            bi4.d1 d1Var = textStatusEditActivity2 != null ? textStatusEditActivity2.f173613x1 : null;
            kz5.q0 q0Var = kz5.q0.f314001d;
            jz5.l[] lVarArr = new jz5.l[2];
            java.lang.String str = d1Var != null ? d1Var.G : null;
            if (str == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("status_clipostid", str);
            java.lang.String str2 = d1Var != null ? d1Var.f354941h : null;
            lVarArr[1] = new jz5.l("status_sessionid", str2 != null ? str2 : "");
            java.util.Map m17 = kz5.c1.m(kz5.c1.k(lVarArr), q0Var);
            m17.toString();
            ((cy1.a) ik6).gk(view, m17);
        }
    }
}
