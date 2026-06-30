package n92;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lk2 f335912d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r45.lk2 lk2Var) {
        super(1);
        this.f335912d = lk2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        m92.b bVar = (m92.b) obj;
        java.util.LinkedList list = this.f335912d.getList(20);
        kotlin.jvm.internal.o.f(list, "getFinder_list(...)");
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.ac5) it.next()).getCustom(1);
            if (kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, bVar.field_username)) {
                break;
            }
            i17++;
        }
        return java.lang.Boolean.valueOf(i17 >= 0);
    }
}
