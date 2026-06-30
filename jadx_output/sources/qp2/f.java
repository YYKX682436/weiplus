package qp2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h81 f365772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qp2.g f365773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.h81 h81Var, qp2.g gVar) {
        super(0);
        this.f365772d = h81Var;
        this.f365773e = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String string;
        nq2.d dVar = nq2.d.f338980a;
        r45.h81 h81Var = this.f365772d;
        java.util.LinkedList list = h81Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getTab_list(...)");
        com.tencent.mars.xlog.Log.i("NearbyPreloadManager", "onGetLiveTabList tabSize:" + list.size());
        java.util.LinkedList linkedList = nq2.d.f338983d;
        linkedList.clear();
        linkedList.addAll(list);
        yz5.s sVar = this.f365773e.f365781n;
        if (sVar != null) {
            java.lang.String string2 = h81Var.getString(7);
            if (string2 == null) {
                string2 = "";
            }
            r45.ky1 ky1Var = (r45.ky1) h81Var.getCustom(2);
            if (ky1Var == null || (str = ky1Var.getString(2)) == null) {
                str = "";
            }
            r45.ky1 ky1Var2 = (r45.ky1) h81Var.getCustom(2);
            java.lang.String str2 = (ky1Var2 == null || (string = ky1Var2.getString(3)) == null) ? "" : string;
            java.util.LinkedList list2 = h81Var.getList(1);
            kotlin.jvm.internal.o.f(list2, "getTab_list(...)");
            sVar.v(string2, str, str2, list2, java.lang.Boolean.valueOf(h81Var.getInteger(8) == 1));
        }
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabFetcher", "onSceneEnd list:" + h81Var.getList(1));
        return jz5.f0.f302826a;
    }
}
