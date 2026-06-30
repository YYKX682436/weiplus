package qj3;

/* loaded from: classes10.dex */
public final class h extends com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout implements ju3.d0 {

    /* renamed from: h, reason: collision with root package name */
    public uj3.b f363891h;

    /* renamed from: i, reason: collision with root package name */
    public uj3.k f363892i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f363893m;

    /* renamed from: n, reason: collision with root package name */
    public final qj3.i f363894n;

    /* renamed from: o, reason: collision with root package name */
    public final qj3.g f363895o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f363896p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Bitmap f363897q;

    /* renamed from: r, reason: collision with root package name */
    public int f363898r;

    /* renamed from: s, reason: collision with root package name */
    public int f363899s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, uj3.b statusManager, uj3.k kVar) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusManager, "statusManager");
        this.f363891h = statusManager;
        this.f363892i = kVar;
        this.f363896p = android.view.View.inflate(context, com.tencent.mm.R.layout.ci9, this);
        qj3.i iVar = new qj3.i(this, this);
        this.f363894n = iVar;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mb8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        qj3.g gVar = new qj3.g((android.widget.FrameLayout) findViewById, this, this.f363892i);
        this.f363895o = gVar;
        getPluginList().add(iVar);
        getPluginList().add(gVar);
    }

    public final android.graphics.Bitmap getBitmap() {
        return this.f363897q;
    }

    public final uj3.k getConfig() {
        return this.f363892i;
    }

    public final com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider getConfigProvider() {
        return this.f363893m;
    }

    public final int getMHeight() {
        return this.f363899s;
    }

    public final int getMWidth() {
        return this.f363898r;
    }

    public final qj3.g getMultiTalkEditPhotoWrapper() {
        return this.f363895o;
    }

    public final uj3.b getStatusManager() {
        return this.f363891h;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(it3.y r5, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r6) {
        /*
            r4 = this;
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "configProvider"
            kotlin.jvm.internal.o.g(r6, r0)
            super.m(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "configProvider "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "MicroMsg.MultiTalkScreenEditContainerPlugin"
            com.tencent.mars.xlog.Log.i(r0, r5)
            r4.f363893m = r6
            dw3.c0 r5 = dw3.c0.f244182a
            r5.b(r6)
            java.util.ArrayList r5 = r4.getPluginList()
            java.util.Iterator r5 = r5.iterator()
        L2f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r5.next()
            yt3.r2 r0 = (yt3.r2) r0
            com.tencent.mm.component.api.jumper.UICustomParam r1 = r6.f155677o
            r2 = 0
            if (r1 == 0) goto L57
            java.util.Map r1 = r1.f64779h
            if (r1 == 0) goto L57
            java.lang.String r3 = r0.name()
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L57
            boolean r1 = r1.booleanValue()
            goto L58
        L57:
            r1 = r2
        L58:
            r1 = r1 ^ 1
            if (r1 == 0) goto L5d
            goto L5f
        L5d:
            r2 = 8
        L5f:
            r0.setVisibility(r2)
            goto L2f
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj3.h.m(it3.y, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public boolean onBackPress() {
        super.onBackPress();
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        super.r(bVar);
        if (bVar == null || bVar.f222218o == null) {
            return;
        }
        this.f363895o.a(false, bVar);
    }

    public final void setBitmap(android.graphics.Bitmap bitmap) {
        this.f363897q = bitmap;
    }

    public final void setConfig(uj3.k kVar) {
        this.f363892i = kVar;
    }

    public final void setConfigProvider(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        this.f363893m = recordConfigProvider;
    }

    public final void setDrawingEnable(boolean z17) {
        bn5.g gVar;
        ym5.w2 w2Var = this.f363895o.f363882m;
        if (w2Var == null || (gVar = (bn5.g) w2Var.getBaseBoardView()) == null) {
            return;
        }
        gVar.setTouchEnable(z17);
    }

    public final void setMHeight(int i17) {
        this.f363899s = i17;
    }

    public final void setMWidth(int i17) {
        this.f363898r = i17;
    }

    public final void setStatusManager(uj3.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<set-?>");
        this.f363891h = bVar;
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo;
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkScreenEditContainerPlugin", "status :" + status + " , param :" + bundle);
        int ordinal = status.ordinal();
        if (ordinal == 32) {
            super.onBackPress();
            return;
        }
        qk.g6 g6Var = qk.g6.TEXT;
        qj3.g gVar = this.f363895o;
        if (ordinal == 40) {
            if (bundle != null) {
                java.lang.CharSequence charSequence = bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                int i17 = bundle.getInt("PARAM_EDIT_TEXT_COLOR");
                int i18 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
                java.lang.String obj = charSequence != null ? charSequence.toString() : null;
                l45.q qVar = gVar.f363883n;
                if (qVar != null) {
                    new l45.a((l45.n) qVar).a(g6Var);
                }
                l45.q qVar2 = gVar.f363883n;
                if (qVar2 != null) {
                    ((l45.n) qVar2).s(obj, i17, i18, "");
                    return;
                }
                return;
            }
            return;
        }
        if (ordinal != 42) {
            if (ordinal == 45) {
                if (bundle != null) {
                    bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                    bundle.getInt("PARAM_EDIT_TEXT_COLOR");
                    bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
                    return;
                }
                return;
            }
            if (ordinal == 65) {
                if (gVar.f363885p) {
                    return;
                }
                android.content.Context context = gVar.f363884o;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    return;
                }
                gVar.f363885p = true;
                qk.o9 o9Var = gVar.f363881i;
                if (o9Var != null) {
                    o9Var.g(new qj3.a(gVar), true);
                    return;
                }
                return;
            }
            if (ordinal == 112) {
                if (bundle == null || (iEmojiInfo = (com.tencent.mm.api.IEmojiInfo) bundle.getParcelable("PARAM_EDIT_EMOJI_INFO")) == null) {
                    return;
                }
                gVar.getClass();
                l45.q qVar3 = gVar.f363883n;
                if (qVar3 != null) {
                    new l45.a((l45.n) qVar3).a(g6Var);
                }
                l45.q qVar4 = gVar.f363883n;
                if (qVar4 != null) {
                    ((l45.n) qVar4).r(iEmojiInfo);
                    return;
                }
                return;
            }
            if (ordinal == 73) {
                l45.q qVar5 = gVar.f363883n;
                if (qVar5 != null) {
                    new l45.a((l45.n) qVar5).a(qk.g6.EMOJI);
                    return;
                }
                return;
            }
            if (ordinal == 74) {
                l45.q qVar6 = gVar.f363883n;
                if (qVar6 != null) {
                    new l45.a((l45.n) qVar6).a(g6Var);
                    return;
                }
                return;
            }
            qk.g6 g6Var2 = qk.g6.MOSAIC;
            switch (ordinal) {
                case 79:
                    gVar.reset();
                    return;
                case 80:
                    gVar.f363889t = g6Var2;
                    gVar.f363890u = 0;
                    l45.q qVar7 = gVar.f363883n;
                    if (qVar7 != null) {
                        new l45.a((l45.n) qVar7).a(g6Var2);
                    }
                    l45.q qVar8 = gVar.f363883n;
                    if (qVar8 != null) {
                        new l45.a((l45.n) qVar8).b(g6Var2, 0, null);
                    }
                    nu3.i iVar = nu3.i.f340218a;
                    nu3.i.c(iVar, "KEY_CLICK_MOSAIC_COUNT_INT", 0, 2, null);
                    iVar.b(8);
                    return;
                case 81:
                    gVar.f363889t = g6Var2;
                    gVar.f363890u = 1;
                    l45.q qVar9 = gVar.f363883n;
                    if (qVar9 != null) {
                        new l45.a((l45.n) qVar9).a(g6Var2);
                    }
                    l45.q qVar10 = gVar.f363883n;
                    if (qVar10 != null) {
                        new l45.a((l45.n) qVar10).b(g6Var2, 1, null);
                    }
                    nu3.i iVar2 = nu3.i.f340218a;
                    nu3.i.c(iVar2, "KEY_CLICK_BRUSH_COUNT_INT", 0, 2, null);
                    iVar2.b(9);
                    return;
                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                    if (bundle != null) {
                        int i19 = bundle.getInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT");
                        qk.g6 g6Var3 = qk.g6.DOODLE;
                        gVar.f363889t = g6Var3;
                        gVar.f363890u = i19;
                        l45.q qVar11 = gVar.f363883n;
                        if (qVar11 != null) {
                            new l45.a((l45.n) qVar11).a(g6Var3);
                        }
                        l45.q qVar12 = gVar.f363883n;
                        if (qVar12 != null) {
                            new l45.a((l45.n) qVar12).b(g6Var3, i19, null);
                            return;
                        }
                        return;
                    }
                    return;
                case 83:
                    l45.q qVar13 = gVar.f363883n;
                    if (qVar13 != null) {
                        new l45.a((l45.n) qVar13).b(um.f.f428678c.a(), -1, null);
                    }
                    l45.q qVar14 = gVar.f363883n;
                    if (qVar14 != null) {
                        new l45.a((l45.n) qVar14).a(gVar.f363889t);
                    }
                    l45.q qVar15 = gVar.f363883n;
                    if (qVar15 != null) {
                        new l45.a((l45.n) qVar15).b(gVar.f363889t, gVar.f363890u, null);
                        return;
                    }
                    return;
                case com.tencent.mm.plugin.appbrand.jsapi.picker.l.CTRL_INDEX /* 84 */:
                    uj3.b.a(this.f363891h, uj3.a.f428196g, null, 2, null);
                    return;
                default:
                    return;
            }
        }
    }
}
