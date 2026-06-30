package ys1;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ys1.f f465141a = new ys1.f();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.a3 f465142b = new com.tencent.mm.sdk.platformtools.a3();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f465143c = new java.util.concurrent.ConcurrentSkipListSet();

    public final void a(ys1.b bVar, boolean z17, java.util.List list, int i17) {
        if (z17 || list == null) {
            return;
        }
        list.add(b(bVar, i17));
    }

    public final zq1.k0 b(ys1.b bVar, int i17) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        zq1.i0 i0Var = new zq1.i0();
        i0Var.f474983a = bVar.f465126a;
        i0Var.f474984b = bVar.f465135j;
        i0Var.f474985c = bVar.f465131f;
        i0Var.f474986d = bVar.f465130e;
        i0Var.f474987e = bVar.f465127b;
        i0Var.f474988f = bVar.f465128c;
        i0Var.f474989g = bVar.f465129d;
        i0Var.f474991i = bVar.f465134i;
        i0Var.f474992j = bVar.f465132g;
        return new zq1.k0(i0Var, i17);
    }
}
