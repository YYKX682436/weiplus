package mi5;

/* loaded from: classes9.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.e0 f326939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f326941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l15.c f326942g;

    public y(mi5.e0 e0Var, android.content.Context context, com.tencent.mm.storage.f9 f9Var, l15.c cVar) {
        this.f326939d = e0Var;
        this.f326940e = context;
        this.f326941f = f9Var;
        this.f326942g = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingLiteAppView$onUpdateLegacyViewModel$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f326940e;
        kotlin.jvm.internal.o.f(context, "$context");
        this.f326939d.getClass();
        ji5.b.f299961a.a(context, this.f326941f, this.f326942g);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingLiteAppView$onUpdateLegacyViewModel$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
