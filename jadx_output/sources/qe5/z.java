package qe5;

/* loaded from: classes12.dex */
public final class z extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f362222d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f362223e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f362224f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View.OnClickListener f362225g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f362222d = jz5.h.b(new qe5.y(this));
        this.f362225g = new qe5.p(this, activity);
    }

    public static final void T6(qe5.z zVar) {
        java.lang.String str;
        java.lang.String str2;
        kd5.e V6 = zVar.V6();
        java.lang.String str3 = V6 != null ? V6.F : null;
        kd5.e V62 = zVar.V6();
        java.lang.String str4 = (V62 == null || (str2 = V62.f306893x) == null) ? "" : str2;
        kd5.e V63 = zVar.V6();
        java.lang.String str5 = (V63 == null || (str = V63.f306892w) == null) ? "" : str;
        kd5.e V64 = zVar.V6();
        if (V64 != null) {
            V64.f306876J = true;
        }
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        androidx.appcompat.app.AppCompatActivity activity = zVar.getActivity();
        ((ht.a) vVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.f.l(activity, str3, str5, str4, 1, 1);
    }

    public final void U6() {
        java.lang.String str;
        oi3.g gVar;
        java.lang.String string;
        kd5.e V6 = V6();
        boolean z17 = V6 != null ? V6.G : false;
        kd5.e V62 = V6();
        boolean z18 = V62 != null ? V62.P : false;
        V6();
        if (!z17 || z18) {
            if (z18) {
                W6().n().setText(com.tencent.mm.R.string.m7g);
                W6().n().setVisibility(0);
                W6().s().setVisibility(8);
                W6().r().setVisibility(8);
            }
            f7(8);
            W6().h().setVisibility(8);
            return;
        }
        kd5.e V63 = V6();
        java.lang.String str2 = "";
        if (V63 == null || (str = V63.f306893x) == null) {
            str = "";
        }
        kd5.e V64 = V6();
        boolean z19 = V64 != null ? V64.I : true;
        V6();
        android.widget.Button h17 = W6().h();
        kotlin.jvm.internal.o.f(h17, "getDownloadOpenQbBtn(...)");
        android.widget.Button g17 = W6().g();
        kotlin.jvm.internal.o.f(g17, "getDownloadOpenBtn(...)");
        if (((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ai(str)) {
            h17.setVisibility(0);
            h17.setText(com.tencent.mm.R.string.brv);
            a7();
            h17.setOnClickListener(new qe5.t(this, str));
            g17.setText(com.tencent.mm.R.string.brs);
            g17.setOnClickListener(new qe5.u(this));
            j75.f Q6 = Q6();
            if (Q6 != null) {
                kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209726n);
                nVar.f306904c = true;
                Q6.B3(nVar);
                return;
            }
            return;
        }
        if (z19) {
            jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
            kd5.e V65 = V6();
            if (V65 != null && (gVar = V65.f306881i) != null && (string = gVar.getString(gVar.f345617d + 13)) != null) {
                ot0.q v17 = ot0.q.v(string);
                if (v17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppAttachDownLoadUtil", "parse content error?? content:%s", string);
                } else {
                    jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
                    java.lang.String str3 = v17.f348690o;
                    ((ht.a) vVar).getClass();
                    str2 = com.tencent.mm.pluginsdk.ui.tools.f.e(str3);
                    kotlin.jvm.internal.o.f(str2, "getMimeTypeByExt(...)");
                }
            }
            ((ht.s) a0Var).getClass();
            if (com.tencent.mm.pluginsdk.model.t3.k(str, str2)) {
                h17.setVisibility(8);
                g17.setText(com.tencent.mm.R.string.ne_);
                g17.setOnClickListener(this.f362225g);
                return;
            }
        }
        a7();
        g17.setText(com.tencent.mm.R.string.brs);
        g17.setOnClickListener(new qe5.v(this));
    }

    public final kd5.e V6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.getState();
        }
        return null;
    }

    public final em.d0 W6() {
        return (em.d0) ((jz5.n) this.f362222d).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a0, code lost:
    
        if (com.tencent.mm.pluginsdk.model.t3.k(r6, r7) == false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6(long r6) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.z.X6(long):void");
    }

    public final boolean Y6() {
        java.lang.String str;
        kd5.e V6 = V6();
        if (V6 == null || (str = V6.F) == null) {
            return true;
        }
        if (com.tencent.mm.vfs.w6.j(str)) {
            W6().c().setVisibility(8);
            return true;
        }
        Z6();
        kd5.e V62 = V6();
        java.lang.Integer valueOf = V62 != null ? java.lang.Integer.valueOf(V62.f306878f) : null;
        if (valueOf == null || valueOf.intValue() != 3) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("resLoadFailed", true);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null) {
            return false;
        }
        P6.setResult(-1, intent);
        P6.finish();
        return false;
    }

    public final void Z6() {
        em.d0 W6 = W6();
        if (W6.f254211t == null) {
            W6.f254211t = (android.widget.LinearLayout) W6.f254192a.findViewById(com.tencent.mm.R.id.d3k);
        }
        W6.f254211t.setVisibility(0);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(5, 0, 2, null));
        }
        W6().t().setVisibility(8);
    }

    public final void a7() {
        W6().g().setBackgroundResource(com.tencent.mm.R.drawable.f481068jy);
        W6().g().setTextColor(b3.l.getColorStateList(getContext(), com.tencent.mm.R.color.aax));
    }

    public final boolean b7() {
        java.lang.String str;
        kd5.e V6 = V6();
        if (V6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadBasicUIC", "openByTing: downloadState is null");
            return true;
        }
        if (V6.f306884o) {
            str = V6.f306895z;
            if (str == null) {
                str = com.tencent.mm.vfs.w6.p(V6.F);
            }
        } else {
            str = V6.f306895z;
        }
        if (!(V6.F.length() == 0)) {
            if (!(V6.f306893x.length() == 0)) {
                if (!(V6.f306892w.length() == 0)) {
                    if (!(str == null || str.length() == 0)) {
                        java.lang.String str2 = V6.F;
                        java.lang.String str3 = V6.f306893x;
                        java.lang.String str4 = V6.f306892w;
                        boolean Ai = ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ai(str3);
                        com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadBasicUIC", "openByTing: canOpenByTing: " + Ai + ", filePath: " + str2 + ", fileExt: " + str3 + ", fileName: " + str4 + ", fileMd5: " + str);
                        if (!Ai) {
                            return true;
                        }
                        bw5.l80 wi6 = ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).wi(str2, str3, str4, str);
                        il4.e eVar = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
                        eVar.f292106c = 1300;
                        eVar.f292107d = false;
                        kd5.e V62 = V6();
                        com.tencent.mm.storage.f9 f9Var = V62 != null ? V62.f306877e : null;
                        java.lang.String Q0 = f9Var != null ? f9Var.Q0() : null;
                        if (f9Var != null) {
                            il4.f fVar = eVar.f292122s;
                            java.util.Map map = fVar.f292132d;
                            int i17 = x51.t1.f452086a;
                            map.put("chat", Q0 == null ? "" : Q0);
                            java.lang.String v17 = com.tencent.mm.ui.chatting.viewitems.a0.v(f9Var, com.tencent.mm.storage.z3.R4(Q0), false);
                            fVar.f292132d.put("sourceuser", v17 != null ? v17 : "");
                        }
                        if (!((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ni(wi6, eVar)) {
                            return true;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadBasicUIC", "openByTing");
                        return false;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadBasicUIC", "openByTing: Invalid file data - path: " + V6.F + ", ext: " + V6.f306893x + ", name: " + V6.f306892w + ", md5: " + str);
        return true;
    }

    public final boolean c7() {
        kd5.e V6 = V6();
        if (V6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadBasicUIC", "openByVideoPlayer: downloadState is null");
            return true;
        }
        java.lang.String str = V6.f306893x;
        if (!(str == null ? false : com.tencent.mm.sdk.platformtools.t8.F0(str)) || P6() == null) {
            return true;
        }
        re5.f0.a(V6.F);
        com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadBasicUIC", "openByVideoPlayer: open by LocalVideoPlayerUIC");
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.ui.media.MediaGalleryContainerUI.class);
        pf5.j0.a(intent, re5.g0.class);
        intent.putExtra("KEY_PATH", V6.F);
        intent.putExtra("KEY_VIDEO_FILE_NAME", V6.f306892w);
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_DISABLE_COMMON_AREA_CONTROL, true);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(P6, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC", "openByVideoPlayer", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            P6.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(P6, "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC", "openByVideoPlayer", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            P6.finish();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d7(boolean r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.z.d7(boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.z.e7():void");
    }

    public final void f7(int i17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.File.FileDownLoadBasicUIC", "open by other way visible: " + i17);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.j(i17));
        }
    }

    public final void g7(int i17) {
        j75.f Q6;
        android.widget.LinearLayout f17 = W6().f();
        kotlin.jvm.internal.o.f(f17, "getDownloadMoreOpenWaysLl(...)");
        if ((i17 != 8 || f17.getVisibility() != 8) && i17 == 0) {
            f17.getVisibility();
        }
        com.tencent.mm.ui.widget.progress.RoundProgressBtn v17 = W6().v();
        kotlin.jvm.internal.o.f(v17, "getRoundProgress(...)");
        if (i17 != v17.getVisibility()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            int i18 = x51.t1.f452086a;
            com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadBasicUIC", "setRoundProgressBar %s %s", valueOf, new x51.s1());
            v17.setVisibility(i17);
            if (i17 == 0 && (Q6 = Q6()) != null) {
                Q6.B3(new kd5.r(-1));
            }
        }
        m7();
    }

    public final void h7() {
        kd5.e V6 = V6();
        java.lang.String str = V6 != null ? V6.F : null;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadBasicUIC", "fileModel?.fullFilePath is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.ui.tools.ShowImageUI.class);
        intent.putExtra("key_message_id", V6 != null ? java.lang.Long.valueOf(V6.f306879g) : null);
        intent.putExtra("key_message_talker", V6 != null ? V6.f306880h : null);
        intent.putExtra("key_image_path", V6 != null ? V6.F : null);
        intent.putExtra("key_favorite", true);
        intent.putExtra("key_scene", 2);
        intent.putExtra("key_conv_session_id", V6 != null ? V6.f306886q : null);
        if (getIntent().hasExtra("jumpChat")) {
            intent.putExtra("jumpChat", getIntent().getBundleExtra("jumpChat"));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(P6, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC", "showFileImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            P6.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(P6, "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC", "showFileImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            P6.finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r2 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i7() {
        /*
            r4 = this;
            em.d0 r0 = r4.W6()
            android.widget.TextView r0 = r0.d()
            r1 = 0
            r0.setVisibility(r1)
            kd5.e r2 = r4.V6()
            if (r2 == 0) goto L2c
            java.lang.String r2 = r2.f306892w
            if (r2 == 0) goto L2c
            int r3 = r2.length()
            if (r3 <= 0) goto L1d
            r1 = 1
        L1d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L28
            goto L29
        L28:
            r2 = 0
        L29:
            if (r2 == 0) goto L2c
            goto L33
        L2c:
            r1 = 2131772796(0x7f10457c, float:1.9176961E38)
            java.lang.String r2 = r4.getString(r1)
        L33:
            r0.setText(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.z.i7():void");
    }

    public final void k7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadBasicUIC", "[ImageGalleryUI] showImage");
        kd5.e V6 = V6();
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
        intent.putExtra("img_gallery_msg_id", V6 != null ? java.lang.Long.valueOf(V6.f306879g) : null);
        intent.putExtra("img_gallery_talker", V6 != null ? V6.f306880h : null);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(P6, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC", "showImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            P6.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(P6, "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC", "showImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            P6.finish();
            P6.overridePendingTransition(0, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        if (r6 != 131) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l7(java.lang.String r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4.Y6()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L18
            j75.f r0 = r4.Q6()
            if (r0 == 0) goto L16
            kd5.q r3 = new kd5.q
            r3.<init>()
            r0.B3(r3)
        L16:
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 == 0) goto L1c
            return r1
        L1c:
            if (r5 != 0) goto L20
            r5 = r2
            goto L24
        L20:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.G0(r5)
        L24:
            if (r5 == 0) goto L52
            if (r6 == 0) goto L3f
            r5 = 2
            if (r6 == r5) goto L3b
            r5 = 6
            if (r6 == r5) goto L3f
            r5 = 74
            if (r6 == r5) goto L3f
            r5 = 130(0x82, float:1.82E-43)
            if (r6 == r5) goto L3f
            r5 = 131(0x83, float:1.84E-43)
            if (r6 == r5) goto L3f
            goto L42
        L3b:
            r4.k7()
            goto L42
        L3f:
            r4.h7()
        L42:
            j75.f r5 = r4.Q6()
            if (r5 == 0) goto L50
            kd5.q r6 = new kd5.q
            r6.<init>()
            r5.B3(r6)
        L50:
            r5 = r1
            goto L53
        L52:
            r5 = r2
        L53:
            if (r5 == 0) goto L56
            return r1
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.z.l7(java.lang.String, int):boolean");
    }

    public final void m7() {
        com.tencent.mm.ui.widget.progress.RoundProgressBtn v17 = W6().v();
        kotlin.jvm.internal.o.f(v17, "getRoundProgress(...)");
        android.widget.Button c17 = W6().c();
        kotlin.jvm.internal.o.f(c17, "getDownloadContinueBtn(...)");
        java.util.List i17 = kz5.c0.i(v17, c17);
        if (i17.isEmpty()) {
            return;
        }
        java.util.Iterator it = i17.iterator();
        while (it.hasNext()) {
            if (((android.view.View) it.next()).getVisibility() == 0) {
                return;
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new qe5.r(this));
        }
    }
}
