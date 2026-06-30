package ss2;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f411974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ss2.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411974e = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ss2.p(this.f411974e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ss2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f411973d;
        ss2.a0 a0Var = this.f411974e;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
            com.tencent.mm.ui.MMActivity mMActivity = a0Var.f411905d;
            boolean z17 = a0Var.d() == 1;
            a0Var.getClass();
            com.tencent.mm.modelcontrol.VideoTransPara Bi = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Bi();
            java.lang.String Zi = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Zi();
            java.lang.String l17 = mv2.q.f331618a.l(Zi, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mars.xlog.Log.i("PostMediaWidget", "record video path:%s thumb path:%s", Zi, l17);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider g17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.g(Zi, l17, Bi, Bi.f71195h * 1000, 11);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            g17.f155683u = bool;
            g17.M.putBoolean("key_edit_enable_emoji_search", true);
            ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsRecordVideoCompositionProvider", "com.tencent.mm.feature.sns.SnsFeatureService");
            com.tencent.mm.plugin.sns.statistics.a.f164826a.d(g17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoCompositionProvider", "com.tencent.mm.feature.sns.SnsFeatureService");
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
            java.util.HashMap hashMap = (java.util.HashMap) uICustomParam.f64779h;
            hashMap.put("plugin_filter", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_menu", bool);
            g17.f155677o = uICustomParam;
            g17.f155682t = java.lang.Boolean.valueOf(z17);
            this.f411973d = 1;
            obj = ((pc0.e2) c1Var).wi(mMActivity, g17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        qc0.m1 m1Var = (qc0.m1) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (m1Var != null && (i17 = m1Var.f361411b) == -1 && m1Var.f361412c == 0) {
            qc0.l1 a17 = m1Var.a();
            android.content.Intent intent = new android.content.Intent();
            if (m1Var.f361415f != null && a17 != null && (str = a17.f361396b) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                kotlin.jvm.internal.o.d(str);
                arrayList.add(str);
                if (a17.a()) {
                    intent.putExtra("key_select_image_list", arrayList);
                } else {
                    intent.putExtra("key_select_video_list", arrayList);
                    intent.putExtra("video_thumb_path", a17.f361397c);
                }
                a0Var.f411905d.triggerActivityResult(4387, i17, intent);
            }
        }
        return f0Var;
    }
}
