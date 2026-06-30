package ri;

/* loaded from: classes12.dex */
public class e implements yj0.b {
    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: all -> 0x00dc, TryCatch #0 {, blocks: (B:18:0x0032, B:27:0x00da, B:31:0x005e, B:33:0x0071, B:35:0x0085, B:36:0x0092, B:38:0x009f, B:39:0x0042, B:42:0x004d), top: B:17:0x0032 }] */
    @Override // yj0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Object r14, java.lang.Object[] r15) {
        /*
            r8 = this;
            java.lang.String r0 = "wakelock"
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            ri.a.c(r0, r1, r2, r3, r4, r5, r6, r7)
            com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner r10 = com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE
            boolean r10 = r10.isBackground()
            if (r10 == 0) goto Ldf
            java.lang.String r10 = "acquire"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L26
            java.lang.String r10 = "release"
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto Ldf
        L26:
            boolean r10 = r14 instanceof android.os.PowerManager.WakeLock
            if (r10 == 0) goto Ldf
            if (r15 == 0) goto L2f
            int r10 = r15.length
            if (r10 != 0) goto Ldf
        L2f:
            java.util.Map r10 = ri.a.f395836e
            monitor-enter(r10)
            int r11 = r12.hashCode()     // Catch: java.lang.Throwable -> Ldc
            r13 = -1164222250(0xffffffffba9b60d6, float:-0.0011854421)
            r15 = 1
            if (r11 == r13) goto L4d
            r13 = 1090594823(0x41012807, float:8.072272)
            if (r11 == r13) goto L42
            goto L57
        L42:
            java.lang.String r11 = "release"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> Ldc
            if (r11 == 0) goto L57
            r11 = r15
            goto L58
        L4d:
            java.lang.String r11 = "acquire"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> Ldc
            if (r11 == 0) goto L57
            r11 = 0
            goto L58
        L57:
            r11 = -1
        L58:
            if (r11 == 0) goto L92
            if (r11 == r15) goto L5e
            goto Lda
        L5e:
            int r9 = r14.hashCode()     // Catch: java.lang.Throwable -> Ldc
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Ldc
            r11 = r10
            java.util.HashMap r11 = (java.util.HashMap) r11     // Catch: java.lang.Throwable -> Ldc
            java.lang.Object r9 = r11.remove(r9)     // Catch: java.lang.Throwable -> Ldc
            android.util.Pair r9 = (android.util.Pair) r9     // Catch: java.lang.Throwable -> Ldc
            if (r9 == 0) goto Lda
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Ldc
            java.lang.Object r13 = r9.second     // Catch: java.lang.Throwable -> Ldc
            java.lang.Long r13 = (java.lang.Long) r13     // Catch: java.lang.Throwable -> Ldc
            long r13 = r13.longValue()     // Catch: java.lang.Throwable -> Ldc
            long r11 = r11 - r13
            r13 = 1800000(0x1b7740, double:8.89318E-318)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 < 0) goto Lda
            ku5.u0 r13 = ku5.t0.f312615d     // Catch: java.lang.Throwable -> Ldc
            ri.e$$a r14 = new ri.e$$a     // Catch: java.lang.Throwable -> Ldc
            r14.<init>()     // Catch: java.lang.Throwable -> Ldc
            ku5.t0 r13 = (ku5.t0) r13     // Catch: java.lang.Throwable -> Ldc
            r13.g(r14)     // Catch: java.lang.Throwable -> Ldc
            goto Lda
        L92:
            r11 = r14
            android.os.PowerManager$WakeLock r11 = (android.os.PowerManager.WakeLock) r11     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r11 = ri.a.b(r11)     // Catch: java.lang.Throwable -> Ldc
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Ldc
            if (r12 != 0) goto Lda
            int r12 = r14.hashCode()     // Catch: java.lang.Throwable -> Ldc
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> Ldc
            android.util.Pair r13 = new android.util.Pair     // Catch: java.lang.Throwable -> Ldc
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldc
            r15.<init>()     // Catch: java.lang.Throwable -> Ldc
            r15.append(r11)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r11 = "@"
            r15.append(r11)     // Catch: java.lang.Throwable -> Ldc
            int r11 = r14.hashCode()     // Catch: java.lang.Throwable -> Ldc
            r15.append(r11)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r11 = "@"
            r15.append(r11)     // Catch: java.lang.Throwable -> Ldc
            r15.append(r9)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r9 = r15.toString()     // Catch: java.lang.Throwable -> Ldc
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Ldc
            java.lang.Long r11 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> Ldc
            r13.<init>(r9, r11)     // Catch: java.lang.Throwable -> Ldc
            r9 = r10
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch: java.lang.Throwable -> Ldc
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> Ldc
        Lda:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Ldc
            goto Ldf
        Ldc:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Ldc
            throw r9
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.e.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[]):void");
    }
}
