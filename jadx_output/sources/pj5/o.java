package pj5;

/* loaded from: classes9.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f355398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f355399e;

    public o(in5.s0 s0Var, com.tencent.mm.storage.f9 f9Var) {
        this.f355398d = s0Var;
        this.f355399e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/schedulemsg/ScheduleMsgItemConvert$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pj5.k kVar = pj5.k.f355386a;
        android.content.Context context = this.f355398d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kVar.c(context, this.f355399e);
        yj0.a.h(this, "com/tencent/mm/ui/schedulemsg/ScheduleMsgItemConvert$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
