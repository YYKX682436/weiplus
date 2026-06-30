package qe5;

/* loaded from: classes12.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f362140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f362141e;

    public l1(qe5.n1 n1Var, boolean z17) {
        this.f362140d = n1Var;
        this.f362141e = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$setRoundProgressBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qe5.n1 n1Var = this.f362140d;
        j75.f Q6 = n1Var.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.t(this.f362141e));
        }
        j75.f Q62 = n1Var.Q6();
        if (Q62 != null) {
            kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209725m);
            nVar.f306904c = false;
            nVar.f306905d = com.tencent.mm.ui.report.l.f209688i;
            Q62.B3(nVar);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$setRoundProgressBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
