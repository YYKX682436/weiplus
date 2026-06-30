package yr3;

/* loaded from: classes11.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f464796a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f464797b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f464798c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f464799d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f464800e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f464801f;

    public e1(android.view.View mainView, android.widget.ImageView coverView, android.widget.ImageView featuredView, android.widget.TextView descView, android.widget.TextView recView, android.view.View descAreaView) {
        kotlin.jvm.internal.o.g(mainView, "mainView");
        kotlin.jvm.internal.o.g(coverView, "coverView");
        kotlin.jvm.internal.o.g(featuredView, "featuredView");
        kotlin.jvm.internal.o.g(descView, "descView");
        kotlin.jvm.internal.o.g(recView, "recView");
        kotlin.jvm.internal.o.g(descAreaView, "descAreaView");
        this.f464796a = mainView;
        this.f464797b = coverView;
        this.f464798c = featuredView;
        this.f464799d = descView;
        this.f464800e = recView;
        this.f464801f = descAreaView;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr3.e1)) {
            return false;
        }
        yr3.e1 e1Var = (yr3.e1) obj;
        return kotlin.jvm.internal.o.b(this.f464796a, e1Var.f464796a) && kotlin.jvm.internal.o.b(this.f464797b, e1Var.f464797b) && kotlin.jvm.internal.o.b(this.f464798c, e1Var.f464798c) && kotlin.jvm.internal.o.b(this.f464799d, e1Var.f464799d) && kotlin.jvm.internal.o.b(this.f464800e, e1Var.f464800e) && kotlin.jvm.internal.o.b(this.f464801f, e1Var.f464801f);
    }

    public int hashCode() {
        return (((((((((this.f464796a.hashCode() * 31) + this.f464797b.hashCode()) * 31) + this.f464798c.hashCode()) * 31) + this.f464799d.hashCode()) * 31) + this.f464800e.hashCode()) * 31) + this.f464801f.hashCode();
    }

    public java.lang.String toString() {
        return "PicViewGroup(mainView=" + this.f464796a + ", coverView=" + this.f464797b + ", featuredView=" + this.f464798c + ", descView=" + this.f464799d + ", recView=" + this.f464800e + ", descAreaView=" + this.f464801f + ')';
    }
}
