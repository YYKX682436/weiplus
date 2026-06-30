package mz0;

/* loaded from: classes5.dex */
public final class l2 extends mz0.b2 {
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f332999J;
    public final jz5.g K;
    public final java.lang.String L;
    public final int M;
    public final int N;
    public final com.tencent.mm.mj_template.sns.compose.widget.c7 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.I = jz5.h.b(mz0.k2.f332995d);
        jz5.i iVar = jz5.i.f302831f;
        this.f332999J = jz5.h.a(iVar, new mz0.f2(this));
        this.K = jz5.h.a(iVar, new mz0.g2(this));
        this.L = "channels";
        this.M = 1800;
        this.N = activity.getIntent().getIntExtra("KEY_POST_ENTERSCENE", 0);
        this.P = new mz0.h2();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J7(mz0.l2 r22, az0.b0 r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.l2.J7(mz0.l2, az0.b0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mz0.b2
    public void D7(java.util.ArrayList mediaList) {
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        int size = mediaList.size();
        if (mediaList.isEmpty()) {
            i17 = 0;
        } else {
            java.util.Iterator it = mediaList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if ((((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next()).getType() == 1) && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        if (mediaList.isEmpty()) {
            i18 = 0;
        } else {
            java.util.Iterator it6 = mediaList.iterator();
            i18 = 0;
            while (it6.hasNext()) {
                if ((((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next()).getType() == 2) && (i18 = i18 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.x1(m7Var, size, i17, i18, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map Ai = m7Var.Ai();
        Ai.put("in_time", java.lang.Long.valueOf(currentTimeMillis));
        Ai.put("page_name", "MJPublisherMovieTemplateUI");
        Ai.put("page_id", "30100");
        Ai.put("view_id", "30100");
        ((cy1.a) rVar).yj("page_in", null, Ai, 6, false);
    }

    @Override // mz0.b2
    public java.lang.Object S6(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        return nz0.o.f341530a.b(str, 2, continuation);
    }

    @Override // mz0.b2
    public java.lang.Object T6(kotlin.coroutines.Continuation continuation) {
        return nz0.o.f341530a.c(0, "cache_key_finder_album", continuation);
    }

    @Override // mz0.b2
    public dz0.e W6() {
        return new mz0.e2();
    }

    @Override // mz0.b2
    public dz0.h X6() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).i7();
        int i17 = this.N;
        java.lang.String str = 60 == i17 || 61 == i17 ? "RedPacketTemplateRecommendv2" : "TemplateRecommendv2";
        ez0.o oVar = ez0.o.f257835a;
        java.util.List e17 = oVar.e();
        boolean a17 = oVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(oVar.e());
        mz0.a a76 = a7();
        if (a76 != null) {
            arrayList.add(a76.f332871a);
        }
        return new dz0.h(str, false, true, -1, false, e17, 0, a17, arrayList, oVar.b());
    }

    @Override // mz0.b2
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout Y6() {
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderTemplateClipMusicPickerComponentLayout(getContext(), null);
    }

    @Override // mz0.b2
    public com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a Z6() {
        return new no4.c(new android.os.Bundle(), com.tencent.mm.plugin.vlog.model.i0.f175614f);
    }

    @Override // mz0.b2
    public mz0.a a7() {
        com.tencent.mm.mj_template.api.MJTemplateSession mJTemplateSession = (com.tencent.mm.mj_template.api.MJTemplateSession) this.f332999J.getValue();
        if (mJTemplateSession == null) {
            return null;
        }
        java.lang.String id6 = ((r45.rz6) ((jz5.n) mJTemplateSession.f69767f).getValue()).f385320d;
        kotlin.jvm.internal.o.f(id6, "id");
        return new mz0.a(id6, mJTemplateSession.f69766e, java.lang.Boolean.FALSE);
    }

    @Override // mz0.b2
    public java.lang.Object b7(kotlin.coroutines.Continuation continuation) {
        return ez0.o.f257835a.f(continuation);
    }

    @Override // mz0.b2
    public mz0.b c7() {
        jz5.g gVar = this.K;
        if (((r45.zi2) gVar.getValue()) == null && !getIntent().hasExtra("KEY_FINDER_POST_MUSIC_FEEDID")) {
            return null;
        }
        r45.zi2 zi2Var = (r45.zi2) gVar.getValue();
        java.lang.String string = zi2Var != null ? zi2Var.getString(12) : null;
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_FINDER_POST_MUSIC_FEEDID");
        if (string == null || string.length() == 0) {
            if (stringExtra == null || stringExtra.length() == 0) {
                return null;
            }
        }
        return new mz0.b(string, stringExtra);
    }

    @Override // mz0.b2
    public java.lang.String d7() {
        return this.L;
    }

    @Override // mz0.b2
    public int e7() {
        return this.M;
    }

    @Override // mz0.b2
    public com.tencent.mm.mj_template.sns.compose.widget.c7 g7() {
        return this.P;
    }

    @Override // mz0.b2
    public ty0.c h7() {
        return null;
    }

    @Override // mz0.b2
    public com.tencent.mm.mj_template.sns.compose.widget.t0 i7() {
        return null;
    }

    @Override // mz0.b2
    public boolean m7() {
        return ((java.lang.Boolean) ((jz5.n) this.I).getValue()).booleanValue();
    }

    @Override // mz0.b2
    public boolean p7() {
        return false;
    }

    @Override // mz0.b2
    public boolean q7() {
        int i17 = this.N;
        return true ^ (60 == i17 || 61 == i17);
    }

    @Override // mz0.b2
    public void r7(java.lang.Throwable th6) {
    }

    @Override // mz0.b2
    public void s7(java.lang.Throwable th6, java.lang.String musicId) {
        kotlin.jvm.internal.o.g(musicId, "musicId");
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.p4(m7Var, musicId, null), 3, null);
    }

    @Override // mz0.b2
    public void t7(dw3.o0 launchType) {
        kotlin.jvm.internal.o.g(launchType, "launchType");
    }

    @Override // mz0.b2
    public void v7(java.lang.String templateId, int i17) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        pp0.k0 k0Var = (pp0.k0) i95.n0.c(pp0.k0.class);
        com.tencent.mm.mj_template.sns.compose.widget.k5 a17 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.a(templateId);
        ((yy0.o0) k0Var).Bi(templateId, i17, a17 != null ? a17.f70032i : null);
    }

    @Override // mz0.b2
    public void x7(az0.b0 exportInfoHolder) {
        kotlin.jvm.internal.o.g(exportInfoHolder, "exportInfoHolder");
        kotlinx.coroutines.l.d(getMainScope(), null, null, new mz0.i2(this, exportInfoHolder, null), 3, null);
    }

    @Override // mz0.b2
    public void y7() {
        nz0.o.f341530a.f(0, "cache_key_finder_album");
    }
}
