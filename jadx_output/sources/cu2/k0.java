package cu2;

/* loaded from: classes8.dex */
public final class k0 implements zy2.ba {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f222415a = jz5.h.b(cu2.j0.f222413d);

    @Override // zy2.ba
    public java.util.LinkedList a() {
        java.util.LinkedList linkedList;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.extension.reddot.k3 f17 = f();
        if (f17 != null) {
            java.lang.String[] strArr = com.tencent.mm.plugin.finder.extension.reddot.k3.f105624e;
            linkedList = f17.D0("FinderRedDotInfo2");
        } else {
            linkedList = new java.util.LinkedList();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("queryAll time cost=");
        sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb6.append(" size=");
        sb6.append(linkedList.size());
        sb6.append("; ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.mm.plugin.finder.extension.reddot.jb) it.next()).field_tips_uuid);
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("FinderRedDotCtrInfoNativeStorage", sb6.toString());
        return linkedList;
    }

    @Override // zy2.ba
    public boolean b(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, boolean z17) {
        com.tencent.mm.plugin.finder.extension.reddot.k3 f17 = f();
        if (f17 != null) {
            return f17.replace(jbVar, z17);
        }
        return false;
    }

    @Override // zy2.ba
    public boolean c(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        com.tencent.mm.plugin.finder.extension.reddot.k3 f17 = f();
        if (f17 != null) {
            return f17.delete(jbVar, false, null);
        }
        return false;
    }

    @Override // zy2.ba
    public boolean d(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return true;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) it.next();
            com.tencent.mm.plugin.finder.extension.reddot.k3 f17 = f();
            if (f17 != null) {
                f17.delete(jbVar, false, new java.lang.String[0]);
            }
        }
        return true;
    }

    public boolean e(java.lang.String table) {
        kotlin.jvm.internal.o.g(table, "table");
        com.tencent.mm.plugin.finder.extension.reddot.k3 f17 = f();
        if (f17 == null) {
            return false;
        }
        boolean A = f17.f105625d.A(table, "DROP TABLE IF EXISTS ".concat(table));
        com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfoStorage", "[dropTable] dropRet=" + A);
        return A;
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.k3 f() {
        return (com.tencent.mm.plugin.finder.extension.reddot.k3) ((jz5.n) this.f222415a).getValue();
    }

    public java.util.LinkedList g(java.lang.String table) {
        kotlin.jvm.internal.o.g(table, "table");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.extension.reddot.k3 f17 = f();
        java.util.ArrayList arrayList = null;
        java.util.LinkedList D0 = f17 != null ? f17.D0(table) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("queryAllByTable time cost=");
        sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb6.append(" table=");
        sb6.append(table);
        sb6.append(", size=");
        sb6.append(D0 != null ? java.lang.Integer.valueOf(D0.size()) : null);
        sb6.append(',');
        if (D0 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(D0, 10));
            java.util.Iterator it = D0.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.plugin.finder.extension.reddot.jb) it.next()).field_tips_uuid);
            }
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("FinderRedDotCtrInfoNativeStorage", sb6.toString());
        return D0 == null ? new java.util.LinkedList() : D0;
    }
}
