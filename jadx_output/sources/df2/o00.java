package df2;

/* loaded from: classes3.dex */
public final class o00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.q00 f230911d;

    public o00(df2.q00 q00Var) {
        this.f230911d = q00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/VisitorCastScreenController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f327724f, 1);
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        df2.q00 q00Var = this.f230911d;
        if (((com.tencent.mm.feature.finder.live.v4) w0Var).qk(((mm2.e1) q00Var.business(mm2.e1.class)).f328988r)) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.d8h));
        } else {
            if2.b.Y6(q00Var, qo0.b.f365351f4, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/VisitorCastScreenController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
