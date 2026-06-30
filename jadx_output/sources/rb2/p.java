package rb2;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f393714f;

    public p(so2.y0 y0Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f393712d = y0Var;
        this.f393713e = s0Var;
        this.f393714f = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$refreshAdContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        so2.y0 y0Var = this.f393712d;
        r45.ky0 advertisement_info = y0Var.f410703d.u0().getAdvertisement_info();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = advertisement_info != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) advertisement_info.getCustom(0) : null;
        if (y0Var.f410703d.a1() && finderJumpInfo != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "onItemClick click comment advertisement, jumpInfo=" + hc2.g0.d(finderJumpInfo));
            in5.s0 s0Var = this.f393713e;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.report.u.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((com.tencent.mm.plugin.finder.report.u) a17).Q6(s0Var, y0Var, y0Var.f410707h, 138);
            xc2.y2 y2Var = xc2.y2.f453343a;
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453244f = this.f393714f;
            xc2.y2.i(y2Var, context2, p0Var, 0, this.f393713e, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$refreshAdContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
