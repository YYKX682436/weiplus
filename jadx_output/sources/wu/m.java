package wu;

/* loaded from: classes9.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s15.d0 f449594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.p f449595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f449596f;

    public m(s15.d0 d0Var, wu.p pVar, android.content.Context context) {
        this.f449594d = d0Var;
        this.f449595e = pVar;
        this.f449596f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailBaseItemConvert$onBindQuoteView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f449596f;
        s15.d0 d0Var = this.f449594d;
        wu.l lVar = new wu.l(context, d0Var);
        if (d0Var.k() <= 0) {
            lVar.invoke();
            yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailBaseItemConvert$onBindQuoteView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        wu.p pVar = this.f449595e;
        java.util.Iterator it = pVar.f449611f.f152065o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (d0Var.k() == ((hu.b) obj).f284997e.A()) {
                    break;
                }
            }
        }
        hu.b bVar = (hu.b) obj;
        if (bVar == null) {
            lVar.invoke();
            yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailBaseItemConvert$onBindQuoteView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        wu.b2 b2Var = wu.b2.f449545a;
        wu.p a17 = b2Var.a(b2Var.b(bVar.f284997e), pVar.f449610e, pVar.f449611f);
        kotlin.jvm.internal.o.d(view);
        a17.o(view, bVar);
        ty.k0 k0Var = (ty.k0) i95.n0.c(ty.k0.class);
        ty.p0 p0Var = ty.p0.f422736e;
        int type = d0Var.getType();
        ((ti3.q) k0Var).getClass();
        ((ku5.t0) ku5.t0.f312615d).b(new ti3.p(p0Var, type), "MicroMsg.msgquote.MsgReportManager");
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailBaseItemConvert$onBindQuoteView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
