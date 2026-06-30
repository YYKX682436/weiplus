package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class n2 extends com.tencent.mm.pluginsdk.ui.tools.s1 {

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.vfs.r6 f191784o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.vfs.r6 f191785p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.vfs.r6[] f191786q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f191787r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191788s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI, com.tencent.mm.pluginsdk.ui.tools.a2 adapter) {
        super(fileSelectorUI, adapter);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f191788s = fileSelectorUI;
        this.f191786q = new com.tencent.mm.vfs.r6[0];
    }

    public final com.tencent.mm.vfs.r6 d() {
        com.tencent.mm.vfs.r6 r6Var = this.f191785p;
        if (r6Var == null) {
            kotlin.jvm.internal.o.o("curFile");
            throw null;
        }
        int hashCode = r6Var.hashCode();
        com.tencent.mm.vfs.r6 r6Var2 = this.f191784o;
        if (r6Var2 == null) {
            kotlin.jvm.internal.o.o("rootPath");
            throw null;
        }
        if (hashCode == r6Var2.hashCode()) {
            return null;
        }
        com.tencent.mm.vfs.r6 r6Var3 = this.f191785p;
        if (r6Var3 != null) {
            return r6Var3.s();
        }
        kotlin.jvm.internal.o.o("curFile");
        throw null;
    }

    public final void e(com.tencent.mm.vfs.r6 curFile) {
        kotlin.jvm.internal.o.g(curFile, "curFile");
        this.f191785p = curFile;
        if (curFile.h()) {
            com.tencent.mm.vfs.r6 r6Var = this.f191785p;
            if (r6Var == null) {
                kotlin.jvm.internal.o.o("curFile");
                throw null;
            }
            if (r6Var.y()) {
                com.tencent.mm.vfs.r6 r6Var2 = this.f191785p;
                if (r6Var2 == null) {
                    kotlin.jvm.internal.o.o("curFile");
                    throw null;
                }
                com.tencent.mm.vfs.r6[] H = r6Var2.H(new com.tencent.mm.pluginsdk.ui.tools.k2(this));
                this.f191786q = H;
                if (H != null) {
                    if (!(H.length == 0)) {
                        java.util.HashSet hashSet = new java.util.HashSet();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (com.tencent.mm.vfs.r6 r6Var3 : H) {
                            if (r6Var3 != null) {
                                if (r6Var3.y()) {
                                    java.lang.String o17 = r6Var3.o();
                                    kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                                    if (!hashSet.contains(o17)) {
                                        java.lang.String o18 = r6Var3.o();
                                        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
                                        hashSet.add(o18);
                                        arrayList.add(r6Var3);
                                    }
                                } else {
                                    arrayList.add(r6Var3);
                                }
                            }
                        }
                        H = (com.tencent.mm.vfs.r6[]) arrayList.toArray(new com.tencent.mm.vfs.r6[0]);
                    }
                    this.f191786q = H;
                    if (H != null) {
                        if (!(H.length == 0)) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.util.Iterator a17 = kotlin.jvm.internal.c.a(H);
                            while (true) {
                                kotlin.jvm.internal.b bVar = (kotlin.jvm.internal.b) a17;
                                if (!bVar.hasNext()) {
                                    break;
                                }
                                com.tencent.mm.vfs.r6 r6Var4 = (com.tencent.mm.vfs.r6) bVar.next();
                                if (r6Var4 != null) {
                                    com.tencent.mm.pluginsdk.ui.tools.i2 i2Var = new com.tencent.mm.pluginsdk.ui.tools.i2(this);
                                    i2Var.f191709a = r6Var4;
                                    i2Var.f191710b = r6Var4.B();
                                    if (r6Var4.y()) {
                                        java.lang.String a18 = x51.k.a(r6Var4.getName());
                                        kotlin.jvm.internal.o.f(a18, "getFullSpell(...)");
                                        java.lang.String upperCase = a18.toUpperCase();
                                        kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
                                        i2Var.f191711c = upperCase;
                                        arrayList2.add(i2Var);
                                    } else {
                                        arrayList3.add(i2Var);
                                    }
                                }
                            }
                            kz5.g0.t(arrayList2, com.tencent.mm.pluginsdk.ui.tools.l2.f191757d);
                            java.util.Collections.sort(arrayList3, com.tencent.mm.pluginsdk.ui.tools.m2.f191771d);
                            java.util.Iterator it = arrayList2.iterator();
                            int i17 = 0;
                            while (it.hasNext()) {
                                H[i17] = ((com.tencent.mm.pluginsdk.ui.tools.i2) it.next()).f191709a;
                                i17++;
                            }
                            java.util.Iterator it6 = arrayList3.iterator();
                            while (it6.hasNext()) {
                                H[i17] = ((com.tencent.mm.pluginsdk.ui.tools.i2) it6.next()).f191709a;
                                i17++;
                            }
                        }
                    }
                }
            }
        }
        java.util.List list = this.f191885f;
        list.clear();
        com.tencent.mm.vfs.r6[] r6VarArr = this.f191786q;
        if (r6VarArr != null) {
            for (com.tencent.mm.vfs.r6 r6Var5 : r6VarArr) {
                if (r6Var5 != null) {
                    java.lang.String o19 = r6Var5.o();
                    kotlin.jvm.internal.o.f(o19, "getAbsolutePath(...)");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(o19)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FileSelectorUI", "createTargetList, folder filePath is null, filter!!");
                    } else {
                        com.tencent.mm.pluginsdk.ui.tools.e2 e2Var = new com.tencent.mm.pluginsdk.ui.tools.e2(this.f191788s);
                        e2Var.f191623a = 4;
                        e2Var.f191624b = 3;
                        e2Var.f191602q = !r6Var5.y();
                        java.lang.String name = r6Var5.getName();
                        kotlin.jvm.internal.o.f(name, "getName(...)");
                        e2Var.f191564h = name;
                        e2Var.f191565i = o19;
                        if (r6Var5.y()) {
                            java.lang.String[] E = r6Var5.E(com.tencent.mm.pluginsdk.ui.tools.j2.f191729a);
                            e2Var.f191601p = E == null ? 0 : E.length;
                        } else if (r6Var5.A()) {
                            e2Var.f191566j = r6Var5.C();
                            e2Var.f191562f = r6Var5.B();
                        }
                        list.add(e2Var);
                    }
                }
            }
        }
    }
}
