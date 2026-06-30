package dm3;

/* loaded from: classes10.dex */
public final class u extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public r45.hf2 f241739c;

    /* renamed from: d, reason: collision with root package name */
    public r45.xs4 f241740d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f241741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dm3.v f241742f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str, dm3.v vVar) {
        super(str);
        this.f241742f = vVar;
    }

    @Override // bi4.o0
    public boolean b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String str = this.f241741e;
        if (str == null || r26.n0.N(str)) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        boolean b17 = kotlin.jvm.internal.o.b(this.f241741e, xy2.c.e(context));
        intent.putExtra("finder_username", this.f241741e);
        ya2.e1 e1Var = ya2.e1.f460472a;
        if (b17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.x(context, intent, 20, 2);
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 32, intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.w(context, intent);
        }
        return true;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(context, "context");
        boolean z17 = false;
        int i17 = bundle != null ? bundle.getInt("STATUS_EXPOSED_SCENE") : 0;
        dm3.j jVar = this.f241742f.f241744d;
        pj4.j0 j0Var = this.f21074b;
        jVar.getClass();
        if (j0Var != null && kotlin.jvm.internal.o.b(j0Var.f355139d, "1")) {
            if (iq.b.C(context)) {
                return true;
            }
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(j0Var.f355141f, "MusicVideoStatusOpenParams", null);
            if (d17 != null) {
                try {
                    r45.hf2 hf2Var = new r45.hf2();
                    dm3.k.a(hf2Var, ".MusicVideoStatusOpenParams", d17);
                    r45.xs4 b17 = zy2.pc.b(".MusicVideoStatusOpenParams", d17);
                    hf2Var.getString(12);
                    b17.getString(6);
                    hf2Var.getString(13);
                    b17.getString(9);
                    qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
                    java.lang.String b18 = dm3.k.b(j0Var, hf2Var);
                    rk4.z8 z8Var = (rk4.z8) g9Var;
                    bw5.lp0 uj6 = z8Var.uj();
                    java.lang.String b19 = uj6 != null ? uj6.b() : null;
                    if (b19 == null) {
                        b19 = "";
                    }
                    boolean b27 = kotlin.jvm.internal.o.b(b19, b18);
                    bw5.lp0 b28 = com.tencent.mm.plugin.finder.storage.oa0.f127302a.b(hf2Var, b18, b17);
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_TextState;
                    il4.e eVar = new il4.e(null, 0, 2001, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, bw5.x2.BizAudioEnterScene_StatusListen, false, 25165819, null);
                    if (b27 && z8Var.ij()) {
                        com.tencent.mars.xlog.Log.i("MusicPlayerJumper", "Ting-Trace state same ClientId paused, resume");
                        z8Var.wj();
                    } else if (b27 && z8Var.fj()) {
                        com.tencent.mars.xlog.Log.i("MusicPlayerJumper", "Ting-Trace state same ClientId available, do nothing");
                    } else {
                        java.lang.String b29 = b28.b();
                        kotlin.jvm.internal.o.f(b29, "getClientId(...)");
                        z8Var.qj(b29, b28, eVar);
                        com.tencent.mars.xlog.Log.i("MusicPlayerJumper", "Ting-Trace state jump do play");
                    }
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    if (i17 == 8 || i17 == 9) {
                        bundle2.putBoolean("key_not_add_floatball_exit", true);
                    }
                    qk.f9.b(z8Var.aj(), context, false, b28, eVar, null, bundle2, ar0Var, null, 146, null);
                    return true;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MusicPlayerJumper", "process StatusJumpInfo fail:" + e17.getLocalizedMessage());
                }
            }
            z17 = true;
        }
        return z17;
    }

    @Override // bi4.o0
    public java.lang.CharSequence f() {
        r45.xs4 xs4Var = this.f241740d;
        java.lang.String string = xs4Var != null ? xs4Var.getString(3) : null;
        return string == null ? "" : string;
    }

    @Override // bi4.o0
    public java.lang.String h() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.hf2 hf2Var = this.f241739c;
        if (hf2Var == null || (str = hf2Var.getString(5)) == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append('|');
        r45.xs4 xs4Var = this.f241740d;
        sb6.append(xs4Var != null ? xs4Var.getString(0) : null);
        return sb6.toString();
    }

    @Override // bi4.o0
    public /* bridge */ /* synthetic */ java.lang.CharSequence i() {
        return "";
    }

    @Override // bi4.o0
    public boolean j() {
        return true;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        java.lang.String str2;
        super.m(str, j0Var);
        this.f241741e = null;
        if (j0Var != null) {
            try {
                str2 = j0Var.f355141f;
            } catch (java.lang.Throwable unused) {
                return;
            }
        } else {
            str2 = null;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "MusicVideoStatusOpenParams", null);
        if (d17 != null) {
            r45.hf2 hf2Var = new r45.hf2();
            dm3.k.a(hf2Var, ".MusicVideoStatusOpenParams", d17);
            this.f241739c = hf2Var;
            this.f241740d = zy2.pc.b(".MusicVideoStatusOpenParams", d17);
        }
    }

    @Override // bi4.o0
    public void n() {
    }

    @Override // bi4.o0
    public boolean o(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        r45.xs4 xs4Var = this.f241740d;
        boolean z17 = false;
        if (xs4Var != null) {
            long Z = pm0.v.Z(xs4Var.getString(0));
            z17 = true;
            java.lang.String string = xs4Var.getString(1);
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(Z);
            if (h17 != null) {
                com.tencent.mm.protocal.protobuf.FinderContact contact = h17.getFeedObject().getContact();
                java.lang.String headUrl = contact != null ? contact.getHeadUrl() : null;
                this.f241741e = h17.getUserName();
                r(container, headUrl);
            } else {
                android.content.Context context = container.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                new db2.g4(Z, string, 43, 1, xy2.c.e(context), true, null, null, 0L, null, false, false, null, null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null).l().q(new dm3.q(this, container));
            }
        }
        return z17;
    }

    @Override // bi4.o0
    public boolean q(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        dm3.v vVar = this.f241742f;
        if (!vVar.f241745e) {
            return true;
        }
        vVar.f241745e = false;
        r45.hf2 hf2Var = this.f241739c;
        java.lang.String string = hf2Var != null ? hf2Var.getString(8) : null;
        if (string == null || r26.n0.N(string)) {
            return false;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag("Finder.TextStatusProvider");
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
            imageView.setTag("Finder.TextStatusProvider");
            container.removeAllViews();
            container.addView(imageView);
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.post(new dm3.t(string, imageView));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(android.widget.FrameLayout frameLayout, java.lang.String str) {
        android.widget.ImageView imageView = (android.widget.ImageView) frameLayout.findViewWithTag("Finder.TextStatusProvider");
        if (imageView == null) {
            imageView = new android.widget.ImageView(frameLayout.getContext());
        }
        frameLayout.removeAllViews();
        frameLayout.addView(imageView);
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.a().c(new mn2.n(str, null, 2, 0 == true ? 1 : 0), imageView, g1Var.h(mn2.f1.f329957h));
    }
}
