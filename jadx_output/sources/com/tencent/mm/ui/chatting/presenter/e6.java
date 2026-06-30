package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class e6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.c6 f202204d;

    public e6(com.tencent.mm.ui.chatting.presenter.c6 c6Var) {
        this.f202204d = c6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0399, code lost:
    
        r0.n();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.presenter.g6(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03a4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00bf, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00bd, code lost:
    
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a9, code lost:
    
        if (r6 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.UrlHistoryListPresenter", "[loadData][perf] Phase1-idOnly:%dms, count:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r7), java.lang.Integer.valueOf(r9.size()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e0, code lost:
    
        if (r9.isEmpty() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ea, code lost:
    
        if (r26.f202204d.f202152t.get() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ee, code lost:
    
        r0 = new java.util.ArrayList(r9.size());
        r6 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ff, code lost:
    
        if (r6.hasNext() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0101, code lost:
    
        r0.add(java.lang.Long.valueOf(((long[]) r6.next())[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0111, code lost:
    
        r9.clear();
        r6 = java.lang.System.currentTimeMillis();
        r8 = r26.f202204d;
        r8.getClass();
        r9 = java.lang.System.currentTimeMillis();
        r15 = new java.util.concurrent.ConcurrentHashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x012a, code lost:
    
        if (r0.isEmpty() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0132, code lost:
    
        if (r8.f202152t.get() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0136, code lost:
    
        r12 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).X8(r8.f202542e);
        r13 = new java.lang.StringBuilder();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0150, code lost:
    
        if (r14 >= 10) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0152, code lost:
    
        if (r14 <= 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0154, code lost:
    
        r13.append(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0157, code lost:
    
        r13.append(com.tencent.mm.ui.chatting.presenter.c6.f202150u[r14]);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0162, code lost:
    
        r11 = new java.lang.String[]{"SELECT " + ((java.lang.Object) r13) + " FROM " + r12 + " WHERE msgId IN (", ")"};
        r18 = 0;
        r12 = r11[0];
        r11 = r11[1];
        r14 = ((r0.size() + 200) - 1) / 200;
        r13 = new java.util.concurrent.CountDownLatch(r14);
        r19 = r3;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a0, code lost:
    
        if (r3 >= r0.size()) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a2, code lost:
    
        r4 = r3 + 200;
        r1 = java.lang.Math.min(r4, r0.size());
        r4 = new java.lang.StringBuilder();
        r21 = r6;
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b6, code lost:
    
        if (r6 >= r1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b8, code lost:
    
        if (r6 <= r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ba, code lost:
    
        r4.append(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01bd, code lost:
    
        r4.append(r0.get(r6));
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c7, code lost:
    
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.i6(r8, r12 + r4.toString() + r11, r15, r13));
        r3 = r4;
        r6 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01f0, code lost:
    
        r21 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f2, code lost:
    
        r13.await();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021c, code lost:
    
        r19 = r3;
        r18 = 0;
        r21 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x038e, code lost:
    
        r0 = r26.f202204d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0396, code lost:
    
        if (r0.f202152t.get() == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.presenter.e6.run():void");
    }
}
