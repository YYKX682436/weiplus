package ix3;

/* loaded from: classes.dex */
public final class f3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dp5 f295409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f295410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex3.e f295411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ix3.j3 f295412g;

    public f3(r45.dp5 dp5Var, java.util.List list, ex3.e eVar, ix3.j3 j3Var) {
        this.f295409d = dp5Var;
        this.f295410e = list;
        this.f295411f = eVar;
        this.f295412g = j3Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.dp5 dp5Var = this.f295409d;
        java.util.LinkedList list = dp5Var.getList(3);
        kotlin.jvm.internal.o.f(list, "getValues(...)");
        java.lang.String str = (java.lang.String) kz5.n0.a0(list, menuItem.getItemId());
        if (str != null) {
            java.util.List list2 = this.f295410e;
            if (list2 != null) {
                java.lang.String str2 = (java.lang.String) list2.get(list2.size() - 1);
                switch (str2.hashCode()) {
                    case -1808118735:
                        if (str2.equals("String")) {
                            bm5.o1 o1Var = bm5.o1.f22719a;
                            java.lang.String string = dp5Var.getString(0);
                            o1Var.p(string != null ? string : "", str);
                            break;
                        }
                        break;
                    case 73679:
                        if (str2.equals("Int")) {
                            bm5.o1 o1Var2 = bm5.o1.f22719a;
                            java.lang.String string2 = dp5Var.getString(0);
                            o1Var2.p(string2 != null ? string2 : "", java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                            break;
                        }
                        break;
                    case 2374300:
                        if (str2.equals("Long")) {
                            bm5.o1 o1Var3 = bm5.o1.f22719a;
                            java.lang.String string3 = dp5Var.getString(0);
                            o1Var3.p(string3 != null ? string3 : "", java.lang.Long.valueOf(java.lang.Long.parseLong(str)));
                            break;
                        }
                        break;
                    case 67973692:
                        if (str2.equals("Float")) {
                            bm5.o1 o1Var4 = bm5.o1.f22719a;
                            java.lang.String string4 = dp5Var.getString(0);
                            o1Var4.p(string4 != null ? string4 : "", java.lang.Float.valueOf(java.lang.Float.parseFloat(str)));
                            break;
                        }
                        break;
                }
            }
            ex3.e eVar = this.f295411f;
            ex3.e eVar2 = (ex3.e) eVar.y0();
            eVar2.f257210g = str;
            ix3.j3 j3Var = this.f295412g;
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = j3Var.f295466d;
            if (mvvmList != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList.A(mvvmList, eVar2, false, 2, null);
            }
            com.tencent.mm.autogen.events.RepairerActionEvent repairerActionEvent = new com.tencent.mm.autogen.events.RepairerActionEvent();
            am.uq uqVar = repairerActionEvent.f54679g;
            uqVar.f8125a = 1;
            uqVar.f8126b = dp5Var.getString(0);
            uqVar.f8127c = str;
            repairerActionEvent.e();
            androidx.appcompat.app.AppCompatActivity activity = j3Var.getActivity();
            r45.dp5 item = eVar.f257209f;
            kotlin.jvm.internal.o.g(item, "item");
            kotlin.jvm.internal.o.g(activity, "activity");
            if (item.getInteger(4) == 1) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
                u1Var.g("需要重启微信才可以使设置生效！");
                u1Var.a(true);
                u1Var.b(new ex3.a(activity));
                u1Var.q(false);
            }
        }
    }
}
