package gi;

/* loaded from: classes12.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final rh.c1 f271989a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f271990b = new gi.a1(this);

    public b1(rh.c1 c1Var) {
        this.f271989a = c1Var;
    }

    public static java.lang.String c(m3.d dVar, m3.d dVar2, java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            m3.d dVar3 = (m3.d) it.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(android.text.TextUtils.isEmpty(str) ? "" : ">>");
            sb6.append((java.lang.String) dVar3.f323092a);
            str = sb6.toString();
        }
        return "calls: " + str + "\ncurr: " + ((java.lang.String) dVar.f323092a) + ", from=" + android.util.Log.getStackTraceString((java.lang.Throwable) dVar.f323093b) + "last: " + ((java.lang.String) dVar2.f323092a) + ", from=" + android.util.Log.getStackTraceString((java.lang.Throwable) dVar2.f323093b);
    }

    public final void a(java.lang.String str, m3.d dVar, java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str2 = "";
        while (it.hasNext()) {
            m3.d dVar2 = (m3.d) it.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str2);
            sb6.append(android.text.TextUtils.isEmpty(str2) ? "" : ">>");
            sb6.append((java.lang.String) dVar2.f323092a);
            str2 = sb6.toString();
        }
        ap.a.a(1, "errCompositors", (java.lang.Throwable) dVar.f323093b, null, "inspect", this.f271989a.y(), (java.lang.String) dVar.f323092a, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x002d, B:8:0x0036, B:9:0x003e, B:14:0x006e, B:16:0x007b, B:21:0x0042, B:24:0x004d, B:27:0x0057, B:30:0x0060, B:34:0x001b), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void b() {
        /*
            r7 = this;
            monitor-enter(r7)
            m3.d r0 = new m3.d     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = "clear"
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch: java.lang.Throwable -> Lbf
            r2.<init>()     // Catch: java.lang.Throwable -> Lbf
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lbf
            java.util.List r2 = r7.f271990b     // Catch: java.lang.Throwable -> Lbf
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> Lbf
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lbf
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1b
            r2 = r4
            goto L2d
        L1b:
            java.util.List r2 = r7.f271990b     // Catch: java.lang.Throwable -> Lbf
            r5 = r2
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> Lbf
            int r5 = r5.size()     // Catch: java.lang.Throwable -> Lbf
            int r5 = r5 - r3
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lbf
            m3.d r2 = (m3.d) r2     // Catch: java.lang.Throwable -> Lbf
        L2d:
            java.util.List r5 = r7.f271990b     // Catch: java.lang.Throwable -> Lbf
            gi.a1 r5 = (gi.a1) r5     // Catch: java.lang.Throwable -> Lbf
            r5.add(r0)     // Catch: java.lang.Throwable -> Lbf
            if (r2 == 0) goto L78
            java.lang.Object r5 = r2.f323092a     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lbf
            int r6 = r5.hashCode()     // Catch: java.lang.Throwable -> Lbf
            switch(r6) {
                case -1367724422: goto L60;
                case -1274442605: goto L57;
                case 94746189: goto L4d;
                case 109757538: goto L42;
                default: goto L41;
            }     // Catch: java.lang.Throwable -> Lbf
        L41:
            goto L6a
        L42:
            java.lang.String r3 = "start"
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> Lbf
            if (r3 == 0) goto L6a
            r3 = 0
            goto L6b
        L4d:
            java.lang.String r3 = "clear"
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> Lbf
            if (r3 == 0) goto L6a
            r3 = 3
            goto L6b
        L57:
            java.lang.String r6 = "finish"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> Lbf
            if (r5 == 0) goto L6a
            goto L6b
        L60:
            java.lang.String r3 = "cancel"
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> Lbf
            if (r3 == 0) goto L6a
            r3 = 2
            goto L6b
        L6a:
            r3 = -1
        L6b:
            if (r3 == 0) goto L6e
            goto L78
        L6e:
            java.lang.String r4 = "not yet finished, call #finish/#cancel before cleaning"
            java.util.List r3 = r7.f271990b     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = c(r0, r2, r3)     // Catch: java.lang.Throwable -> Lbf
            goto L79
        L78:
            r2 = r4
        L79:
            if (r4 == 0) goto Lbd
            java.lang.String r3 = "MicroMsg.battery.MMCompositeMonitors"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbf
            r5.<init>()     // Catch: java.lang.Throwable -> Lbf
            rh.c1 r6 = r7.f271989a     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r6 = r6.y()     // Catch: java.lang.Throwable -> Lbf
            r5.append(r6)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r6 = "#"
            r5.append(r6)     // Catch: java.lang.Throwable -> Lbf
            r5.append(r1)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = " "
            r5.append(r1)     // Catch: java.lang.Throwable -> Lbf
            rh.c1 r1 = r7.f271989a     // Catch: java.lang.Throwable -> Lbf
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> Lbf
            r5.append(r1)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = ": "
            r5.append(r1)     // Catch: java.lang.Throwable -> Lbf
            r5.append(r4)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = ", callStackInfo:\n"
            r5.append(r1)     // Catch: java.lang.Throwable -> Lbf
            r5.append(r2)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> Lbf
            com.tencent.mars.xlog.Log.w(r3, r1)     // Catch: java.lang.Throwable -> Lbf
            java.util.List r1 = r7.f271990b     // Catch: java.lang.Throwable -> Lbf
            r7.a(r4, r0, r1)     // Catch: java.lang.Throwable -> Lbf
        Lbd:
            monitor-exit(r7)
            return
        Lbf:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.b1.b():void");
    }
}
