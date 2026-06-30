package hb2;

/* loaded from: classes2.dex */
public final class v0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb2.w0 f280104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f280106c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f280107d;

    public v0(hb2.w0 w0Var, java.lang.String str, java.lang.Object obj, zy2.gc gcVar) {
        this.f280104a = w0Var;
        this.f280105b = str;
        this.f280106c = obj;
        this.f280107d = gcVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        int i17;
        java.util.LinkedList list;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        hb2.w0 w0Var = this.f280104a;
        com.tencent.mars.xlog.Log.i(w0Var.k(), "[doRequest] errType:" + fVar.f70615a + " errCode:" + fVar.f70616b);
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.sn2 sn2Var = (r45.sn2) fVar.f70618d;
            if (sn2Var != null && (list = sn2Var.getList(1)) != null) {
                java.util.Iterator it = list.iterator();
                i17 = 0;
                while (it.hasNext()) {
                    if (((r45.ix0) it.next()).getInteger(0) == w0Var.i()) {
                        break;
                    }
                    i17++;
                }
            }
            i17 = -1;
            if (i17 != -1) {
                r45.ix0 ix0Var = (r45.ix0) ((r45.sn2) fVar.f70618d).getList(1).get(i17);
                kotlin.jvm.internal.o.d(ix0Var);
                java.lang.String str = this.f280105b;
                java.lang.Object obj2 = this.f280106c;
                w0Var.l(str, obj2, ix0Var);
                zy2.gc gcVar = this.f280107d;
                if (gcVar != null) {
                    gcVar.r5(obj2, ix0Var);
                }
            } else {
                hb2.w0.f(this.f280104a, this.f280107d, this.f280106c, null, 4, null);
            }
        } else {
            hb2.w0.f(this.f280104a, this.f280107d, this.f280106c, null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
