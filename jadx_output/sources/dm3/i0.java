package dm3;

/* loaded from: classes11.dex */
public final class i0 extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public pj4.j0 f241702c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f241703d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.wd6 f241704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dm3.j0 f241705f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, dm3.j0 j0Var) {
        super(str);
        this.f241705f = j0Var;
        this.f241704e = new r45.wd6();
    }

    @Override // bi4.o0
    public boolean b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return false;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        bw5.v70 d17;
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = bundle != null ? bundle.getInt("STATUS_EXPOSED_SCENE") : 0;
        dm3.j jVar = this.f241705f.f241706d;
        java.lang.String str = this.f241703d;
        pj4.j0 j0Var = this.f241702c;
        jVar.getClass();
        if (!kotlin.jvm.internal.o.b(j0Var != null ? j0Var.f355139d : null, "15")) {
            return false;
        }
        if (iq.b.C(context)) {
            com.tencent.mars.xlog.Log.e("MusicPlayerJumper", "doJumpTing checkVoiceUsingAndShowToast true");
        } else {
            r45.wd6 wd6Var = new r45.wd6();
            try {
                wd6Var.parseFrom(android.util.Base64.decode(j0Var.f355142g, 2));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MusicPlayerJumper", "parseFrom StatusFooterJumpListen exp: %s", e17.getMessage());
            }
            java.lang.String str2 = wd6Var.f389078d;
            if (!(str2 == null || str2.length() == 0)) {
                ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Vi(false);
                qk.k6 k6Var = (qk.k6) i95.n0.c(qk.k6.class);
                kotlin.jvm.internal.o.d(k6Var);
                bw5.lp0 i66 = qk.k6.i6(k6Var, null, null, null, null, 15, null);
                java.lang.String listenId = (i66 == null || (d17 = i66.d()) == null) ? null : d17.getListenId();
                if (listenId == null) {
                    listenId = "";
                }
                boolean b17 = kotlin.jvm.internal.o.b(listenId, str2);
                bw5.x2 x2Var = bw5.x2.BizAudioEnterScene_StatusListen;
                if (b17 && qk.k6.vd(k6Var, null, null, null, null, 15, null)) {
                    com.tencent.mars.xlog.Log.i("MusicPlayerJumper", "Ting-Trace state same listenId paused, resume");
                    qk.k6.Hb(k6Var, null, null, null, null, 15, null);
                } else if (b17 && qk.k6.Yc(k6Var, null, null, null, null, 15, null)) {
                    com.tencent.mars.xlog.Log.i("MusicPlayerJumper", "Ting-Trace state same listenId available, do nothing");
                } else {
                    kotlin.jvm.internal.o.d(str2);
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                    il4.e eVar = new il4.e(null, 0, 2001, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, x2Var, false, 25165819, null);
                    if (str != null) {
                        eVar.f292122s.f292132d.put("textstatus", str);
                    }
                    rk4.a aVar = (rk4.a) k6Var;
                    java.util.ArrayList arrayList = aVar.f396526d;
                    if (arrayList == null) {
                        kotlin.jvm.internal.o.o("mImplList");
                        throw null;
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            qk.j6 j6Var = (qk.j6) it.next();
                            if (j6Var.m(null, str2, null, null)) {
                                j6Var.z(str2, eVar);
                                break;
                            }
                        } else {
                            qk.j6 j6Var2 = aVar.f396527e;
                            if (j6Var2 == null) {
                                kotlin.jvm.internal.o.o("mFallbackImpl");
                                throw null;
                            }
                            ((rk4.h) j6Var2).z(str2, eVar);
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MusicPlayerJumper", "Ting-Trace state jump do play");
                }
                android.os.Bundle bundle2 = new android.os.Bundle();
                if (i17 == 8 || i17 == 9) {
                    bundle2.putBoolean("key_not_add_floatball_exit", true);
                }
                com.tencent.mars.xlog.Log.i("MusicPlayerJumper", "Ting-Trace state jump goToTingPlayerActivity");
                qk.k6.I1(k6Var, context, false, null, new il4.e(null, 0, 2001, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, x2Var, false, 25165819, null), null, bundle2, bw5.ar0.TingScene_TextState, null, null, null, str2, 918, null);
                return true;
            }
            com.tencent.mars.xlog.Log.e("MusicPlayerJumper", "fail jump ting, listenId is null");
        }
        return true;
    }

    @Override // bi4.o0
    public /* bridge */ /* synthetic */ java.lang.CharSequence f() {
        return "";
    }

    @Override // bi4.o0
    public java.lang.String h() {
        return "";
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
        this.f241702c = j0Var;
        this.f241703d = str;
        if (kotlin.jvm.internal.o.b(j0Var != null ? j0Var.f355139d : null, "15")) {
            try {
                this.f241704e.parseFrom(android.util.Base64.decode(j0Var.f355142g, 2));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingStatusService", "getOftenRead exp: %s", e17.getMessage());
            }
        }
    }

    @Override // bi4.o0
    public void n() {
    }

    @Override // bi4.o0
    public boolean o(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        return false;
    }

    @Override // bi4.o0
    public boolean q(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        dm3.j0 j0Var = this.f241705f;
        if (!j0Var.f241707e) {
            return true;
        }
        j0Var.f241707e = false;
        java.lang.String str = this.f241704e.f389079e;
        if (str == null || r26.n0.N(str)) {
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
        imageView.post(new dm3.h0(str, imageView));
        return true;
    }
}
