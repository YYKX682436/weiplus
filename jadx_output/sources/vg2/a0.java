package vg2;

/* loaded from: classes3.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f436465a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f436466b;

    /* renamed from: c, reason: collision with root package name */
    public final tg2.h f436467c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f436468d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f436469e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f436470f;

    /* renamed from: g, reason: collision with root package name */
    public final vg2.w f436471g;

    /* renamed from: h, reason: collision with root package name */
    public ce2.i f436472h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f436473i;

    public a0(android.content.Context context, android.view.ViewGroup parentRoot, tg2.h onBatchSelect) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parentRoot, "parentRoot");
        kotlin.jvm.internal.o.g(onBatchSelect, "onBatchSelect");
        this.f436465a = context;
        this.f436466b = parentRoot;
        this.f436467c = onBatchSelect;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aro, (android.view.ViewGroup) null);
        this.f436468d = inflate;
        this.f436469e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a4f);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f436470f = linkedList;
        vg2.w wVar = new vg2.w(this, linkedList);
        this.f436471g = wVar;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.lqa);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setVerticalFadingEdgeEnabled(false);
        recyclerView.setVerticalScrollBarEnabled(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(wVar);
        this.f436473i = recyclerView;
        recyclerView.N(new vg2.x(this));
    }

    public final void a() {
        android.view.View view = this.f436468d;
        if (view.getVisibility() == 0) {
            android.view.View view2 = this.f436468d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f436466b.removeView(view);
        }
    }
}
