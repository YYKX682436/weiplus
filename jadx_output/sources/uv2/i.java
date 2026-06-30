package uv2;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final uv2.i f431389a = new uv2.i();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f431390b = kz5.c0.i(4, 2, 7);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f431391c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f431392d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final uv2.g f431393e = new uv2.g();

    public static /* synthetic */ void b(uv2.i iVar, java.util.List list, java.lang.String str, dn.k kVar, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, boolean z17, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, yz5.l lVar, int i27, java.lang.Object obj) {
        iVar.a(list, str, kVar, str2, str3, i17, i18, i19, (i27 & 256) != 0 ? false : z17, (i27 & 512) != 0 ? null : str4, (i27 & 1024) != 0 ? null : num, (i27 & 2048) != 0 ? null : num2, (i27 & 4096) != 0 ? null : lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static jz5.l m(uv2.i r25, java.util.List r26, long r27, r45.mb4 r29, dn.k r30, boolean r31, java.lang.String r32, yz5.l r33, int r34, java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uv2.i.m(uv2.i, java.util.List, long, r45.mb4, dn.k, boolean, java.lang.String, yz5.l, int, java.lang.Object):jz5.l");
    }

    public final void a(java.util.List list, java.lang.String str, dn.k kVar, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, boolean z17, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, yz5.l lVar) {
        java.lang.String h17 = h(str2);
        dn.m mVar = new dn.m();
        mVar.f241785d = str;
        mVar.f241787f = kVar;
        mVar.field_mediaId = h17;
        mVar.field_fullpath = str2;
        mVar.field_thumbpath = str3;
        mVar.field_talker = "";
        mVar.field_needStorage = true;
        mVar.field_priority = 2;
        mVar.field_bzScene = 2;
        mVar.field_appType = 251;
        mVar.field_fileType = i17;
        mVar.A = i18;
        mVar.B = i19;
        mVar.C1 = z17;
        mVar.N = str4;
        if (num != null) {
            mVar.Z = num.intValue();
        }
        if (num2 != null) {
            num2.intValue();
        }
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaUploadManager", "[createCdnTaskInfo] appType:" + mVar.field_appType + " fileType:" + mVar.field_fileType + " cdnCustomHeader:" + str4);
        if (lVar != null) {
            lVar.invoke(h17);
        }
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaUploadManager", "[addCdnTaskInfo] before cancel " + mVar.field_mediaId + " appType:" + mVar.field_appType + " fileType:" + mVar.field_fileType);
        i95.m c17 = i95.n0.c(sx.e0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((rx.l) ((sx.e0) c17)).Ni(mVar.field_mediaId);
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaUploadManager", "[addCdnTaskInfo] after cancel " + mVar.field_mediaId + " appType:" + mVar.field_appType + " fileType:" + mVar.field_fileType);
        list.add(mVar);
    }

    public final void c(long j17, java.lang.String str) {
        f431391c.put(str, java.lang.Long.valueOf(j17));
    }

    public final void d(long j17, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f431392d;
        uv2.s sVar = (uv2.s) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (sVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaUploadManager", "[cancelUpload] postId:" + j17 + " isPreUpload:" + z17);
        for (java.lang.String str : z17 ? sVar.f431413a : sVar.f431414b) {
            i95.m c17 = i95.n0.c(sx.e0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((rx.l) ((sx.e0) c17)).Ni(str);
            com.tencent.mars.xlog.Log.i("LogPost.FinderMediaUploadManager", "[cancelUpload] cancelSendTask uploadMediaId:" + str + " isPreUpload:" + z17);
        }
        concurrentHashMap.remove(java.lang.Long.valueOf(j17));
    }

    public final void e(java.util.List mediaList, boolean z17) {
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(mediaList);
        if (mb4Var != null) {
            pm0.v.K(null, new uv2.f(mb4Var.getLong(59), z17));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b8, code lost:
    
        if (((java.lang.Number) r3.f302833d).intValue() > 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0332 A[LOOP:3: B:99:0x00f5->B:109:0x0332, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.o f(java.util.List r43, dn.k r44, java.lang.String r45, boolean r46, boolean r47, r45.q23 r48, java.lang.String r49, yz5.l r50, yz5.a r51) {
        /*
            Method dump skipped, instructions count: 1707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uv2.i.f(java.util.List, dn.k, java.lang.String, boolean, boolean, r45.q23, java.lang.String, yz5.l, yz5.a):jz5.o");
    }

    public final java.lang.String g(com.tencent.mm.protocal.protobuf.FinderObject finderObj) {
        r45.q23 video_tmpl_info;
        r45.ko6 ko6Var;
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        java.lang.String O6 = ((ey2.j) ((xy2.e) pf5.u.f353936a.e(zy2.b6.class).c(xy2.e.class))).O6(finderObj);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObj.getObjectDesc();
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaUploadManager", "[getCommonCustomHeader] customHeader:" + O6 + " originalCheckSum:" + ((objectDesc == null || (video_tmpl_info = objectDesc.getVideo_tmpl_info()) == null || (ko6Var = video_tmpl_info.f383601w) == null) ? null : ko6Var.f378884i));
        return O6;
    }

    public final java.lang.String h(java.lang.String str) {
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
        kotlin.jvm.internal.o.f(b17, "getMD5String(...)");
        return "upload_".concat(b17);
    }

    public final java.lang.String i(java.lang.String fullPath) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(fullPath, "fullPath");
        i95.m c17 = i95.n0.c(bg0.v.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(fullPath, true);
        if (d17 != null) {
            str = "videobitrate:" + d17.f162383b + "\r\nvideoformat:" + (t21.u2.b(fullPath) ? 174 : 28) + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE;
        } else {
            str = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getVideoCustomHeader] customHeader:");
        sb6.append(str);
        sb6.append(" mediaInfo is null:");
        sb6.append(d17 == null);
        sb6.append(" path:");
        sb6.append(fullPath);
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaUploadManager", sb6.toString());
        return str;
    }

    public final java.lang.String j(java.lang.String str) {
        boolean z17 = false;
        if (str != null && r26.i0.y(str, "upload_", false)) {
            z17 = true;
        }
        if (!z17) {
            return str == null ? "" : str;
        }
        java.lang.String substring = str.substring(7);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public final void k(dn.m info, int i17, int i18, java.lang.String uniqueId) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        if (info.field_appType == i17 || info.field_fileType == i18) {
            return;
        }
        info.field_appType = i17;
        info.field_fileType = i18;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appType1", i17);
            jSONObject.put("fileType1", i18);
            jSONObject.put("appType2", info.field_appType);
            jSONObject.put("fileType2", info.field_fileType);
            jSONObject.put("mediaId", info.field_mediaId);
            jSONObject.put(dm.i4.COL_ID, uniqueId);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("LogPost.FinderMediaUploadManager", e17.getMessage());
        }
        pm0.z.b(xy2.b.f458155b, "post_upload_type_error", false, null, null, false, false, new uv2.h(jSONObject), 60, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0219 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l l(java.util.List r30, long r31, r45.mb4 r33, dn.k r34, boolean r35, java.lang.String r36, yz5.l r37) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uv2.i.l(java.util.List, long, r45.mb4, dn.k, boolean, java.lang.String, yz5.l):jz5.l");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l n(java.util.List r21, long r22, r45.mb4 r24, dn.k r25, boolean r26, java.lang.String r27, yz5.l r28) {
        /*
            r20 = this;
            r15 = r20
            r14 = r24
            r0 = 2
            int r0 = r14.getInteger(r0)
            r1 = 4
            r2 = -1
            r13 = 62
            r3 = 0
            if (r0 != r1) goto L52
            java.lang.String r0 = r14.getString(r13)
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 != 0) goto L52
            r0 = 65
            java.lang.String r0 = r14.getString(r0)
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            java.lang.String r1 = "LogPost.FinderMediaUploadManager"
            if (r0 != 0) goto L2e
            java.lang.String r0 = "[needUploadShareCoverUrl] svr_shareCoverUrl exist"
            com.tencent.mars.xlog.Log.i(r1, r0)
            goto L52
        L2e:
            java.lang.String r0 = r14.getString(r13)
            boolean r0 = com.tencent.mm.vfs.w6.j(r0)
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "[needUploadShareCoverUrl] shareCoverUrl not exist, "
            r0.<init>(r4)
            java.lang.String r4 = r14.getString(r13)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r1, r0)
            r0 = 7
            r12 = r0
            goto L53
        L50:
            r12 = r2
            goto L53
        L52:
            r12 = r3
        L53:
            if (r12 != r2) goto L99
            java.lang.String r2 = "task_FinderUploadTask_2"
            java.lang.String r4 = r14.getString(r13)
            java.lang.String r5 = r14.getString(r13)
            r6 = 20304(0x4f50, float:2.8452E-41)
            r7 = 120(0x78, float:1.68E-43)
            r8 = 300(0x12c, float:4.2E-43)
            r11 = 0
            r16 = 0
            r17 = 3072(0xc00, float:4.305E-42)
            r18 = 0
            r0 = r20
            r1 = r21
            r3 = r25
            r9 = r26
            r10 = r27
            r19 = r12
            r12 = r16
            r13 = r28
            r14 = r17
            r15 = r18
            b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r24
            r1 = 62
            java.lang.String r0 = r0.getString(r1)
            r1 = r20
            java.lang.String r0 = r1.h(r0)
            r2 = r22
            r1.c(r2, r0)
            r3 = 1
            goto L9c
        L99:
            r19 = r12
            r1 = r15
        L9c:
            jz5.l r0 = new jz5.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uv2.i.n(java.util.List, long, r45.mb4, dn.k, boolean, java.lang.String, yz5.l):jz5.l");
    }
}
