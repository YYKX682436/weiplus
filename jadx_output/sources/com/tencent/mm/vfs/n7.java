package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class n7 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.vfs.n7 f213096d = new com.tencent.mm.vfs.n7();

    public n7() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jz5.l lVar;
        com.tencent.mm.vfs.r ctx = (com.tencent.mm.vfs.r) obj;
        com.tencent.mm.vfs.q2 fs6 = (com.tencent.mm.vfs.q2) obj2;
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(fs6, "fs");
        if (!(fs6 instanceof com.tencent.mm.vfs.u3)) {
            return java.lang.Boolean.FALSE;
        }
        jz5.l lVar2 = null;
        for (com.tencent.mm.vfs.q2 q2Var : com.tencent.mm.vfs.e8.c(fs6, null)) {
            if (q2Var instanceof com.tencent.mm.vfs.h4) {
                r26.t tVar = com.tencent.mm.vfs.p7.f213127a;
                com.tencent.mm.vfs.h4 h4Var = (com.tencent.mm.vfs.h4) q2Var;
                java.lang.String mRealBasePath = h4Var.f212975e;
                kotlin.jvm.internal.o.f(mRealBasePath, "mRealBasePath");
                boolean z17 = false;
                r26.m b17 = tVar.b(mRealBasePath, 0);
                if (b17 != null) {
                    r26.q qVar = (r26.q) b17;
                    if (qVar.a().size() >= 2) {
                        java.lang.String str = (java.lang.String) qVar.a().get(1);
                        if (lVar2 == null) {
                            java.util.Iterator it = ctx.f213148a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    lVar = 0;
                                    break;
                                }
                                lVar = it.next();
                                jz5.l lVar3 = (jz5.l) lVar;
                                if (kotlin.jvm.internal.o.b(lVar3.f302833d, str) || kotlin.jvm.internal.o.b(lVar3.f302834e, str)) {
                                    break;
                                }
                            }
                            lVar2 = lVar;
                            if (lVar2 == null) {
                                com.tencent.mars.xlog.Log.w("VFS.VFSRuleChecker", "Account not found, path: " + h4Var.f212975e);
                            }
                        } else {
                            java.lang.Object obj3 = lVar2.f302833d;
                            if (kotlin.jvm.internal.o.b(obj3, str)) {
                                continue;
                            } else {
                                java.lang.Object obj4 = lVar2.f302834e;
                                if (!kotlin.jvm.internal.o.b(obj4, str)) {
                                    java.lang.String str2 = "Cross account migration found: " + str + " <-> (" + ((java.lang.String) obj3) + '/' + ((java.lang.String) obj4);
                                    if (z65.c.a()) {
                                        z17 = true;
                                    } else {
                                        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                                    }
                                    if (z17) {
                                        throw new java.lang.AssertionError(str2);
                                    }
                                    com.tencent.mars.xlog.Log.e("VFS.VFSRuleChecker", str2);
                                    return java.lang.Boolean.FALSE;
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
