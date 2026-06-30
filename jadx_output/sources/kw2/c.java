package kw2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public long f312895b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f312894a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f312896c = new java.util.HashSet();

    public c(r45.qt2 qt2Var) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
    
        if (r8 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011b, code lost:
    
        if (r8 == null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r8, com.tencent.mm.protocal.protobuf.FinderCommentInfo r10) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kw2.c.a(long, com.tencent.mm.protocal.protobuf.FinderCommentInfo):void");
    }

    public final void b(long j17, int i17, dn.h hVar) {
        kw2.b bVar;
        if (j17 == 0 || (bVar = (kw2.b) this.f312894a.get(java.lang.Long.valueOf(j17))) == null) {
            return;
        }
        if (i17 != 0) {
            bVar.f312873j = i17;
            bVar.f312880q = i17;
        }
        java.lang.String str = hVar != null ? hVar.f241769d : null;
        if (str == null) {
            str = "";
        }
        bVar.f312878o = str;
        bVar.f312879p = hVar != null ? hVar.f241770e : 0;
        bVar.f312883t = hVar != null ? hVar.field_averageConnectCost : 0L;
        bVar.f312882s = hVar != null ? hVar.field_connectCostTime : 0L;
        long j18 = hVar != null ? hVar.field_fileLength : 0L;
        if (j18 > 0) {
            bVar.f312869f = j18;
        }
    }

    public final void c(long j17, long j18) {
        kw2.b bVar;
        if (j17 == 0 || (bVar = (kw2.b) this.f312894a.get(java.lang.Long.valueOf(j17))) == null) {
            return;
        }
        if (!(bVar.f312874k == 0)) {
            bVar = null;
        }
        if (bVar != null) {
            long c17 = c01.id.c();
            long j19 = c17 - j18;
            bVar.f312874k = j19;
            if (bVar.f312872i == -1) {
                long j27 = bVar.f312886w;
                bVar.f312872i = 1 <= j27 && j27 < c17 ? c17 - j27 : 0L;
            }
            if (bVar.f312867d == 2) {
                bVar.f312884u = j19;
            }
        }
    }

    public final void d(long j17) {
        kw2.b bVar;
        if (j17 == 0 || (bVar = (kw2.b) this.f312894a.get(java.lang.Long.valueOf(j17))) == null || bVar.f312889z <= 0) {
            return;
        }
        long c17 = c01.id.c();
        bVar.f312877n += c17;
        r45.t23 t23Var = new r45.t23();
        t23Var.set(2, java.lang.Integer.valueOf((int) c17));
        t23Var.set(1, java.lang.Integer.valueOf(bVar.A));
        if (bVar.f312875l == 0) {
            t23Var.set(0, 2);
        } else {
            t23Var.set(0, 0);
        }
        bVar.f312888y.add(t23Var);
        bVar.f312889z = 0L;
    }

    public final void e(long j17) {
        if (j17 == 0) {
            return;
        }
        kw2.b bVar = (kw2.b) this.f312894a.get(java.lang.Long.valueOf(j17));
        java.util.HashSet hashSet = this.f312896c;
        if (bVar != null) {
            if (!(bVar.f312886w == 0)) {
                bVar = null;
            }
            if (bVar != null) {
                bVar.f312886w = c01.id.c();
                bVar.f312870g = hashSet.contains(java.lang.Long.valueOf(j17)) ? 0L : 1L;
            }
        }
        hashSet.add(java.lang.Long.valueOf(j17));
    }
}
