package g16;

/* loaded from: classes15.dex */
public final class k implements g16.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g16.l f267633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f267634b;

    public k(g16.l lVar, java.util.ArrayList arrayList) {
        this.f267633a = lVar;
        this.f267634b = arrayList;
    }

    @Override // g16.o0
    public void a() {
    }

    @Override // g16.o0
    public g16.m0 b(n16.b classId, o06.x1 source) {
        kotlin.jvm.internal.o.g(classId, "classId");
        kotlin.jvm.internal.o.g(source, "source");
        return this.f267633a.r(classId, source, this.f267634b);
    }
}
