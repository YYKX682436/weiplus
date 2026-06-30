package rb2;

/* loaded from: classes2.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f393707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f393708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f393709h;

    public o1(rb2.z2 z2Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var) {
        this.f393705d = z2Var;
        this.f393706e = s0Var;
        this.f393707f = j17;
        this.f393708g = j18;
        this.f393709h = j60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f393705d.F(this.f393706e, this.f393707f, this.f393708g, this.f393709h, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
