package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class a6 extends com.tencent.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f212783e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f212784f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String[] f212785g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String[] f212786h;

    /* renamed from: i, reason: collision with root package name */
    public long f212787i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.TreeMap f212788m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.vfs.b6[] f212789n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f212790o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.vfs.b6[] f212791p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f212792q;

    /* renamed from: r, reason: collision with root package name */
    public int f212793r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.StatisticsFileSystem f212794s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.tencent.mm.vfs.StatisticsFileSystem statisticsFileSystem, com.tencent.mm.vfs.q2 q2Var, java.lang.String[] strArr, java.lang.String[] strArr2, java.util.Map map) {
        super(statisticsFileSystem, map);
        this.f212794s = statisticsFileSystem;
        this.f212787i = Long.MIN_VALUE;
        this.f212783e = q2Var;
        this.f212784f = java.util.Collections.singletonList(q2Var);
        this.f212785g = strArr;
        this.f212786h = strArr2;
    }

    @Override // com.tencent.mm.vfs.m0
    public java.util.List K() {
        return this.f212784f;
    }

    @Override // com.tencent.mm.vfs.m0
    public com.tencent.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f212783e;
    }

    public final void O(com.tencent.mm.vfs.b6 b6Var) {
        java.lang.Object[] objArr = new java.lang.Object[16];
        objArr[0] = "relPath";
        objArr[1] = b6Var.f212833d;
        objArr[2] = "recursive";
        objArr[3] = java.lang.Boolean.valueOf(b6Var.f212834e);
        objArr[4] = "totalSize";
        objArr[5] = java.lang.Long.valueOf(b6Var.f212837h);
        objArr[6] = "fileCount";
        objArr[7] = java.lang.Integer.valueOf(b6Var.f212838i);
        objArr[8] = "dirCount";
        objArr[9] = java.lang.Integer.valueOf(b6Var.f212839m);
        objArr[10] = "averageAge";
        objArr[11] = java.lang.Long.valueOf(b6Var.f212838i - b6Var.f212843q == 0 ? 0L : b6Var.f212840n / (r1 - r3));
        objArr[12] = "maxDepth";
        objArr[13] = java.lang.Integer.valueOf(b6Var.f212841o);
        objArr[14] = "maxFileSize";
        objArr[15] = java.lang.Long.valueOf(b6Var.f212842p);
        J(2, objArr);
    }

    public final void P() {
        long j17 = com.tencent.mm.vfs.a3.f212781a.j();
        if (this.f212787i != j17 || this.f212789n == null) {
            this.f212787i = j17;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            this.f212788m = new java.util.TreeMap();
            this.f212793r = 0;
            for (java.lang.String str : this.f212785g) {
                boolean z17 = !str.endsWith("\u0000");
                if (!z17) {
                    str = str.substring(0, str.length() - 1);
                }
                com.tencent.mm.vfs.b6 b6Var = new com.tencent.mm.vfs.b6(str, z17);
                if (z17) {
                    arrayList.add(b6Var);
                    this.f212788m.put(str, new com.tencent.mm.vfs.b6[]{b6Var});
                } else {
                    arrayList2.add(b6Var);
                }
            }
            com.tencent.mm.vfs.b6[] b6VarArr = new com.tencent.mm.vfs.b6[0];
            this.f212789n = (com.tencent.mm.vfs.b6[]) arrayList.toArray(b6VarArr);
            com.tencent.mm.vfs.b6[] b6VarArr2 = (com.tencent.mm.vfs.b6[]) arrayList2.toArray(b6VarArr);
            this.f212791p = b6VarArr2;
            this.f212790o = new byte[this.f212789n.length];
            this.f212792q = new byte[b6VarArr2.length];
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.a6)) {
            return false;
        }
        com.tencent.mm.vfs.a6 a6Var = (com.tencent.mm.vfs.a6) obj;
        return this.f212783e.equals(a6Var.f212783e) && java.util.Arrays.equals(this.f212785g, a6Var.f212785g) && java.util.Arrays.equals(this.f212786h, a6Var.f212786h) && this.f212794s.f212756h == a6Var.f212794s.f212756h;
    }

    public int hashCode() {
        int hashCode = com.tencent.mm.vfs.a6.class.hashCode();
        java.lang.Object[] objArr = {this.f212783e, this.f212785g, this.f212786h, java.lang.Boolean.valueOf(this.f212794s.f212756h)};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.q2
    public java.lang.Iterable list(java.lang.String str) {
        com.tencent.mm.vfs.b6 b6Var;
        java.lang.Iterable list = super.list(str);
        if (com.tencent.mm.vfs.a3.f212781a.j() == Long.MIN_VALUE) {
            return list;
        }
        P();
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, true, true);
        com.tencent.mm.vfs.b6[] b6VarArr = (com.tencent.mm.vfs.b6[]) this.f212788m.remove(l17);
        int binarySearch = java.util.Arrays.binarySearch(this.f212791p, l17);
        if (b6VarArr == null && binarySearch < 0) {
            return list;
        }
        if (binarySearch < 0) {
            b6Var = null;
        } else {
            b6Var = this.f212791p[binarySearch];
            this.f212792q[binarySearch] = (byte) (list == null ? 2 : 1);
        }
        int binarySearch2 = java.util.Arrays.binarySearch(this.f212789n, l17);
        if (binarySearch2 >= 0) {
            this.f212790o[binarySearch2] = (byte) (list != null ? 1 : 2);
        }
        if (list == null) {
            return null;
        }
        this.f212793r++;
        com.tencent.mm.vfs.z5 z5Var = new com.tencent.mm.vfs.z5(this, b6VarArr, b6Var);
        return new pm5.l(list, z5Var, z5Var, false);
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        java.lang.Iterable<com.tencent.mm.vfs.x1> list;
        try {
            if (this.f212794s.f212756h && com.tencent.mm.vfs.a3.f212781a.j() != Long.MIN_VALUE) {
                if (this.f212793r != 0) {
                    this.f212788m = null;
                    this.f212789n = null;
                    this.f212791p = null;
                    this.f212792q = null;
                    this.f212793r = 0;
                }
                P();
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    com.tencent.mm.vfs.b6[] b6VarArr = this.f212791p;
                    if (i17 >= b6VarArr.length) {
                        break;
                    }
                    if (this.f212792q[i17] <= 0 && (list = list(b6VarArr[i17].f212833d)) != null) {
                        for (com.tencent.mm.vfs.x1 x1Var : list) {
                            i18++;
                            if ((i18 & 16) == 0) {
                                cancellationSignal.throwIfCanceled();
                            }
                        }
                    }
                    i17++;
                }
                while (!this.f212788m.isEmpty()) {
                    java.lang.Iterable<com.tencent.mm.vfs.x1> list2 = list((java.lang.String) this.f212788m.lastKey());
                    if (list2 != null) {
                        for (com.tencent.mm.vfs.x1 x1Var2 : list2) {
                            i18++;
                            if ((i18 & 16) == 0) {
                                cancellationSignal.throwIfCanceled();
                            }
                        }
                    }
                }
            }
            if (this.f212789n != null && this.f212791p != null && this.f212793r == 0) {
                int i19 = 0;
                while (true) {
                    com.tencent.mm.vfs.b6[] b6VarArr2 = this.f212789n;
                    if (i19 >= b6VarArr2.length) {
                        break;
                    }
                    if (this.f212790o[i19] == 1) {
                        com.tencent.mm.vfs.b6 b6Var = b6VarArr2[i19];
                        java.util.TreeMap treeMap = this.f212788m;
                        java.lang.String str = b6Var.f212833d;
                        java.lang.String str2 = b6Var.f212833d;
                        java.lang.String str3 = (java.lang.String) treeMap.ceilingKey(str);
                        if (str3 != null) {
                            if (!str3.equals(str2)) {
                                if (str3.startsWith(str2 + '/')) {
                                }
                            }
                        }
                        O(b6Var);
                    }
                    i19++;
                }
                int i27 = 0;
                while (true) {
                    com.tencent.mm.vfs.b6[] b6VarArr3 = this.f212791p;
                    if (i27 >= b6VarArr3.length) {
                        break;
                    }
                    if (this.f212792q[i27] == 1) {
                        O(b6VarArr3[i27]);
                    }
                    i27++;
                }
            }
            this.f212787i = Long.MIN_VALUE;
            this.f212788m = null;
            this.f212789n = null;
            this.f212790o = null;
            this.f212791p = null;
            this.f212792q = null;
            this.f212793r = 0;
            cancellationSignal.throwIfCanceled();
            super.q(cancellationSignal);
        } catch (java.lang.Throwable th6) {
            this.f212787i = Long.MIN_VALUE;
            this.f212788m = null;
            this.f212789n = null;
            this.f212790o = null;
            this.f212791p = null;
            this.f212792q = null;
            this.f212793r = 0;
            throw th6;
        }
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return "stat <- " + this.f212783e;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f212794s;
    }
}
