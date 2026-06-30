package nh5;

/* loaded from: classes3.dex */
public final class c0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f337130d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f337131e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f337132f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f337133g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f337134h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f337135i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f337136m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f337137n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f337130d = jz5.h.b(new nh5.b0(itemView));
        this.f337131e = jz5.h.b(new nh5.a0(itemView));
        this.f337132f = jz5.h.b(new nh5.w(itemView));
        this.f337133g = jz5.h.b(new nh5.v(itemView));
        this.f337134h = jz5.h.b(new nh5.z(itemView));
        this.f337135i = jz5.h.b(new nh5.x(itemView));
        this.f337136m = jz5.h.b(new nh5.y(itemView));
        i().setVisibility(8);
        l().setVisibility(8);
        j().setVisibility(8);
        k().setVisibility(8);
        itemView.setOnClickListener(new nh5.t(this));
        itemView.setOnLongClickListener(new nh5.u(this));
    }

    public final android.widget.TextView i() {
        java.lang.Object value = this.f337133g.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.TextView j() {
        java.lang.Object value = this.f337135i.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.TextView k() {
        java.lang.Object value = this.f337136m.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.TextView l() {
        java.lang.Object value = this.f337134h.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }
}
