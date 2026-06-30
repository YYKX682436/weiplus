package qf0;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362244e;

    public m(java.lang.String str, java.lang.String str2) {
        this.f362243d = str;
        this.f362244e = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r0 < 96) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            vn4.f r0 = vn4.f.f438440a
            java.lang.String r1 = "path"
            java.lang.String r2 = r8.f362243d
            kotlin.jvm.internal.o.g(r2, r1)
            java.lang.String r1 = "patchVersion"
            java.lang.String r3 = r8.f362244e
            kotlin.jvm.internal.o.g(r3, r1)
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r4 = com.tencent.mm.vfs.z7.a(r2)
            r1.<init>(r4)
            boolean r0 = r0.a(r1)
            java.lang.String r1 = "MicroMsg.HpRevertHelper"
            if (r0 != 0) goto L28
            java.lang.String r0 = "recordHotpatchFile isLegalFile=false"
            com.tencent.mars.xlog.Log.e(r1, r0)
            goto Lea
        L28:
            int r0 = r3.length()
            r4 = 1
            r5 = 0
            if (r0 <= 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r5
        L33:
            java.lang.String r6 = "substring(...)"
            if (r0 == 0) goto L77
            java.lang.String r0 = "^0x2800[0-9A-Fa-f]{2}[0-5A-Za-z][0-9A-Za-z]$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.lang.String r7 = "compile(...)"
            kotlin.jvm.internal.o.f(r0, r7)
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L6a
            int r0 = r3.length()
            int r0 = r0 + (-2)
            java.lang.String r0 = r3.substring(r0)
            kotlin.jvm.internal.o.f(r0, r6)
            r7 = 16
            r26.a.a(r7)
            int r0 = java.lang.Integer.parseInt(r0, r7)
            if (r0 < 0) goto L6a
            r7 = 96
            if (r0 >= r7) goto L6a
            goto L6b
        L6a:
            r4 = r5
        L6b:
            if (r4 != 0) goto L77
            java.lang.String r0 = "recordHotpatchFile not releaseVersion: "
            java.lang.String r0 = r0.concat(r3)
            com.tencent.mars.xlog.Log.e(r1, r0)
            goto Lea
        L77:
            java.lang.String r0 = com.tencent.mm.vfs.w6.p(r2)
            kotlin.jvm.internal.o.d(r0)
            java.lang.String r3 = lp0.a.f320248b
            if (r3 == 0) goto L8c
            r4 = 8
            java.lang.String r3 = r3.substring(r5, r4)
            kotlin.jvm.internal.o.f(r3, r6)
            goto L8e
        L8c:
            java.lang.String r3 = ""
        L8e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "__"
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            com.tencent.mm.vfs.r6 r4 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.r6 r5 = vn4.f.f438441b
            r4.<init>(r5, r3)
            java.lang.String r3 = r4.o()
            java.lang.String r4 = "getAbsolutePath(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            com.tencent.mm.vfs.w6.c(r2, r3)
            java.lang.String r2 = com.tencent.mm.vfs.w6.p(r3)
            boolean r4 = kotlin.jvm.internal.o.b(r2, r0)
            if (r4 != 0) goto Le1
            com.tencent.mm.vfs.w6.h(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "recordHotpatchFile but md5 not same! md5=("
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " , "
            r3.append(r0)
            r3.append(r2)
            r0 = 41
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.mars.xlog.Log.e(r1, r0)
            goto Lea
        Le1:
            java.lang.String r2 = "recordHotpatchFile success! md5="
            java.lang.String r0 = r2.concat(r0)
            com.tencent.mars.xlog.Log.i(r1, r0)
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf0.m.run():void");
    }
}
