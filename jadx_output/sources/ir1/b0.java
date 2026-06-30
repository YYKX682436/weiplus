package ir1;

/* loaded from: classes11.dex */
public final class b0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.u f293937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir1.e0 f293938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f293939f;

    public b0(ir1.u uVar, ir1.e0 e0Var, android.view.View view) {
        this.f293937d = uVar;
        this.f293938e = e0Var;
        this.f293939f = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansConversationAdapter$onCreateViewHolder$1$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        ir1.u uVar = this.f293937d;
        hr1.e eVar = (hr1.e) uVar.f293125i;
        ir1.w wVar = this.f293938e.f293965o;
        if (wVar != null) {
            android.view.View itemView = this.f293939f;
            kotlin.jvm.internal.o.f(itemView, "$itemView");
            int adapterPosition = uVar.getAdapterPosition();
            kotlin.jvm.internal.o.d(eVar);
            ir1.t tVar = (ir1.t) wVar;
            tVar.f294048e = eVar;
            rl5.r rVar = new rl5.r(itemView.getContext());
            rVar.L = tVar;
            rVar.g(itemView, adapterPosition, 0L, tVar, tVar, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
            rVar.m();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansConversationAdapter$onCreateViewHolder$1$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
