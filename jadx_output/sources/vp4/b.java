package vp4;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438990d;

    /* renamed from: e, reason: collision with root package name */
    public int f438991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f438993g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f438994h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f438995i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438996m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ vp4.j f438997n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ st3.r f438998o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f438999p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f439000q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f439001r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, int i17, int i18, java.lang.String str2, vp4.j jVar, st3.r rVar, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, r45.h70 h70Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438992f = str;
        this.f438993g = recordConfigProvider;
        this.f438994h = i17;
        this.f438995i = i18;
        this.f438996m = str2;
        this.f438997n = jVar;
        this.f438998o = rVar;
        this.f438999p = h0Var;
        this.f439000q = h0Var2;
        this.f439001r = h70Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vp4.b(this.f438992f, this.f438993g, this.f438994h, this.f438995i, this.f438996m, this.f438997n, this.f438998o, this.f438999p, this.f439000q, this.f439001r, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vp4.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f438991e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        int i19 = this.f438994h;
        java.lang.String workTagId = this.f438992f;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoBackgroundRemuxChain", "dealBackgroundWork >> workTagId: " + workTagId + ", confirmEditTimeStamp: " + currentTimeMillis);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f438993g;
            android.os.Bundle bundle = recordConfigProvider.M;
            int i27 = bundle != null ? bundle.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 0) : 0;
            dm.q0 q0Var = new dm.q0();
            q0Var.field_work_id = workTagId;
            q0Var.field_work_type = 4001;
            q0Var.field_work_code = -1;
            q0Var.field_source_video_path = recordConfigProvider.A;
            q0Var.field_output_video_path = recordConfigProvider.B;
            q0Var.field_output_thumb_path = recordConfigProvider.C;
            java.lang.String str = this.f438996m;
            if (str == null) {
                str = "";
            }
            q0Var.field_music_path = str;
            ct0.b bVar = this.f438997n.f439037c;
            q0Var.field_is_capture_video = bVar != null ? bVar.f222206c : false;
            st3.r rVar = this.f438998o;
            q0Var.field_is_change = rVar.f412582j;
            q0Var.field_is_save_source_media = recordConfigProvider.f155687y;
            q0Var.field_is_sava_to_sys_album_if_media_edited = recordConfigProvider.f155688z;
            q0Var.field_aba_target_bitrate = i19;
            q0Var.field_source_video_rotate = rVar.f412578f;
            q0Var.field_encode_target_height = rVar.f412574b;
            q0Var.field_encode_target_width = rVar.f412573a;
            q0Var.field_encode_video_bitrate = rVar.f412575c;
            q0Var.field_encode_frame_rate = rVar.f412577e;
            q0Var.field_encode_qp_switch = rVar.f412585m;
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = recordConfigProvider.f155676n;
            q0Var.field_video_param_preset_index = videoTransPara.f71202r;
            q0Var.field_video_param_profile_index = videoTransPara.f71201q;
            q0Var.field_composition_info = (byte[]) this.f438999p.f310123d;
            q0Var.field_video_param = (byte[]) this.f439000q.f310123d;
            q0Var.field_confirm_remux_time_stamp = currentTimeMillis;
            q0Var.field_is_killed_process_restart = 2;
            q0Var.field_tec_enter_scene = i27;
            q0Var.field_export_video_duration_ms = (int) this.f439001r.f375899f;
            this.f438990d = i27;
            this.f438991e = 1;
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new zp4.d(q0Var, null), this);
            if (g17 != aVar) {
                g17 = f0Var;
            }
            if (g17 == aVar) {
                return aVar;
            }
            i17 = i27;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f438990d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        aq4.a aVar2 = aq4.a.f13201a;
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxBackgroundManager", "enqueueWork >> workTagId: ".concat(workTagId));
        a5.c0 c0Var = new a5.c0(com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork.class);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("KEY_EXPORT_TARGET_VIDEO_BITRATE", java.lang.Integer.valueOf(i19));
        hashMap.put("KEY_EXPORT_BACKGROUND_WORK_TAG_ID", workTagId);
        hashMap.put("KEY_EXPORT_ABA_FLAG", java.lang.Integer.valueOf(this.f438995i));
        hashMap.put("KEY_EXPORT_TEC_SCENE", java.lang.Integer.valueOf(i17));
        a5.m mVar = new a5.m(hashMap);
        a5.m.d(mVar);
        c0Var.f1430c.f297768e = mVar;
        ((java.util.HashSet) c0Var.f1431d).add(workTagId);
        a5.t0 a17 = c0Var.a();
        kotlin.jvm.internal.o.f(a17, "build(...)");
        b5.w.c(com.tencent.mm.sdk.platformtools.x2.f193071a).a((a5.d0) a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeVideoTecReporter", "reportWorkEnqueue >> workTagId: ".concat(workTagId));
        com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct snsFakeVideoLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct();
        snsFakeVideoLogStruct.f60551d = 10;
        snsFakeVideoLogStruct.p(workTagId);
        snsFakeVideoLogStruct.k();
        return f0Var;
    }
}
