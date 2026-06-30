package h4;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f278712a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f278713b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f278714c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f278715d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f278716e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f278717f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f278718g;

    public z(kotlinx.coroutines.y0 scope, int i17, kotlinx.coroutines.flow.j source, boolean z17, yz5.p onEach, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 2) != 0 ? 0 : i17;
        z17 = (i18 & 8) != 0 ? false : z17;
        z18 = (i18 & 32) != 0 ? false : z18;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(onEach, "onEach");
        this.f278714c = scope;
        this.f278715d = source;
        this.f278716e = z17;
        this.f278717f = onEach;
        this.f278718g = z18;
        this.f278712a = jz5.h.a(jz5.i.f302829d, new h4.s(this, i17));
        this.f278713b = new kotlinx.coroutines.flow.m2(new h4.y(this, null));
    }
}
