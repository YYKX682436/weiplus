package com.tencent.mm.plugin.subapp.ui.pluginapp;

/* loaded from: classes8.dex */
public class InviteFriendsBy3rdUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0, jk5.b, jk5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f172427d;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f172431h;

    /* renamed from: e, reason: collision with root package name */
    public int f172428e = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f172429f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f172430g = null;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f172432i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f172433m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.EditText f172434n = null;

    /* renamed from: o, reason: collision with root package name */
    public final jk5.j f172435o = new jk5.j();

    /* renamed from: p, reason: collision with root package name */
    public boolean f172436p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f172437q = false;

    @Override // jk5.b
    public void I4(jk5.c cVar) {
        android.app.ProgressDialog progressDialog = this.f172430g;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            db5.e1.n(getContext(), com.tencent.mm.R.string.f493411k25, com.tencent.mm.R.string.f490573yv, new gg4.g0(this), new gg4.h0(this));
        } else {
            if (ordinal != 1) {
                return;
            }
            db5.e1.n(getContext(), com.tencent.mm.R.string.f493410k24, com.tencent.mm.R.string.f490573yv, new gg4.g0(this), new gg4.h0(this));
        }
    }

    @Override // jk5.a
    public void V2(jk5.c cVar) {
    }

    public final void V6(int i17) {
        w11.j0 j0Var = new w11.j0(i17);
        this.f172429f = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.ggc), true, true, new gg4.e0(this, j0Var));
        c01.d9.e().g(j0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap W6() {
        /*
            r9 = this;
            java.lang.String r0 = c01.z1.r()
            java.lang.String r1 = g83.a.a()
            java.lang.String r2 = g83.a.b()
            java.lang.String r3 = "qr_"
            byte[] r0 = r0.getBytes()
            java.lang.String r4 = kk.k.g(r0)
            java.lang.String r5 = ".png"
            r6 = 1
            r7 = 1
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.h1.a(r1, r2, r3, r4, r5, r6, r7)
            r1 = 0
            r2 = 0
            java.io.RandomAccessFile r0 = com.tencent.mm.vfs.w6.B(r0, r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            long r3 = r0.length()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.read(r3)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.close()     // Catch: java.lang.Exception -> L4a
            goto L4a
        L33:
            r1 = move-exception
            goto L52
        L35:
            r3 = move-exception
            goto L3b
        L37:
            r0 = move-exception
            goto L55
        L39:
            r3 = move-exception
            r0 = r1
        L3b:
            java.lang.String r4 = "MicroMsg.InviteFriendsBy3rdUI"
            java.lang.String r5 = ""
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L33
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r3, r5, r2)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L49
            r0.close()     // Catch: java.lang.Exception -> L49
        L49:
            r3 = r1
        L4a:
            if (r3 != 0) goto L4d
            return r1
        L4d:
            android.graphics.Bitmap r0 = com.tencent.mm.sdk.platformtools.x.G(r3)
            return r0
        L52:
            r8 = r1
            r1 = r0
            r0 = r8
        L55:
            if (r1 == 0) goto L5a
            r1.close()     // Catch: java.lang.Exception -> L5a
        L5a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI.W6():android.graphics.Bitmap");
    }

    public final void X6(int i17, java.lang.String str, java.lang.String str2) {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488673a02, null);
        this.f172431h = inflate;
        this.f172434n = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.c_l);
        this.f172432i = (android.widget.ImageView) this.f172431h.findViewById(com.tencent.mm.R.id.c_i);
        this.f172433m = (android.widget.ProgressBar) this.f172431h.findViewById(com.tencent.mm.R.id.imb);
        android.view.View view = (android.view.View) this.f172432i.getParent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI", "showConfirmDialog", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI", "showConfirmDialog", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f172434n.setText(str);
        android.graphics.Bitmap W6 = W6();
        if (W6 == null) {
            c01.d9.e().g(new g21.a(c01.z1.r(), com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c01.d9.b().p().l(66561, null)), 0));
            ((android.widget.ProgressBar) this.f172431h.findViewById(com.tencent.mm.R.id.imb)).setVisibility(0);
        } else {
            android.widget.ImageView imageView = this.f172432i;
            if (imageView != null) {
                imageView.setImageBitmap(W6);
            }
        }
        r35.j1.i(this.mController, str2, this.f172431h, getResources().getString(com.tencent.mm.R.string.f490551ya), new gg4.x(this, str, i17));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494896aw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        if (r0 != false) goto L19;
     */
    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r7 = 2131761443(0x7f101923, float:1.9153935E38)
            r6.setMMTitle(r7)
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = "Invite_friends"
            r1 = 4
            int r7 = r7.getIntExtra(r0, r1)
            r6.f172427d = r7
            java.lang.Class<c25.e> r7 = c25.e.class
            lm0.a r7 = gm0.j1.s(r7)
            c25.e r7 = (c25.e) r7
            com.tencent.mm.plugin.zero.a r7 = (com.tencent.mm.plugin.zero.a) r7
            ip.j r7 = r7.b()
            java.lang.String r0 = "InviteFriendsInviteFlags"
            java.lang.String r7 = r7.d(r0)
            r0 = 0
            int r7 = com.tencent.mm.sdk.platformtools.t8.P(r7, r0)
            com.tencent.mm.ui.base.preference.r r1 = r6.getPreferenceScreen()
            r2 = r7 & 2
            if (r2 > 0) goto L40
            java.lang.String r2 = "invite_friends_by_message"
            r3 = r1
            com.tencent.mm.ui.base.preference.h0 r3 = (com.tencent.mm.ui.base.preference.h0) r3
            r3.w(r2)
        L40:
            r2 = r7 & 1
            if (r2 > 0) goto L4d
            java.lang.String r2 = "invite_friends_by_mail"
            r3 = r1
            com.tencent.mm.ui.base.preference.h0 r3 = (com.tencent.mm.ui.base.preference.h0) r3
            r3.w(r2)
        L4d:
            com.tencent.mm.sdk.platformtools.f9 r2 = com.tencent.mm.sdk.platformtools.f9.Global3rdSrv
            boolean r3 = r2.h()
            if (r3 != 0) goto L72
            r3 = r7 & 4
            if (r3 <= 0) goto L72
            androidx.appcompat.app.AppCompatActivity r3 = r6.getContext()
            java.lang.String r4 = "com.whatsapp"
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 == 0) goto L66
            goto L70
        L66:
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L70
            r5 = 8192(0x2000, float:1.148E-41)
            r3.getApplicationInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L70
            r0 = 1
        L70:
            if (r0 != 0) goto L7b
        L72:
            java.lang.String r0 = "invite_friends_by_whatsapp"
            r3 = r1
            com.tencent.mm.ui.base.preference.h0 r3 = (com.tencent.mm.ui.base.preference.h0) r3
            r3.w(r0)
        L7b:
            boolean r0 = r2.h()
            java.lang.String r3 = "invite_friends_by_facebook"
            if (r0 != 0) goto L8e
            r0 = r7 & 8
            if (r0 <= 0) goto L8e
            boolean r0 = c01.z1.C()
            if (r0 != 0) goto L94
        L8e:
            r0 = r1
            com.tencent.mm.ui.base.preference.h0 r0 = (com.tencent.mm.ui.base.preference.h0) r0
            r0.w(r3)
        L94:
            com.tencent.mm.ui.base.preference.h0 r1 = (com.tencent.mm.ui.base.preference.h0) r1
            r1.w(r3)
            boolean r0 = r2.h()
            if (r0 != 0) goto La3
            r7 = r7 & 16
            if (r7 > 0) goto La9
        La3:
            java.lang.String r7 = "invite_friends_by_twitter"
            r1.w(r7)
        La9:
            r1.notifyDataSetChanged()
            com.tencent.mm.modelbase.r1 r7 = c01.d9.e()
            r0 = 1803(0x70b, float:2.527E-42)
            r7.a(r0, r6)
            com.tencent.mm.modelbase.r1 r7 = c01.d9.e()
            r0 = 1804(0x70c, float:2.528E-42)
            r7.a(r0, r6)
            com.tencent.mm.modelbase.r1 r7 = c01.d9.e()
            r0 = 168(0xa8, float:2.35E-43)
            r7.a(r0, r6)
            gg4.y r7 = new gg4.y
            r7.<init>(r6)
            r6.setBackBtn(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(1803, this);
        c01.d9.e().q(1804, this);
        c01.d9.e().q(be1.r0.CTRL_INDEX, this);
        int i17 = this.f172428e;
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14035, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(this.f172427d));
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if ("invite_friends_by_message".equals(preference.f197780q)) {
            this.f172428e = 2;
            V6(2);
            return true;
        }
        if ("invite_friends_by_mail".equals(preference.f197780q)) {
            this.f172428e = 1;
            V6(1);
            return true;
        }
        if ("invite_friends_by_whatsapp".equals(preference.f197780q)) {
            this.f172428e = 3;
            V6(4);
            return true;
        }
        if ("invite_friends_by_facebook".equals(preference.f197780q)) {
            this.f172428e = 4;
            if (c01.z1.u()) {
                this.f172437q = true;
                V6(8);
            } else {
                db5.e1.n(getContext(), com.tencent.mm.R.string.iqx, com.tencent.mm.R.string.f490573yv, new gg4.z(this), new gg4.a0(this));
            }
            return true;
        }
        if (!"invite_friends_by_twitter".equals(preference.f197780q)) {
            return false;
        }
        this.f172428e = 5;
        if (this.f172435o.f300169b != null) {
            this.f172436p = true;
            V6(16);
        } else {
            db5.e1.n(getContext(), com.tencent.mm.R.string.j0_, com.tencent.mm.R.string.f490573yv, new gg4.c0(this), new gg4.d0(this));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0359  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r26, int r27, java.lang.String r28, com.tencent.mm.modelbase.m1 r29) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
