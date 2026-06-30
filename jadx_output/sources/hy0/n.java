package hy0;

/* loaded from: classes.dex */
public abstract class n implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f285888a;

    /* renamed from: b, reason: collision with root package name */
    public final int f285889b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f285890c;

    public n(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f285888a = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 30);
        this.f285889b = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 8);
        this.f285890c = jz5.h.b(new hy0.m(context));
    }

    public final float b() {
        return ((java.lang.Number) ((jz5.n) this.f285890c).getValue()).floatValue();
    }
}
