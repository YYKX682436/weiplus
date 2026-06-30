package go2;

/* loaded from: classes2.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f274075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f274077g;

    public w0(android.content.Context context, int i17, java.lang.String str, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f274074d = context;
        this.f274075e = i17;
        this.f274076f = str;
        this.f274077g = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$showMemberBecomeDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f274074d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        boolean d17 = eo2.f.f255565a.d(java.lang.Integer.valueOf(this.f274075e));
        java.lang.String str = this.f274076f;
        if (d17) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Gk(context, intent, str);
        } else {
            km5.d T = pm0.v.T(new ho2.c(V6, this.f274076f, 0, 4, null).l(), new go2.v0(context, intent, str));
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            T.f((com.tencent.mm.plugin.finder.ui.MMFinderUI) context);
        }
        this.f274077g.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$showMemberBecomeDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
