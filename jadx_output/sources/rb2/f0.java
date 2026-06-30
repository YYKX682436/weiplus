package rb2;

/* loaded from: classes2.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.m60 f393622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rb2.m0 f393625g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393626h;

    public f0(r45.m60 m60Var, java.lang.String str, in5.s0 s0Var, rb2.m0 m0Var, so2.y0 y0Var) {
        this.f393622d = m60Var;
        this.f393623e = str;
        this.f393624f = s0Var;
        this.f393625g = m0Var;
        this.f393626h = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$refreshRefFeed$1$3$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) this.f393622d.getCustom(1);
        kotlin.jvm.internal.o.d(finderJumpInfo);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "onItemClick click, " + this.f393623e + " jumpInfo=" + hc2.g0.d(finderJumpInfo));
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context = this.f393624f.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        p0Var.f453244f = this.f393625g.f393686e.f0();
        p0Var.f453245g = this.f393626h.f410703d.t0();
        p0Var.f453255q = com.tencent.mars.cdn.CdnManager.kAppTypeTingImage;
        xc2.y2.i(y2Var, context, p0Var, 0, this.f393624f, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$refreshRefFeed$1$3$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
