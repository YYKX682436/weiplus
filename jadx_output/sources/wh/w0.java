package wh;

/* loaded from: classes12.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f445889a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f445890b;

    public w0(int i17, int[] iArr) {
        this.f445889a = "/proc/" + i17 + "/time_in_state";
        this.f445890b = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r5 < 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        r0.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List a() {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L60
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = r10.f445889a     // Catch: java.lang.Throwable -> L60
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L60
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L60
            android.text.TextUtils$SimpleStringSplitter r2 = new android.text.TextUtils$SimpleStringSplitter     // Catch: java.lang.Throwable -> L56
            r3 = 32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L56
            r3 = 0
            r4 = 0
            r5 = -1
        L1b:
            r6 = r3
        L1c:
            java.lang.String r7 = r1.readLine()     // Catch: java.lang.Throwable -> L56
            if (r7 == 0) goto L4f
            java.lang.String r8 = "cpu"
            boolean r8 = r7.startsWith(r8)     // Catch: java.lang.Throwable -> L56
            int[] r9 = r10.f445890b
            if (r8 == 0) goto L38
            if (r5 < 0) goto L31
            r0.add(r4)     // Catch: java.lang.Throwable -> L56
        L31:
            int r5 = r5 + 1
            r4 = r9[r5]     // Catch: java.lang.Throwable -> L56
            long[] r4 = new long[r4]     // Catch: java.lang.Throwable -> L56
            goto L1b
        L38:
            r8 = r9[r5]     // Catch: java.lang.Throwable -> L56
            if (r6 >= r8) goto L1c
            r2.setString(r7)     // Catch: java.lang.Throwable -> L56
            r2.next()     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = r2.next()     // Catch: java.lang.Throwable -> L56
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Throwable -> L56
            r4[r6] = r7     // Catch: java.lang.Throwable -> L56
            int r6 = r6 + 1
            goto L1c
        L4f:
            r0.add(r4)     // Catch: java.lang.Throwable -> L56
            r1.close()     // Catch: java.lang.Throwable -> L60
            return r0
        L56:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L60
        L5f:
            throw r0     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to read cpu-freq: "
            r2.<init>(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.w0.a():java.util.List");
    }

    public void b() {
        java.util.List a17 = a();
        int[] iArr = this.f445890b;
        java.util.ArrayList arrayList = (java.util.ArrayList) a17;
        if (iArr.length != arrayList.size()) {
            throw new java.io.IOException("Cpu clusterNum unmatched, expect = " + iArr.length + ", actual = " + arrayList.size());
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            long[] jArr = (long[]) arrayList.get(i17);
            if (iArr[i17] != jArr.length) {
                throw new java.io.IOException("Cpu clusterStepNum unmatched, expect = " + iArr[i17] + ", actual = " + jArr.length + ", cluster = " + i17);
            }
        }
    }
}
