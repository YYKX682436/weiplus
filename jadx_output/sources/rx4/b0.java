package rx4;

/* loaded from: classes8.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.e0 f401102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx4.i f401103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401104f;

    public b0(rx4.e0 e0Var, rx4.i iVar, int i17) {
        this.f401102d = e0Var;
        this.f401103e = iVar;
        this.f401104f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vu4.a aVar = vu4.a.f440253w;
        int i17 = this.f401104f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        rx4.e0 e0Var = this.f401102d;
        rx4.i iVar = this.f401103e;
        e0Var.W6(aVar, iVar, valueOf);
        e0Var.U6(iVar, i17);
        rx4.e0.Y6(e0Var, false, 1, null);
        e0Var.hideVKB();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
