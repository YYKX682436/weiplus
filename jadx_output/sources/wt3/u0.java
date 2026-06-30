package wt3;

/* loaded from: classes5.dex */
public final class u0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt3.v0 f449502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f449503b;

    public u0(wt3.v0 v0Var, boolean z17) {
        this.f449502a = v0Var;
        this.f449503b = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        r45.xv0 xv0Var = (r45.xv0) fVar.f70618d;
        boolean z17 = xv0Var.f390474e;
        com.tencent.mm.protobuf.g gVar = xv0Var.f390473d;
        java.util.LinkedList items = xv0Var.f390475f;
        kotlin.jvm.internal.o.f(items, "items");
        wt3.v0 v0Var = this.f449502a;
        v0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GetListenVideoBgmList callback ");
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(i18);
        sb6.append(", ");
        sb6.append(str);
        sb6.append(", loadFirstPage:");
        boolean z18 = this.f449503b;
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeGetListenVideoBgmListHelper", sb6.toString());
        yz5.q qVar = v0Var.f449518e;
        if ((i17 != 0 || i18 != 0) && qVar != null) {
            qVar.invoke(new java.util.LinkedList(), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        }
        v0Var.f449519f = gVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeGetListenVideoBgmListHelper", "GetListenVideoBgmList count:" + items.size() + ", has_more:" + z17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(items, 10));
        java.util.Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.vv0) it.next()).f388599d);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            java.lang.String str2 = null;
            if (!it6.hasNext()) {
                break;
            }
            r45.ug4 ug4Var = (r45.ug4) it6.next();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("title:");
            r45.pg4 pg4Var = ug4Var.f387347d;
            sb7.append(pg4Var != null ? pg4Var.f383020f : null);
            sb7.append("-author:");
            r45.pg4 pg4Var2 = ug4Var.f387347d;
            sb7.append(pg4Var2 != null ? pg4Var2.f383021g : null);
            sb7.append("-duration:");
            r45.pg4 pg4Var3 = ug4Var.f387347d;
            sb7.append(pg4Var3 != null ? java.lang.Integer.valueOf(pg4Var3.f383023i) : null);
            sb7.append("-mir_begin:");
            sb7.append(ug4Var.f387351h);
            sb7.append("-mir_end:");
            sb7.append(ug4Var.f387352i);
            sb7.append("-listen_id:");
            r45.pg4 pg4Var4 = ug4Var.f387347d;
            if (pg4Var4 != null) {
                str2 = pg4Var4.f383018d;
            }
            sb7.append(str2);
            sb7.append("-url:");
            sb7.append(ug4Var.f387349f);
            arrayList2.add(sb7.toString());
        }
        arrayList2.toString();
        if (qVar != null) {
            qVar.invoke(items, java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        }
        return null;
    }
}
