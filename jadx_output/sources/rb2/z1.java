package rb2;

/* loaded from: classes2.dex */
public final class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f393849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393853h;

    public z1(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, in5.s0 s0Var, java.lang.String str, so2.y0 y0Var, rb2.z2 z2Var) {
        this.f393849d = finderJumpInfo;
        this.f393850e = s0Var;
        this.f393851f = str;
        this.f393852g = y0Var;
        this.f393853h = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        so2.y0 y0Var = this.f393852g;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f393849d;
        rb2.z2 z2Var = this.f393853h;
        in5.s0 s0Var = this.f393850e;
        if (finderJumpInfo == null) {
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            i0Var.ql(context, this.f393851f, this.f393852g, z2Var.f393686e.a0(), z2Var.f393686e.k0());
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c17).Gk(context2, y0Var.f410703d.field_feedId, (r18 & 4) != 0 ? false : true, (r18 & 8) != 0 ? false : false, 2, (r18 & 32) != 0 ? false : true);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        r45.ky0 advertisement_info = y0Var.f410703d.u0().getAdvertisement_info();
        if (advertisement_info == null || (string = advertisement_info.getString(4)) == null) {
            r45.qy0 promotion_info = y0Var.f410703d.u0().getPromotion_info();
            string = promotion_info != null ? promotion_info.getString(4) : null;
        }
        if (string == null) {
            string = "";
        }
        p0Var.f453254p = string;
        p0Var.f453244f = z2Var.f393686e.f0();
        xc2.y2.i(y2Var, context3, p0Var, 0, null, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
