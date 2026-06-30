package j75;

/* loaded from: classes10.dex */
public final class t implements androidx.lifecycle.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j75.a f298091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f298092b;

    public t(j75.a aVar, android.content.Context context) {
        this.f298091a = aVar;
        this.f298092b = context;
    }

    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class eventClass) {
        kotlin.jvm.internal.o.g(eventClass, "eventClass");
        return new j75.r(this.f298091a, (androidx.lifecycle.y) this.f298092b);
    }
}
