package l62;

/* loaded from: classes8.dex */
public class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f316766e = {l75.n0.getCreateSQLs(j62.c.I, "ExptItem")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f316767f = new java.lang.String[0];

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f316768d;

    public d(l75.k0 k0Var) {
        super(k0Var, j62.c.I, "ExptItem", f316767f);
        this.f316768d = k0Var;
    }

    public final boolean y0(int i17) {
        int i18;
        try {
            i18 = this.f316768d.delete("ExptItem", "exptId=?", new java.lang.String[]{i17 + ""});
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExptStorage", "delete expt by id [%s]", e17.toString());
            i18 = 0;
        }
        return i18 > 0;
    }

    public java.util.List z0(java.util.List list) {
        long j17;
        d95.b0 b0Var = null;
        if (list == null || list.size() <= 0) {
            return null;
        }
        l75.k0 k0Var = this.f316768d;
        if (k0Var instanceof d95.b0) {
            b0Var = (d95.b0) k0Var;
            j17 = b0Var.b();
        } else {
            j17 = -1;
        }
        try {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                j62.c cVar = (j62.c) it.next();
                boolean z17 = false;
                if (cVar != null) {
                    try {
                        z17 = super.replace(cVar);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ExptStorage", "replace expt error [%s]", e17.toString());
                    }
                    cVar.toString();
                }
                if (z17) {
                    linkedList.add(cVar);
                }
            }
            return linkedList;
        } finally {
            if (b0Var != null) {
                b0Var.w(java.lang.Long.valueOf(j17));
            }
        }
    }
}
