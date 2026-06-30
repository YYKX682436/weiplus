package mz0;

/* loaded from: classes5.dex */
public abstract class b2 extends com.tencent.mm.ui.component.UIComponent implements dz0.k {
    public final jz5.g A;
    public kotlinx.coroutines.r2 B;
    public kotlinx.coroutines.r2 C;
    public final jz5.g D;
    public final jz5.g E;
    public final yz5.a F;
    public final jz5.g G;
    public final jz5.g H;

    /* renamed from: d, reason: collision with root package name */
    public boolean f332883d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f332884e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f332885f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f332886g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f332887h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.v2 f332888i;

    /* renamed from: m, reason: collision with root package name */
    public ty0.b1 f332889m;

    /* renamed from: n, reason: collision with root package name */
    public kz0.a f332890n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.v2 f332891o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f332892p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f332893q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f332894r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f332895s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f332896t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f332897u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f332898v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f332899w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f332900x;

    /* renamed from: y, reason: collision with root package name */
    public final n0.v2 f332901y;

    /* renamed from: z, reason: collision with root package name */
    public final n0.v2 f332902z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f332884e = new java.util.ArrayList();
        jz5.i iVar = jz5.i.f302831f;
        this.f332885f = jz5.h.a(iVar, new mz0.r(this));
        this.f332886g = new java.util.ArrayList();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Maas_SnsSpringStrategy_Int, -1));
        valueOf = valueOf.intValue() != -1 ? valueOf : null;
        this.f332887h = !((valueOf != null ? valueOf.intValue() : ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoTemplateMiaojianRecommendEnabled", 1)) == 1);
        this.f332888i = n0.s4.c(null, null, 2, null);
        this.f332891o = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        sb6.append(lp0.b.h0("TemplateExport").o());
        sb6.append('/');
        this.f332892p = sb6.toString();
        this.f332893q = jz5.h.b(mz0.s.f333038d);
        this.f332894r = jz5.h.a(iVar, new mz0.g0(this));
        this.f332895s = jz5.h.a(iVar, new mz0.a2(this));
        this.f332896t = jz5.h.a(iVar, new mz0.j0(this));
        this.f332897u = jz5.h.a(iVar, new mz0.p(this));
        this.f332898v = jz5.h.a(iVar, new mz0.v0(this));
        this.f332899w = jz5.h.a(iVar, new mz0.q0(this));
        this.f332900x = jz5.h.a(iVar, new mz0.x1(this));
        this.f332901y = n0.s4.c(0, null, 2, null);
        this.f332902z = n0.s4.c(java.lang.Double.valueOf(0.0d), null, 2, null);
        this.A = jz5.h.a(iVar, mz0.t1.f333062d);
        this.D = jz5.h.a(iVar, new mz0.v1(this));
        this.E = jz5.h.a(iVar, new mz0.q(this));
        this.F = new mz0.w0(this);
        this.G = jz5.h.a(iVar, new mz0.o0(this));
        this.H = jz5.h.a(iVar, new mz0.h(this));
    }

    public static final int O6(mz0.b2 b2Var) {
        return ((java.lang.Number) ((n0.q4) b2Var.f332901y).getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P6(mz0.b2 r7, com.tencent.mm.mj_template.sns.compose.widget.m5 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof mz0.a1
            if (r0 == 0) goto L16
            r0 = r9
            mz0.a1 r0 = (mz0.a1) r0
            int r1 = r0.f332876g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f332876g = r1
            goto L1b
        L16:
            mz0.a1 r0 = new mz0.a1
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f332874e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f332876g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.f332873d
            dz0.l r7 = (dz0.l) r7
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.throwOnFailure(r9)
            android.app.Activity r9 = r7.getContext()
            java.lang.String r2 = "context"
            kotlin.jvm.internal.o.g(r9, r2)
            pf5.z r2 = pf5.z.f353948a
            boolean r5 = r9 instanceof androidx.appcompat.app.AppCompatActivity
            if (r5 == 0) goto L9e
            androidx.appcompat.app.AppCompatActivity r9 = (androidx.appcompat.app.AppCompatActivity) r9
            pf5.v r9 = r2.a(r9)
            java.lang.Class<dz0.l> r2 = dz0.l.class
            pf5.c r9 = r9.c(r2)
            dz0.l r9 = (dz0.l) r9
            mz0.e1 r2 = new mz0.e1
            r2.<init>(r8, r7, r9, r3)
            r0.f332873d = r9
            r0.f332876g = r4
            r7 = 300000(0x493e0, double:1.482197E-318)
            java.lang.Object r7 = kotlinx.coroutines.a4.c(r7, r2, r0)
            if (r7 != r1) goto L6a
            goto L9d
        L6a:
            r6 = r9
            r9 = r7
            r7 = r6
        L6d:
            r1 = r9
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto L7d
            r8 = 2131771685(0x7f104125, float:1.9174708E38)
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r7 = (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) r7
            r7.r7(r8)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L9d
        L7d:
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct r7 = oy0.a.f349833a
            if (r7 != 0) goto L82
            goto L84
        L82:
            r7.f58969d = r4
        L84:
            if (r7 != 0) goto L87
            goto L94
        L87:
            r8 = 0
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "failReason"
            java.lang.String r8 = r7.b(r9, r8, r4)
            r7.f58977l = r8
        L94:
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct r7 = oy0.a.f349833a
            if (r7 == 0) goto L9b
            r7.k()
        L9b:
            oy0.a.f349833a = r3
        L9d:
            return r1
        L9e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Check failed."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.b2.P6(mz0.b2, com.tencent.mm.mj_template.sns.compose.widget.m5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void Q6(mz0.b2 b2Var) {
        b2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "preloadMusic: ");
        android.app.Activity context = b2Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dz0.x xVar = ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).f69789m;
        java.util.List list = (java.util.List) xVar.f245052c.getValue();
        if (list == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Template.TemplateControlUIC", "preloadMusic: music info list is null");
            return;
        }
        com.tencent.maas.model.MJMusicInfo mJMusicInfo = (com.tencent.maas.model.MJMusicInfo) xVar.f245053d.getValue();
        java.lang.String musicID = mJMusicInfo != null ? mJMusicInfo.getMusicID() : null;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.maas.model.MJMusicInfo) it.next()).getMusicID());
        }
        int indexOf = arrayList.indexOf(musicID);
        az0.i5.f15557a.A(kz5.p0.f313996d, arrayList.subList(java.lang.Math.max(0, indexOf), java.lang.Math.min(indexOf + 3, arrayList.size())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0293  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R6(mz0.b2 r26, dw3.o0 r27) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.b2.R6(mz0.b2, dw3.o0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0225 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object V6(mz0.b2 r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.b2.V6(mz0.b2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // dz0.k
    public void A(float f17) {
        py0.f0 f76 = f7();
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.gvr, java.lang.Integer.valueOf(a06.d.b(f17 * 100)));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        f76.c(string);
    }

    public final void A7() {
        com.tencent.maas.instamovie.MJMovieSession mJMovieSession;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        az0.n7 n7Var = ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).f69783d;
        java.lang.Double videoAspectRatio = (n7Var == null || (mJMovieSession = n7Var.f15742a) == null) ? null : mJMovieSession.getVideoAspectRatio();
        double doubleValue = videoAspectRatio == null ? 1.0d : videoAspectRatio.doubleValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "refreshScreenRatio: " + doubleValue);
        ((n0.q4) this.f332902z).setValue(java.lang.Double.valueOf(doubleValue));
    }

    public final void B7(int i17) {
        if (this.f332883d) {
            return;
        }
        bz0.f fVar = bz0.f.f36735a;
        bz0.f.f36738d = kotlinx.coroutines.l.d(bz0.f.f36736b, null, null, new bz0.e(bz0.f.f36738d, i17, null), 3, null);
        this.f332883d = true;
    }

    public void C7(java.util.List defaultTemplateList, r45.rz6 rz6Var) {
        kotlin.jvm.internal.o.g(defaultTemplateList, "defaultTemplateList");
    }

    public void D7(java.util.ArrayList mediaList) {
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
    }

    public void E7(java.lang.String curSelectedItemId, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(curSelectedItemId, "curSelectedItemId");
        kotlin.jvm.internal.o.g(info, "info");
    }

    public void F7(java.lang.String curSelectedItemId, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(curSelectedItemId, "curSelectedItemId");
        kotlin.jvm.internal.o.g(info, "info");
    }

    public void G7(java.lang.String curSelectedItemId, java.lang.String str) {
        kotlin.jvm.internal.o.g(curSelectedItemId, "curSelectedItemId");
    }

    @Override // dz0.k
    public java.lang.Object H6(kotlin.coroutines.Continuation continuation) {
        return V6(this, continuation);
    }

    public void H7(boolean z17) {
    }

    public final void I7(java.lang.String content, boolean z17) {
        kotlin.jvm.internal.o.g(content, "content");
        py0.f0 f76 = f7();
        f76.c(content);
        f76.e(z17);
    }

    @Override // dz0.k
    public void Q1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "onPreview");
        f7().dismiss();
        android.view.TextureView textureView = (android.view.TextureView) ((n0.q4) this.f332888i).getValue();
        if (textureView != null) {
            textureView.setVisibility(0);
        }
        ((n0.q4) this.f332891o).setValue(java.lang.Boolean.TRUE);
        A7();
    }

    @Override // dz0.k
    public java.lang.Object R1(kotlin.coroutines.Continuation continuation) {
        mz0.a a76;
        java.lang.Object obj;
        boolean p76 = p7();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (p76 && (a76 = a7()) != null) {
            java.util.Iterator it = o7().b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.mj_template.sns.compose.widget.m5) obj).f70077a, a76.f332871a)) {
                    break;
                }
            }
            com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = (com.tencent.mm.mj_template.sns.compose.widget.m5) obj;
            if (m5Var != null && (m5Var instanceof com.tencent.mm.mj_template.sns.compose.widget.k5)) {
                oy0.d.f349837a.a((com.tencent.mm.mj_template.sns.compose.widget.k5) m5Var, getContext(), new mz0.d(this, m5Var));
            }
        }
        return f0Var;
    }

    public abstract java.lang.Object S6(java.lang.String str, kotlin.coroutines.Continuation continuation);

    public abstract java.lang.Object T6(kotlin.coroutines.Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U6(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof mz0.e
            if (r0 == 0) goto L13
            r0 = r8
            mz0.e r0 = (mz0.e) r0
            int r1 = r0.f332934g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f332934g = r1
            goto L18
        L13:
            mz0.e r0 = new mz0.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f332932e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f332934g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f332931d
            mz0.b2 r0 = (mz0.b2) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L67
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            java.lang.Object r2 = r0.f332931d
            mz0.b2 r2 = (mz0.b2) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4e
        L3f:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f332931d = r7
            r0.f332934g = r5
            java.lang.Object r8 = r7.T6(r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            r2 = r7
        L4e:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L6f
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r5 = kotlinx.coroutines.internal.b0.f310484a
            mz0.f r6 = new mz0.f
            r6.<init>(r2, r8, r3)
            r0.f332931d = r2
            r0.f332934g = r4
            java.lang.Object r8 = kotlinx.coroutines.l.g(r5, r6, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            r0 = r2
        L67:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L6d
            r2 = r0
            goto L6f
        L6d:
            r3 = r8
            goto L7f
        L6f:
            com.tencent.mm.mj_template.sns.compose.widget.m7 r8 = r2.o7()
            kz5.p0 r0 = kz5.p0.f313996d
            r8.c(r0)
            java.lang.String r8 = "MicroMsg.Template.TemplateControlUIC"
            java.lang.String r0 = "get template list info error"
            com.tencent.mars.xlog.Log.e(r8, r0)
        L7f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.b2.U6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract dz0.e W6();

    public abstract dz0.h X6();

    public com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout Y6() {
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout(getContext(), null);
    }

    public com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a Z6() {
        return null;
    }

    public abstract mz0.a a7();

    public abstract java.lang.Object b7(kotlin.coroutines.Continuation continuation);

    public abstract mz0.b c7();

    public abstract java.lang.String d7();

    public abstract int e7();

    public final py0.f0 f7() {
        return (py0.f0) this.f332894r.getValue();
    }

    public abstract com.tencent.mm.mj_template.sns.compose.widget.c7 g7();

    public abstract ty0.c h7();

    public abstract com.tencent.mm.mj_template.sns.compose.widget.t0 i7();

    public yz5.q k7() {
        return null;
    }

    public final dz0.d l7() {
        return (dz0.d) this.D.getValue();
    }

    public abstract boolean m7();

    public final az0.d n7() {
        return (az0.d) this.f332900x.getValue();
    }

    public final com.tencent.mm.mj_template.sns.compose.widget.m7 o7() {
        return (com.tencent.mm.mj_template.sns.compose.widget.m7) this.f332895s.getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        super.onBeforeFinish(intent);
        B7(1);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        f7().e(false);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.mm_compose.MMComposeView) this.f332885f.getValue()).setContent(u0.j.c(-712169128, true, new mz0.f0(this, (dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))));
        if (this.f332887h) {
            y7();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("Template_Media_List");
        java.util.ArrayList mediaList = this.f332884e;
        if (parcelableArrayListExtra != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "media size :" + parcelableArrayListExtra.size());
            int i17 = 0;
            for (java.lang.Object obj : parcelableArrayListExtra) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "index:" + i17 + " path:" + ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj).f138430e);
                i17 = i18;
            }
            mediaList.addAll(parcelableArrayListExtra);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showSpringStrategy:");
        boolean z17 = this.f332887h;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", sb6.toString());
        super.onCreateBefore(bundle);
        pf5.u uVar = pf5.u.f353936a;
        dz0.l lVar = (dz0.l) uVar.b(getContext()).c(dz0.l.class);
        dz0.l lVar2 = (dz0.l) uVar.b(getContext()).c(dz0.l.class);
        D7(mediaList);
        com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) lVar2;
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        maasSdkUIC.f69798v = mediaList;
        maasSdkUIC.f69792p = false;
        dz0.e provider = W6();
        kotlin.jvm.internal.o.g(provider, "provider");
        maasSdkUIC.f69799w = provider;
        maasSdkUIC.f69785f = this;
        dz0.h params = X6();
        kotlin.jvm.internal.o.g(params, "params");
        maasSdkUIC.f69784e = params;
        boolean z18 = kotlin.jvm.internal.o.b(params.f244855a, "MomentsTemplateRecommendv2") && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsTemplateListType()) == 1;
        boolean z19 = kotlin.jvm.internal.o.b(maasSdkUIC.f69784e.f244855a, "TemplateRecommendv2") && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigFinderTemplateListType()) == 1;
        if (z18 || z19) {
            boolean z27 = params.f244856b;
            boolean z28 = params.f244857c;
            int i19 = params.f244858d;
            boolean z29 = params.f244859e;
            int i27 = params.f244861g;
            boolean z37 = params.f244862h;
            java.util.List list = params.f244863i;
            arrayList = mediaList;
            boolean z38 = params.f244864j;
            java.util.List defaultTemplateIDs = params.f244860f;
            kotlin.jvm.internal.o.g(defaultTemplateIDs, "defaultTemplateIDs");
            maasSdkUIC.f69784e = new dz0.h("alltemplaterecommend", z27, z28, i19, z29, defaultTemplateIDs, i27, z37, list, z38);
        } else {
            arrayList = mediaList;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "set homepage template from wechat backend");
            ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) lVar).f69791o = false;
            kotlinx.coroutines.l.d(getMainScope(), null, null, new mz0.x0(this, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "set homepage template from maas");
            ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) lVar).f69791o = true;
            android.content.ComponentCallbacks2 context = getContext();
            androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
            if (yVar != null) {
                ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) uVar.b(getContext()).c(dz0.l.class))).f69787h.observe(yVar, new mz0.y0(this));
            }
        }
        vt3.l lVar3 = vt3.l.f440005a;
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next()).f138430e);
        }
        lVar3.b(arrayList3, 5, false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((n0.q4) this.f332888i).setValue(null);
        com.tencent.mm.mj_template.sns.compose.widget.j5 j5Var = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m;
        com.tencent.mm.mj_template.sns.compose.widget.k5.f70027o.clear();
        ((com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout) ((zy0.e) ((dz0.f) this.G.getValue())).f477321j.getValue()).h();
        B7(5);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            int c17 = com.tencent.mm.ui.bl.c(getActivity());
            ((n0.q4) this.f332901y).setValue(java.lang.Integer.valueOf(c17));
        }
    }

    public abstract boolean p7();

    public abstract boolean q7();

    public void r7(java.lang.Throwable th6) {
        f7().dismiss();
    }

    public void s7(java.lang.Throwable th6, java.lang.String musicId) {
        kotlin.jvm.internal.o.g(musicId, "musicId");
    }

    @Override // dz0.k
    public void t(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e("MicroMsg.Template.TemplateControlUIC", "onSdkError:".concat(msg));
        f7().dismiss();
        db5.t7.g(getContext(), getContext().getString(com.tencent.mm.R.string.f490775aq3));
        getContext().finish();
    }

    public void t7(dw3.o0 launchType) {
        kotlin.jvm.internal.o.g(launchType, "launchType");
    }

    public void u7(java.lang.Throwable th6, java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
    }

    public void v7(java.lang.String templateId, int i17) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
    }

    public void w7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "performExport");
        kotlinx.coroutines.l.d(getMainScope(), null, null, new mz0.j1(this, null), 3, null);
    }

    public abstract void x7(az0.b0 b0Var);

    @Override // dz0.k
    public void y1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "onMovieSessionCreated: ");
        android.view.TextureView textureView = new android.view.TextureView(getActivity());
        n0.v2 v2Var = this.f332888i;
        ((n0.q4) v2Var).setValue(textureView);
        android.view.TextureView textureView2 = (android.view.TextureView) ((n0.q4) v2Var).getValue();
        if (textureView2 != null) {
            textureView2.setVisibility(4);
        }
        android.view.TextureView textureView3 = (android.view.TextureView) ((n0.q4) v2Var).getValue();
        if (textureView3 == null) {
            return;
        }
        textureView3.setSurfaceTextureListener(new mz0.z0(this));
    }

    public abstract void y7();

    @Override // dz0.k
    public java.lang.Object z2(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (K0) {
            return f0Var;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.Object a17 = dz0.g.a(((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).D, str, null, continuation, 2, null);
        return a17 == pz5.a.f359186d ? a17 : f0Var;
    }

    public final void z7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "preloadTemplate: ");
        java.util.List b17 = o7().b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = b17.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = (com.tencent.mm.mj_template.sns.compose.widget.m5) next;
            if (m5Var.f70079c && !r26.n0.D(m5Var.f70077a, "@@", false, 2, null)) {
                z17 = true;
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.tencent.mm.mj_template.sns.compose.widget.m5) it6.next()).f70077a);
        }
        int indexOf = arrayList2.indexOf(o7().a());
        if (indexOf > 0) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int i17 = indexOf - 1;
            int i18 = indexOf + 2;
            int size = arrayList2.size();
            if (i18 <= size) {
                size = i18;
            }
            arrayList3.addAll(arrayList2.subList(i17, size));
            if (i17 > 0) {
                int size2 = arrayList2.size();
                if (i17 > size2) {
                    i17 = size2;
                }
                arrayList3.addAll(arrayList2.subList(0, i17));
            }
            if (i18 < arrayList2.size()) {
                arrayList3.addAll(arrayList2.subList(i18, arrayList2.size()));
            }
            arrayList2 = arrayList3;
        }
        az0.i5.f15557a.A(arrayList2, kz5.p0.f313996d);
    }
}
