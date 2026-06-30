package df2;

/* loaded from: classes10.dex */
public final class gx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.jx f230260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(df2.jx jxVar) {
        super(0);
        this.f230260d = jxVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        km2.q a76 = ((mm2.o4) this.f230260d.business(mm2.o4.class)).a7();
        xh2.i iVar = new xh2.i(0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, 0L, 2032, null);
        iVar.f454553e = 1;
        linkedList.add(new xh2.a(a76, iVar));
        return linkedList;
    }
}
