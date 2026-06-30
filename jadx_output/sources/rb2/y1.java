package rb2;

/* loaded from: classes2.dex */
public final class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f393835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393837f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393838g;

    public y1(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, in5.s0 s0Var, so2.y0 y0Var, rb2.z2 z2Var) {
        this.f393835d = finderJumpInfo;
        this.f393836e = s0Var;
        this.f393837f = y0Var;
        this.f393838g = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String string2 = null;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f393835d;
        in5.s0 s0Var = this.f393836e;
        so2.y0 y0Var = this.f393837f;
        if (finderJumpInfo == null) {
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            java.lang.String Z0 = y0Var.f410703d.Z0();
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            i0Var.Bk(Z0, context);
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar != null) {
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zi(1, y0Var.f410703d.field_feedId, nyVar.V6(), 2, y0Var.f410703d.Z0());
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        r45.ky0 advertisement_info = y0Var.f410703d.u0().getAdvertisement_info();
        if (advertisement_info == null || (string = advertisement_info.getString(4)) == null) {
            r45.qy0 promotion_info = y0Var.f410703d.u0().getPromotion_info();
            if (promotion_info != null) {
                string2 = promotion_info.getString(4);
            }
        } else {
            string2 = string;
        }
        if (string2 == null) {
            string2 = "";
        }
        p0Var.f453254p = string2;
        p0Var.f453244f = this.f393838g.f393686e.f0();
        xc2.y2.i(y2Var, context3, p0Var, 0, null, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
