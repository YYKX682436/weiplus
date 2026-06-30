package df2;

/* loaded from: classes3.dex */
public final class tt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wt f231471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f231472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(df2.wt wtVar, r45.h32 h32Var) {
        super(0);
        this.f231471d = wtVar;
        this.f231472e = h32Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string = this.f231472e.getString(4);
        if (string == null) {
            string = "";
        }
        df2.wt wtVar = this.f231471d;
        wtVar.o7(3, string);
        wtVar.n7("clickClose", false);
        return jz5.f0.f302826a;
    }
}
