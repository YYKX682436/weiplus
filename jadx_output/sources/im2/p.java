package im2;

/* loaded from: classes3.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.q f292477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f292478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f292479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f292480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292481h;

    public p(im2.q qVar, r45.cz1 cz1Var, long j17, r45.qt2 qt2Var, java.lang.String str) {
        this.f292477d = qVar;
        this.f292478e = cz1Var;
        this.f292479f = j17;
        this.f292480g = qt2Var;
        this.f292481h = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC$onCreate$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.G().r()).intValue() <= 0) {
            db5.t7.makeText(view.getContext(), view.getContext().getResources().getString(com.tencent.mm.R.string.cn9), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC$onCreate$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r45.zy1 zy1Var = new r45.zy1();
        zy1Var.set(0, this.f292481h);
        zy1Var.set(5, java.lang.Boolean.FALSE);
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        androidx.appcompat.app.AppCompatActivity activity = this.f292477d.getActivity();
        r45.cz1 cz1Var = this.f292478e;
        r45.j55 j55Var = (r45.j55) cz1Var.getCustom(11);
        int integer = j55Var != null ? j55Var.getInteger(0) : 0;
        java.lang.String string = cz1Var.getString(0);
        if (string == null) {
            string = "";
        }
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Vi(activity, integer, zy1Var, string, this.f292479f, this.f292480g, false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.ek((ml2.r0) c17, ml2.p4.f327803q, "", null, 0, null, 28, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC$onCreate$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
