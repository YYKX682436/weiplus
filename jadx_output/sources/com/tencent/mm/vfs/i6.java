package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class i6 implements pm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f213001a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f213002b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f213003c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.vfs.g6 f213004d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.k6[] f213005e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f213006f;

    public i6(int i17, java.lang.String basePath, yz5.p pVar, com.tencent.mm.vfs.g6 context) {
        kotlin.jvm.internal.o.g(basePath, "basePath");
        kotlin.jvm.internal.o.g(context, "context");
        this.f213001a = i17;
        this.f213002b = basePath;
        this.f213003c = pVar;
        this.f213004d = context;
        com.tencent.mm.vfs.k6[] k6VarArr = {com.tencent.mm.vfs.l2.f213053l};
        this.f213005e = k6VarArr;
        this.f213006f = kz5.v.f(k6VarArr);
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        pm5.i iVar;
        java.lang.Iterable b17;
        com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) obj;
        if (x1Var == null) {
            return null;
        }
        boolean z17 = x1Var.f213236f;
        int i17 = this.f213001a;
        if (!z17) {
            return b(i17, null, x1Var);
        }
        java.lang.String str = this.f213002b + '/' + x1Var.f213232b;
        com.tencent.mm.vfs.g6 g6Var = this.f213004d;
        java.lang.String str2 = (java.lang.String) g6Var.f212957b.get(str);
        boolean z18 = g6Var.f212961f;
        com.tencent.mm.vfs.l6 l6Var = g6Var.f212962g;
        if (str2 != null) {
            com.tencent.mm.vfs.m6 m6Var = (com.tencent.mm.vfs.m6) g6Var.f212956a.remove(str2);
            if (m6Var == null) {
                return b(i17, null, x1Var);
            }
            int i18 = i17 | m6Var.f213074a;
            java.lang.String str3 = m6Var.f213075b;
            if (kotlin.jvm.internal.o.b(l6Var != null ? java.lang.Boolean.valueOf(l6Var.c(i18, str3, x1Var)) : null, java.lang.Boolean.FALSE)) {
                return null;
            }
            final com.tencent.mm.vfs.h6 h6Var = l6Var != null ? new com.tencent.mm.vfs.h6(l6Var, i18, m6Var) : null;
            com.tencent.mm.vfs.b8 b8Var = h6Var != null ? new com.tencent.mm.vfs.b8(h6Var) { // from class: com.tencent.mm.vfs.k2

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ yz5.l f213026a;

                {
                    kotlin.jvm.internal.o.g(h6Var, "function");
                    this.f213026a = h6Var;
                }

                @Override // com.tencent.mm.vfs.b8
                public final /* synthetic */ boolean accept(java.lang.Object obj2) {
                    return ((java.lang.Boolean) this.f213026a.invoke(obj2)).booleanValue();
                }
            } : null;
            com.tencent.mm.vfs.q2 q2Var = m6Var.f213076c;
            java.lang.Iterable p17 = com.tencent.mm.vfs.e8.p(q2Var, "", z18, b8Var);
            if (p17 == null) {
                return b(i18, null, x1Var);
            }
            pm5.l lVar = new pm5.l(p17, new com.tencent.mm.vfs.j6(i18, str3, (yz5.p) g6Var.f212960e.get(str3)));
            com.tencent.mm.vfs.x1 m17 = q2Var.m("");
            if (m17 == null || (b17 = b(1073741824 | i18, str3, m17)) == null) {
                b17 = b(i18, null, x1Var);
            }
            iVar = z18 ? new pm5.i(lVar, b17) : new pm5.i(b17, lVar);
        } else {
            java.lang.Integer num = (java.lang.Integer) g6Var.f212958c.get(str);
            int intValue = num != null ? num.intValue() : 0;
            if ((Integer.MIN_VALUE & intValue) != 0) {
                return null;
            }
            int i19 = i17 | (intValue & 268435455);
            java.lang.Iterable b18 = b(i19, null, x1Var);
            if (kotlin.jvm.internal.o.b(l6Var != null ? java.lang.Boolean.valueOf(l6Var.c(i19, null, x1Var)) : null, java.lang.Boolean.FALSE)) {
                return null;
            }
            java.lang.Iterable d17 = x1Var.d();
            if (d17 == null) {
                return b18;
            }
            pm5.b bVar = new pm5.b(d17, new com.tencent.mm.vfs.i6(i19, str, (yz5.p) g6Var.f212959d.get(str), g6Var));
            iVar = z18 ? new pm5.i(bVar, b18) : new pm5.i(b18, bVar);
        }
        return iVar;
    }

    public final java.lang.Iterable b(int i17, java.lang.String str, com.tencent.mm.vfs.x1 x1Var) {
        yz5.p pVar = this.f213003c;
        if (pVar != null) {
            i17 = ((java.lang.Number) pVar.invoke(x1Var, java.lang.Integer.valueOf(i17))).intValue();
        }
        this.f213005e[0] = new com.tencent.mm.vfs.k6(i17, str, x1Var);
        return this.f213006f;
    }
}
