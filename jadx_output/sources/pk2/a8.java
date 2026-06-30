package pk2;

/* loaded from: classes3.dex */
public final class a8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(pk2.o9 o9Var) {
        super(1);
        this.f355554d = o9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pk2.o9 o9Var = this.f355554d;
        o9Var.d((java.util.List) obj);
        df2.od odVar = (df2.od) o9Var.e(df2.od.class);
        if (odVar != null) {
            odVar.e7(r45.n72.kActionType_ShareLive);
        }
        return jz5.f0.f302826a;
    }
}
