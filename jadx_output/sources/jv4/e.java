package jv4;

/* loaded from: classes12.dex */
public abstract class e implements jv4.f {

    /* renamed from: a, reason: collision with root package name */
    public final su4.p0 f302235a;

    /* renamed from: b, reason: collision with root package name */
    public nv4.e f302236b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.ViewGroup f302237c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f302238d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f302239e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f302240f;

    public e(su4.p0 config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f302235a = config;
        this.f302238d = jz5.h.b(new jv4.d(this));
        this.f302239e = jz5.h.b(new jv4.a(this));
        this.f302240f = jz5.h.b(new jv4.b(this));
    }

    public abstract jv4.h a();

    public int b() {
        return com.tencent.mm.R.layout.egj;
    }

    public void c() {
        android.view.ViewGroup viewGroup;
        su4.p0 p0Var = this.f302235a;
        android.view.View findViewById = p0Var.getActivity().findViewById(p0Var.n());
        android.view.ViewGroup viewGroup2 = findViewById instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById : null;
        if (viewGroup2 == null) {
            return;
        }
        android.view.View inflate = android.view.LayoutInflater.from(p0Var.getActivity()).inflate(b(), (android.view.ViewGroup) null);
        android.view.ViewGroup viewGroup3 = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
        if (viewGroup3 == null) {
            return;
        }
        this.f302237c = viewGroup3;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) viewGroup3.findViewById(com.tencent.mm.R.id.f485081tz5);
        recyclerView.setBackground(null);
        e(recyclerView, viewGroup3);
        viewGroup2.addView(viewGroup3);
        if (p0Var.isTeenMode() && (viewGroup = this.f302237c) != null) {
            viewGroup.setVisibility(8);
        }
        d();
    }

    public abstract void d();

    public void e(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.ViewGroup teachContainer) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(teachContainer, "teachContainer");
        recyclerView.setOnTouchListener(new jv4.c(this));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this.f302235a.getActivity()));
        recyclerView.setAdapter((jv4.p) ((jz5.n) this.f302239e).getValue());
        recyclerView.setItemAnimator(null);
        this.f302236b = new nv4.e(recyclerView, new nv4.a((jv4.k) ((jz5.n) this.f302240f).getValue()));
    }
}
