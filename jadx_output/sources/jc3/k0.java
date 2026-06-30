package jc3;

/* loaded from: classes7.dex */
public interface k0 extends com.tencent.mm.plugin.appbrand.appstorage.u1 {
    static /* synthetic */ void Ag(jc3.k0 k0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var, java.util.List list, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPkgFS");
        }
        k0Var.J(str, str2, (i17 & 4) != 0 ? null : str3, u1Var, (i17 & 16) != 0 ? null : list);
    }

    void J(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var, java.util.List list);

    void Vf(java.lang.String str, java.lang.String str2, java.lang.String str3);

    java.lang.String X3(java.lang.String str);

    void s7(java.lang.String str);
}
