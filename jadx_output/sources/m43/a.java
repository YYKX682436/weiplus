package m43;

/* loaded from: classes8.dex */
public class a implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f323452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m43.b f323453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m43.c f323454f;

    public a(m43.c cVar, java.lang.String str, m43.b bVar) {
        this.f323454f = cVar;
        this.f323452d = str;
        this.f323453e = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f3 A[ADDED_TO_REGION] */
    @Override // com.tencent.mm.sdk.platformtools.a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTimerExpired() {
        /*
            r6 = this;
            m43.c r0 = r6.f323454f
            java.util.Map r1 = r0.f323456a
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.String r2 = r6.f323452d
            r1.remove(r2)
            r0.getClass()
            java.lang.String r0 = "game_mmkv"
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.sdk.platformtools.o4.M(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L1e
            java.lang.String r3 = "auto_run_switch"
            java.lang.String r1 = r0.u(r3, r1)
        L1e:
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            java.lang.String r3 = "autoRunSwitch:%s"
            java.lang.String r4 = "MicroMsg.GameAutoRunController"
            com.tencent.mars.xlog.Log.i(r4, r3, r0)
            r0 = 1
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L40
            r3.<init>(r1)     // Catch: org.json.JSONException -> L40
            boolean r1 = r3.has(r2)     // Catch: org.json.JSONException -> L40
            if (r1 == 0) goto L40
            int r1 = r3.getInt(r2)     // Catch: org.json.JSONException -> L40
            if (r1 == 0) goto L3d
            goto Le0
        L3d:
            r1 = 0
            goto Le1
        L40:
            com.tencent.mm.plugin.game.commlib.i.e()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.tencent.mm.plugin.game.commlib.i.f139381a
            if (r3 != 0) goto L4f
            com.tencent.mm.plugin.game.commlib.i.s()
        L4f:
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.tencent.mm.plugin.game.commlib.i.f139381a
            if (r3 == 0) goto Lce
            m53.n r3 = r3.AutoRunTaskSetting
            if (r3 != 0) goto L58
            goto Lce
        L58:
            boolean r3 = r3.f323913d
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "md5_check"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.tencent.mm.plugin.game.commlib.i.f139381a
            m53.n r3 = r3.AutoRunTaskSetting
            boolean r3 = r3.f323914e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "download_resume"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.tencent.mm.plugin.game.commlib.i.f139381a
            m53.n r3 = r3.AutoRunTaskSetting
            boolean r3 = r3.f323915f
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "preload_commlib"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.tencent.mm.plugin.game.commlib.i.f139381a
            m53.n r3 = r3.AutoRunTaskSetting
            boolean r3 = r3.f323916g
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "game_silent_download"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.tencent.mm.plugin.game.commlib.i.f139381a
            m53.n r3 = r3.AutoRunTaskSetting
            boolean r3 = r3.f323917h
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "wepkg_download_retry"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.tencent.mm.plugin.game.commlib.i.f139381a
            m53.n r3 = r3.AutoRunTaskSetting
            boolean r3 = r3.f323918i
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "wepkg_expired_clean"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.tencent.mm.plugin.game.commlib.i.f139381a
            m53.n r3 = r3.AutoRunTaskSetting
            boolean r3 = r3.f323919m
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "game_cache_clean"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.tencent.mm.plugin.game.commlib.i.f139381a
            m53.n r3 = r3.AutoRunTaskSetting
            boolean r3 = r3.f323920n
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "game_resource_check"
            r1.put(r5, r3)
        Lce:
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto Le0
            java.lang.Object r1 = r1.get(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r0
            goto Le1
        Le0:
            r1 = r0
        Le1:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "taskId:%s, allowInvoke:%b"
            com.tencent.mars.xlog.Log.i(r4, r3, r2)
            m43.b r2 = r6.f323453e
            if (r2 == 0) goto Lf8
            if (r1 == 0) goto Lf8
            r2.a()
        Lf8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m43.a.onTimerExpired():boolean");
    }
}
