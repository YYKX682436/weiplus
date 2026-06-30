package dk2;

/* loaded from: classes2.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f233745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(r45.cz1 cz1Var) {
        super(1);
        this.f233745d = cz1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.cz1 item = (r45.cz1) obj;
        kotlin.jvm.internal.o.g(item, "item");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(item.getString(0), this.f233745d.getString(0)));
    }
}
