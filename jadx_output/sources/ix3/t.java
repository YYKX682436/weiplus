package ix3;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.u f295558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ix3.u uVar) {
        super(1);
        this.f295558d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        return new ix3.g0(intValue, (ix3.c) this.f295558d.f295568d.get(intValue));
    }
}
