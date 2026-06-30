package mz0;

/* loaded from: classes5.dex */
public final class x2 extends mz0.b2 {
    public final java.util.Map I;

    /* renamed from: J, reason: collision with root package name */
    public int f333080J;
    public long K;
    public final boolean L;
    public final jz5.g M;
    public final jz5.g N;
    public final java.lang.String P;
    public final int Q;
    public final com.tencent.mm.mj_template.sns.compose.widget.c7 R;
    public final com.tencent.mm.mj_template.sns.compose.widget.t0 S;
    public final ty0.c T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.I = new java.util.LinkedHashMap();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Maas_SnsSpringOfflineStrategy_Int, -1));
        valueOf = valueOf.intValue() != -1 ? valueOf : null;
        this.L = (valueOf != null ? valueOf.intValue() : ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoTemplateCdnDownloadDisabled", 0)) == 1;
        jz5.i iVar = jz5.i.f302831f;
        this.M = jz5.h.a(iVar, new mz0.v2(this));
        this.N = jz5.h.a(iVar, new mz0.n2(this));
        this.P = "moments";
        this.Q = dw3.j0.f244218a.b();
        this.R = new mz0.p2(this);
        this.S = new mz0.r2();
        this.T = new mz0.q2(this);
    }

    public static final void J7(mz0.x2 x2Var, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        x2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "saveSnsBgmExportData mjMusicId:" + str + ", listenId:" + str2 + ", isMajorOwned:" + bool);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.Map map = x2Var.I;
        if (map.containsKey(str) || bool == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = str;
        }
        mz0.m2 m2Var = new mz0.m2(str2, bool);
        kotlin.jvm.internal.o.d(str);
        map.put(str, m2Var);
    }

    @Override // mz0.b2
    public void C7(java.util.List defaultTemplateList, r45.rz6 rz6Var) {
        kotlin.jvm.internal.o.g(defaultTemplateList, "defaultTemplateList");
        bz0.j jVar = bz0.j.f36750a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(defaultTemplateList, 10));
        java.util.Iterator it = defaultTemplateList.iterator();
        while (it.hasNext()) {
            r45.rz6 rz6Var2 = (r45.rz6) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("tid", rz6Var2.f385320d);
            if (kotlin.jvm.internal.o.b(rz6Var2.f385320d, rz6Var != null ? rz6Var.f385320d : null)) {
                jSONObject.put("src", 0);
            } else {
                jSONObject.put("src", 3);
            }
            arrayList.add(jSONObject);
        }
        bz0.j.f36755f = arrayList;
    }

    @Override // mz0.b2
    public void D7(java.util.ArrayList mediaList) {
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        this.f333080J = dx1.f.n(dx1.g.f244489a, "SnsTemplate", "mediadetail", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", null, true, null, null, 208, null);
        kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new mz0.u2(mediaList, null), 3, null);
    }

    @Override // mz0.b2
    public void E7(java.lang.String curSelectedItemId, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        java.util.List list;
        kotlin.jvm.internal.o.g(curSelectedItemId, "curSelectedItemId");
        kotlin.jvm.internal.o.g(info, "info");
        super.E7(curSelectedItemId, info);
        bz0.j jVar = bz0.j.f36750a;
        java.lang.String musicId = info.C;
        kotlin.jvm.internal.o.g(musicId, "musicId");
        java.util.List list2 = bz0.j.f36759j;
        java.util.List list3 = (java.util.List) kz5.n0.k0(list2);
        bz0.g gVar = list3 != null ? (bz0.g) kz5.n0.k0(list3) : null;
        ((java.util.ArrayList) list2).size();
        if (list3 != null) {
            list3.size();
        }
        kotlin.jvm.internal.o.b(curSelectedItemId, gVar != null ? gVar.f36739a : null);
        if (gVar == null || (list = gVar.f36743e) == null) {
            return;
        }
        list.add(musicId);
    }

    @Override // mz0.b2
    public void F7(java.lang.String curSelectedItemId, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(curSelectedItemId, "curSelectedItemId");
        kotlin.jvm.internal.o.g(info, "info");
        super.F7(curSelectedItemId, info);
        bz0.j jVar = bz0.j.f36750a;
        java.lang.String musicId = info.C;
        java.lang.String musicName = info.f155723t;
        kotlin.jvm.internal.o.g(musicId, "musicId");
        kotlin.jvm.internal.o.g(musicName, "musicName");
        java.util.List list = bz0.j.f36759j;
        java.util.List list2 = (java.util.List) kz5.n0.k0(list);
        bz0.g gVar = list2 != null ? (bz0.g) kz5.n0.k0(list2) : null;
        ((java.util.ArrayList) list).size();
        if (list2 != null) {
            list2.size();
        }
        kotlin.jvm.internal.o.b(curSelectedItemId, gVar != null ? gVar.f36739a : null);
        if (gVar != null) {
            java.util.List list3 = gVar.f36741c;
            if (list3.contains(musicId)) {
                return;
            }
            list3.add(musicId);
            gVar.f36742d.add(musicName);
        }
    }

    @Override // mz0.b2
    public void G7(java.lang.String curSelectedItemId, java.lang.String str) {
        kotlin.jvm.internal.o.g(curSelectedItemId, "curSelectedItemId");
        bz0.j.f36750a.b(o7().a(), str);
    }

    @Override // mz0.b2, dz0.k
    public java.lang.Object H6(kotlin.coroutines.Continuation continuation) {
        bz0.j jVar = bz0.j.f36750a;
        bz0.j.f36751b.f58998v = ((r45.ib6) this.M.getValue()) != null ? 2 : 1;
        java.lang.Object V6 = mz0.b2.V6(this, continuation);
        return V6 == pz5.a.f359186d ? V6 : jz5.f0.f302826a;
    }

    @Override // mz0.b2
    public void H7(boolean z17) {
        androidx.lifecycle.g0 g0Var;
        if (z17) {
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            dz0.x xVar = ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).f69789m;
            com.tencent.maas.model.MJMusicInfo mJMusicInfo = (xVar == null || (g0Var = xVar.f245053d) == null) ? null : (com.tencent.maas.model.MJMusicInfo) g0Var.getValue();
            if (mJMusicInfo == null) {
                return;
            }
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo b17 = com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.M.b(mJMusicInfo, 1);
            b17.f155719p = 3;
            b17.f155722s = true;
            wv3.b.f450048a.d(b17, true);
        }
    }

    public final void K7(java.lang.String str) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "refreshFinalReport: ");
        dx1.f fVar = dx1.g.f244489a;
        fVar.i("SnsTemplate", "final_egid", str);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        az0.n7 n7Var = ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).f69783d;
        com.tencent.maas.model.MJMusicOptions currentMusicOptions = n7Var != null ? n7Var.f15742a.getCurrentMusicOptions() : null;
        if (currentMusicOptions != null) {
            java.lang.String musicID = currentMusicOptions.getMusicInfo().getMusicID();
            if (musicID == null) {
                musicID = "";
            }
            fVar.i("SnsTemplate", "final_musicid", musicID);
            i17 = java.lang.Integer.valueOf(java.lang.Integer.valueOf(currentMusicOptions.getSourceType().getValue()).intValue());
        } else {
            i17 = 0;
        }
        fVar.i("SnsTemplate", "final_musictype", i17);
    }

    @Override // mz0.b2, dz0.k
    public void Q1() {
        java.lang.Object obj;
        super.Q1();
        java.lang.String a17 = o7().a();
        dx1.f fVar = dx1.g.f244489a;
        fVar.j("SnsTemplate", "egpreviewcnt", 1, bx1.u.f36310e);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "td", java.lang.Integer.valueOf(this.f333080J), null, true, "egtd", null, 144, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "maasSessionKey", bz0.a.f36722a, null, false, null, null, 240, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "egid", a17, null, false, null, null, 240, null);
        java.util.Iterator it = o7().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.mj_template.sns.compose.widget.m5) obj).f70077a, a17)) {
                    break;
                }
            }
        }
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = (com.tencent.mm.mj_template.sns.compose.widget.m5) obj;
        java.lang.Integer valueOf = m5Var != null ? java.lang.Integer.valueOf(o7().b().indexOf(m5Var)) : null;
        dx1.f fVar2 = dx1.g.f244489a;
        dx1.f.n(fVar2, "SnsTemplate", "editdetail", "eglocation", java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0), null, false, null, null, 240, null);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dx1.f.n(fVar2, "SnsTemplate", "editdetail", "vediotime", java.lang.Long.valueOf(((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).Y6()), null, false, null, null, 240, null);
        fVar2.i("SnsPublishProcess", "Maaskey", bz0.a.f36722a);
        dx1.f.n(fVar2, "SnsTemplate", "mediadetail", "maasSessionKey", bz0.a.f36722a, null, false, null, null, 240, null);
        dx1.f.n(fVar2, "SnsTemplate", "editdetail", "musicSearchFlag", 0, null, false, null, null, 240, null);
        bx1.u uVar = bx1.u.f36310e;
        fVar2.j("SnsTemplate", "musiccnt", 0, uVar);
        dx1.f.n(fVar2, "SnsTemplate", "editdetail", "musiccnt", 0, uVar, false, null, null, 224, null);
        bz0.j jVar = bz0.j.f36750a;
        jVar.a(a17, "");
        jVar.b(a17, "");
        K7(a17);
        this.K = java.lang.System.currentTimeMillis();
    }

    @Override // mz0.b2
    public java.lang.Object S6(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        return nz0.o.f341530a.b(str, 4, continuation);
    }

    @Override // mz0.b2
    public java.lang.Object T6(kotlin.coroutines.Continuation continuation) {
        return nz0.o.f341530a.c(3, "cache_key_sns", continuation);
    }

    @Override // mz0.b2
    public dz0.e W6() {
        return gz0.j.f277679a;
    }

    @Override // mz0.b2
    public dz0.h X6() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean i76 = ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).i7();
        boolean z17 = !i76;
        boolean z18 = !i76;
        int i17 = d11.s.fj().qj().f71195h;
        ez0.o oVar = ez0.o.f257835a;
        java.util.List e17 = oVar.e();
        int i18 = d11.s.fj().qj().f71195h;
        boolean a17 = oVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(oVar.e());
        mz0.a a76 = a7();
        if (a76 != null) {
            arrayList.add(a76.f332871a);
        }
        return new dz0.h("MomentsTemplateRecommendv2", z17, z18, i17, true, e17, i18, a17, arrayList, oVar.b());
    }

    @Override // mz0.b2
    public mz0.a a7() {
        return (mz0.a) this.N.getValue();
    }

    @Override // mz0.b2
    public java.lang.Object b7(kotlin.coroutines.Continuation continuation) {
        return ez0.o.f257835a.f(continuation);
    }

    @Override // mz0.b2
    public mz0.b c7() {
        return null;
    }

    @Override // mz0.b2
    public java.lang.String d7() {
        return this.P;
    }

    @Override // mz0.b2
    public int e7() {
        return this.Q;
    }

    @Override // mz0.b2
    public com.tencent.mm.mj_template.sns.compose.widget.c7 g7() {
        return this.R;
    }

    @Override // mz0.b2
    public ty0.c h7() {
        return this.T;
    }

    @Override // mz0.b2
    public com.tencent.mm.mj_template.sns.compose.widget.t0 i7() {
        return this.S;
    }

    @Override // mz0.b2
    public yz5.q k7() {
        return new mz0.o2(this);
    }

    @Override // mz0.b2
    public boolean m7() {
        return this.L;
    }

    @Override // mz0.b2, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        dx1.f fVar = dx1.g.f244489a;
        fVar.i("SnsTemplate", "moreAction", 2);
        fVar.i("SnsPublishProcess", "ifMiaojian", 1);
        fVar.i("SnsTemplate", "goToMJAppResult", 0);
    }

    @Override // mz0.b2, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
        dx1.f fVar = dx1.g.f244489a;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        fVar.j("SnsPublishProcess", "egEditTime", java.lang.Long.valueOf(mMActivity != null ? mMActivity.getActivityBrowseTimeMs() : 0L), bx1.u.f36310e);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        dx1.f.n(dx1.g.f244489a, "SnsTemplate", "editdetail", "egpreviewtime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.K), bx1.u.f36310e, false, null, null, 224, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.K = java.lang.System.currentTimeMillis();
    }

    @Override // mz0.b2
    public boolean p7() {
        return !android.text.TextUtils.isEmpty(((r45.ib6) this.M.getValue()) != null ? r0.f376915m : null);
    }

    @Override // mz0.b2
    public boolean q7() {
        return true;
    }

    @Override // mz0.b2
    public void r7(java.lang.Throwable th6) {
        n0.e5 e5Var;
        n0.e5 e5Var2;
        dx1.f fVar = dx1.g.f244489a;
        ty0.b1 b1Var = this.f332889m;
        int i17 = 0;
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "musicStatus", java.lang.Integer.valueOf(((b1Var == null || (e5Var2 = b1Var.f422794d) == null || !((java.lang.Boolean) e5Var2.getValue()).booleanValue()) ? 0 : 1) ^ 1), null, false, null, null, 240, null);
        ty0.b1 b1Var2 = this.f332889m;
        if (b1Var2 != null && (e5Var = b1Var2.f422795e) != null && ((java.lang.Boolean) e5Var.getValue()).booleanValue()) {
            i17 = 1;
        }
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "oriMusicStatus", java.lang.Integer.valueOf(i17 ^ 1), null, false, null, null, 240, null);
        if (th6 == null) {
            fVar.i("SnsTemplate", "egendcnt", 1);
        }
    }

    @Override // mz0.b2
    public void s7(java.lang.Throwable th6, java.lang.String musicId) {
        kotlin.jvm.internal.o.g(musicId, "musicId");
        if (th6 == null) {
            dx1.f fVar = dx1.g.f244489a;
            bx1.u uVar = bx1.u.f36310e;
            fVar.j("SnsTemplate", "musiccnt", 1, uVar);
            dx1.f.n(fVar, "SnsTemplate", "editdetail", "musiccnt", 1, uVar, false, null, null, 224, null);
            K7(o7().a());
        }
    }

    @Override // mz0.b2
    public void t7(dw3.o0 launchType) {
        kotlin.jvm.internal.o.g(launchType, "launchType");
        dw3.o0 o0Var = dw3.o0.f244245i;
        nu3.g gVar = nu3.g.f340216a;
        if (launchType == o0Var) {
            gVar.b(getContext(), launchType);
            return;
        }
        bz0.j jVar = bz0.j.f36750a;
        bz0.j.f36751b.f58989m = 1;
        gVar.b(getContext(), launchType);
    }

    @Override // mz0.b2
    public void u7(java.lang.Throwable th6, java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        this.K = java.lang.System.currentTimeMillis();
        dx1.f fVar = dx1.g.f244489a;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "vediotime", java.lang.Long.valueOf(((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).Y6()), null, false, null, null, 240, null);
        K7(templateId);
    }

    @Override // mz0.b2
    public void w7() {
        n0.e5 e5Var;
        ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
        boolean c17 = ez0.o.f257835a.c();
        ty0.b1 b1Var = this.f332889m;
        com.tencent.maas.model.MJMusicInfo mJMusicInfo = (b1Var == null || (e5Var = b1Var.f422792b) == null) ? null : (com.tencent.maas.model.MJMusicInfo) e5Var.getValue();
        if (mJMusicInfo != null) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo b17 = com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.M.b(mJMusicInfo, 1);
            b17.f155719p = 3;
            b17.f155722s = true;
            wv3.b bVar = wv3.b.f450048a;
            wv3.c cVar = wv3.b.f450049b.contains(b17.C) ? wv3.c.f450051f : wv3.c.f450050e;
            wv3.d dVar = wv3.d.f450055f;
            bVar.b(b17, dVar, cVar);
            java.lang.String a17 = bVar.a(b17, dVar, cVar);
            dx1.g.f244489a.i("SnsPublishProcess", "musicInfo", a17);
            ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsMusicInfo", "com.tencent.mm.feature.sns.SnsFeatureService");
            com.tencent.mm.plugin.sns.statistics.j0.f164861a.n(a17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsMusicInfo", "com.tencent.mm.feature.sns.SnsFeatureService");
        }
        if (c17) {
            kotlinx.coroutines.l.d(getMainScope(), kotlinx.coroutines.q1.f310570c, null, new mz0.s2(this, null), 2, null);
        } else {
            super.w7();
        }
    }

    @Override // mz0.b2
    public void x7(az0.b0 exportInfoHolder) {
        java.lang.String str;
        java.lang.Object obj;
        n0.e5 e5Var;
        n0.e5 e5Var2;
        com.tencent.maas.model.MJMusicInfo mJMusicInfo;
        java.lang.String musicID;
        n0.e5 e5Var3;
        kotlin.jvm.internal.o.g(exportInfoHolder, "exportInfoHolder");
        java.lang.String str2 = exportInfoHolder.f15338a;
        java.lang.String str3 = exportInfoHolder.f15339b;
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        dx1.g.f244489a.i("SnsTemplate", "installMiaojian", java.lang.Integer.valueOf(dw3.c.f244181a.b(context, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF") ? 1 : 2));
        dw3.c0.f244182a.v(true, "", str2, true, false, true);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_export_video_path", str2);
        intent.putExtra("key_export_video_cover_path", str3);
        r45.ib6 ib6Var = new r45.ib6();
        ib6Var.f376909d = "miaojian";
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = o7().f70100r;
        java.lang.String str4 = "";
        if (m5Var == null || (str = m5Var.f70077a) == null) {
            str = "";
        }
        ib6Var.f376910e = str;
        java.lang.String str5 = exportInfoHolder.f15344g;
        if (str5 == null) {
            str5 = "";
        }
        ib6Var.f376914i = str5;
        java.lang.String str6 = exportInfoHolder.f15345h;
        if (str6 == null) {
            str6 = "";
        }
        ib6Var.f376915m = str6;
        java.util.Iterator it = o7().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.mj_template.sns.compose.widget.m5) obj).f70077a, o7().a())) {
                    break;
                }
            }
        }
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var2 = (com.tencent.mm.mj_template.sns.compose.widget.m5) obj;
        java.lang.Integer valueOf = m5Var2 != null ? java.lang.Integer.valueOf(o7().b().indexOf(m5Var2)) : null;
        dx1.f fVar = dx1.g.f244489a;
        int i17 = 0;
        fVar.i("SnsPublishProcess", "egLocation", java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
        java.lang.String templateId = ib6Var.f376910e;
        kotlin.jvm.internal.o.f(templateId, "templateId");
        fVar.i("SnsPublishProcess", "egID", templateId);
        ty0.b1 b1Var = this.f332889m;
        if ((b1Var == null || (e5Var3 = b1Var.f422794d) == null || ((java.lang.Boolean) e5Var3.getValue()).booleanValue()) ? false : true) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "performPost has music id");
            ty0.b1 b1Var2 = this.f332889m;
            if (b1Var2 != null && (e5Var2 = b1Var2.f422792b) != null && (mJMusicInfo = (com.tencent.maas.model.MJMusicInfo) e5Var2.getValue()) != null && (musicID = mJMusicInfo.getMusicID()) != null) {
                str4 = musicID;
            }
            ib6Var.f376911f = str4;
            fVar.i("SnsPublishProcess", "musicID", str4);
        }
        ty0.b1 b1Var3 = this.f332889m;
        if (b1Var3 != null && (e5Var = b1Var3.f422795e) != null && ((java.lang.Boolean) e5Var.getValue()).booleanValue()) {
            i17 = 1;
        }
        fVar.i("SnsPublishProcess", "ifVoice", java.lang.Integer.valueOf(i17 ^ 1));
        com.tencent.mm.mj_template.sns.compose.widget.k5 k5Var = m5Var instanceof com.tencent.mm.mj_template.sns.compose.widget.k5 ? (com.tencent.mm.mj_template.sns.compose.widget.k5) m5Var : null;
        if (k5Var != null) {
            ib6Var.f376913h = k5Var.f70030g;
            ib6Var.f376912g = k5Var.f70031h;
        }
        intent.putExtra("key_video_template_info", ib6Var.toByteArray());
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Override // mz0.b2
    public void y7() {
        nz0.o.f341530a.f(3, "cache_key_sns");
    }
}
