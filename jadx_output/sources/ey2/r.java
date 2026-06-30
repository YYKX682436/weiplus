package ey2;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.u f257487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ey2.u uVar) {
        super(1);
        this.f257487d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.cy0 it = (r45.cy0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = it.getInteger(3) == 0;
        ey2.u uVar = this.f257487d;
        uVar.f257531m = z17;
        uVar.f257530i = it.getByteString(2);
        uVar.f257533o = (r45.dy0) it.getCustom(6);
        uVar.f257532n = false;
        java.util.LinkedList list = it.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        uVar.P6(list);
        return jz5.f0.f302826a;
    }
}
