package ij5;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f291771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ij5.t tVar) {
        super(0);
        this.f291771d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f291771d.getIntent().getBooleanExtra("key_canSelectOpenIM", false));
    }
}
