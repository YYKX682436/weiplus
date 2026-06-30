package j93;

/* loaded from: classes11.dex */
public final class u0 implements db5.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.x0 f298508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db5.f3 f298509b;

    public u0(j93.x0 x0Var, db5.f3 f3Var) {
        this.f298508a = x0Var;
        this.f298509b = f3Var;
    }

    @Override // db5.d3
    public final void a(java.lang.CharSequence charSequence) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReNameLabelDialogUIC", "onTextChange() called with: charSequence = [" + ((java.lang.Object) charSequence) + ']');
        j93.x0 x0Var = this.f298508a;
        androidx.appcompat.app.AppCompatActivity activity = x0Var.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.hideVKB();
        }
        this.f298509b.B();
        java.lang.String obj = charSequence.toString();
        if (f93.q5.f260441a.a(x0Var.getContext(), obj)) {
            x0Var.f298531d = obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.ReNameLabelDialogUIC", "dealRenameLabel() called");
            java.lang.String stringExtra = x0Var.getIntent().getStringExtra("label_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            androidx.appcompat.app.AppCompatActivity activity2 = x0Var.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            x0Var.f298533f = ((cj5.o) pf5.z.f353948a.a(activity2).a(cj5.o.class)).T6();
            r45.es6 es6Var = new r45.es6();
            r45.f54 f54Var = new r45.f54();
            f54Var.f374021d = obj;
            f54Var.f374022e = java.lang.Integer.parseInt(stringExtra);
            es6Var.f373715d = f54Var;
            ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436684m, vg3.b.f436645e, vg3.c.f436670y, 0, null, 24, null));
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 636;
            lVar.f70666c = "/cgi-bin/micromsg-bin/updatecontactlabel";
            lVar.f70664a = es6Var;
            lVar.f70665b = new r45.fs6();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            iVar.l().K(new j93.s0(x0Var, stringExtra));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReNameLabelDialogUIC", "dealRenameLabel() called with: labelName = " + obj + " checkLabelNameValid fail");
        }
        b93.l.a(b93.l.f18596a, x0Var.getIntent().getIntExtra("key_label_click_source", 0), 15, 0, 0, 0, 28, null);
    }
}
