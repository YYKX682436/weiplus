package g30;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268024d;

    public c(g30.e eVar, java.lang.String str) {
        this.f268024d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if (r9 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        if (r7 >= 3600000) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        r9.close();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r11 = this;
            java.lang.Class<com.tencent.mm.feature.emoji.b0> r0 = com.tencent.mm.feature.emoji.b0.class
            i95.m r1 = i95.n0.c(r0)
            com.tencent.mm.feature.emoji.b0 r1 = (com.tencent.mm.feature.emoji.b0) r1
            r1.getClass()
            com.tencent.mm.storage.n5 r1 = com.tencent.mm.storage.n5.f()
            z85.k r1 = r1.a()
            r1.getClass()
            java.lang.String r2 = r11.f268024d
            boolean r3 = n22.m.q(r2)
            r4 = 0
            if (r3 == 0) goto L98
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "274544"
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r5 = 0
            android.content.SharedPreferences r7 = r1.f470806e
            long r5 = r7.getLong(r3, r5)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r5
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r5 = 1
            if (r3 < 0) goto L44
        L42:
            r4 = r5
            goto L98
        L44:
            boolean r3 = n22.m.q(r2)
            if (r3 == 0) goto L8d
            java.lang.String r3 = "desc"
            java.lang.String r6 = "EmojiInfoDesc"
            java.lang.String r9 = "groupId"
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r6, r9}
            java.lang.String r6 = "select %s from %s where %s=?"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            java.lang.String[] r6 = new java.lang.String[]{r2}
            r9 = 0
            l75.k0 r1 = r1.f470805d     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r10 = 2
            android.database.Cursor r9 = r1.f(r3, r6, r10)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            if (r9 == 0) goto L70
            boolean r1 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            if (r1 == 0) goto L70
            r1 = r5
            goto L71
        L70:
            r1 = r4
        L71:
            if (r9 == 0) goto L8e
            goto L83
        L74:
            r0 = move-exception
            goto L87
        L76:
            r1 = move-exception
            java.lang.String r3 = "MicroMsg.emoji.EmojiInfoDescStorage"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L74
            com.tencent.mars.xlog.Log.w(r3, r1)     // Catch: java.lang.Throwable -> L74
            if (r9 == 0) goto L8d
            r1 = r4
        L83:
            r9.close()
            goto L8e
        L87:
            if (r9 == 0) goto L8c
            r9.close()
        L8c:
            throw r0
        L8d:
            r1 = r4
        L8e:
            if (r1 != 0) goto L98
            r9 = 3600000(0x36ee80, double:1.7786363E-317)
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 < 0) goto L98
            goto L42
        L98:
            if (r4 == 0) goto Lc3
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.feature.emoji.b0 r0 = (com.tencent.mm.feature.emoji.b0) r0
            y12.h r0 = r0.Ni()
            r0.getClass()
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r0 == 0) goto Lb5
            java.lang.String r0 = "MicroMsg.emoji.EmojiMgrImpl"
            java.lang.String r1 = "doSceneGetEmotionDesc get emotion desc faild."
            com.tencent.mars.xlog.Log.w(r0, r1)
            goto Lc3
        Lb5:
            z12.p r0 = new z12.p
            r0.<init>(r2)
            gm0.y r1 = gm0.j1.n()
            com.tencent.mm.modelbase.r1 r1 = r1.f273288b
            r1.g(r0)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g30.c.run():void");
    }
}
