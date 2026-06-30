package mh2;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f326291a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f326292b;

    public a(android.content.Context context, android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f326291a = context;
        this.f326292b = android.view.LayoutInflater.from(context).inflate(a(), viewGroup, false);
    }

    public abstract int a();

    public final void b(android.widget.ImageView img, com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        kotlin.jvm.internal.o.g(img, "img");
        zl2.a.f473632a.a(img, finderContact);
    }

    public abstract void c(om2.d0 d0Var);

    public void d(r45.x84 ktvData) {
        kotlin.jvm.internal.o.g(ktvData, "ktvData");
    }

    public void e(om2.d0 singState) {
        kotlin.jvm.internal.o.g(singState, "singState");
    }
}
