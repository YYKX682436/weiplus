package fc4;

/* loaded from: classes4.dex */
public final class j0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final db5.t4 f261171d;

    /* renamed from: e, reason: collision with root package name */
    public int f261172e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f261173f;

    /* renamed from: g, reason: collision with root package name */
    public xc4.p f261174g;

    /* renamed from: h, reason: collision with root package name */
    public final dd4.e0 f261175h;

    /* renamed from: i, reason: collision with root package name */
    public wd4.l1 f261176i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f261171d = new fc4.g0(this);
        this.f261172e = -1;
        this.f261173f = "";
        this.f261175h = new dd4.e0();
    }

    public static final /* synthetic */ java.lang.String O6(fc4.j0 j0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLocalId$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        java.lang.String str = j0Var.f261173f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLocalId$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        return str;
    }

    public final java.lang.String P6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        xc4.p pVar = this.f261174g;
        if (pVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            return null;
        }
        r45.jj4 R0 = pVar.R0();
        if (R0 == null) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "getCurrentMaterialPath, media is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            return null;
        }
        java.lang.String o17 = com.tencent.mm.plugin.sns.model.y6.o(pVar.W0(), pVar.R0());
        if (com.tencent.mm.vfs.w6.j(o17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            return o17;
        }
        java.lang.String str = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), R0.f377855d) + ca4.z0.R(R0);
        if (!android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            return str;
        }
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "getCurrentMaterialPath, mediaPath is empty");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        return null;
    }

    public final void Q6() {
        wd4.g gVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showShareSheet", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "showShareSheet");
        xc4.p pVar = this.f261174g;
        if (pVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showShareSheet", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            return;
        }
        r45.jj4 R0 = pVar.R0();
        if (R0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showShareSheet", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            return;
        }
        wd4.l1 l1Var = new wd4.l1(getContext(), 4);
        l1Var.b(pVar.c1(), R0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initMenu", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTCannotTransmitForFav"), 0) == 0) {
            arrayList.add(1003);
        }
        j45.l.g("favorite");
        arrayList.add(1006);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initMenu", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSecondMenu", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(1013);
        if (com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTCannotTransmitForFav"), 0) == 0) {
            java.lang.String o17 = com.tencent.mm.plugin.sns.model.y6.o(pVar.W0(), R0);
            if (!com.tencent.mm.vfs.w6.j(o17)) {
                o17 = com.tencent.mm.plugin.sns.model.y6.m(pVar.W0());
                com.tencent.mars.xlog.Log.w(pf5.o.TAG, "initSecondMenu get relocated video path: %s", o17);
            }
            boolean j17 = com.tencent.mm.vfs.w6.j(getIntent().getStringExtra("intent_thumbpath"));
            boolean z17 = !android.text.TextUtils.isEmpty(o17) && com.tencent.mm.vfs.w6.j(o17);
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "config can forward sight, thumb existed %B, video existed %B", java.lang.Boolean.valueOf(j17), java.lang.Boolean.valueOf(z17));
            if (j17 && z17) {
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                exDeviceHaveBindNetworkDeviceEvent.f54141g.f6221c = pVar.W0();
                exDeviceHaveBindNetworkDeviceEvent.e();
                if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                    arrayList2.add(1008);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSecondMenu", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        l1Var.n(arrayList, arrayList2, null);
        l1Var.l(this.f261171d);
        l1Var.k(fc4.h0.f261162d);
        l1Var.m();
        this.f261176i = l1Var;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
        com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity snsFlexibleVideoActivity = (com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity) activity;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(snsFlexibleVideoActivity).a(fc4.j0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        fc4.j0 j0Var = (fc4.j0) a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        java.lang.String P6 = j0Var.P6();
        if (P6 == null || P6.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            gVar = null;
        } else {
            wd4.g gVar2 = new wd4.g(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel.b(P6, "mp4"), bi1.g.SNS_VIDEO);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            gVar = gVar2;
        }
        if (gVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandOpenMaterials_SnsFlexibleVideoActivity", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials");
        } else {
            java.lang.String P62 = j0Var.P6();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_SnsFlexibleVideoActivity", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo: " + gVar);
            kotlinx.coroutines.l.d(v65.m.b(snsFlexibleVideoActivity), null, null, new wd4.q1(snsFlexibleVideoActivity, gVar, j0Var, P62, null), 3, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showShareSheet", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R6(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            java.lang.String r0 = "startDownload"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r8 instanceof fc4.i0
            if (r2 == 0) goto L1b
            r2 = r8
            fc4.i0 r2 = (fc4.i0) r2
            int r3 = r2.f261169g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f261169g = r3
            goto L20
        L1b:
            fc4.i0 r2 = new fc4.i0
            r2.<init>(r6, r8)
        L20:
            java.lang.Object r8 = r2.f261167e
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f261169g
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L33
            java.lang.Object r7 = r2.f261166d
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L53
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r7
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            r2.f261166d = r7
            r2.f261169g = r5
            dd4.e0 r8 = r6.f261175h
            r4 = 30
            java.lang.Object r8 = r8.b(r4, r2)
            if (r8 != r3) goto L53
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L53:
            java.lang.String r8 = (java.lang.String) r8
            com.tencent.mm.vfs.w6.c(r8, r7)
            boolean r7 = com.tencent.mm.vfs.w6.j(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fc4.j0.R6(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.Collection collection;
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        r45.jj4 jj4Var;
        java.lang.String str;
        com.tencent.mm.plugin.sns.storage.SnsInfo k17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        if (4097 == i17 && intent != null && -1 == i18) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
                return;
            }
            kotlin.jvm.internal.o.d(stringExtra);
            int i19 = 0;
            java.util.List g17 = new r26.t(",").g(stringExtra, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f313996d;
            java.util.ArrayList<java.lang.String> P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) collection.toArray(new java.lang.String[0]));
            kotlin.jvm.internal.o.f(P1, "stringsToList(...)");
            for (java.lang.String str2 : P1) {
                if (this.f261172e == 0 && (k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f261173f)) != null) {
                    if (com.tencent.mm.storage.z3.R4(str2)) {
                        com.tencent.mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent snsForwardFeedToChatRoomForDataReportEvent = new com.tencent.mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent();
                        java.lang.String T = ca4.z0.T(k17);
                        am.tv tvVar = snsForwardFeedToChatRoomForDataReportEvent.f54811g;
                        tvVar.f8037a = T;
                        k17.getLocalid();
                        tvVar.getClass();
                        snsForwardFeedToChatRoomForDataReportEvent.e();
                    } else {
                        com.tencent.mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent snsForwardFeedToSingleChatForDataReportEvent = new com.tencent.mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent();
                        java.lang.String T2 = ca4.z0.T(k17);
                        am.uv uvVar = snsForwardFeedToSingleChatForDataReportEvent.f54812g;
                        uvVar.f8139a = T2;
                        k17.getLocalid();
                        uvVar.getClass();
                        snsForwardFeedToSingleChatForDataReportEvent.e();
                    }
                }
                xc4.p pVar = this.f261174g;
                if (pVar != null && (h17 = pVar.h1()) != null && (a90Var = h17.ContentObj) != null && (linkedList = a90Var.f369840h) != null && (jj4Var = (r45.jj4) kz5.n0.a0(linkedList, i19)) != null) {
                    java.lang.String o17 = com.tencent.mm.plugin.sns.model.y6.o(this.f261173f, jj4Var);
                    int S = ca4.z0.S(o17);
                    java.lang.String q17 = com.tencent.mm.plugin.sns.model.y6.q(jj4Var);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", str2, o17, q17, jj4Var.f377875x, java.lang.Integer.valueOf(jj4Var.A), java.lang.Integer.valueOf(S));
                    if (com.tencent.mm.vfs.w6.j(o17)) {
                        str = o17;
                    } else {
                        java.lang.String m17 = com.tencent.mm.plugin.sns.model.y6.m(this.f261173f);
                        com.tencent.mars.xlog.Log.w("MicroMsg.SnsOnlineVideoActivity", "shareSendVideo get relocated video path: %s", m17);
                        str = m17;
                    }
                    if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(q17) || !com.tencent.mm.vfs.w6.j(str) || !com.tencent.mm.vfs.w6.j(q17)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsOnlineVideoActivity", "send video error");
                        if (com.tencent.mm.plugin.sns.model.j4.e()) {
                            com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.ihu), null, getActivity(), null, null);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
                        return;
                    }
                    ((dk5.s5) tg3.t1.a()).nj(getActivity(), str2, str, q17, 43, S, false, false, h17.statExtStr, null);
                    wf0.q1 q1Var = (wf0.q1) i95.n0.c(wf0.q1.class);
                    xc4.p pVar2 = this.f261174g;
                    ((vf0.w1) q1Var).Ai(pVar2 != null ? pVar2.W0() : null);
                    if (stringExtra2 != null) {
                        ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, str2);
                    }
                    com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.fw6), null, getActivity(), null, null);
                }
                i19 = 0;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        this.f261172e = getIntent().getIntExtra("intent_from_scene", -1);
        java.lang.String stringExtra = getIntent().getStringExtra("intent_localid");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f261173f = stringExtra;
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        xc4.p a76 = ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).a7(this.f261173f);
        this.f261174g = a76;
        if (a76 != null) {
            dd4.e0 e0Var = this.f261175h;
            android.app.Activity context = getContext();
            android.view.KeyEvent.Callback findViewById = findViewById(com.tencent.mm.R.id.rpo);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            e0Var.d(context, (dd4.t0) findViewById, a76);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        this.f261175h.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
    }
}
