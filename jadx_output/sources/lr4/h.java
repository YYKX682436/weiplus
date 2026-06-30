package lr4;

/* loaded from: classes11.dex */
public final class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr4.e f320733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr4.k f320734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f320735f;

    public h(lr4.e eVar, lr4.k kVar, android.view.View view) {
        this.f320733d = eVar;
        this.f320734e = kVar;
        this.f320735f = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter$onCreateViewHolder$1$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        lr4.e eVar = this.f320733d;
        kr4.g gVar = (kr4.g) eVar.f293125i;
        lr4.d dVar = this.f320734e.f320745h;
        if (dVar != null) {
            android.view.View itemView = this.f320735f;
            kotlin.jvm.internal.o.f(itemView, "$itemView");
            int adapterPosition = eVar.getAdapterPosition();
            kotlin.jvm.internal.o.d(gVar);
            lr4.s sVar = (lr4.s) dVar;
            sVar.f320762d = gVar;
            rl5.r rVar = new rl5.r(itemView.getContext());
            rVar.L = sVar;
            rVar.g(itemView, adapterPosition, 0L, sVar, sVar, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
            rVar.m();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter$onCreateViewHolder$1$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
