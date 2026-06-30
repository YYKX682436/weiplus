package rb2;

/* loaded from: classes2.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f393716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f393717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393719g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393720h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393721i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393722m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f393723n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f393724o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f393725p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(boolean z17, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, rb2.z2 z2Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var) {
        super(0);
        this.f393716d = z17;
        this.f393717e = viewGroup;
        this.f393718f = view;
        this.f393719g = view2;
        this.f393720h = view3;
        this.f393721i = z2Var;
        this.f393722m = s0Var;
        this.f393723n = j17;
        this.f393724o = j18;
        this.f393725p = j60Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f393716d;
        android.view.ViewGroup viewGroup = this.f393717e;
        if (z17) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            android.view.View view = this.f393718f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f393719g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f393720h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setOnClickListener(new rb2.o1(this.f393721i, this.f393722m, this.f393723n, this.f393724o, this.f393725p));
        }
        return jz5.f0.f302826a;
    }
}
