package m84;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m84.a0 f324754a = new m84.a0();

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:11:0x000d, B:5:0x001b, B:9:0x0021), top: B:10:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:11:0x000d, B:5:0x001b, B:9:0x0021), top: B:10:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r5) {
        /*
            java.lang.String r0 = "clear, key="
            java.lang.String r1 = "clear"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "MicroMsg.AdWorldCupAvatarStorage"
            if (r5 == 0) goto L18
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L14
            goto L18
        L14:
            r4 = 0
            goto L19
        L16:
            r5 = move-exception
            goto L3c
        L18:
            r4 = 1
        L19:
            if (r4 == 0) goto L21
            java.lang.String r5 = "clear, aid is null or empty"
            com.tencent.mars.xlog.Log.w(r3, r5)     // Catch: java.lang.Throwable -> L16
            goto L3f
        L21:
            m84.a0 r4 = m84.a0.f324754a     // Catch: java.lang.Throwable -> L16
            java.lang.String r5 = r4.c(r5)     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L16
            r4.append(r5)     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L16
            com.tencent.mars.xlog.Log.i(r3, r0)     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = ""
            p34.o.i(r5, r0)     // Catch: java.lang.Throwable -> L16
            goto L3f
        L3c:
            ca4.q.c(r3, r5)
        L3f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.a0.a(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:38:0x0014, B:5:0x0023, B:9:0x002a, B:11:0x0036, B:17:0x0044, B:21:0x005d, B:22:0x006d, B:27:0x0082), top: B:37:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0023 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:38:0x0014, B:5:0x0023, B:9:0x002a, B:11:0x0036, B:17:0x0044, B:21:0x005d, B:22:0x006d, B:27:0x0082), top: B:37:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:38:0x0014, B:5:0x0023, B:9:0x002a, B:11:0x0036, B:17:0x0044, B:21:0x005d, B:22:0x006d, B:27:0x0082), top: B:37:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final m84.z b(java.lang.String r13) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "getAvatarRecord hit, key="
            java.lang.String r2 = "getAvatarRecord, avatarUrl empty in cache, key="
            java.lang.String r3 = "getAvatarRecord"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r5 = 0
            r6 = 1
            r7 = 0
            java.lang.String r8 = "MicroMsg.AdWorldCupAvatarStorage"
            if (r13 == 0) goto L20
            int r9 = r13.length()     // Catch: java.lang.Throwable -> L1d
            if (r9 != 0) goto L1b
            goto L20
        L1b:
            r9 = r5
            goto L21
        L1d:
            r13 = move-exception
            goto Lb5
        L20:
            r9 = r6
        L21:
            if (r9 == 0) goto L2a
            java.lang.String r13 = "getAvatarRecord, aid is null or empty"
            com.tencent.mars.xlog.Log.w(r8, r13)     // Catch: java.lang.Throwable -> L1d
            goto Lb8
        L2a:
            m84.a0 r9 = m84.a0.f324754a     // Catch: java.lang.Throwable -> L1d
            java.lang.String r13 = r9.c(r13)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r9 = p34.o.e(r13)     // Catch: java.lang.Throwable -> L1d
            if (r9 == 0) goto L3f
            int r10 = r9.length()     // Catch: java.lang.Throwable -> L1d
            if (r10 != 0) goto L3d
            goto L3f
        L3d:
            r10 = r5
            goto L40
        L3f:
            r10 = r6
        L40:
            if (r10 == 0) goto L44
            goto Lb8
        L44:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r9 = "avatarUrl"
            java.lang.String r9 = r10.optString(r9, r0)     // Catch: java.lang.Throwable -> L1d
            kotlin.jvm.internal.o.d(r9)     // Catch: java.lang.Throwable -> L1d
            int r11 = r9.length()     // Catch: java.lang.Throwable -> L1d
            if (r11 != 0) goto L5a
            r11 = r6
            goto L5b
        L5a:
            r11 = r5
        L5b:
            if (r11 == 0) goto L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            r0.append(r13)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            com.tencent.mars.xlog.Log.w(r8, r13)     // Catch: java.lang.Throwable -> L1d
            goto Lb8
        L6d:
            java.lang.String r2 = "avatarMd5"
            java.lang.String r0 = r10.optString(r2, r0)     // Catch: java.lang.Throwable -> L1d
            m84.z r2 = new m84.z     // Catch: java.lang.Throwable -> L1d
            kotlin.jvm.internal.o.d(r0)     // Catch: java.lang.Throwable -> L1d
            int r11 = r0.length()     // Catch: java.lang.Throwable -> L1d
            if (r11 != 0) goto L7f
            r5 = r6
        L7f:
            if (r5 == 0) goto L82
            r0 = r7
        L82:
            java.lang.String r5 = "updateTs"
            r11 = 0
            long r5 = r10.optLong(r5, r11)     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r9, r0, r5)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb3
            r0.append(r13)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r13 = ", ts="
            r0.append(r13)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r13 = "getUpdateTs"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r1)     // Catch: java.lang.Throwable -> Lb3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r1)     // Catch: java.lang.Throwable -> Lb3
            long r5 = r2.f324824c     // Catch: java.lang.Throwable -> Lb3
            r0.append(r5)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> Lb3
            com.tencent.mars.xlog.Log.i(r8, r13)     // Catch: java.lang.Throwable -> Lb3
            r7 = r2
            goto Lb8
        Lb3:
            r13 = move-exception
            r7 = r2
        Lb5:
            ca4.q.c(r8, r13)
        Lb8:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.a0.b(java.lang.String):m84.z");
    }

    public static final boolean d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasAvatar", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage");
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAvatar", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage");
            return false;
        }
        m84.z b17 = b(str);
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAvatar", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage");
            return false;
        }
        boolean z17 = b17.a().length() > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAvatar", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0026 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:30:0x001a, B:5:0x0026, B:10:0x0030, B:15:0x0045, B:18:0x0061, B:20:0x00a2, B:24:0x00ae, B:28:0x00cb), top: B:29:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(java.lang.String r17, m84.z r18) {
        /*
            r0 = r17
            r1 = r18
            java.lang.String r2 = "getUpdateTs"
            java.lang.String r3 = "getAvatarMd5"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord"
            java.lang.String r5 = "saveAvatarRecord, key="
            java.lang.String r6 = "saveAvatarRecord"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            r9 = 1
            java.lang.String r10 = "MicroMsg.AdWorldCupAvatarStorage"
            if (r0 == 0) goto L23
            int r11 = r17.length()     // Catch: java.lang.Throwable -> Lc9
            if (r11 != 0) goto L21
            goto L23
        L21:
            r11 = 0
            goto L24
        L23:
            r11 = r9
        L24:
            if (r11 == 0) goto L2e
            java.lang.String r0 = "saveAvatarRecord, aid is null or empty"
            com.tencent.mars.xlog.Log.e(r10, r0)     // Catch: java.lang.Throwable -> Lc9
            goto Ld5
        L2e:
            if (r1 == 0) goto Lcb
            long r11 = r1.f324824c     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r13 = r1.f324823b     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r14 = r18.a()     // Catch: java.lang.Throwable -> Lc9
            int r14 = r14.length()     // Catch: java.lang.Throwable -> Lc9
            if (r14 != 0) goto L40
            r14 = r9
            goto L41
        L40:
            r14 = 0
        L41:
            if (r14 == 0) goto L45
            goto Lcb
        L45:
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc9
            r14.<init>()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r15 = "avatarUrl"
            java.lang.String r8 = r18.a()     // Catch: java.lang.Throwable -> Lc9
            r14.put(r15, r8)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r8 = "avatarMd5"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch: java.lang.Throwable -> Lc9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch: java.lang.Throwable -> Lc9
            if (r13 != 0) goto L60
            java.lang.String r15 = ""
            goto L61
        L60:
            r15 = r13
        L61:
            r14.put(r8, r15)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r8 = "updateTs"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)     // Catch: java.lang.Throwable -> Lc9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)     // Catch: java.lang.Throwable -> Lc9
            r14.put(r8, r11)     // Catch: java.lang.Throwable -> Lc9
            m84.a0 r8 = m84.a0.f324754a     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = r8.c(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r8 = r14.toString()     // Catch: java.lang.Throwable -> Lc9
            p34.o.i(r0, r8)     // Catch: java.lang.Throwable -> Lc9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            r8.<init>(r5)     // Catch: java.lang.Throwable -> Lc9
            r8.append(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = ", avatarUrlLen="
            r8.append(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = r18.a()     // Catch: java.lang.Throwable -> Lc9
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lc9
            r8.append(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = ", hasMd5="
            r8.append(r0)     // Catch: java.lang.Throwable -> Lc9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch: java.lang.Throwable -> Lc9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch: java.lang.Throwable -> Lc9
            if (r13 == 0) goto Lac
            int r0 = r13.length()     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto La9
            goto Lac
        La9:
            r16 = 0
            goto Lae
        Lac:
            r16 = r9
        Lae:
            r0 = r16 ^ 1
            r8.append(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = ", ts="
            r8.append(r0)     // Catch: java.lang.Throwable -> Lc9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)     // Catch: java.lang.Throwable -> Lc9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)     // Catch: java.lang.Throwable -> Lc9
            r8.append(r11)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> Lc9
            com.tencent.mars.xlog.Log.i(r10, r0)     // Catch: java.lang.Throwable -> Lc9
            goto Ld5
        Lc9:
            r0 = move-exception
            goto Ld2
        Lcb:
            java.lang.String r0 = "saveAvatarRecord, record is null or avatarUrl empty"
            com.tencent.mars.xlog.Log.e(r10, r0)     // Catch: java.lang.Throwable -> Lc9
            goto Ld5
        Ld2:
            ca4.q.c(r10, r0)
        Ld5:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.a0.e(java.lang.String, m84.z):void");
    }

    public final java.lang.String c(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCacheKey", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUin", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage");
        try {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                str2 = gm0.j1.b().j();
                kotlin.jvm.internal.o.d(str2);
            } else {
                str2 = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getUin();
                kotlin.jvm.internal.o.d(str2);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("MicroMsg.AdWorldCupAvatarStorage", th6);
            str2 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUin", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage");
        sb6.append(str2);
        sb6.append('_');
        sb6.append(str);
        sb6.append("_worldCupAvatarInfo");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheKey", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage");
        return sb7;
    }
}
