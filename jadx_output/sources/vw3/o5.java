package vw3;

/* loaded from: classes.dex */
public final class o5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw3.q5 f441053d;

    public o5(vw3.q5 q5Var) {
        this.f441053d = q5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.text.Editable text;
        java.lang.String obj;
        vw3.n nVar;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerSetValueDialog$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vw3.q5 q5Var = this.f441053d;
        android.widget.EditText editText = q5Var.f441088m;
        if (editText != null && (text = editText.getText()) != null && (obj = text.toString()) != null && (nVar = q5Var.f441087i) != null) {
            ix3.g3 g3Var = (ix3.g3) nVar;
            r45.dp5 dp5Var = g3Var.f295425d;
            java.util.List list = g3Var.f295422a;
            if (list != null) {
                java.lang.String str2 = (java.lang.String) list.get(list.size() - 1);
                switch (str2.hashCode()) {
                    case -1808118735:
                        if (str2.equals("String")) {
                            bm5.o1 o1Var = bm5.o1.f22719a;
                            java.lang.String string = dp5Var.getString(0);
                            o1Var.p(string != null ? string : "", obj);
                            break;
                        }
                        break;
                    case 73679:
                        if (str2.equals("Int")) {
                            bm5.o1 o1Var2 = bm5.o1.f22719a;
                            java.lang.String string2 = dp5Var.getString(0);
                            str = string2 != null ? string2 : "";
                            java.lang.Integer h17 = r26.h0.h(obj);
                            o1Var2.p(str, java.lang.Integer.valueOf(h17 != null ? h17.intValue() : 0));
                            break;
                        }
                        break;
                    case 2374300:
                        if (str2.equals("Long")) {
                            bm5.o1 o1Var3 = bm5.o1.f22719a;
                            java.lang.String string3 = dp5Var.getString(0);
                            str = string3 != null ? string3 : "";
                            java.lang.Long j17 = r26.h0.j(obj);
                            o1Var3.p(str, java.lang.Long.valueOf(j17 != null ? j17.longValue() : 0L));
                            break;
                        }
                        break;
                    case 67973692:
                        if (str2.equals("Float")) {
                            bm5.o1 o1Var4 = bm5.o1.f22719a;
                            java.lang.String string4 = dp5Var.getString(0);
                            str = string4 != null ? string4 : "";
                            java.lang.Float f17 = r26.g0.f(obj);
                            o1Var4.p(str, java.lang.Float.valueOf(f17 != null ? f17.floatValue() : 0.0f));
                            break;
                        }
                        break;
                }
            }
            ex3.e eVar = g3Var.f295423b;
            ex3.e eVar2 = (ex3.e) eVar.y0();
            eVar2.f257210g = obj;
            ix3.j3 j3Var = g3Var.f295424c;
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = j3Var.f295466d;
            if (mvvmList != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList.A(mvvmList, eVar2, false, 2, null);
            }
            com.tencent.mm.autogen.events.RepairerActionEvent repairerActionEvent = new com.tencent.mm.autogen.events.RepairerActionEvent();
            am.uq uqVar = repairerActionEvent.f54679g;
            uqVar.f8125a = 1;
            uqVar.f8126b = dp5Var.getString(0);
            uqVar.f8127c = obj;
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
        q5Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerSetValueDialog$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
