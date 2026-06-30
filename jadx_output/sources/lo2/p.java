package lo2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI f320162d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI finderMemberFanListUI) {
        super(1);
        this.f320162d = finderMemberFanListUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI finderMemberFanListUI = this.f320162d;
        com.tencent.mm.protobuf.g gVar = finderMemberFanListUI.A;
        if (gVar != null) {
            return gVar;
        }
        if (linkedList != null) {
            java.util.ArrayList arrayList = finderMemberFanListUI.f121395y;
            if (arrayList.isEmpty()) {
                arrayList.addAll(linkedList);
                lo2.g gVar2 = finderMemberFanListUI.f121394x;
                gVar2.getClass();
                java.util.ArrayList arrayList2 = gVar2.f320123e;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                gVar2.notifyDataSetChanged();
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        return f0Var;
    }
}
