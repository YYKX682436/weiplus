package uu;

/* loaded from: classes9.dex */
public final class d extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final s15.w f431202d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f431203e;

    public d(s15.w recordInfoItem) {
        kotlin.jvm.internal.o.g(recordInfoItem, "recordInfoItem");
        this.f431202d = recordInfoItem;
        this.f431203e = jz5.h.b(new uu.a(this));
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        v65.i.b(scope, null, new uu.c(this, request, b17, null), 1, null);
        return b17;
    }
}
