package ze5;

/* loaded from: classes9.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ze5.f f471890f;

    public e(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, ze5.f fVar) {
        this.f471888d = dVar;
        this.f471889e = f9Var;
        this.f471890f = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppBrandMvvm$ChattingItemAppBrandTo$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yb5.d dVar = this.f471888d;
        boolean D = dVar.D();
        com.tencent.mm.storage.f9 f9Var = this.f471889e;
        ot0.q v17 = ot0.q.v(c01.w9.l(D, f9Var.j(), f9Var.A0()));
        int i17 = v17.f348666i;
        if (i17 == 33) {
            te5.t.f418749a.d(dVar, f9Var);
        } else if (i17 == 36) {
            kotlin.jvm.internal.o.d(view);
            te5.t.e(v17, dVar, view, f9Var, new com.tencent.mm.ui.chatting.viewitems.qq(this.f471890f));
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppBrandMvvm$ChattingItemAppBrandTo$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
