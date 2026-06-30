package mf3;

/* loaded from: classes12.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.p f326115a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f326116b;

    public q(mf3.p apiCenter) {
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f326115a = apiCenter;
        this.f326116b = new java.util.ArrayList();
    }

    public final void a(java.lang.Class apiClz, mf3.n holder) {
        kotlin.jvm.internal.o.g(apiClz, "apiClz");
        kotlin.jvm.internal.o.g(holder, "holder");
        ((java.util.ArrayList) this.f326116b).add(holder);
        this.f326115a.d(apiClz, holder);
    }
}
