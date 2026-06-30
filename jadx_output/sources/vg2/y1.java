package vg2;

/* loaded from: classes3.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f436622a;

    /* renamed from: b, reason: collision with root package name */
    public final tg2.h f436623b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f436624c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f436625d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.PopupWindow f436626e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f436627f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f436628g;

    /* renamed from: h, reason: collision with root package name */
    public final vg2.u1 f436629h;

    /* renamed from: i, reason: collision with root package name */
    public r45.kv1 f436630i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f436631j;

    public y1(android.content.Context context, tg2.h onBatchSelect, yz5.a onDismiss) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onBatchSelect, "onBatchSelect");
        kotlin.jvm.internal.o.g(onDismiss, "onDismiss");
        this.f436622a = context;
        this.f436623b = onBatchSelect;
        this.f436624c = onDismiss;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aro, (android.view.ViewGroup) null);
        this.f436625d = inflate;
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -1, -2, true);
        this.f436626e = popupWindow;
        this.f436627f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a4f);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f436628g = linkedList;
        vg2.u1 u1Var = new vg2.u1(this, linkedList);
        this.f436629h = u1Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.lqa);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setVerticalFadingEdgeEnabled(false);
        recyclerView.setVerticalScrollBarEnabled(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(u1Var);
        this.f436631j = recyclerView;
        recyclerView.setBackgroundResource(com.tencent.mm.R.drawable.d2q);
        recyclerView.N(new vg2.v1(this));
        popupWindow.setOutsideTouchable(true);
    }
}
