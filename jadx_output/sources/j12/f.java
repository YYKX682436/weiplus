package j12;

/* loaded from: classes15.dex */
public class f implements java.lang.Cloneable, java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f297158d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f297159e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f297160f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f297161g;

    public f(com.tencent.mm.plugin.emoji.model.s sVar) {
        java.util.List list = sVar == null ? null : sVar.f97600b;
        this.f297159e = new java.util.HashMap();
        this.f297160f = new java.util.HashMap();
        this.f297161g = c01.z1.y();
        if (list == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f297158d = arrayList;
        arrayList.addAll(list);
    }

    public java.lang.Object clone() {
        try {
            j12.f fVar = (j12.f) super.clone();
            try {
                java.util.ArrayList arrayList = this.f297158d;
                if (arrayList == null) {
                    return fVar;
                }
                fVar.f297158d = (java.util.ArrayList) arrayList.clone();
                return fVar;
            } catch (java.lang.CloneNotSupportedException unused) {
                return fVar;
            }
        } catch (java.lang.CloneNotSupportedException unused2) {
            return null;
        }
    }

    public void d() {
        if (this.f297158d == null || ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ri().f97598b == null) {
            return;
        }
        java.util.Iterator it = this.f297158d.iterator();
        while (it.hasNext()) {
            j12.i iVar = (j12.i) it.next();
            r45.zj0 zj0Var = iVar.f297167b;
            if (zj0Var != null) {
                int b17 = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ri().b(zj0Var.f392128d);
                if (b17 >= 0) {
                    iVar.c(6);
                    iVar.f297170e = b17;
                }
                if (b17 < 0 && iVar.f297171f == 6) {
                    iVar.c(3);
                }
            }
        }
    }

    public com.tencent.mm.storage.f5 e(java.lang.String str) {
        com.tencent.mm.storage.f5 f5Var = (com.tencent.mm.storage.f5) this.f297159e.get(str);
        if (f5Var != null) {
            return f5Var;
        }
        com.tencent.mm.storage.f5 f5Var2 = new com.tencent.mm.storage.f5(str);
        this.f297159e.put(str, f5Var2);
        return f5Var2;
    }

    public j12.i g(java.lang.String str) {
        java.lang.String str2;
        java.util.ArrayList arrayList = this.f297158d;
        if (arrayList == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j12.i iVar = (j12.i) it.next();
            r45.zj0 zj0Var = iVar.f297167b;
            if (zj0Var != null && (str2 = zj0Var.f392128d) != null && str2.equals(str)) {
                return iVar;
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new j12.e(this, null);
    }
}
