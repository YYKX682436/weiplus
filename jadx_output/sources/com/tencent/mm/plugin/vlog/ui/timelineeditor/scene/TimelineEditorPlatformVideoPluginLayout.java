package com.tencent.mm.plugin.vlog.ui.timelineeditor.scene;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorPlatformVideoPluginLayout;", "Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorBaseVideoPluginLayout;", "Llp4/q;", "Lbv3/d;", "getCurrentTrackTimeRange", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class TimelineEditorPlatformVideoPluginLayout extends com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout implements lp4.q {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f176086z = 0;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.HashMap f176087x;

    /* renamed from: y, reason: collision with root package name */
    public volatile long f176088y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineEditorPlatformVideoPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f176087x = new java.util.HashMap();
    }

    private final bv3.d getCurrentTrackTimeRange() {
        rm5.j currentTrack = getCurrentTrack();
        if (currentTrack == null) {
            return null;
        }
        bv3.d dVar = new bv3.d(0L, false, 3, null);
        dVar.d(currentTrack.f397502d, currentTrack.f397503e);
        java.util.HashMap hashMap = this.f176087x;
        java.lang.String str = currentTrack.f397499a;
        if (hashMap.get(str) == null) {
            hashMap.put(str, new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return dVar;
        }
        arrayList.add(dVar);
        return dVar;
    }

    @Override // com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout
    public void A() {
        super.A();
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = (com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer) findViewById(com.tencent.mm.R.id.oyw);
        kotlin.jvm.internal.o.d(timeEditorItemContainer);
        new gp4.j(timeEditorItemContainer, this);
        lp4.l0 l0Var = (lp4.l0) j(lp4.l0.class);
        if (l0Var != null) {
            l0Var.z(timeEditorItemContainer);
        }
        lp4.u uVar = (lp4.u) j(lp4.u.class);
        if (uVar != null) {
            uVar.f320432n.add(this);
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484179d90);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        lp4.f0 f0Var = new lp4.f0((com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) findViewById, this);
        lp4.l0 l0Var2 = (lp4.l0) j(lp4.l0.class);
        if (l0Var2 != null) {
            l0Var2.z(f0Var);
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.o89);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        new lp4.q0(findViewById2, this);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.content.Intent intent = ((android.app.Activity) context).getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        op4.l lVar = new op4.l(this, intent);
        lVar.z(new op4.b(this));
        lVar.z(new op4.e(this));
        lVar.z(new op4.h(this));
        lVar.z(new op4.g(this));
        lVar.z(new op4.j(this));
    }

    @Override // com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout
    public void B(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        setOnClickListener(new pp4.g(this));
        super.B(navigator, configProvider);
        lp4.q0 q0Var = (lp4.q0) j(lp4.q0.class);
        if (q0Var != null) {
            q0Var.f320411m = navigator;
            q0Var.f320409h = configProvider;
        }
        lp4.j0 j0Var = (lp4.j0) j(lp4.j0.class);
        if (j0Var != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            j0Var.f320367m.round(rect);
            gp4.j jVar = (gp4.j) j(gp4.j.class);
            if (jVar != null) {
                com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = jVar.f274412f;
                timeEditorItemContainer.getClass();
                timeEditorItemContainer.f175955p = configProvider;
            }
            gp4.j jVar2 = (gp4.j) j(gp4.j.class);
            if (jVar2 != null) {
                jVar2.f274412f.w(rect);
            }
            j0Var.f320367m.round(lt3.n.f321263d);
        }
    }

    @Override // com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout
    public java.lang.String C() {
        return "MicroMsg.TimelineEditorPlatformVideoPluginLayout";
    }

    @Override // com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public boolean onBackPress() {
        super.onBackPress();
        op4.l lVar = (op4.l) j(op4.l.class);
        if (lVar == null) {
            return true;
        }
        java.util.Iterator it = lVar.f347293g.entrySet().iterator();
        while (it.hasNext()) {
            ((op4.k) ((java.util.Map.Entry) it.next()).getValue()).d();
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BasePluginLayout", "onPause");
        super.onPause();
        if (this.f176088y != 0) {
            pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.f176088y;
            java.util.Map Ai = ((yy0.m7) l0Var).Ai();
            Ai.put("out_time", java.lang.Long.valueOf(currentTimeMillis));
            Ai.put("stay_time", java.lang.Long.valueOf(currentTimeMillis2));
            Ai.put("page_name", "TimelineEditorPlatformVideoUI");
            Ai.put("page_id", "30038");
            Ai.put("view_id", "30038");
            ((cy1.a) rVar).yj("page_out", null, Ai, 6, false);
            this.f176088y = 0L;
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BasePluginLayout", "onResume");
        super.onResume();
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        this.f176088y = java.lang.System.currentTimeMillis();
        java.util.Map Ai = ((yy0.m7) l0Var).Ai();
        Ai.put("in_time", java.lang.Long.valueOf(this.f176088y));
        Ai.put("page_name", "TimelineEditorPlatformVideoUI");
        Ai.put("page_id", "30038");
        Ai.put("view_id", "30038");
        ((cy1.a) rVar).yj("page_in", null, Ai, 6, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x015c, code lost:
    
        if ((r5 != null ? (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) r5.getParcelable("KEY_SELECT_AUDIO_INFO") : null) != null) goto L77;
     */
    @Override // com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(ct0.b r12) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout.r(ct0.b):void");
    }

    @Override // com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        gp4.j jVar;
        zu3.a aVar;
        boolean z17;
        rm5.v vVar;
        lp4.q0 q0Var;
        android.graphics.RectF rectF;
        android.graphics.RectF rectF2;
        cp4.r rVar;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo;
        rm5.v vVar2;
        lp4.f0 f0Var;
        zu3.a aVar2;
        zu3.a aVar3;
        rm5.v vVar3;
        lp4.l0 l0Var;
        zu3.a aVar4;
        lp4.l0 l0Var2;
        lp4.l0 l0Var3;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 40) {
            if (ordinal == 42) {
                H();
                com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.F(this, null, 1, null);
                gp4.j jVar2 = (gp4.j) j(gp4.j.class);
                if (jVar2 != null && (aVar = jVar2.f274413g) != null) {
                    jVar2.Q(aVar);
                }
            } else if (ordinal == 55) {
                if (bundle != null) {
                    boolean z18 = bundle.getBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN");
                    com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo lyricsInfo = (com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo) bundle.getParcelable("EDIT_SELECT_MUSIC_LYRICS_LIST");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (lyricsInfo != null) {
                        java.util.Iterator it = lyricsInfo.f155730d.iterator();
                        while (it.hasNext()) {
                            byte[] bArr = (byte[]) it.next();
                            r45.ge4 ge4Var = new r45.ge4();
                            if (bArr != null) {
                                try {
                                    ge4Var.parseFrom(bArr);
                                } catch (java.lang.Exception e17) {
                                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                                }
                            }
                            arrayList.add(ge4Var);
                        }
                    }
                    if (z18) {
                        yo4.p pVar = (yo4.p) j(yo4.p.class);
                        zu3.t tVar = new zu3.t(arrayList, (pVar != null ? pVar.f464287r : null) != null ? r7.f155720q : 0L);
                        gp4.j jVar3 = (gp4.j) j(gp4.j.class);
                        if (jVar3 != null) {
                            jVar3.f274412f.p(cw3.j.f224168g);
                        }
                        gp4.j jVar4 = (gp4.j) j(gp4.j.class);
                        if (jVar4 != null) {
                            gp4.j.B(jVar4, tVar, null, null, 0L, 12, null);
                        }
                    } else {
                        gp4.j jVar5 = (gp4.j) j(gp4.j.class);
                        if (jVar5 != null) {
                            jVar5.f274412f.p(cw3.j.f224168g);
                        }
                    }
                }
            } else if (ordinal == 64) {
                yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                m7Var.rj(1);
                m7Var.qj(30038);
                java.util.Map Ai = m7Var.Ai();
                Ai.put("view_id", "mc_complete");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("mc_complete", null, Ai, 6, false);
                D();
                lp4.l0 l0Var4 = (lp4.l0) j(lp4.l0.class);
                if (l0Var4 != null) {
                    l0Var4.f320373f.stop();
                }
                lp4.d1 d1Var = (lp4.d1) j(lp4.d1.class);
                if (d1Var != null) {
                    lp4.d1.A(d1Var, null, 1, null);
                }
                gp4.j jVar6 = (gp4.j) j(gp4.j.class);
                if (jVar6 != null) {
                    com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = jVar6.f274412f;
                    android.graphics.Rect rect = new android.graphics.Rect(0, 0, timeEditorItemContainer.getWidth(), timeEditorItemContainer.getHeight());
                    lp4.q0 q0Var2 = (lp4.q0) j(lp4.q0.class);
                    if (q0Var2 != null) {
                        float[] I = jVar6.I();
                        java.util.ArrayList<zu3.a> editItems = jVar6.E();
                        kotlin.jvm.internal.o.g(editItems, "editItems");
                        r45.vl5 vl5Var = new r45.vl5();
                        r45.g70 g70Var = q0Var2.f320412n;
                        g70Var.f374938d = vl5Var;
                        com.tencent.mm.plugin.vlog.model.x.g(rect, vl5Var);
                        g70Var.f374941g = new r45.vl5();
                        android.graphics.Rect rect2 = new android.graphics.Rect((int) I[0], (int) I[1], (int) I[2], (int) I[3]);
                        r45.vl5 validRect = g70Var.f374941g;
                        kotlin.jvm.internal.o.f(validRect, "validRect");
                        com.tencent.mm.plugin.vlog.model.x.g(rect2, validRect);
                        java.util.LinkedList linkedList = g70Var.f374939e;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(editItems, 10));
                        for (zu3.a aVar5 : editItems) {
                            r45.de deVar = new r45.de();
                            deVar.f372338d = aVar5.f475758a.f475805d;
                            deVar.f372339e = x51.j1.a(aVar5.toProtoBuf().toByteArray());
                            arrayList2.add(deVar);
                        }
                        linkedList.addAll(arrayList2);
                        ct0.b bVar = q0Var2.f320410i;
                        g70Var.f374940f = bVar != null ? bVar.f222206c : false;
                    }
                    android.graphics.Rect rect3 = new android.graphics.Rect(0, 0, timeEditorItemContainer.getWidth(), timeEditorItemContainer.getHeight());
                    android.graphics.Rect rect4 = new android.graphics.Rect();
                    lp4.j0 j0Var = (lp4.j0) j(lp4.j0.class);
                    if (j0Var != null && (rectF2 = j0Var.f320367m) != null) {
                        rectF2.round(rect4);
                    }
                    android.graphics.Rect rect5 = new android.graphics.Rect();
                    lp4.j0 j0Var2 = (lp4.j0) j(lp4.j0.class);
                    if (j0Var2 != null && (rectF = j0Var2.f320368n) != null) {
                        rectF.round(rect5);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.BasePluginLayout", "cropRect:" + rect5);
                    bp4.p4 p4Var = (bp4.p4) j(bp4.p4.class);
                    if (p4Var != null) {
                        p4Var.getClass();
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    yo4.p pVar2 = (yo4.p) j(yo4.p.class);
                    com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = pVar2 != null ? pVar2.f464287r : null;
                    if (audioCacheInfo != null) {
                        wt3.c1.f449387b.c(audioCacheInfo, new pp4.j(this, audioCacheInfo, rect3, rect4, rect5, z17));
                    } else {
                        lp4.u uVar = (lp4.u) j(lp4.u.class);
                        if (uVar != null && (vVar = uVar.f320429h) != null && (q0Var = (lp4.q0) j(lp4.q0.class)) != null) {
                            q0Var.z(vVar, getEditId(), rect3, rect4, rect5, z17, new pp4.k(this));
                        }
                    }
                }
            } else if (ordinal == 67) {
                if (bundle != null) {
                    int i17 = bundle.getInt("PARAM_DELETE_VIEW_TYPE_INT");
                    cw3.j jVar7 = cw3.j.f224165d;
                    if (i17 == 4) {
                        yo4.p pVar3 = (yo4.p) j(yo4.p.class);
                        if (pVar3 != null) {
                            pVar3.C();
                        }
                    } else if (i17 == 6) {
                        cp4.r rVar2 = (cp4.r) j(cp4.r.class);
                        if (rVar2 != null) {
                            rVar2.B(0);
                        }
                    } else if (i17 == 7 && (rVar = (cp4.r) j(cp4.r.class)) != null) {
                        rVar.B(1);
                    }
                }
                com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.F(this, null, 1, null);
            } else if (ordinal != 112) {
                if (ordinal == 108) {
                    z();
                    lp4.f0 f0Var2 = (lp4.f0) j(lp4.f0.class);
                    if (f0Var2 != null) {
                        f0Var2.z().setEnableLengthEdit(true);
                    }
                    gp4.j jVar8 = (gp4.j) j(gp4.j.class);
                    if (jVar8 != null && (aVar3 = jVar8.f274413g) != null) {
                        lp4.f0 f0Var3 = (lp4.f0) j(lp4.f0.class);
                        if (f0Var3 != null) {
                            f0Var3.f320354t = aVar3;
                        }
                        lp4.l0 l0Var5 = (lp4.l0) j(lp4.l0.class);
                        if (l0Var5 != null) {
                            bv3.d dVar = aVar3.f475760c;
                            l0Var5.B(dVar.c(), dVar.b());
                        }
                    }
                    lp4.u uVar2 = (lp4.u) j(lp4.u.class);
                    if (uVar2 != null && (vVar2 = uVar2.f320429h) != null && (f0Var = (lp4.f0) j(lp4.f0.class)) != null && (aVar2 = f0Var.f320354t) != null) {
                        boolean z19 = f0Var.f320348n;
                        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = f0Var.f320343f;
                        if (!z19) {
                            f0Var.f320348n = true;
                            editorPanelHolder.setCloseTouchOutside(true);
                            com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup z27 = f0Var.z();
                            lp4.b0 b0Var = f0Var.f320355u;
                            z27.setCallback(b0Var);
                            f0Var.z().setRealTimeCallback(b0Var);
                            editorPanelHolder.setOnVisibleChangeCallback(new lp4.w(f0Var));
                            ((android.widget.ImageView) ((jz5.n) f0Var.f320346i).getValue()).setOnClickListener(new lp4.x(f0Var));
                            ((android.widget.ImageView) ((jz5.n) f0Var.f320347m).getValue()).setOnClickListener(new lp4.y(f0Var));
                        }
                        long j17 = 1000;
                        long startUs = vVar2.h().getStartUs() / j17;
                        f0Var.f320349o = vVar2.h().getEndUs() / j17;
                        bv3.d dVar2 = aVar2.f475760c;
                        long b17 = dVar2.b();
                        long j18 = f0Var.f320349o;
                        if (b17 > j18) {
                            bv3.c cVar = dVar2.f24732b;
                            cVar.c(cVar.f24728c + (j18 - cVar.a()));
                        }
                        f0Var.f320350p = dVar2.c();
                        long b18 = dVar2.b();
                        f0Var.f320351q = b18;
                        f0Var.f320352r = f0Var.f320350p;
                        f0Var.f320353s = b18;
                        bv3.d dVar3 = new bv3.d(0L, false, 3, null);
                        dVar3.d(f0Var.f320352r, f0Var.f320353s);
                        aVar2.f475759b = dVar3;
                        com.tencent.mars.xlog.Log.i("MicroMsg.VLogTimeEditPlugin", "time range:" + dVar2);
                        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup z28 = f0Var.z();
                        com.tencent.mm.plugin.vlog.model.h1 a17 = np4.a.a(vVar2);
                        zu3.a aVar6 = f0Var.f320354t;
                        kotlin.jvm.internal.o.d(aVar6);
                        long c17 = aVar6.f475760c.c();
                        zu3.a aVar7 = f0Var.f320354t;
                        kotlin.jvm.internal.o.d(aVar7);
                        z28.b(a17, c17, aVar7.f475760c.b());
                        editorPanelHolder.setShow(true);
                    }
                    com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.F(this, null, 1, null);
                } else if (ordinal != 109) {
                    switch (ordinal) {
                        case 116:
                            if (bundle != null) {
                                zu3.e eVar = bundle.getInt("PARAM_1_INT") == 0 ? zu3.e.f475801m : zu3.e.f475802n;
                                byte[] byteArray = bundle.getByteArray("PARAM_1_BYTEARRAY");
                                kotlin.jvm.internal.o.d(byteArray);
                                zu3.d dVar4 = new zu3.d(eVar, byteArray);
                                gp4.j jVar9 = (gp4.j) j(gp4.j.class);
                                if (jVar9 != null) {
                                    gp4.j.A(jVar9, dVar4, getCurrentTrackTimeRange(), null, 0L, 12, null);
                                    break;
                                }
                            }
                            break;
                        case 117:
                            if (bundle != null && bundle.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                cp4.r rVar3 = (cp4.r) j(cp4.r.class);
                                if (rVar3 != null) {
                                    rVar3.f221074y++;
                                }
                                D();
                                int i18 = bundle.getInt("PARAM_EDIT_TEXT_COLOR", 0);
                                int i19 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT", 0);
                                java.lang.String string = bundle.getString("PARAM_EDIT_TEXT_FONT");
                                yt3.m mVar = (yt3.m) j(yt3.m.class);
                                if (mVar != null) {
                                    byte[] byteArray2 = bundle.getByteArray("PARAM_1_BYTEARRAY");
                                    kotlin.jvm.internal.o.d(byteArray2);
                                    mVar.B(byteArray2, i18, i19, string);
                                    break;
                                }
                            }
                            break;
                        case 118:
                            if (bundle != null && bundle.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                D();
                                z();
                                cp4.r rVar4 = (cp4.r) j(cp4.r.class);
                                if (rVar4 != null) {
                                    byte[] byteArray3 = bundle.getByteArray("PARAM_1_BYTEARRAY");
                                    kotlin.jvm.internal.o.d(byteArray3);
                                    rVar4.H(byteArray3);
                                    break;
                                }
                            }
                            break;
                        case 119:
                            if (bundle != null) {
                                if (bundle.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                    int i27 = bundle.getInt("PARAM_EDIT_TEXT_COLOR", 0);
                                    int i28 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT", 0);
                                    java.lang.String string2 = bundle.getString("PARAM_EDIT_TEXT_FONT");
                                    cp4.r rVar5 = (cp4.r) j(cp4.r.class);
                                    if (rVar5 != null) {
                                        byte[] byteArray4 = bundle.getByteArray("PARAM_1_BYTEARRAY");
                                        kotlin.jvm.internal.o.d(byteArray4);
                                        rVar5.J(byteArray4, i27, i28, string2);
                                    }
                                }
                                if (bundle.getLong("PARAM_1_LONG", -1L) >= 0) {
                                    E(java.lang.Long.valueOf(bundle.getLong("PARAM_1_LONG")));
                                    break;
                                }
                            }
                            break;
                        case 120:
                            if (bundle != null) {
                                int i29 = bundle.getInt("PARAM_1_INT");
                                gp4.j jVar10 = (gp4.j) j(gp4.j.class);
                                if (jVar10 != null) {
                                    jVar10.f274412f.m(i29 == 1 ? zu3.e.f475802n : zu3.e.f475801m);
                                    break;
                                }
                            }
                            break;
                        case 121:
                            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.F(this, null, 1, null);
                            gp4.j jVar11 = (gp4.j) j(gp4.j.class);
                            if (jVar11 != null) {
                                jVar11.f274412f.s();
                                break;
                            }
                            break;
                        default:
                            switch (ordinal) {
                                case 137:
                                    gp4.j jVar12 = (gp4.j) j(gp4.j.class);
                                    if (jVar12 != null && (aVar4 = jVar12.f274413g) != null) {
                                        D();
                                        ep4.j jVar13 = (ep4.j) j(ep4.j.class);
                                        if (jVar13 != null) {
                                            jVar13.B(aVar4);
                                            break;
                                        }
                                    }
                                    break;
                                case 138:
                                    if (bundle != null) {
                                        bundle.getLong("PARAM_1_LONG");
                                        gp4.j jVar14 = (gp4.j) j(gp4.j.class);
                                        zu3.a aVar8 = jVar14 != null ? jVar14.f274413g : null;
                                        zu3.y yVar = aVar8 instanceof zu3.y ? (zu3.y) aVar8 : null;
                                        if (yVar != null) {
                                            com.tencent.mm.xeffect.effect.EffectManager effectManager = so4.g.f410781f;
                                            kotlin.jvm.internal.o.d(effectManager);
                                            uq5.y l17 = effectManager.l(yVar.f475866h);
                                            if (l17 != null) {
                                                bv3.d dVar5 = yVar.f475760c;
                                                l17.b(dVar5.c(), dVar5.b());
                                            }
                                        }
                                        gp4.j jVar15 = (gp4.j) j(gp4.j.class);
                                        if (jVar15 != null) {
                                            jVar15.P();
                                        }
                                        gp4.j jVar16 = (gp4.j) j(gp4.j.class);
                                        if (jVar16 != null) {
                                            jVar16.N(false);
                                        }
                                        lp4.u uVar3 = (lp4.u) j(lp4.u.class);
                                        if (uVar3 != null) {
                                            gp4.j jVar17 = (gp4.j) j(gp4.j.class);
                                            rm5.v D = uVar3.D(jVar17 != null ? jVar17.f274412f.getAllTTSData() : null);
                                            if (D != null && (l0Var2 = (lp4.l0) j(lp4.l0.class)) != null) {
                                                lp4.l0.C(l0Var2, D, false, false, 0L, 14, null);
                                            }
                                        }
                                        com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.F(this, null, 1, null);
                                        break;
                                    }
                                    break;
                                case 139:
                                    gp4.j jVar18 = (gp4.j) j(gp4.j.class);
                                    if (jVar18 != null) {
                                        jVar18.N(false);
                                    }
                                    com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.F(this, null, 1, null);
                                    break;
                                case 140:
                                    gp4.j jVar19 = (gp4.j) j(gp4.j.class);
                                    if (jVar19 != null) {
                                        jVar19.P();
                                    }
                                    gp4.j jVar20 = (gp4.j) j(gp4.j.class);
                                    if (jVar20 != null) {
                                        jVar20.N(false);
                                    }
                                    lp4.u uVar4 = (lp4.u) j(lp4.u.class);
                                    if (uVar4 != null) {
                                        gp4.j jVar21 = (gp4.j) j(gp4.j.class);
                                        rm5.v D2 = uVar4.D(jVar21 != null ? jVar21.f274412f.getAllTTSData() : null);
                                        if (D2 != null && (l0Var3 = (lp4.l0) j(lp4.l0.class)) != null) {
                                            lp4.l0.C(l0Var3, D2, false, false, 0L, 14, null);
                                        }
                                    }
                                    com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.F(this, null, 1, null);
                                    break;
                                default:
                                    super.w(status, bundle);
                                    break;
                            }
                    }
                } else {
                    H();
                    gp4.j jVar22 = (gp4.j) j(gp4.j.class);
                    zu3.a aVar9 = jVar22 != null ? jVar22.f274413g : null;
                    zu3.y yVar2 = aVar9 instanceof zu3.y ? (zu3.y) aVar9 : null;
                    if (yVar2 != null) {
                        com.tencent.mm.xeffect.effect.EffectManager effectManager2 = so4.g.f410781f;
                        kotlin.jvm.internal.o.d(effectManager2);
                        uq5.y l18 = effectManager2.l(yVar2.f475866h);
                        if (l18 != null) {
                            bv3.d dVar6 = yVar2.f475760c;
                            l18.b(dVar6.c(), dVar6.b());
                        }
                    }
                    gp4.j jVar23 = (gp4.j) j(gp4.j.class);
                    if (jVar23 != null) {
                        jVar23.N(false);
                    }
                    lp4.u uVar5 = (lp4.u) j(lp4.u.class);
                    if (uVar5 != null && (vVar3 = uVar5.f320429h) != null && (l0Var = (lp4.l0) j(lp4.l0.class)) != null) {
                        l0Var.B(0L, vVar3.j());
                    }
                    com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.F(this, null, 1, null);
                }
            } else if (bundle != null && (emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) bundle.getParcelable("PARAM_EDIT_EMOJI_INFO")) != null) {
                bv3.d currentTrackTimeRange = getCurrentTrackTimeRange();
                gp4.j jVar24 = (gp4.j) j(gp4.j.class);
                if (jVar24 != null) {
                    gp4.j.A(jVar24, new zu3.j(emojiInfo, null, null, 6, null), currentTrackTimeRange, null, 0L, 12, null);
                }
            }
        } else if (bundle != null && (jVar = (gp4.j) j(gp4.j.class)) != null) {
            java.lang.CharSequence charSequence = bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
            int i37 = bundle.getInt("PARAM_EDIT_TEXT_COLOR");
            int i38 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
            java.lang.String string3 = bundle.getString("PARAM_EDIT_TEXT_FONT");
            kotlin.jvm.internal.o.d(string3);
            gp4.j.A(jVar, new zu3.a0(charSequence, i37, i38, string3, 0, null, 48, null), getCurrentTrackTimeRange(), null, 0L, 12, null);
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.F(this, null, 1, null);
        }
        op4.l lVar = (op4.l) j(op4.l.class);
        if (lVar != null) {
            lVar.w(status, bundle);
        }
    }
}
