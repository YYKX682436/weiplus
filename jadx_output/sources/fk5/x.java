package fk5;

/* loaded from: classes12.dex */
public final class x implements gy1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f263681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263682b;

    public x(long j17, java.lang.String str) {
        this.f263681a = j17;
        this.f263682b = str;
    }

    @Override // gy1.d
    public final void a(java.lang.Object obj) {
        java.util.Map map = kotlin.jvm.internal.m0.h(obj) ? (java.util.Map) obj : null;
        if (map != null) {
            fk5.y.f263683d.a(this.f263681a, map, new fk5.w(this.f263682b));
        }
    }
}
