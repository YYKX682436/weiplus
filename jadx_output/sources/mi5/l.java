package mi5;

/* loaded from: classes4.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f326870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc5.d f326871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ot0.q f326872f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326873g;

    public l(r45.ev2 ev2Var, fc5.d dVar, ot0.q qVar, android.content.Context context) {
        this.f326870d = ev2Var;
        this.f326871e = dVar;
        this.f326872f = qVar;
        this.f326873g = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingFinderCollectionView$onUpdateViewModel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ev2 ev2Var = this.f326870d;
        if (ev2Var.getLong(0) != 0) {
            fc5.d dVar = this.f326871e;
            int i17 = com.tencent.mm.storage.z3.R4(dVar.getString(dVar.f43702d + 1)) ? 3 : 2;
            int i18 = this.f326872f.f348666i;
            android.content.Context context = this.f326873g;
            ya2.e1 e1Var = ya2.e1.f460472a;
            if (i18 == 119) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                kotlin.jvm.internal.o.f(context, "$context");
                e1Var.u(context, ev2Var, i17);
            } else {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                kotlin.jvm.internal.o.f(context, "$context");
                e1Var.n(context, ev2Var, i17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingFinderCollectionView$onUpdateViewModel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
