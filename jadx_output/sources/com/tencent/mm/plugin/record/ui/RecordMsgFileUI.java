package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class RecordMsgFileUI extends com.tencent.mm.ui.MMActivity implements zs3.t {
    public static final long G = ip.c.k();
    public static final /* synthetic */ int H = 0;
    public boolean E;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f155285d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f155286e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f155287f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.MMImageView f155288g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f155289h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f155290i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f155291m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f155292n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f155293o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f155294p;

    /* renamed from: s, reason: collision with root package name */
    public long f155297s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f155298t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f155299u;

    /* renamed from: v, reason: collision with root package name */
    public r45.gp0 f155300v;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f155302x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.handoff.model.AbsHandOffFile f155303y;

    /* renamed from: z, reason: collision with root package name */
    public bt3.b2 f155304z;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f155295q = null;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f155296r = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: w, reason: collision with root package name */
    public boolean f155301w = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public final com.tencent.mm.modelcdntran.c1 F = new com.tencent.mm.modelcdntran.c1() { // from class: com.tencent.mm.plugin.record.ui.RecordMsgFileUI$$a
        @Override // com.tencent.mm.modelcdntran.c1
        public final void a(int i17, com.tencent.mm.modelcdntran.d1 d1Var) {
            int i18 = com.tencent.mm.plugin.record.ui.RecordMsgFileUI.H;
            com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = com.tencent.mm.plugin.record.ui.RecordMsgFileUI.this;
            recordMsgFileUI.getClass();
            if (d1Var.f70908d.equals(recordMsgFileUI.f155299u)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgFileUI", "CdnMediaListener %s %s %s", java.lang.Long.valueOf(recordMsgFileUI.f155297s), java.lang.Integer.valueOf(i17), d1Var.f70908d);
                zs3.y z17 = bt3.g2.z(d1Var);
                z17.field_status = i17 != 1 ? i17 != 2 ? i17 != 3 ? 1 : 4 : 3 : 2;
                recordMsgFileUI.B0(0, z17);
            }
        }
    };

    @Override // zs3.t
    public void B0(int i17, zs3.y yVar) {
        if (yVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgFileUI", "on cdn info changed, but cdn info is null");
            return;
        }
        if (this.f155299u.equals(yVar.field_mediaId)) {
            int i18 = yVar.field_status;
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f155296r;
            if (i18 == 2) {
                n3Var.post(new com.tencent.mm.plugin.record.ui.y0(this));
                Z6(yVar, true);
                b7(0, 2);
                jx3.f.INSTANCE.idkeyStat(1203L, 5L, this.f155300v.R, false);
                return;
            }
            if (i18 == 3) {
                n3Var.post(new com.tencent.mm.plugin.record.ui.a1(this));
                Z6(yVar, false);
                b7(1, 4);
            } else {
                if (i18 != 4) {
                    c7(yVar);
                    return;
                }
                Z6(yVar, false);
                n3Var.post(new com.tencent.mm.plugin.record.ui.z0(this));
                b7(1, 3);
            }
        }
    }

    public final int T6() {
        int i17 = this.f155300v.I;
        if (i17 == 15) {
            return 4;
        }
        if (i17 == 10130) {
            return 8;
        }
        return i17;
    }

    public final java.lang.String U6() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(bt3.g2.H(this.f155300v, this.f155298t, this.f155297s, 1));
        if (r6Var.m()) {
            return r6Var.o();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c01.d9.b().e());
        sb6.append("web/");
        java.lang.String str = this.f155300v.G;
        if (str == null) {
            str = "";
        }
        sb6.append(kk.k.g(str.getBytes()));
        return sb6.toString();
    }

    public final void V6() {
        this.f155287f.setVisibility(8);
        this.f155285d.setVisibility(8);
        this.f155286e.setVisibility(8);
        this.f155290i.setVisibility(8);
        android.view.View view = this.f155293o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c7(((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(this.f155299u));
    }

    public final void W6() {
        r45.jp0 jp0Var;
        if (this.f155303y.getFileStatus() != 1) {
            this.f155303y.setFileStatus(1);
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile absHandOffFile = this.f155303y;
            java.lang.String t17 = bt3.g2.t(this.f155300v, this.f155298t, this.f155297s, 1);
            if (t17 == null) {
                t17 = "";
            }
            absHandOffFile.setFullPath(t17);
            ((d73.i) i95.n0.c(d73.i.class)).Ja(this.f155303y);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(this.f155303y);
        }
        if (T6() == 15 && (jp0Var = this.f155300v.O1) != null && !com.tencent.mm.sdk.platformtools.t8.K0(jp0Var.f377998d) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f155300v.O1.f378001g)) {
            this.B = true;
            this.f155288g.setVisibility(8);
            android.view.View view = this.f155293o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f155287f.setVisibility(8);
            this.f155285d.setVisibility(8);
            this.f155286e.setVisibility(8);
            this.f155290i.setVisibility(8);
            java.lang.String t18 = bt3.g2.t(this.f155300v, this.f155298t, this.f155297s, 1);
            fp.k.b();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.oy7);
            this.f155295q = com.tencent.mm.pluginsdk.ui.tools.n8.a(getContext());
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            viewGroup.addView((android.view.View) this.f155295q, 0, layoutParams);
            this.f155295q.setVideoCallback(new com.tencent.mm.plugin.record.ui.k1(this));
            fp.k.b();
            if (t18 != null) {
                this.f155295q.stop();
                this.f155295q.setVideoPath(t18);
            }
            fp.k.b();
            if (c01.d9.c() != null) {
                ((com.tencent.mm.booter.b) c01.d9.c()).a();
            }
        }
        if (T6() == 15 || T6() == 4) {
            if (this.B) {
                return;
            }
            android.view.View view2 = this.f155293o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f155287f.setVisibility(8);
            this.f155285d.setVisibility(8);
            this.f155286e.setVisibility(0);
            this.f155286e.setText(com.tencent.mm.R.string.cb9);
            this.f155290i.setVisibility(8);
            a7();
            return;
        }
        if (!this.f155301w) {
            android.view.View view3 = this.f155293o;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f155287f.setVisibility(4);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f155300v.A)) {
                this.f155285d.setVisibility(8);
            } else {
                this.f155285d.setVisibility(0);
            }
            this.f155286e.setVisibility(0);
            this.f155290i.setVisibility(0);
            return;
        }
        this.f155286e.setText(com.tencent.mm.R.string.f490508x2);
        this.f155290i.setVisibility(8);
        android.view.View view4 = this.f155293o;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f155287f.setVisibility(8);
        this.f155286e.setVisibility(0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f155300v.A)) {
            this.f155285d.setVisibility(8);
        }
    }

    public final void X6() {
        this.f155287f.setVisibility(8);
        this.f155285d.setVisibility(8);
        this.f155286e.setVisibility(8);
        android.view.View view = this.f155293o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f155290i.setVisibility(0);
        if (this.f155300v.I == 4) {
            this.f155290i.setGravity(17);
            this.f155290i.setText(com.tencent.mm.R.string.cbv);
            return;
        }
        this.f155290i.setGravity(17);
        this.f155290i.setText(com.tencent.mm.R.string.cbu);
        if (this.E) {
            return;
        }
        this.E = true;
        b7(8, 6);
    }

    public final void Y6() {
        android.view.View view = this.f155293o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f155286e.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f155300v.A)) {
            this.f155285d.setVisibility(8);
        } else {
            this.f155285d.setVisibility(0);
        }
        this.f155287f.setVisibility(0);
        this.f155287f.setText(com.tencent.mm.R.string.cb7);
        this.f155290i.setVisibility(8);
    }

    public final void Z6(zs3.y yVar, boolean z17) {
        if (1 == yVar.field_type) {
            int i17 = yVar.field_fileType;
            if ((i17 == 7 || i17 == 5) && this.D) {
                try {
                    com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f155298t, java.lang.Long.valueOf(yVar.field_mediaId.split("@")[2]).longValue());
                    ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).wi(false, yVar.field_dataId, Li.I0(), z17, false, Li.Q0());
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    public final void a7() {
        if (this.C) {
            return;
        }
        this.C = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_fav_path", bt3.g2.t(this.f155300v, this.f155298t, this.f155297s, 1));
        intent.putExtra("key_detail_fav_thumb_path", bt3.g2.H(this.f155300v, this.f155298t, this.f155297s, 1));
        intent.putExtra("key_detail_fav_video_duration", this.f155300v.f375448y);
        intent.putExtra("key_detail_statExtStr", this.f155300v.R1);
        intent.putExtra("key_detail_fav_video_scene_from", 1);
        intent.putExtra("key_detail_msg_uuid", this.f155300v.f375431q2);
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        o72.x1.L0(this, ".ui.detail.FavoriteVideoPlayUI", intent, null);
        finish();
    }

    public final void b7(int i17, int i18) {
        if (8 == T6()) {
            int i19 = this.f155300v.R > 26214400 ? 7 : 5;
            jx3.f.INSTANCE.idkeyStat(1203L, i18, 1L, false);
            ct3.d.f222303a.c(this.f155302x, this.f155300v, 4, i19);
        }
    }

    public final void c7(zs3.y yVar) {
        long j17;
        int i17;
        long j18;
        if (yVar != null) {
            i17 = (int) ((((float) yVar.field_offset) / ((float) java.lang.Math.max(1L, yVar.field_totalLen))) * 100.0f);
            j18 = yVar.field_offset;
            j17 = yVar.field_totalLen;
        } else {
            j17 = (int) this.f155300v.R;
            i17 = 0;
            j18 = 0;
        }
        this.f155296r.post(new com.tencent.mm.plugin.record.ui.x0(this, i17, j18, j17));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.acx;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
        com.tencent.mm.pluginsdk.ui.tools.f.f(this, i17, i18, intent, true, com.tencent.mm.R.string.brq, com.tencent.mm.R.string.brr, 5);
        if (i18 == -1 && i17 == 1001) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null);
            T6();
            com.tencent.mm.plugin.record.ui.l1 l1Var = new com.tencent.mm.plugin.record.ui.l1(this, Q);
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            if (T6() == 4 || T6() == 15) {
                gm0.j1.e().j(new com.tencent.mm.plugin.record.ui.m1(this, P1, stringExtra2, l1Var));
            } else {
                gm0.j1.e().j(new com.tencent.mm.plugin.record.ui.w0(this, P1, stringExtra2, l1Var));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013d  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.record.ui.RecordMsgFileUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f155295q;
        if (f4Var != null) {
            f4Var.setVideoCallback(null);
            this.f155295q.stop();
            this.f155295q.onDetach();
            if (c01.d9.c() != null) {
                ((com.tencent.mm.booter.b) c01.d9.c()).b();
            }
        }
        super.onDestroy();
        ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0(this);
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Bi(this.F);
        if (this.f155303y != null) {
            ((d73.i) i95.n0.c(d73.i.class)).a9(this.f155303y);
        }
        this.f155304z.g();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f155295q;
        if (f4Var != null) {
            f4Var.stop();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f155295q;
        if (f4Var != null) {
            f4Var.start();
        }
    }
}
