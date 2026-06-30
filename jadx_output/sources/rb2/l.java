package rb2;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.v f393673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f393676g;

    public l(rb2.v vVar, in5.s0 s0Var, so2.y0 y0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f393673d = vVar;
        this.f393674e = s0Var;
        this.f393675f = y0Var;
        this.f393676g = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rb2.v.B(this.f393673d, this.f393674e, this.f393675f, this.f393676g, 2);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
