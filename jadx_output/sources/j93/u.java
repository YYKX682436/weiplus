package j93;

/* loaded from: classes11.dex */
public final class u implements db5.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.w f298506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db5.f3 f298507b;

    public u(j93.w wVar, db5.f3 f3Var) {
        this.f298506a = wVar;
        this.f298507b = f3Var;
    }

    @Override // db5.d3
    public final void a(java.lang.CharSequence charSequence) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CreateNewLabelUIC", "onTextChange() called with: charSequence = [" + ((java.lang.Object) charSequence) + ']');
        j93.w wVar = this.f298506a;
        androidx.appcompat.app.AppCompatActivity activity = wVar.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.hideVKB();
        }
        db5.f3 f3Var = this.f298507b;
        f3Var.B();
        java.lang.String obj = charSequence.toString();
        if (f93.q5.f260441a.a(wVar.getContext(), obj)) {
            androidx.appcompat.app.AppCompatActivity activity2 = wVar.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            wVar.f298525d = ((cj5.o) pf5.z.f353948a.a(activity2).a(cj5.o.class)).T6();
            r45.b4 b4Var = new r45.b4();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.f54 f54Var = new r45.f54();
            f54Var.f374021d = obj;
            linkedList.add(f54Var);
            b4Var.f370506e = linkedList;
            b4Var.f370505d = 1;
            ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436684m, vg3.b.f436645e, vg3.c.f436668w, 0, null, 24, null));
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = kd1.c.CTRL_INDEX;
            lVar.f70666c = "/cgi-bin/micromsg-bin/addcontactlabel";
            lVar.f70664a = b4Var;
            lVar.f70665b = new r45.c4();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            iVar.l().K(new j93.s(wVar));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CreateNewLabelUIC", "dealRenameLabel() called with: labelName = " + obj + " checkLabelNameValid fail");
        }
        b93.l.a(b93.l.f18596a, wVar.getIntent().getIntExtra("key_label_click_source", 0), 10, 1, 0, 0, 16, null);
        if (wVar.getActivity() instanceof com.tencent.mm.plugin.label.ui.ContactLabelSelectUI) {
            androidx.appcompat.app.AppCompatActivity activity3 = wVar.getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            j93.r rVar = (j93.r) pf5.z.f353948a.a(activity3).a(j93.r.class);
            android.widget.Button nextBtn = f3Var.N;
            kotlin.jvm.internal.o.f(nextBtn, "nextBtn");
            java.lang.String labelName = charSequence.toString();
            rVar.getClass();
            kotlin.jvm.internal.o.g(labelName, "labelName");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", nextBtn, kz5.c1.k(new jz5.l("view_id", "label_create_finish_btn"), new jz5.l("label_business_type", (java.lang.String) ((jz5.n) rVar.f298487e).getValue()), new jz5.l("label_select_sessionid", rVar.O6()), new jz5.l("label_text_cnt", java.lang.Integer.valueOf(labelName.length()))), 33926);
        }
    }
}
