package nv3;

/* loaded from: classes5.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f340655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv3.f f340656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f340657c;

    public e(kotlin.jvm.internal.g0 g0Var, nv3.f fVar, boolean z17) {
        this.f340655a = g0Var;
        this.f340656b = fVar;
        this.f340657c = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        wt3.i0 i0Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f340655a.f310121d;
        boolean z17 = this.f340657c;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        r45.xv0 xv0Var = (r45.xv0) fVar.f70618d;
        boolean z18 = xv0Var.f390474e;
        com.tencent.mm.protobuf.g gVar = xv0Var.f390473d;
        java.util.LinkedList items = xv0Var.f390475f;
        kotlin.jvm.internal.o.f(items, "items");
        nv3.f fVar2 = this.f340656b;
        fVar2.getClass();
        com.tencent.mars.xlog.Log.i("GetListenVideoBgmListHelper", "GetListenVideoBgmList callback " + i17 + ' ' + i18 + ", " + str + ", loadFirstPage:" + z17);
        if ((i17 != 0 || i18 != 0) && (i0Var = fVar2.f340667i) != null) {
            i0Var.a(new java.util.LinkedList(), z17, z18, currentTimeMillis);
        }
        fVar2.f340668j = gVar;
        com.tencent.mars.xlog.Log.i("GetListenVideoBgmListHelper", "GetListenVideoBgmList count:" + items.size() + ", has_more:" + z18);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(items, 10));
        java.util.Iterator it = items.iterator();
        while (true) {
            java.lang.String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            r45.ug4 ug4Var = ((r45.vv0) it.next()).f388599d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("title:");
            r45.pg4 pg4Var = ug4Var.f387347d;
            sb6.append(pg4Var != null ? pg4Var.f383020f : null);
            sb6.append("-author:");
            r45.pg4 pg4Var2 = ug4Var.f387347d;
            sb6.append(pg4Var2 != null ? pg4Var2.f383021g : null);
            sb6.append("-duration:");
            r45.pg4 pg4Var3 = ug4Var.f387347d;
            sb6.append(pg4Var3 != null ? java.lang.Integer.valueOf(pg4Var3.f383023i) : null);
            sb6.append("-mir_begin:");
            sb6.append(ug4Var.f387351h);
            sb6.append("-mir_end:");
            sb6.append(ug4Var.f387352i);
            sb6.append("-listen_id:");
            r45.pg4 pg4Var4 = ug4Var.f387347d;
            if (pg4Var4 != null) {
                str2 = pg4Var4.f383018d;
            }
            sb6.append(str2);
            sb6.append("-url:");
            sb6.append(ug4Var.f387349f);
            arrayList.add(sb6.toString());
        }
        arrayList.toString();
        wt3.i0 i0Var2 = fVar2.f340667i;
        if (i0Var2 != null) {
            i0Var2.a(items, z17, z18, currentTimeMillis);
        }
        return null;
    }
}
