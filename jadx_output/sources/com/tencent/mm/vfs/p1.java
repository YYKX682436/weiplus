package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class p1 extends com.tencent.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f213120e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f213121f;

    /* renamed from: g, reason: collision with root package name */
    public final long f213122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.ExpireFileSystem f213123h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.vfs.ExpireFileSystem expireFileSystem, com.tencent.mm.vfs.q2 q2Var, long j17, java.util.Map map) {
        super(expireFileSystem, map);
        this.f213123h = expireFileSystem;
        this.f213120e = q2Var;
        this.f213121f = java.util.Collections.singletonList(q2Var);
        this.f213122g = j17;
    }

    @Override // com.tencent.mm.vfs.m0
    public java.util.List K() {
        return this.f213121f;
    }

    @Override // com.tencent.mm.vfs.m0
    public com.tencent.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f213120e;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.p1)) {
            return false;
        }
        com.tencent.mm.vfs.p1 p1Var = (com.tencent.mm.vfs.p1) obj;
        return this.f213120e.equals(p1Var.f213120e) && this.f213122g == p1Var.f213122g;
    }

    public int hashCode() {
        int hashCode = com.tencent.mm.vfs.p1.class.hashCode();
        java.lang.Object[] objArr = {this.f213120e, java.lang.Long.valueOf(this.f213122g)};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "deleteFiles"
            java.lang.String r3 = "deleteSize"
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r1.f213122g
            long r4 = r4 - r6
            r6 = 0
            r8 = 0
            com.tencent.mm.vfs.q2 r0 = r1.f213120e     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a
            java.lang.String r10 = ""
            r11 = 0
            r12 = 1
            java.lang.Iterable r0 = com.tencent.mm.vfs.e8.p(r0, r10, r12, r11)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            if (r0 == 0) goto L6e
            pm5.b r0 = (pm5.b) r0     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L8a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L8a
            r10 = r6
            r13 = r8
        L24:
            boolean r14 = r0.hasNext()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            if (r14 == 0) goto L5e
            java.lang.Object r14 = r0.next()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            com.tencent.mm.vfs.x1 r14 = (com.tencent.mm.vfs.x1) r14     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            r18.throwIfCanceled()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            boolean r15 = r14.f213236f     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            if (r15 == 0) goto L45
            com.tencent.mm.vfs.ExpireFileSystem r15 = r1.f213123h     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            boolean r15 = r15.f212712h     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            if (r15 == 0) goto L5c
            com.tencent.mm.vfs.q2 r15 = r14.f213237g     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            java.lang.String r14 = r14.f213231a     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            r15.e(r14, r8)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            goto L5c
        L45:
            long r8 = r14.f213235e     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 > 0) goto L5c
            boolean r8 = r14.b(r12)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            if (r8 == 0) goto L5c
            long r8 = r14.f213234d     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            int r16 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r16 >= 0) goto L59
            long r8 = r14.f213233c     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
        L59:
            long r10 = r10 + r8
            int r13 = r13 + 1
        L5c:
            r8 = 0
            goto L24
        L5e:
            r6 = r10
            r8 = r13
            goto L6f
        L61:
            r0 = move-exception
            r6 = r10
            r8 = r13
            goto L6c
        L65:
            r0 = move-exception
            r6 = r10
            r8 = r13
            r4 = 3
            goto L8d
        L6a:
            r0 = move-exception
            r8 = 0
        L6c:
            r9 = 3
            goto L9a
        L6e:
            r8 = 0
        L6f:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0, r2, r4}
            r4 = 3
            r1.J(r4, r0)
            super.q(r18)
            return
        L83:
            r0 = move-exception
            goto L8b
        L85:
            r0 = move-exception
            r4 = 3
            r9 = r4
            r8 = 0
            goto L9a
        L8a:
            r0 = move-exception
        L8b:
            r4 = 3
            r8 = 0
        L8d:
            boolean r4 = r0 instanceof android.os.OperationCanceledException     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L93
            r4 = 4
            goto L94
        L93:
            r4 = 5
        L94:
            r9 = r4
            throw r0     // Catch: java.lang.Throwable -> L96
        L96:
            r0 = move-exception
            goto L9a
        L98:
            r0 = move-exception
            r9 = r4
        L9a:
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r4, r2, r5}
            r1.J(r9, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.p1.q(android.os.CancellationSignal):void");
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return "expire(" + com.tencent.mm.vfs.e8.h(this.f213122g) + ") <- " + this.f213120e;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f213123h;
    }
}
