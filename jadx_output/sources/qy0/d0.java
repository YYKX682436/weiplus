package qy0;

/* loaded from: classes5.dex */
public final class d0 extends py0.y {
    public final n0.v2 A;

    /* renamed from: o, reason: collision with root package name */
    public ut3.d f367573o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f367574p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Intent f367575q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f367576r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f367577s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f367578t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f367579u;

    /* renamed from: v, reason: collision with root package name */
    public final n0.v2 f367580v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f367581w;

    /* renamed from: x, reason: collision with root package name */
    public final qy0.t f367582x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.mj_template.sns.compose.widget.m7 f367583y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f367584z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f367575q = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.m b17 = gm0.j1.b();
        sb6.append(kk.v.a(b17 != null ? b17.h() : 0));
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        this.f367576r = sb6.toString();
        this.f367577s = jz5.h.b(qy0.y.f367673d);
        jz5.i iVar = jz5.i.f302831f;
        this.f367578t = jz5.h.a(iVar, new qy0.r(this));
        this.f367579u = jz5.h.a(iVar, new qy0.v(this));
        this.f367580v = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);
        this.f367581w = jz5.h.a(iVar, new qy0.s(this));
        this.f367582x = new qy0.t(this, activity);
        com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = new com.tencent.mm.mj_template.sns.compose.widget.m7(getMainScope(), kz5.p0.f313996d, kz5.b0.c(com.tencent.mm.mj_template.sns.compose.widget.y4.f70336e), false, false, false, false, 64, null);
        m7Var.f70093k = new qy0.c0(this, null);
        this.f367583y = m7Var;
        this.f367584z = jz5.h.b(new qy0.u(this));
        this.A = n0.s4.c(0, null, 2, null);
    }

    public static final void U6(qy0.d0 d0Var) {
        com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = d0Var.f367583y;
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = (com.tencent.mm.mj_template.sns.compose.widget.m5) kz5.n0.a0(m7Var.b(), 1);
        if (m5Var != null) {
            m7Var.e(m5Var.f70077a);
            d0Var.a7(true, false);
        }
        super.Q1();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // py0.y, dz0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H6(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof qy0.j
            if (r0 == 0) goto L13
            r0 = r11
            qy0.j r0 = (qy0.j) r0
            int r1 = r0.f367599g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f367599g = r1
            goto L18
        L13:
            qy0.j r0 = new qy0.j
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f367597e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f367599g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f367596d
            qy0.d0 r0 = (qy0.d0) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L40
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            kotlin.ResultKt.throwOnFailure(r11)
            r0.f367596d = r10
            r0.f367599g = r4
            if (r3 != r1) goto L3f
            return r1
        L3f:
            r0 = r10
        L40:
            com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams r11 = r0.W6()
            boolean r11 = r11.f69769e
            if (r11 == 0) goto L59
            java.lang.String r11 = "MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC"
            java.lang.String r0 = "manage sdk, init"
            com.tencent.mars.xlog.Log.i(r11, r0)
            az0.i5 r4 = az0.i5.f15557a
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            az0.i5.s(r4, r5, r6, r7, r8, r9)
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qy0.d0.H6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pf5.o
    public android.content.Intent N6() {
        return W6().f69770f ? this.f367575q : getIntent();
    }

    @Override // py0.y
    public jz5.l O6() {
        n0.e5 e5Var;
        com.tencent.maas.model.MJMusicInfo mJMusicInfo;
        java.lang.String a17 = this.f367583y.a();
        ty0.b1 b1Var = this.f359033h;
        java.lang.String musicID = (b1Var == null || (e5Var = b1Var.f422792b) == null || (mJMusicInfo = (com.tencent.maas.model.MJMusicInfo) e5Var.getValue()) == null) ? null : mJMusicInfo.getMusicID();
        if (musicID == null) {
            musicID = "";
        }
        return new jz5.l(a17, musicID);
    }

    @Override // py0.y, dz0.k
    public void Q1() {
        if (W6().f69770f) {
            kotlinx.coroutines.l.d(getMainScope(), null, null, new qy0.x(this, null), 3, null);
        } else {
            super.Q1();
        }
    }

    @Override // py0.y
    public void Q6() {
        android.content.ComponentCallbacks2 context = getContext();
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar != null) {
            if (V6()) {
                android.app.Activity context2 = getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(dz0.l.class))).f69791o = false;
            } else {
                int Ri = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_finder_maas_recomend_fallback_type, bm5.h0.RepairerConfig_Maas_FinderFallBack_Int, 0);
                com.tencent.mars.xlog.Log.i("FinderMaasXConfigImpl", "finder fallback " + Ri);
                if (Ri == 2) {
                    android.app.Activity context3 = getContext();
                    kotlin.jvm.internal.o.g(context3, "context");
                    pf5.z zVar2 = pf5.z.f353948a;
                    if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).c(dz0.l.class))).f69791o = false;
                    kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new qy0.q(this, null), 3, null);
                } else {
                    android.app.Activity context4 = getContext();
                    kotlin.jvm.internal.o.g(context4, "context");
                    pf5.z zVar3 = pf5.z.f353948a;
                    if (!(context4 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    androidx.lifecycle.j0 j0Var = ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar3.a((androidx.appcompat.app.AppCompatActivity) context4).c(dz0.l.class))).f69787h;
                    final com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = this.f367583y;
                    j0Var.observe(yVar, new androidx.lifecycle.k0() { // from class: qy0.k
                        @Override // androidx.lifecycle.k0
                        public void onChanged(java.lang.Object obj) {
                            java.util.List p07 = (java.util.List) obj;
                            kotlin.jvm.internal.o.g(p07, "p0");
                            com.tencent.mm.mj_template.sns.compose.widget.m7.this.d(p07);
                        }
                    });
                    android.app.Activity context5 = getContext();
                    kotlin.jvm.internal.o.g(context5, "context");
                    if (!(context5 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar3.a((androidx.appcompat.app.AppCompatActivity) context5).c(dz0.l.class))).f69786g.observe(yVar, new qy0.l(this));
                }
            }
        }
        java.util.List list = W6().f69768d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj).getType() == 1) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next()).f138430e);
        }
        com.tencent.mm.mm_compose.MMComposeView mMComposeView = (com.tencent.mm.mm_compose.MMComposeView) ((jz5.n) this.f359029d).getValue();
        int h17 = com.tencent.mm.ui.bl.h(mMComposeView.getContext());
        android.content.Context context6 = mMComposeView.getContext();
        kotlin.jvm.internal.o.f(context6, "getContext(...)");
        pf5.z zVar4 = pf5.z.f353948a;
        if (!(context6 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        mMComposeView.setContent(u0.j.c(-1637040323, true, new qy0.p(this, h17, (dz0.l) zVar4.a((androidx.appcompat.app.AppCompatActivity) context6).c(dz0.l.class), arrayList2)));
    }

    @Override // py0.y
    public void R6(java.lang.String path, java.lang.String str) {
        kotlin.jvm.internal.o.g(path, "path");
        if (W6().f69770f) {
            Z6(true, path);
        } else {
            super.R6(path, str);
        }
    }

    public final boolean V6() {
        java.lang.String str = (java.lang.String) ((jz5.n) this.f367584z).getValue();
        if (str == null || str.length() == 0) {
            r45.zi2 zi2Var = (r45.zi2) this.f367579u.getValue();
            java.lang.String string = zi2Var != null ? zi2Var.getString(12) : null;
            if (string == null || string.length() == 0) {
                return false;
            }
        }
        return true;
    }

    public final com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams W6() {
        return (com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams) this.f367578t.getValue();
    }

    public final com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager X6() {
        return (com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager) this.f367581w.getValue();
    }

    public final void Y6() {
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "launchMMEditorUI");
        this.f367574p = true;
        ut3.f.f431176c.f431177a = this.f367573o;
        android.app.Activity context = getContext();
        int i17 = com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.f155625t;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.class);
        intent.putExtras(getContext().getIntent());
        android.app.Activity context2 = getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(1);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context2, arrayList.toArray(), "com/tencent/mm/mj_template/album_template/multi_template/MaasAlbumMultiTemplateOverlayUIC", "launchMMEditorUI", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(boolean r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qy0.d0.Z6(boolean, java.lang.String):void");
    }

    public final void a7(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "switchMaasPreview() called with: maasPreview = " + z17);
        ((n0.q4) this.f367580v).setValue(java.lang.Boolean.valueOf(z17));
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class));
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "setMaasPreview() called with: maasPreview = " + z17);
        maasSdkUIC.f69801y = z17;
        kotlinx.coroutines.l.d(maasSdkUIC.getMainScope(), null, null, new dz0.l2(z17, maasSdkUIC, null), 3, null);
        if (W6().f69770f) {
            if (!z17) {
                getActivity().mo133getLifecycle().a(X6());
                X6().b();
                return;
            }
            getActivity().mo133getLifecycle().c(X6());
            com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager X6 = X6();
            X6.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMMusicManager", "pausePlay: ");
            gz0.h hVar = X6.f69748m;
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    public final boolean b7(com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var) {
        return (m7Var.a().length() > 0) && !kotlin.jvm.internal.o.b(m7Var.a(), "@@no_template@@");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (r14 == null) goto L17;
     */
    @Override // py0.y, com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateBefore(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qy0.d0.onCreateBefore(android.os.Bundle):void");
    }

    @Override // py0.y, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.mj_template.sns.compose.widget.j5 j5Var = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m;
        com.tencent.mm.mj_template.sns.compose.widget.k5.f70027o.clear();
        if (W6().f69769e) {
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "manage sdk, release");
            az0.i5.x(az0.i5.f15557a, false, false, 3, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPreDestroyed() {
        super.onPreDestroyed();
        if (this.f359035m || !this.f367574p) {
            return;
        }
        S6(2);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f367574p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "setReportScene: 2, field: " + bz0.a.f36723b);
            bz0.a.f36723b = 2;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        if (W6().f69770f) {
            contentView.setBackgroundColor(getColor(com.tencent.mm.R.color.f479163rn));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            int c17 = com.tencent.mm.ui.bl.c(getActivity());
            ((n0.q4) this.A).setValue(java.lang.Integer.valueOf(c17));
        }
    }

    @Override // dz0.k
    public void t(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "onSdkError ".concat(msg));
        Y6();
        getContext().finish();
    }
}
