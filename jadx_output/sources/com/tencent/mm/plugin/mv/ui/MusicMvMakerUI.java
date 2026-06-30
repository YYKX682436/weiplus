package com.tencent.mm.plugin.mv.ui;

@db5.a(33)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvMakerUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "Lcom/tencent/mm/plugin/mv/ui/view/b0;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvMakerUI extends com.tencent.mm.plugin.mv.ui.BaseMusicMvUI implements com.tencent.mm.plugin.mv.ui.view.b0 {

    /* renamed from: u, reason: collision with root package name */
    public static int f150868u;

    /* renamed from: r, reason: collision with root package name */
    public int f150879r;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f150869e = jz5.h.b(new jm3.r(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f150870f = jz5.h.b(new jm3.p(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f150871g = jz5.h.b(new jm3.k(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f150872h = jz5.h.b(new jm3.t(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f150873i = jz5.h.b(new jm3.u(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f150874m = jz5.h.b(new jm3.o(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f150875n = jz5.h.b(new jm3.i(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f150876o = jz5.h.b(new jm3.j(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f150877p = jz5.h.b(new jm3.q(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f150878q = jz5.h.b(new jm3.l(this));

    /* renamed from: s, reason: collision with root package name */
    public final androidx.lifecycle.k0 f150880s = new jm3.s(this);

    /* renamed from: t, reason: collision with root package name */
    public final jm3.o0 f150881t = new jm3.o0(this);

    public static final void U6(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI) {
        musicMvMakerUI.getClass();
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.c3.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.lang.Integer num = (java.lang.Integer) ((com.tencent.mm.plugin.mv.ui.uic.c3) a17).O6().getValue();
        if (num != null && num.intValue() == 1) {
            com.tencent.mm.plugin.mv.ui.uic.v4 v4Var = (com.tencent.mm.plugin.mv.ui.uic.v4) zVar.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.v4.class);
            android.app.ProgressDialog progressDialog = v4Var.f151497q;
            if (progressDialog != null) {
                progressDialog.show();
            } else {
                android.app.Activity context = v4Var.getContext();
                android.app.Activity context2 = v4Var.getContext();
                com.tencent.mm.ui.widget.dialog.u3 c17 = com.tencent.mm.ui.widget.dialog.u3.c(context, context2 != null ? context2.getString(com.tencent.mm.R.string.f490604zq) : null, false, 0, null);
                v4Var.f151497q = c17;
                c17.show();
            }
            r45.qr4 qr4Var = new r45.qr4();
            androidx.appcompat.app.AppCompatActivity activity = v4Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a18 = zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.c3.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            com.tencent.mm.plugin.mv.ui.uic.c3 c3Var = (com.tencent.mm.plugin.mv.ui.uic.c3) a18;
            androidx.appcompat.app.AppCompatActivity activity2 = v4Var.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            androidx.lifecycle.c1 a19 = zVar.a(activity2).a(um3.b.class);
            kotlin.jvm.internal.o.f(a19, "get(...)");
            qr4Var.set(0, c3Var.f151075e);
            v4Var.f151491h.d(new com.tencent.mm.plugin.mv.ui.uic.l4(qr4Var, v4Var, (um3.b) a19, c3Var));
            return;
        }
        if (((com.tencent.mm.plugin.mv.ui.uic.h4) zVar.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.h4.class)).P6()) {
            com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = (com.tencent.mm.plugin.mv.ui.uic.h4) zVar.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.h4.class);
            h4Var.getClass();
            android.content.Intent intent = new android.content.Intent(h4Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI.class);
            r45.ss4 Q6 = h4Var.Q6(h4Var.f151172s);
            if (Q6 != null) {
                intent.putExtra("key_track_data", Q6.toByteArray());
            }
            intent.putExtra("key_seek_to_start", true);
            pm0.v.g(intent, h4Var.getActivity().getIntent(), "key_mv_from_scene", 0);
            androidx.appcompat.app.AppCompatActivity activity3 = h4Var.getActivity();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity3, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC", "onNextBtnClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity3.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity3, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC", "onNextBtnClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            java.util.ArrayList arrayList2 = h4Var.f151161e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((fm3.q) next).f264114o != null) {
                    arrayList3.add(next);
                }
            }
            fm3.g0.f264070a.a(0, arrayList3.size());
        }
    }

    public static final void V6(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI) {
        musicMvMakerUI.getClass();
        musicMvMakerUI.c7(((com.tencent.mm.plugin.mv.ui.uic.h4) pf5.z.f353948a.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.h4.class)).P6());
    }

    public final boolean W6(int i17, int i18, boolean z17) {
        if (z17 && i17 <= 2000) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
            u1Var.g(getResources().getString(com.tencent.mm.R.string.f492602h43));
            u1Var.n(getResources().getString(com.tencent.mm.R.string.f490454vi));
            u1Var.q(false);
            return false;
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.mv.ui.uic.c3.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        int i19 = this.f150879r + i18;
        this.f150879r = i19;
        r45.ss4 ss4Var = (r45.ss4) ((com.tencent.mm.plugin.mv.ui.uic.c3) a17).f151077g.getValue();
        if (i19 <= (ss4Var != null ? ss4Var.getInteger(6) : 0)) {
            return true;
        }
        this.f150879r -= i18;
        com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(this);
        u1Var2.g(getResources().getString(com.tencent.mm.R.string.h4g));
        u1Var2.n(getResources().getString(com.tencent.mm.R.string.f490454vi));
        u1Var2.q(false);
        return false;
    }

    public final android.view.View X6() {
        return (android.view.View) ((jz5.n) this.f150875n).getValue();
    }

    public final com.tencent.mm.ui.widget.MMRoundCornerImageView Y6() {
        return (com.tencent.mm.ui.widget.MMRoundCornerImageView) ((jz5.n) this.f150876o).getValue();
    }

    public final com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView Z6() {
        return (com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView) ((jz5.n) this.f150874m).getValue();
    }

    public final void a7(fm3.w wVar, yz5.a aVar) {
        if (wVar == null) {
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        android.view.View X6 = X6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(X6, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI", "makeMediaThumbTransition", "(Lcom/tencent/mm/plugin/mv/model/MusicMvAnimationInfo;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        X6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(X6, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI", "makeMediaThumbTransition", "(Lcom/tencent/mm/plugin/mv/model/MusicMvAnimationInfo;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.MMRoundCornerImageView Y6 = Y6();
        kotlin.jvm.internal.o.f(Y6, "<get-albumFakeThumb>(...)");
        wVar.a(Y6);
        Y6().setRadius(0);
        jz5.g gVar = this.f150878q;
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).getLocationInWindow(r1);
        int i17 = r1[0];
        int width = ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).getWidth();
        android.util.Size size = wVar.f264160c;
        int[] iArr = {i17 + ((width - size.getWidth()) / 2), iArr[1] + ((((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).getHeight() - size.getHeight()) / 2)};
        com.tencent.mm.plugin.music.ui.transition.GravityArcMotion gravityArcMotion = new com.tencent.mm.plugin.music.ui.transition.GravityArcMotion();
        android.graphics.Point point = wVar.f264159b;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(Y6(), "x", "y", gravityArcMotion.getPath(point.x, point.y, iArr[0], iArr[1]));
        ofFloat.setInterpolator(new y3.b());
        ofFloat.setDuration(400L);
        ofFloat.addListener(new jm3.n(this, aVar));
        ofFloat.start();
    }

    public void b7(int i17) {
        int i18;
        boolean z17;
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.mv.ui.uic.c3.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.lang.Integer num = (java.lang.Integer) ((com.tencent.mm.plugin.mv.ui.uic.c3) a17).O6().getValue();
        if (num != null && num.intValue() == 0) {
            i18 = i17;
            z17 = true;
        } else {
            i18 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = (com.tencent.mm.plugin.mv.ui.uic.h4) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.mv.ui.uic.h4.class);
            h4Var.getClass();
            kl3.t.g().a().pause();
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "takePhoto, minDuration:" + i17 + ", maxDuration:" + i18);
            android.content.Intent intent = new android.content.Intent(h4Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvRouterUI.class);
            intent.putExtra("KEY_MUSIC_ROUTER", 1);
            intent.putExtra("KEY_IS_FIX_CLIP_MODE", z17);
            intent.putExtra("KEY_MIN_RECORD_DURATION", i17);
            intent.putExtra("KEY_MAX_RECORD_DURATION", i18);
            h4Var.getActivity().startActivityForResult(intent, 1024);
            return;
        }
        com.tencent.mm.plugin.mv.ui.uic.v4 v4Var = (com.tencent.mm.plugin.mv.ui.uic.v4) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.mv.ui.uic.v4.class);
        v4Var.getClass();
        kl3.t.g().a().pause();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFlexEditUIC", "takePhoto, minDuration:" + i17 + ", maxDuration:" + i18);
        android.content.Intent intent2 = new android.content.Intent(v4Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvRouterUI.class);
        intent2.putExtra("KEY_MUSIC_ROUTER", 1);
        intent2.putExtra("KEY_IS_FIX_CLIP_MODE", z17);
        intent2.putExtra("KEY_MIN_RECORD_DURATION", i17);
        intent2.putExtra("KEY_MAX_RECORD_DURATION", i18);
        v4Var.getActivity().startActivityForResult(intent2, 1025);
    }

    public final void c7(boolean z17) {
        jz5.g gVar = this.f150873i;
        jz5.g gVar2 = this.f150872h;
        if (z17) {
            android.view.View view = (android.view.View) ((jz5.n) gVar2).getValue();
            if (view != null) {
                view.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.arv));
            }
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar).getValue()).setIconColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an));
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) gVar2).getValue();
        if (view2 != null) {
            view2.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.aru));
        }
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar).getValue()).setIconColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_1));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489327c56;
    }

    @Override // com.tencent.mm.plugin.mv.ui.BaseMusicMvUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.mv.ui.uic.h4.class, com.tencent.mm.plugin.mv.ui.uic.v4.class, com.tencent.mm.plugin.mv.ui.uic.z5.class, com.tencent.mm.plugin.mv.ui.uic.c3.class, com.tencent.mm.plugin.mv.ui.uic.x6.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionDenied(java.lang.String str) {
        ((com.tencent.mm.plugin.mv.ui.uic.v4) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.mv.ui.uic.v4.class)).onBackPressed();
    }

    @Override // com.tencent.mm.plugin.mv.ui.BaseMusicMvUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
        hideActionbarLine();
        i65.a.B(this);
        f150868u = com.tencent.mm.ui.bl.b(this).y;
        android.view.View view = (android.view.View) ((jz5.n) this.f150871g).getValue();
        if (view != null) {
            view.setOnClickListener(new jm3.w(this));
        }
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(this).a(um3.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        um3.b bVar = (um3.b) a17;
        androidx.lifecycle.c1 a18 = zVar.a(this).a(com.tencent.mm.plugin.mv.ui.uic.c3.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.c3 c3Var = (com.tencent.mm.plugin.mv.ui.uic.c3) a18;
        androidx.lifecycle.c1 a19 = zVar.a(this).a(com.tencent.mm.plugin.mv.ui.uic.v4.class);
        kotlin.jvm.internal.o.f(a19, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.v4 v4Var = (com.tencent.mm.plugin.mv.ui.uic.v4) a19;
        androidx.lifecycle.c1 a27 = zVar.a(this).a(com.tencent.mm.plugin.mv.ui.uic.h4.class);
        kotlin.jvm.internal.o.f(a27, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = (com.tencent.mm.plugin.mv.ui.uic.h4) a27;
        android.view.View view2 = (android.view.View) ((jz5.n) this.f150872h).getValue();
        if (view2 != null) {
            view2.setOnClickListener(new jm3.x(this));
        }
        ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).getClass();
        int i17 = ll3.j2.f319185a;
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.k1x)).setVisibility(0);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g8f);
        android.widget.TextView textView2 = null;
        if (textView != null) {
            textView.setOnClickListener(new jm3.n0(c3Var));
        } else {
            textView = null;
        }
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g7f);
        if (textView3 != null) {
            textView3.setOnClickListener(new jm3.m0(c3Var));
            textView2 = textView3;
        }
        c3Var.O6().observe(this, new jm3.y(textView2, this, textView));
        c3Var.O6().observe(this, this.f150880s);
        c3Var.f151077g.observe(this, new jm3.d0(this, v4Var, bVar, h4Var, c3Var));
        ((com.tencent.mm.plugin.mv.ui.uic.z5) zVar.a(this).a(com.tencent.mm.plugin.mv.ui.uic.z5.class)).H = new jm3.j0(this, c3Var);
        fm3.j0 j0Var = fm3.j0.f264078a;
        r45.hf2 songInfo = c3Var.f151075e;
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this, 7, r45.bt4.class);
        if (bt4Var != null && 10 == bt4Var.f371036d) {
            j0Var.i(this, songInfo, new fm3.u(), 1, 1, "");
        }
        v4Var.f151488e.observe(this, new jm3.k0(this));
        v4Var.f151490g.observe(this, new jm3.l0(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView Z6 = Z6();
        if (Z6 != null) {
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            t23.p0.k().f(Z6);
            com.google.android.material.tabs.TabLayout tabLayout = Z6.f151619d;
            if (tabLayout != null) {
                tabLayout.K.remove(Z6.f151618J);
            }
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment = Z6.f151629p;
            if (musicMvTabSearchFragment != null) {
                gm0.j1.d().q(3820, musicMvTabSearchFragment);
            }
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment musicMvTabMyFavFragment = Z6.f151642y;
            if (musicMvTabMyFavFragment != null) {
                gm0.j1.d().q(3966, musicMvTabMyFavFragment);
            }
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment musicMvTabMachineFragment = Z6.f151638w;
            if (musicMvTabMachineFragment != null) {
                gm0.j1.d().q(6860, musicMvTabMachineFragment);
            }
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment musicMvTabMyLikeFragment = Z6.f151645z;
            if (musicMvTabMyLikeFragment != null) {
                gm0.j1.d().q(3965, musicMvTabMyLikeFragment);
            }
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            t23.p0.b();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView Z6 = Z6();
        if (Z6 != null) {
            Z6.P = true;
        }
        ll3.z0.a(ll3.z0.f319264a, false, 1, null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView Z6 = Z6();
        if (Z6 != null) {
            Z6.P = false;
        }
        ((ja0.m0) ((ka0.q0) i95.n0.c(ka0.q0.class))).getClass();
        getWindow().getDecorView().setSystemUiVisibility(5894);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
    }
}
