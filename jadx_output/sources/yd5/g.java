package yd5;

/* loaded from: classes4.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.view.View view, com.tencent.mm.storage.f9 msg, boolean z17, java.lang.String str) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.Chatting.ChatTagSearchSpanClickReportFlow", "bindDataToWidget widget:" + view);
        if (view != null) {
            r45.ek6 ek6Var = new r45.ek6();
            ek6Var.f373584d = msg.I0();
            ek6Var.f373585e = z17 ? 2 : 1;
            if (z17) {
                str = msg.Q0();
            }
            ek6Var.f373586f = str;
            ek6Var.f373587g = msg.getCreateTime();
            ek6Var.f373588h = 0;
            ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).getClass();
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            t04.a aVar = context instanceof com.tencent.mm.ui.component.UIComponentActivity ? (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class) : null;
            o04.n O6 = aVar != null ? aVar.O6(1) : null;
            if (O6 == null) {
                O6 = new o04.g(1);
                android.content.Context context2 = view.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                t04.a aVar2 = context2 instanceof com.tencent.mm.ui.component.UIComponentActivity ? (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(t04.a.class) : null;
                if (aVar2 != null) {
                    aVar2.S6(O6);
                }
            }
            ((o04.g) O6).b(java.lang.String.valueOf(view.hashCode()), ek6Var);
        }
    }
}
