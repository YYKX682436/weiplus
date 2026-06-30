package ij5;

/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.n0 f291767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ij5.n0 n0Var) {
        super(0);
        this.f291767d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f291767d.getIntent().getBooleanExtra("key_forceLightMode", false));
    }
}
