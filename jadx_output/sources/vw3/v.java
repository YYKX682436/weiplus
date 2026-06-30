package vw3;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI f441153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI) {
        super(1);
        this.f441153d = repairerBlockDetectUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ix3.p0 state = (ix3.p0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof ix3.h0)) {
            ix3.h0 h0Var = (ix3.h0) dVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("时间点: ");
            sb7.append(h0Var.f295429b.f295420e.f295371a);
            sb7.append('(');
            ix3.g0 g0Var = h0Var.f295429b;
            sb7.append(k35.m1.e(g0Var.f295420e.f295371a));
            sb7.append(")\n");
            sb6.append(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Block时间: ");
            ix3.c cVar = g0Var.f295420e;
            sb8.append(cVar.f295372b);
            sb8.append("ms\n");
            sb6.append(sb8.toString());
            sb6.append("堆栈:\n");
            for (java.lang.StackTraceElement stackTraceElement : cVar.f295373c) {
                sb6.append("    ");
                sb6.append(stackTraceElement.toString());
                sb6.append("\n");
            }
            com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI = this.f441153d;
            android.content.Intent intent = new android.content.Intent(repairerBlockDetectUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerNormalContainerUI.class);
            pf5.j0.a(intent, ix3.e0.class);
            intent.putExtra("TraceInfo", sb6.toString());
            androidx.appcompat.app.AppCompatActivity context = repairerBlockDetectUI.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerBlockDetectUI$onCreate$5", "invoke", "(Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerBlockDetectState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/repairer/ui/RepairerBlockDetectUI$onCreate$5", "invoke", "(Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerBlockDetectState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f302826a;
    }
}
