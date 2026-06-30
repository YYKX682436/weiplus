package ix3;

/* loaded from: classes.dex */
public final class m3 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.o3 f295496d;

    public m3(ix3.o3 o3Var) {
        this.f295496d = o3Var;
    }

    @Override // in5.u
    public boolean a(android.view.View itemView, android.view.MotionEvent event, in5.c cVar, int i17) {
        ex3.e item = (ex3.e) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(item, "item");
        if (event.getAction() != 0) {
            return false;
        }
        int rawX = (int) event.getRawX();
        ix3.o3 o3Var = this.f295496d;
        o3Var.f295518f = rawX;
        o3Var.f295519g = (int) event.getRawY();
        return false;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        ex3.e dataItem = (ex3.e) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        ix3.o3 o3Var = this.f295496d;
        o3Var.f295520h = dataItem;
        r45.dp5 dp5Var = dataItem.f257209f;
        int integer = dp5Var.getInteger(2);
        if (integer == 1) {
            o3Var.getActivity().startActivityForResult(new android.content.Intent(o3Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerGroupUI.class).putExtra("key_config_item_list", dp5Var.toByteArray()), 1);
            return;
        }
        if (integer != 2) {
            if (integer == 3) {
                o3Var.getActivity().startActivityForResult(new android.content.Intent(o3Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerItemSettingUI.class).putExtra("key_config_item", dp5Var.toByteArray()), 2);
                return;
            }
            if (integer != 4) {
                return;
            }
            com.tencent.mm.autogen.events.RepairerActionEvent repairerActionEvent = new com.tencent.mm.autogen.events.RepairerActionEvent();
            am.uq uqVar = repairerActionEvent.f54679g;
            uqVar.f8125a = 2;
            uqVar.f8126b = dp5Var.getString(0);
            uqVar.f8127c = dataItem.f257210g;
            repairerActionEvent.e();
            java.lang.Object newInstance = java.lang.Class.forName(dp5Var.getString(10)).getConstructors()[0].newInstance(new java.lang.Object[0]);
            q55.a aVar = newInstance instanceof q55.a ? (q55.a) newInstance : null;
            if (aVar != null) {
                aVar.h(o3Var.getActivity());
                return;
            }
            android.widget.Toast.makeText(o3Var.getActivity(), "初始化失败：className: " + dp5Var.getString(10), 0).show();
            return;
        }
        java.util.LinkedList list = dp5Var.getList(3);
        kotlin.jvm.internal.o.f(list, "getValues(...)");
        java.lang.String str = (java.lang.String) kz5.n0.Z(list);
        java.util.LinkedList list2 = dp5Var.getList(3);
        kotlin.jvm.internal.o.f(list2, "getValues(...)");
        boolean b17 = kotlin.jvm.internal.o.b(kz5.n0.a0(list2, 1), "true");
        if (str != null) {
            if (kotlin.jvm.internal.o.b(str, "RepairerHonorRiskDebugUIC")) {
                android.content.Intent intent = new android.content.Intent();
                pf5.j0.a(intent, ix3.q2.class);
                intent.setClassName(o3Var.getActivity(), "com.tencent.mm.plugin.repairer.ui.RepairerNormalContainerUI");
                o3Var.getActivity().startActivityForResult(intent, 0);
                return;
            }
            if (kotlin.jvm.internal.o.b(str, "RepairerFloatBallDebugUIC")) {
                android.content.Intent intent2 = new android.content.Intent();
                pf5.j0.a(intent2, ix3.l2.class);
                intent2.setClassName(o3Var.getActivity(), "com.tencent.mm.plugin.repairer.ui.RepairerNormalContainerUI");
                o3Var.getActivity().startActivityForResult(intent2, 0);
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            lk5.s.e(intent3, b17);
            android.content.Intent className = intent3.setClassName(o3Var.getActivity(), str);
            kotlin.jvm.internal.o.f(className, "setClassName(...)");
            o3Var.getActivity().startActivityForResult(className, 0);
        }
    }

    @Override // in5.u
    public boolean v(android.view.View itemView, in5.c cVar, int i17) {
        ex3.e data = (ex3.e) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        ix3.o3 o3Var = this.f295496d;
        rl5.r rVar = o3Var.f295517e;
        if (rVar != null) {
            rVar.g(itemView, i17, 0L, new ix3.k3(o3Var, data, i17), new ix3.l3(o3Var, data, i17), o3Var.f295518f, o3Var.f295519g);
        }
        super.v(itemView, data, i17);
        return false;
    }
}
