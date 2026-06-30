package uj3;

/* loaded from: classes14.dex */
public final class b0 implements com.tencent.mm.plugin.multitalk.model.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f428216d;

    /* renamed from: e, reason: collision with root package name */
    public final uj3.b f428217e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f428218f;

    /* renamed from: g, reason: collision with root package name */
    public uj3.z f428219g;

    /* renamed from: h, reason: collision with root package name */
    public final uj3.a0 f428220h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f428221i;

    /* renamed from: m, reason: collision with root package name */
    public int f428222m;

    public b0(android.content.Context context, uj3.b statusManager) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusManager, "statusManager");
        this.f428216d = context;
        this.f428217e = statusManager;
        this.f428220h = new uj3.a0(this, statusManager);
        this.f428222m = -1;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.a0
    public void a(java.lang.String userName, android.graphics.Bitmap bm6, int i17, int i18) {
        uj3.z zVar;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(bm6, "bm");
        uj3.z zVar2 = this.f428219g;
        if ((zVar2 != null ? zVar2.f428400g : null) != null) {
            if (kotlin.jvm.internal.o.b(userName, zVar2 != null ? zVar2.f428400g : null)) {
                if ((com.tencent.mm.plugin.multitalk.model.e3.Ri().o().c(userName) == 100 || com.tencent.mm.plugin.multitalk.model.e3.Ri().o().c(userName) == 104) && (zVar = this.f428219g) != null) {
                    synchronized (zVar) {
                        if (zVar.f428396c == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "drawVideo view is null");
                            return;
                        }
                        if (zVar.f428407n) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "renderVideoBitmap img false cause isDoingAnimationChange");
                            return;
                        }
                        if (zVar.c(userName, bm6, i17, i18, 1)) {
                            return;
                        }
                        android.widget.ImageView imageView = zVar.f428397d;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = zVar.f428396c;
                        if (voIPRenderTextureView != null) {
                            voIPRenderTextureView.setVisibility(0);
                        }
                        zVar.e(bm6, i17, i18, 1);
                        ((ku5.t0) ku5.t0.f312615d).B(new uj3.w(zVar, userName));
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.a0
    public void b() {
    }

    public final void c(boolean z17) {
        uj3.z zVar;
        java.lang.Integer valueOf;
        uj3.z zVar2;
        java.lang.Integer valueOf2;
        if (!z17) {
            uj3.z zVar3 = this.f428219g;
            if (((zVar3 == null || (valueOf = java.lang.Integer.valueOf(zVar3.f428394a.getVisibility())) == null || valueOf.intValue() != 4) ? false : true) || (zVar = this.f428219g) == null) {
                return;
            }
            zVar.f428398e = 0;
            android.widget.RelativeLayout relativeLayout = zVar.f428394a;
            relativeLayout.setAlpha(1.0f);
            relativeLayout.setVisibility(0);
            relativeLayout.clearAnimation();
            relativeLayout.animate().alpha(0.0f).setDuration(300L).setListener(new uj3.x(zVar)).start();
            return;
        }
        uj3.z zVar4 = this.f428219g;
        if (((zVar4 == null || (valueOf2 = java.lang.Integer.valueOf(zVar4.f428394a.getVisibility())) == null || valueOf2.intValue() != 0) ? false : true) || (zVar2 = this.f428219g) == null) {
            return;
        }
        zVar2.f();
        zVar2.a(zVar2.f428395b.e());
        android.widget.RelativeLayout relativeLayout2 = zVar2.f428394a;
        relativeLayout2.setAlpha(0.0f);
        relativeLayout2.setVisibility(0);
        relativeLayout2.clearAnimation();
        relativeLayout2.animate().alpha(1.0f).setDuration(300L).setListener(new uj3.y(zVar2)).start();
    }

    public final java.lang.String d() {
        java.lang.String str;
        uj3.z zVar = this.f428219g;
        return (zVar == null || (str = zVar.f428400g) == null) ? "" : str;
    }

    public final void e(android.view.ViewGroup rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f428221i = rootView;
        android.view.View inflate = android.view.View.inflate(this.f428216d, com.tencent.mm.R.layout.c3j, rootView);
        this.f428218f = inflate;
        android.widget.RelativeLayout relativeLayout = inflate != null ? (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.a9w) : null;
        kotlin.jvm.internal.o.e(relativeLayout, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.f428219g = new uj3.z(relativeLayout, this.f428217e);
    }

    public final boolean f(java.util.ArrayList speakers) {
        java.lang.String d17;
        kotlin.jvm.internal.o.g(speakers, "speakers");
        uj3.a0 a0Var = this.f428220h;
        a0Var.getClass();
        uj3.b0 b0Var = a0Var.f428210d;
        uj3.z zVar = b0Var.f428219g;
        java.lang.Long l17 = null;
        java.lang.Long l18 = zVar != null ? zVar.f428402i : null;
        if (l18 == null) {
            d17 = (java.lang.String) speakers.get(e06.p.j(e06.p.m(0, speakers.size()), c06.e.f37716d));
        } else {
            long longValue = l18.longValue();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            d17 = android.os.SystemClock.elapsedRealtime() - longValue >= 3000 ? speakers.contains(b0Var.d()) ? b0Var.d() : (java.lang.String) speakers.get(e06.p.j(e06.p.m(0, speakers.size()), c06.e.f37716d)) : b0Var.d();
        }
        uj3.z zVar2 = b0Var.f428219g;
        if (zVar2 != null) {
            if (d17 != null) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                l17 = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
            }
            zVar2.f428402i = l17;
            zVar2.f428400g = d17;
        }
        b0Var.c(true);
        return true;
    }

    public final void g() {
        uj3.a0 a0Var = this.f428220h;
        uj3.h1 h1Var = a0Var.f428212f;
        if (h1Var != null) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = h1Var.f428284b;
            if (b4Var != null) {
                b4Var.removeCallbacksAndMessages(null);
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = h1Var.f428284b;
            if (b4Var2 != null) {
                b4Var2.d();
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var3 = h1Var.f428284b;
            if (b4Var3 != null) {
                b4Var3.quitSafely();
            }
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ri().q().h(a0Var);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.a0
    /* renamed from: getAvatarIv */
    public android.widget.ImageView getF150341g() {
        return null;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.a0
    /* renamed from: getUsername */
    public java.lang.String getF150344m() {
        java.lang.String str;
        uj3.z zVar = this.f428219g;
        return (zVar == null || (str = zVar.f428400g) == null) ? "" : str;
    }

    public final void h(java.lang.String userName) {
        uj3.z zVar;
        kotlin.jvm.internal.o.g(userName, "userName");
        uj3.z zVar2 = this.f428219g;
        boolean z17 = false;
        if (zVar2 != null && zVar2.f428398e == 1) {
            z17 = true;
        }
        if ((z17 && com.tencent.mm.plugin.multitalk.model.e3.Ri().f150174q.contains(userName)) || (zVar = this.f428219g) == null) {
            return;
        }
        zVar.d(userName);
    }

    public final void i(boolean z17) {
        uj3.z zVar;
        java.lang.Integer valueOf;
        uj3.z zVar2 = this.f428219g;
        if (((zVar2 == null || (valueOf = java.lang.Integer.valueOf(zVar2.f428394a.getVisibility())) == null || valueOf.intValue() != 0) ? false : true) && (!r26.n0.N(d())) && (zVar = this.f428219g) != null) {
            zVar.a(zVar.f428395b.e());
            android.view.View view = zVar.f428405l;
            if (view == null) {
                return;
            }
            int i17 = z17 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectAvatarCellLayout", "doShowOrHideSpeakerVoice", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectAvatarCellLayout", "doShowOrHideSpeakerVoice", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
