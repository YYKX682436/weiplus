package qg5;

/* loaded from: classes8.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.p f362953d;

    public e(qg5.p pVar) {
        this.f362953d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/ChatRecordsAnalyzeStagingDialog$createBodyView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "User clicked detail button");
        qg5.p pVar = this.f362953d;
        jt.x xVar = (jt.x) ((jz5.n) pVar.f363124f).getValue();
        android.content.Context context = pVar.f363119a;
        ((jb0.g) xVar).Di(context, pVar.f363120b, 9, context.getString(com.tencent.mm.R.string.pd_), true);
        qg5.p.a(pVar, 3, pVar.b());
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/ChatRecordsAnalyzeStagingDialog$createBodyView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
