package w22;

/* loaded from: classes10.dex */
public final class v implements r22.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f442580a;

    /* renamed from: b, reason: collision with root package name */
    public final r22.d f442581b;

    /* renamed from: c, reason: collision with root package name */
    public final y22.h f442582c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f442583d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter f442584e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f442585f;

    /* renamed from: g, reason: collision with root package name */
    public int f442586g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f442587h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f442588i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f442589j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f442590k;

    /* renamed from: l, reason: collision with root package name */
    public final x22.c f442591l;

    /* renamed from: m, reason: collision with root package name */
    public u22.b f442592m;

    /* renamed from: n, reason: collision with root package name */
    public v22.g f442593n;

    /* renamed from: o, reason: collision with root package name */
    public final w22.o f442594o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f442595p;

    public v(android.content.Context context, r22.d view, y22.h uiNavigation, java.lang.String str, com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter reporter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(uiNavigation, "uiNavigation");
        kotlin.jvm.internal.o.g(reporter, "reporter");
        this.f442580a = context;
        this.f442581b = view;
        this.f442582c = uiNavigation;
        this.f442583d = str;
        this.f442584e = reporter;
        this.f442591l = new x22.c();
        this.f442592m = new u22.b();
        this.f442594o = new w22.o(this);
        this.f442595p = new w22.l(this);
    }

    public static final void a(w22.v vVar, java.lang.String str, int i17, boolean z17) {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        r22.d dVar = vVar.f442581b;
        com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView textItem = dVar.getF98698i().getTextItem();
        h0Var.f310123d = textItem;
        if (textItem == null) {
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer f98698i = dVar.getF98698i();
            com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView textEditorItemView = new com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView(f98698i.getContext(), null);
            f98698i.f98728g.addView(textEditorItemView, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            textEditorItemView.b(f98698i.getValidRect(), f98698i.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480351vc));
            f98698i.f98729h.a(f98698i.getValidRect(), f98698i.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480351vc));
            h0Var.f310123d = textEditorItemView;
            textEditorItemView.setOnClickListener(new w22.u(vVar, h0Var));
        }
        ((com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView) h0Var.f310123d).f(str, i17, z17);
        dVar.getF98698i().setEditing((b32.c0) h0Var.f310123d);
    }

    public void b(com.tencent.mm.api.IEmojiInfo emojiInfo, android.graphics.Matrix matrix) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        if (emojiInfo instanceof com.tencent.mm.storage.emotion.EmojiInfo) {
            r22.d dVar = this.f442581b;
            int size = dVar.getF98698i().getAllEmojiMd5().size();
            android.content.Context context = this.f442580a;
            if (size >= 8) {
                db5.t7.makeText(context, com.tencent.mm.R.string.bus, 0).show();
                return;
            }
            com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView emojiEditorItemView = new com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView(context);
            emojiEditorItemView.setEmojiInfo(emojiInfo);
            emojiEditorItemView.resume();
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer f98698i = dVar.getF98698i();
            f98698i.getClass();
            f98698i.c(new b32.y(f98698i, emojiEditorItemView, matrix));
        }
    }

    public final void c(java.lang.String str, yz5.l lVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        w22.k kVar = new w22.k(lVar);
        x22.c cVar = this.f442591l;
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiEmojiTextSpam", "cgiEmojiTextSpam " + str);
        com.tencent.mm.sdk.platformtools.u3.h(new x22.b(str, cVar, kVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.storage.emotion.EmojiInfo d(java.lang.String r10, int r11, java.util.ArrayList r12) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w22.v.d(java.lang.String, int, java.util.ArrayList):com.tencent.mm.storage.emotion.EmojiInfo");
    }

    public final void e() {
        int i17;
        boolean z17;
        int i18;
        int i19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start mix ");
        r22.d dVar = this.f442581b;
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f98697h = dVar.getF98697h();
        sb6.append(f98697h != null ? f98697h.getF98625n() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorPresenter", sb6.toString());
        v22.a aVar = new v22.a(dVar.getF98698i().getValidRect());
        java.util.List<b32.c0> allItemViews = dVar.getF98698i().getAllItemViews();
        java.util.ArrayList<java.lang.String> allEmojiMd5 = dVar.getF98698i().getAllEmojiMd5();
        com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView textItem = dVar.getF98698i().getTextItem();
        int textColor = textItem != null ? textItem.getTextColor() : 0;
        java.lang.String attachedText = dVar.getF98698i().getAttachedText();
        java.util.Iterator<b32.c0> it = allItemViews.iterator();
        while (it.hasNext()) {
            av3.a e17 = zu3.n.e(it.next(), null, 1, null);
            if (e17 != null) {
                ((java.util.ArrayList) aVar.f432793a).add(e17);
            }
        }
        v22.g gVar = this.f442593n;
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = this.f442584e;
        if (gVar == null) {
            emojiCaptureReporter.f98593q = dVar.getF98698i().getAttachedText();
            emojiCaptureReporter.f98594r = textColor;
            emojiCaptureReporter.f98595s = this.f442590k;
            emojiCaptureReporter.f98596t = this.f442589j;
            emojiCaptureReporter.f98597u = allEmojiMd5.size();
            int i27 = textColor;
            emojiCaptureReporter.f98592p = java.lang.System.currentTimeMillis() - emojiCaptureReporter.f98583d;
            t85.j jVar = this.f442592m.f423978e;
            emojiCaptureReporter.A = jVar != null ? jVar.f416474a : null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(emojiCaptureReporter.f98593q)) {
                emojiCaptureReporter.f98593q = emojiCaptureReporter.f98593q.replace(",", " ");
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[20];
            objArr[0] = java.lang.Long.valueOf(emojiCaptureReporter.f98583d);
            objArr[1] = java.lang.Long.valueOf(emojiCaptureReporter.f98592p);
            objArr[2] = java.lang.Long.valueOf(emojiCaptureReporter.f98590n);
            objArr[3] = java.lang.Long.valueOf(emojiCaptureReporter.f98591o);
            objArr[4] = 0;
            objArr[5] = 0;
            objArr[6] = emojiCaptureReporter.f98593q;
            objArr[7] = java.lang.Integer.toHexString(emojiCaptureReporter.f98594r & 16777215);
            objArr[8] = java.lang.Integer.valueOf(emojiCaptureReporter.f98595s ? 1 : 0);
            objArr[9] = java.lang.Integer.valueOf(emojiCaptureReporter.f98596t ? 1 : 0);
            objArr[10] = java.lang.Integer.valueOf(emojiCaptureReporter.f98597u);
            objArr[11] = java.lang.Integer.valueOf(emojiCaptureReporter.f98598v ? 1 : 0);
            objArr[12] = java.lang.Integer.valueOf(emojiCaptureReporter.f98599w);
            objArr[13] = emojiCaptureReporter.f98600x;
            objArr[14] = "";
            objArr[15] = "";
            objArr[16] = java.lang.Integer.valueOf(emojiCaptureReporter.f98601y ? 2 : 1);
            objArr[17] = emojiCaptureReporter.f98602z;
            objArr[18] = emojiCaptureReporter.A;
            objArr[19] = emojiCaptureReporter.D;
            g0Var.d(15989, objArr);
            com.tencent.mm.storage.emotion.EmojiInfo d17 = d(attachedText, i27, allEmojiMd5);
            v22.j jVar2 = v22.j.f432824a;
            u22.b bVar = this.f442592m;
            int i28 = bVar.f423974a;
            long j17 = d17.field_captureEnterTime;
            java.lang.String str = bVar.f423976c;
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f98697h2 = dVar.getF98697h();
            i17 = 3;
            int playRate = f98697h2 != null ? (int) f98697h2.getPlayRate() : 1;
            i18 = 4;
            z17 = true;
            this.f442593n = jVar2.a(i28, j17, str, aVar, playRate, this.f442590k, this.f442592m.f423978e, d17);
            i19 = 5;
        } else {
            int i29 = textColor;
            i17 = 3;
            z17 = true;
            long j18 = emojiCaptureReporter.f98583d;
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCapture", "deleteEmojiInfoByEnterTime: " + j18);
            z85.l c17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c();
            c17.getClass();
            if (j18 != 0) {
                if (c17.f470808d.delete("EmojiInfo", "captureEnterTime=" + j18, null) > 0) {
                    c17.doNotify("event_update_emoji");
                }
            }
            com.tencent.mm.storage.emotion.EmojiInfo d18 = d(attachedText, i29, allEmojiMd5);
            v22.j jVar3 = v22.j.f432824a;
            u22.b bVar2 = this.f442592m;
            int i37 = bVar2.f423974a;
            long j19 = d18.field_captureEnterTime;
            java.lang.String str2 = bVar2.f423976c;
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f98697h3 = dVar.getF98697h();
            int playRate2 = f98697h3 != null ? (int) f98697h3.getPlayRate() : 1;
            i18 = 4;
            i19 = 5;
            this.f442593n = jVar3.a(i37, j19, str2, aVar, playRate2, this.f442590k, this.f442592m.f423978e, d18);
        }
        g();
        int i38 = this.f442592m.f423974a;
        boolean z18 = (i38 == i17 || i38 == i18 || i38 == i19) ? z17 : false;
        y22.h hVar = this.f442582c;
        if (!z18) {
            y22.h.a(hVar, z17, null, 2, null);
            return;
        }
        java.lang.Runnable runnable = this.f442595p;
        com.tencent.mm.sdk.platformtools.u3.l(runnable);
        com.tencent.mm.sdk.platformtools.u3.i(runnable, 60000L);
        android.content.Context context = this.f442580a;
        java.lang.String string = context.getString(com.tencent.mm.R.string.bwc);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        ((y22.m) hVar).f(context, string, false, 0, null);
        qr.e eVar = qr.e.f366008a;
        long j27 = this.f442592m.f423975b;
        w22.o callback = this.f442594o;
        kotlin.jvm.internal.o.g(callback, "callback");
        pm0.v.X(new qr.c(j27, callback));
    }

    public boolean f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBack: ");
        r22.d dVar = this.f442581b;
        com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = (com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer) dVar;
        sb6.append(captureEditorContainer.getVisibility() == 0);
        sb6.append(' ');
        sb6.append(captureEditorContainer.f98699m.getVisibility() == 0);
        sb6.append(' ');
        sb6.append(captureEditorContainer.f98707u.getVisibility() == 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorPresenter", sb6.toString());
        if (!(captureEditorContainer.getVisibility() == 0)) {
            return false;
        }
        if (captureEditorContainer.f98699m.getVisibility() == 0) {
            captureEditorContainer.b(false, null, 0);
            return true;
        }
        if (captureEditorContainer.f98707u.getVisibility() == 0) {
            captureEditorContainer.a(false);
            return true;
        }
        this.f442590k = false;
        this.f442589j = false;
        this.f442585f = null;
        this.f442587h = false;
        this.f442588i = false;
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f98697h = dVar.getF98697h();
        com.tencent.mm.vfs.w6.h(f98697h != null ? f98697h.getF98625n() : null);
        com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer2 = (com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer) dVar;
        captureEditorContainer2.f98701o.setSelected(false);
        captureEditorContainer2.f98702p.setSelected(false);
        captureEditorContainer2.f98704r.setImageDrawable(captureEditorContainer2.f98709w);
        captureEditorContainer2.f98705s.setImageDrawable(captureEditorContainer2.f98711y);
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView = captureEditorContainer2.f98697h;
        if (emojiVideoPlayTextureView != null) {
            emojiVideoPlayTextureView.stop();
        }
        captureEditorContainer2.f98696g.removeView(captureEditorContainer2.f98697h);
        captureEditorContainer2.f98697h = null;
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer f98698i = dVar.getF98698i();
        f98698i.b();
        f98698i.f98728g.removeAllViews();
        this.f442593n = null;
        i(true);
        ((y22.m) this.f442582c).d();
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = this.f442584e;
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(9, emojiCaptureReporter.f98583d, 0L, 0L, 0L, 0L, 0L, 0, 0, emojiCaptureReporter.G);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if ((r1 != null ? r1.n() : false) == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.EditorPresenter"
            java.lang.String r1 = "pause"
            com.tencent.mars.xlog.Log.i(r0, r1)
            r22.d r0 = r5.f442581b
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView r1 = r0.getF98697h()
            r2 = 0
            if (r1 == 0) goto L1f
            ph3.k r1 = r1.f98626o
            if (r1 == 0) goto L1a
            boolean r1 = r1.n()
            goto L1b
        L1a:
            r1 = r2
        L1b:
            r3 = 1
            if (r1 != r3) goto L1f
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r3 == 0) goto L45
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView r1 = r0.getF98697h()
            if (r1 == 0) goto L45
            ph3.k r3 = r1.f98626o
            if (r3 == 0) goto L43
            boolean r3 = r3.n()
            if (r3 == 0) goto L43
            ph3.k r3 = r1.f98626o
            if (r3 == 0) goto L39
            r3.pause()
        L39:
            y22.q r3 = new y22.q
            r3.<init>(r1)
            y22.g r4 = r1.f98624m
            r4.b(r3)
        L43:
            r1.f98634w = r2
        L45:
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer r0 = r0.getF98698i()
            r0.b()
            r5.i(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w22.v.g():void");
    }

    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorPresenter", "resume");
        r22.d dVar = this.f442581b;
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f98697h = dVar.getF98697h();
        if (f98697h != null) {
            f98697h.start();
        }
        android.view.ViewGroup viewGroup = dVar.getF98698i().f98728g;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.KeyEvent.Callback childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof b32.c0) {
                ((b32.c0) childAt).resume();
            }
        }
        i(true);
    }

    public final void i(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorPresenter", "toggleTouch: " + z17);
        android.content.Context context = this.f442580a;
        if (context instanceof android.app.Activity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            if (z17) {
                activity.getWindow().clearFlags(16);
            } else {
                activity.getWindow().addFlags(16);
            }
        }
    }

    public void j(java.lang.String str, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorPresenter", "updateText " + str);
        android.content.Context context = this.f442580a;
        c(str, new w22.t(com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.ggc), true, 0, null), this, str, i17, z17));
    }
}
