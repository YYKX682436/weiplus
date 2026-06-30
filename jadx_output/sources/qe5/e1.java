package qe5;

/* loaded from: classes12.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f362090d;

    public e1(qe5.n1 n1Var) {
        this.f362090d = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initFileDownloadBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qe5.n1 n1Var = this.f362090d;
        j75.f Q6 = n1Var.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.i(false));
        }
        androidx.appcompat.app.AppCompatActivity activity = n1Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        qe5.z zVar = (qe5.z) pf5.z.f353948a.a(activity).a(qe5.z.class);
        qe5.d1 d1Var = new qe5.d1(n1Var);
        zVar.getClass();
        kd5.e V6 = zVar.V6();
        java.lang.String str = V6 != null ? V6.f306892w : null;
        if (str != null ? r26.n0.B(str, ".apk", false) : false) {
            z17 = true;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(zVar.getContext(), 1, 2, false);
            z2Var.m(zVar.getString(com.tencent.mm.R.string.f490347sg), zVar.getString(com.tencent.mm.R.string.f489792bt));
            z2Var.o(0);
            com.tencent.mm.ui.bk.r0(z2Var.C.getPaint(), 0.8f);
            z2Var.v(zVar.getColor(com.tencent.mm.R.color.a0c));
            qe5.w wVar = new qe5.w(z2Var);
            qe5.x xVar = new qe5.x(d1Var, z2Var);
            z2Var.D = wVar;
            z2Var.E = xVar;
            z2Var.q(zVar.getString(com.tencent.mm.R.string.dt9));
            android.widget.TextView textView = new android.widget.TextView(zVar.getContext());
            textView.setText(com.tencent.mm.R.string.dt8);
            textView.setTextColor(zVar.getColor(com.tencent.mm.R.color.f478719fa));
            textView.setTextSize(14.0f);
            z2Var.j(textView);
            z2Var.C();
        } else {
            z17 = false;
        }
        if (!z17) {
            j75.f Q62 = n1Var.Q6();
            if (Q62 != null) {
                Q62.B3(new kd5.y());
            }
            j75.f Q63 = n1Var.Q6();
            if (Q63 != null) {
                kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209725m);
                nVar.f306904c = false;
                nVar.f306905d = com.tencent.mm.ui.report.l.f209687h;
                Q63.B3(nVar);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initFileDownloadBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
