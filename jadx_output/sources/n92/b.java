package n92;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xb1 f335908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r45.xb1 xb1Var) {
        super(1);
        this.f335908d = xb1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        m92.b bVar = (m92.b) obj;
        java.util.LinkedList list = this.f335908d.getList(23);
        kotlin.jvm.internal.o.f(list, "getContacts(...)");
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.qz0) it.next()).getCustom(0);
            if (kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, bVar.field_username)) {
                break;
            }
            i17++;
        }
        return java.lang.Boolean.valueOf(i17 >= 0);
    }
}
