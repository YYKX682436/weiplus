package el2;

/* loaded from: classes3.dex */
public final class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f253743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f253744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.y42 f253745f;

    public a2(cm2.b0 b0Var, el2.c2 c2Var, r45.y42 y42Var) {
        this.f253743d = b0Var;
        this.f253744e = c2Var;
        this.f253745f = y42Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLivePromoteFixedEntranceWidget$setAppDownloadOrOther$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cm2.b0 b0Var = this.f253743d;
        java.lang.Integer g17 = b0Var.g();
        el2.c2 c2Var = this.f253744e;
        if (g17 != null) {
            int intValue = g17.intValue();
            bf2.c cVar = bf2.c.f19598a;
            gk2.e l17 = c2Var.l();
            java.lang.String jump_id = b0Var.f43331v.getJump_id();
            if (jump_id == null) {
                jump_id = "";
            }
            bf2.c.c(cVar, l17, 5, intValue, jump_id, 0, null, 0, 2, null, 0, nd1.y0.CTRL_INDEX, null);
        }
        df2.nt ntVar = (df2.nt) c2Var.f253762e.U0(df2.nt.class);
        r45.y42 y42Var = this.f253745f;
        if (ntVar != null) {
            r45.yp5 yp5Var = new r45.yp5();
            yp5Var.set(0, java.lang.Long.valueOf(y42Var.getLong(0)));
            yp5Var.set(2, 1);
            yp5Var.set(1, 4);
            yp5Var.set(3, y42Var.getByteString(5));
            ntVar.a7(yp5Var);
        }
        if (y42Var.getBoolean(3)) {
            c2Var.n(y42Var, null, new el2.y1(y42Var, c2Var, b0Var));
        } else {
            el2.c2.k(c2Var, new el2.z1(c2Var, b0Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLivePromoteFixedEntranceWidget$setAppDownloadOrOther$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
