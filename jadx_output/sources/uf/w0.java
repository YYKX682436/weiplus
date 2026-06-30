package uf;

/* loaded from: classes7.dex */
public final class w0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c1 f427118d;

    public w0(uf.c1 c1Var) {
        this.f427118d = c1Var;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        f06.v[] vVarArr = uf.c1.f426981m;
        uf.c1 c1Var = this.f427118d;
        com.tencent.mm.sdk.platformtools.o4 d17 = c1Var.d();
        java.lang.Long valueOf = java.lang.Long.valueOf(d17 != null ? d17.getLong(str, 0L) : 0L);
        java.lang.String str2 = (java.lang.String) obj2;
        com.tencent.mm.sdk.platformtools.o4 d18 = c1Var.d();
        return mz5.a.b(valueOf, java.lang.Long.valueOf(d18 != null ? d18.getLong(str2, 0L) : 0L));
    }
}
