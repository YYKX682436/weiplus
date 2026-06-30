package yl2;

/* loaded from: classes3.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f462968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f462969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f462970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f462971g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.n f462972h;

    public a1(android.widget.TextView textView, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, yl2.g1 g1Var, com.tencent.mm.ui.widget.dialog.y1 y1Var, v65.n nVar) {
        this.f462968d = textView;
        this.f462969e = finderJumpInfo;
        this.f462970f = g1Var;
        this.f462971g = y1Var;
        this.f462972h = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ui/livepost/FinderLivePostHelper$showEligibilityDialog$2$1$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "eligibilityJumpInfo click ok");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = this.f462968d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo info = this.f462969e;
        kotlin.jvm.internal.o.g(info, "info");
        xc2.y2 y2Var = xc2.y2.f453343a;
        xc2.p0 p0Var = new xc2.p0(info);
        p0Var.f453252n = 0;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        yl2.g1 g1Var = this.f462970f;
        g1Var.f463013f.a();
        pm0.v.V(1000L, new yl2.z0(g1Var, this.f462971g, this.f462972h));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ui/livepost/FinderLivePostHelper$showEligibilityDialog$2$1$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
