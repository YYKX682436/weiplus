package rb2;

/* loaded from: classes2.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rb2.m0 f393618f;

    public e0(so2.y0 y0Var, android.view.View view, rb2.m0 m0Var) {
        this.f393616d = y0Var;
        this.f393617e = view;
        this.f393618f = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$refreshDisplayFlag$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ly0 help_promotion_button = this.f393616d.f410703d.u0().getHelp_promotion_button();
        if (help_promotion_button != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) help_promotion_button.getCustom(1)) != null) {
            xc2.y2 y2Var = xc2.y2.f453343a;
            android.view.View view2 = this.f393617e;
            android.content.Context context = view2.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            rb2.m0 m0Var = this.f393618f;
            com.tencent.mm.plugin.lite.s g17 = y2Var.g(context, m0Var.f393686e.f0(), m0Var.f393686e.r());
            android.content.Context context2 = view2.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.R = g17;
            xc2.y2.i(y2Var, context2, p0Var, 0, null, 12, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$refreshDisplayFlag$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
