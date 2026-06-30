package ij5;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f291796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ij5.t tVar) {
        super(0);
        this.f291796d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ij5.t tVar = this.f291796d;
        return java.lang.Integer.valueOf(tVar.getIntent().getIntExtra("Select_Conv_Type", tVar.f291799d));
    }
}
