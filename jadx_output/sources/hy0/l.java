package hy0;

/* loaded from: classes5.dex */
public final class l implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f285863a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f285864b;

    public l(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f285863a = jz5.h.b(new hy0.j(context));
        this.f285864b = jz5.h.b(new hy0.k(context));
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(context, "context");
        if (context.f286050f == null) {
            ((hy0.i) ((jz5.n) this.f285863a).getValue()).a(canvas, context);
        } else {
            ((hy0.g0) ((jz5.n) this.f285864b).getValue()).a(canvas, context);
        }
    }
}
