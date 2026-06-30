package in5;

/* loaded from: classes10.dex */
public class s0 extends in5.r0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f293121e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.f2 f293122f;

    /* renamed from: g, reason: collision with root package name */
    public final x4.a f293123g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f293124h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f293125i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f293126m;

    public s0(android.view.View view, x4.a aVar) {
        super(view);
        this.f293126m = null;
        new java.util.LinkedHashSet();
        new java.util.LinkedHashSet();
        this.f293121e = view.getContext();
        this.f293123g = aVar;
    }

    public java.lang.Object l() {
        return this.f293125i;
    }

    public android.content.Context n() {
        return this.f293121e;
    }

    public androidx.recyclerview.widget.RecyclerView o() {
        if (this.f293126m != null || !(this.itemView.getParent() instanceof androidx.recyclerview.widget.RecyclerView)) {
            return this.f293126m;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.itemView.getParent();
        this.f293126m = recyclerView;
        return recyclerView;
    }

    public android.view.View p(int i17) {
        return this.itemView.findViewById(i17);
    }

    public void q(java.lang.Object obj) {
        this.f293125i = obj;
    }

    public in5.s0 r(int i17, int i18) {
        ((android.widget.TextView) p(i17)).setText(i18);
        return this;
    }

    public in5.s0 s(int i17, java.lang.CharSequence charSequence) {
        ((android.widget.TextView) p(i17)).setText(charSequence);
        return this;
    }

    public in5.s0 v(int i17, int i18) {
        ((android.widget.TextView) p(i17)).setTextColor(i18);
        return this;
    }

    public in5.s0 w(int i17, int i18) {
        android.view.View p17 = p(i17);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/view/recyclerview/SimpleViewHolder", "setVisible", "(II)Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/view/recyclerview/SimpleViewHolder", "setVisible", "(II)Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return this;
    }

    public s0(android.view.View view) {
        super(view);
        this.f293126m = null;
        new java.util.LinkedHashSet();
        new java.util.LinkedHashSet();
        this.f293121e = view.getContext();
    }
}
