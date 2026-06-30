package m0;

/* loaded from: classes14.dex */
public final class t extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final int f322508d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f322509e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f322510f;

    /* renamed from: g, reason: collision with root package name */
    public final m0.u f322511g;

    /* renamed from: h, reason: collision with root package name */
    public int f322512h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f322508d = 5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f322509e = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f322510f = arrayList2;
        this.f322511g = new m0.u();
        setClipChildren(false);
        m0.v vVar = new m0.v(context);
        addView(vVar);
        arrayList.add(vVar);
        arrayList2.add(vVar);
        this.f322512h = 1;
        setTag(com.tencent.mm.R.id.f485243h04, java.lang.Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(0, 0);
    }
}
