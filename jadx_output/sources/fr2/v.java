package fr2;

/* loaded from: classes2.dex */
public final class v implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fr2.x f265758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.zz2 f265759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265760c;

    public v(fr2.x xVar, r45.zz2 zz2Var, java.lang.String str) {
        this.f265758a = xVar;
        this.f265759b = zz2Var;
        this.f265760c = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        r45.zz2 zz2Var = this.f265759b;
        java.lang.String str2 = this.f265760c;
        if (z17) {
            zy2.db dbVar = (zy2.db) i95.n0.c(zy2.db.class);
            fr2.x xVar = this.f265758a;
            androidx.appcompat.app.AppCompatActivity activity = xVar.getActivity();
            android.app.Activity context = xVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            ((b92.s2) dbVar).Bi(activity, zz2Var, nyVar != null ? nyVar.V6() : null, str2);
        }
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "addQuickShare: bOk=" + z17 + ", username=" + str2 + ", themeId=" + zz2Var.f392483g);
    }
}
