package l36;

/* loaded from: classes16.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final l36.v f315658e;

    /* renamed from: f, reason: collision with root package name */
    public static final l36.v f315659f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f315660a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f315661b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String[] f315662c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f315663d;

    static {
        l36.r rVar = l36.r.f315622q;
        l36.r rVar2 = l36.r.f315623r;
        l36.r rVar3 = l36.r.f315624s;
        l36.r rVar4 = l36.r.f315625t;
        l36.r rVar5 = l36.r.f315626u;
        l36.r rVar6 = l36.r.f315616k;
        l36.r rVar7 = l36.r.f315618m;
        l36.r rVar8 = l36.r.f315617l;
        l36.r rVar9 = l36.r.f315619n;
        l36.r rVar10 = l36.r.f315621p;
        l36.r rVar11 = l36.r.f315620o;
        l36.r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11};
        l36.r[] rVarArr2 = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, l36.r.f315614i, l36.r.f315615j, l36.r.f315612g, l36.r.f315613h, l36.r.f315610e, l36.r.f315611f, l36.r.f315609d};
        l36.u uVar = new l36.u(true);
        uVar.b(rVarArr);
        l36.e1 e1Var = l36.e1.TLS_1_3;
        l36.e1 e1Var2 = l36.e1.TLS_1_2;
        uVar.d(e1Var, e1Var2);
        uVar.f315650d = true;
        new l36.v(uVar);
        l36.u uVar2 = new l36.u(true);
        uVar2.b(rVarArr2);
        l36.e1 e1Var3 = l36.e1.TLS_1_1;
        l36.e1 e1Var4 = l36.e1.TLS_1_0;
        uVar2.d(e1Var, e1Var2, e1Var3, e1Var4);
        uVar2.f315650d = true;
        f315658e = new l36.v(uVar2);
        l36.u uVar3 = new l36.u(true);
        uVar3.b(rVarArr2);
        uVar3.d(e1Var4);
        uVar3.f315650d = true;
        new l36.v(uVar3);
        f315659f = new l36.v(new l36.u(false));
    }

    public v(l36.u uVar) {
        this.f315660a = uVar.f315647a;
        this.f315662c = uVar.f315648b;
        this.f315663d = uVar.f315649c;
        this.f315661b = uVar.f315650d;
    }

    public boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        if (!this.f315660a) {
            return false;
        }
        java.lang.String[] strArr = this.f315663d;
        if (strArr != null && !m36.e.p(m36.e.f323391f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        java.lang.String[] strArr2 = this.f315662c;
        return strArr2 == null || m36.e.p(l36.r.f315607b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof l36.v)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l36.v vVar = (l36.v) obj;
        boolean z17 = vVar.f315660a;
        boolean z18 = this.f315660a;
        if (z18 != z17) {
            return false;
        }
        return !z18 || (java.util.Arrays.equals(this.f315662c, vVar.f315662c) && java.util.Arrays.equals(this.f315663d, vVar.f315663d) && this.f315661b == vVar.f315661b);
    }

    public int hashCode() {
        if (this.f315660a) {
            return ((((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + java.util.Arrays.hashCode(this.f315662c)) * 31) + java.util.Arrays.hashCode(this.f315663d)) * 31) + (!this.f315661b ? 1 : 0);
        }
        return 17;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.util.List list;
        if (!this.f315660a) {
            return "ConnectionSpec()";
        }
        java.util.List list2 = null;
        java.lang.String str2 = "[all enabled]";
        java.lang.String[] strArr = this.f315662c;
        if (strArr != null) {
            if (strArr != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
                for (java.lang.String str3 : strArr) {
                    arrayList.add(l36.r.a(str3));
                }
                list = java.util.Collections.unmodifiableList(arrayList);
            } else {
                list = null;
            }
            str = list.toString();
        } else {
            str = "[all enabled]";
        }
        java.lang.String[] strArr2 = this.f315663d;
        if (strArr2 != null) {
            if (strArr2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(strArr2.length);
                for (java.lang.String str4 : strArr2) {
                    arrayList2.add(l36.e1.a(str4));
                }
                list2 = java.util.Collections.unmodifiableList(arrayList2);
            }
            str2 = list2.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f315661b + ")";
    }
}
