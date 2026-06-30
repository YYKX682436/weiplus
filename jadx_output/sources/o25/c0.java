package o25;

/* loaded from: classes9.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f342488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f342489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f342490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342491g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o25.d0 f342492h;

    public c0(o25.d0 d0Var, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18, java.lang.String str) {
        this.f342492h = d0Var;
        this.f342488d = m1Var;
        this.f342489e = i17;
        this.f342490f = i18;
        this.f342491g = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r12 = this;
            com.tencent.mm.modelbase.m1 r0 = r12.f342488d
            de0.h r0 = (de0.h) r0
            com.tencent.mm.modelsimple.h1 r0 = (com.tencent.mm.modelsimple.h1) r0
            r45.zp6 r0 = r0.I()
            com.tencent.mm.modelbase.m1 r1 = r12.f342488d
            r2 = r1
            de0.h r2 = (de0.h) r2
            com.tencent.mm.modelsimple.h1 r2 = (com.tencent.mm.modelsimple.h1) r2
            com.tencent.mm.modelbase.o r2 = r2.f71337e
            com.tencent.mm.modelbase.n r2 = r2.f70711b
            com.tencent.mm.protobuf.f r2 = r2.f70700a
            r45.zp6 r2 = (r45.zp6) r2
            r3 = 0
            if (r2 != 0) goto L1e
            r2 = r3
            goto L20
        L1e:
            java.lang.String r2 = r2.f392284f
        L20:
            o25.d0 r4 = r12.f342492h
            java.lang.String r5 = r4.f342497g
            android.os.Bundle r4 = r4.f342498h
            de0.h r1 = (de0.h) r1
            java.lang.String r6 = o25.z.f342593a
            java.lang.String r6 = "weixin://dl/channels/shareVideo/"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto Ld7
            if (r4 == 0) goto Ld7
            if (r0 == 0) goto Ld7
            r45.tv5 r5 = r0.f392296u
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            if (r5 == 0) goto L45
            int r8 = r5.f386821d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L46
        L45:
            r8 = r3
        L46:
            r9 = 0
            r7[r9] = r8
            java.lang.String r8 = "MicroMsg.DeepLinkHelper"
            java.lang.String r10 = "fillTranslateLinkResponse finderInfoResult: %s"
            com.tencent.mars.xlog.Log.i(r8, r10, r7)
            if (r5 == 0) goto Ld7
            java.lang.String r7 = "key_app_id"
            java.lang.String r7 = r4.getString(r7)
            java.lang.String r8 = "key_finder_share_video_jump_info_state"
            int r5 = r5.f386821d
            r4.putInt(r8, r5)
            com.tencent.mm.modelsimple.h1 r1 = (com.tencent.mm.modelsimple.h1) r1
            r1.getClass()
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r5 == 0) goto L6b
            goto Ld2
        L6b:
            java.lang.String r5 = r1.f71338f     // Catch: java.lang.Exception -> Lc8
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r5)     // Catch: java.lang.Exception -> Lc8
            if (r5 != 0) goto Ld2
            com.tencent.mm.pluginsdk.model.app.z r5 = zo3.p.Ri()     // Catch: java.lang.Exception -> Lc8
            r5.getClass()     // Catch: java.lang.Exception -> Lc8
            if (r7 == 0) goto L90
            int r8 = r7.length()     // Catch: java.lang.Exception -> Lc8
            if (r8 != 0) goto L83
            goto L90
        L83:
            com.tencent.mm.pluginsdk.model.app.z r8 = zo3.p.Ri()     // Catch: java.lang.Exception -> Lc8
            com.tencent.mm.pluginsdk.model.app.m r8 = r8.z0(r7)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r5 = r5.J0(r8, r7, r6)     // Catch: java.lang.Exception -> Lc8
            goto L98
        L90:
            java.lang.String r5 = "MicroMsg.AppInfoStorage"
            java.lang.String r8 = "hasIconUrl, appId is null"
            com.tencent.mars.xlog.Log.e(r5, r8)     // Catch: java.lang.Exception -> Lc8
            r5 = r3
        L98:
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.K0(r5)     // Catch: java.lang.Exception -> Lc8
            if (r8 == 0) goto Lb2
            com.tencent.mm.pluginsdk.model.app.y r8 = zo3.p.Ni()     // Catch: java.lang.Exception -> Lc8
            r10 = 3000(0xbb8, double:1.482E-320)
            com.tencent.mm.pluginsdk.model.app.m r8 = r8.d(r7, r10)     // Catch: java.lang.Exception -> Lc8
            if (r8 == 0) goto Lb2
            com.tencent.mm.pluginsdk.model.app.z r5 = zo3.p.Ri()     // Catch: java.lang.Exception -> Lc8
            java.lang.String r5 = r5.J0(r8, r7, r6)     // Catch: java.lang.Exception -> Lc8
        Lb2:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lc8
            java.lang.String r1 = r1.f71338f     // Catch: java.lang.Exception -> Lc8
            r6.<init>(r1)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r1 = "iconurl"
            java.lang.String r7 = ""
            if (r5 != 0) goto Lc0
            r5 = r7
        Lc0:
            r6.put(r1, r5)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Exception -> Lc8
            goto Ld2
        Lc8:
            r1 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r6 = "MicroMsg.NetSceneTranslateLink"
            java.lang.String r7 = "getFinderJumpInfo exception"
            com.tencent.mars.xlog.Log.printErrStackTrace(r6, r1, r7, r5)
        Ld2:
            java.lang.String r1 = "key_finder_share_video_jump_info_string"
            r4.putString(r1, r3)
        Ld7:
            ku5.u0 r1 = ku5.t0.f312615d
            o25.b0 r3 = new o25.b0
            r3.<init>(r12, r2, r0)
            ku5.t0 r1 = (ku5.t0) r1
            r1.B(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o25.c0.run():void");
    }
}
