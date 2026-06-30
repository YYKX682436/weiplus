package qe5;

/* loaded from: classes12.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f362126d;

    public i1(qe5.n1 n1Var) {
        this.f362126d = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.storage.f9 f9Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initPreview$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qe5.n1 n1Var = this.f362126d;
        androidx.appcompat.app.AppCompatActivity activity = n1Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC.class)).W6()) {
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = n1Var.P6();
            if (P6 != null) {
                P6.finish();
            }
            yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initPreview$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        kd5.e T6 = n1Var.T6();
        jz5.f0 f0Var = null;
        if (T6 != null && T6.f306884o) {
            kd5.e T62 = n1Var.T6();
            if (T62 != null) {
                T62.M = true;
            }
            kd5.e T63 = n1Var.T6();
            if (T63 != null) {
                T63.L = false;
            }
            j75.f Q6 = n1Var.Q6();
            if (Q6 != null) {
                Q6.B3(new kd5.u(6, 0, 2, null));
            }
            androidx.appcompat.app.AppCompatActivity activity2 = n1Var.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((qe5.z) pf5.z.f353948a.a(activity2).a(qe5.z.class)).X6(0L);
        } else {
            kd5.e T64 = n1Var.T6();
            if (T64 != null && (f9Var = T64.f306877e) != null) {
                sc5.g gVar = sc5.g.f406572a;
                android.app.Activity context = n1Var.getContext();
                kd5.e T65 = n1Var.T6();
                sc5.g.g(gVar, context, f9Var, false, false, T65 != null ? T65.f306886q : null, 12, null);
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = n1Var.P6();
                if (P62 != null) {
                    P62.finish();
                    f0Var = jz5.f0.f302826a;
                }
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePageLogicUIC", "openOriginFileBtn: msg is null");
            }
        }
        j75.f Q62 = n1Var.Q6();
        if (Q62 != null) {
            kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209724i);
            nVar.f306904c = false;
            Q62.B3(nVar);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initPreview$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
