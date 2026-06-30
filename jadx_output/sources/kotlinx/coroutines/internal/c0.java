package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f310487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f310488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oz5.l f310489f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(yz5.l lVar, java.lang.Object obj, oz5.l lVar2) {
        super(1);
        this.f310487d = lVar;
        this.f310488e = obj;
        this.f310489f = lVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kotlinx.coroutines.internal.v0 a17 = kotlinx.coroutines.internal.d0.a(this.f310487d, this.f310488e, null);
        if (a17 != null) {
            kotlinx.coroutines.u0.a(this.f310489f, a17);
        }
        return jz5.f0.f302826a;
    }
}
