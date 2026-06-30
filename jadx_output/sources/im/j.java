package im;

/* loaded from: classes9.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f292156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.o f292157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j17, jz5.o oVar) {
        super(0);
        this.f292156d = j17;
        this.f292157e = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.g gVar = im.m.f292159d;
        ((java.util.HashMap) ((jz5.n) im.m.f292159d).getValue()).put(java.lang.Long.valueOf(this.f292156d), this.f292157e);
        return jz5.f0.f302826a;
    }
}
