package com.tencent.mm.plugin.multitask.ui.bg;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\u0003¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d¨\u0006+"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/bg/DynamicBgContainer;", "Landroid/widget/FrameLayout;", "Lsk3/c;", "", "visibility", "Ljz5/f0;", "setGradientBgViewVisibility", "setVisibility", "", "d", "Z", "getReleased", "()Z", "setReleased", "(Z)V", "released", "Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;", "e", "Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;", "getDynamicBgSurfaceView", "()Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;", "setDynamicBgSurfaceView", "(Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;)V", "dynamicBgSurfaceView", "Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;", "value", "f", "Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;", "getGradientBgView", "()Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;", "setGradientBgView", "(Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;)V", "gradientBgView", "g", "getBottomGradientBgView", "bottomGradientBgView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class DynamicBgContainer extends android.widget.FrameLayout implements sk3.c {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f150530h;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean released;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBgSurfaceView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientBgView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView bottomGradientBgView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicBgContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void setIsInMultiWindowMode(boolean z17) {
        f150530h = z17;
    }

    public final synchronized void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "activeDynamicBg");
        if (this.released) {
            return;
        }
        new com.tencent.mm.autogen.events.PreloadToolsProcessEvent().e();
        setVisibility(0);
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientBgView = getGradientBgView();
        if (gradientBgView != null) {
            gradientBgView.setVisibility(0);
        }
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientBgView2 = getGradientBgView();
        if (gradientBgView2 != null) {
            gradientBgView2.setAlpha(1.0f);
        }
        if (((hh4.m) i95.n0.c(hh4.m.class)) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DynamicBgContainer.", "addDynamicBackgroundView service is null");
            return;
        }
        if (gh4.j0.b() && jh4.d.f299851b && !f150530h) {
            android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(...)");
            this.dynamicBgSurfaceView = new com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView(applicationContext, null);
            c();
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView = this.dynamicBgSurfaceView;
            com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer dynamicBgContainer = (com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer) (dynamicBackgroundGLSurfaceView != null ? dynamicBackgroundGLSurfaceView.getParent() : null);
            if (dynamicBgContainer != null && dynamicBgContainer.dynamicBgSurfaceView != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "removed");
                dynamicBgContainer.removeView(dynamicBgContainer.dynamicBgSurfaceView);
                dynamicBgContainer.dynamicBgSurfaceView = null;
            }
            addView(this.dynamicBgSurfaceView, layoutParams);
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView2 = this.dynamicBgSurfaceView;
            if (dynamicBackgroundGLSurfaceView2 != null) {
                com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientBgView3 = getGradientBgView();
                kotlin.jvm.internal.o.d(gradientBgView3);
                dynamicBackgroundGLSurfaceView2.setGradientBackgroundView(gradientBgView3);
            }
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView3 = this.dynamicBgSurfaceView;
            if (dynamicBackgroundGLSurfaceView3 != null) {
                dynamicBackgroundGLSurfaceView3.setShowGradientView(false);
            }
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView4 = this.dynamicBgSurfaceView;
            if (dynamicBackgroundGLSurfaceView4 != null) {
                dynamicBackgroundGLSurfaceView4.setVisibility(0);
            }
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView5 = this.dynamicBgSurfaceView;
            if (dynamicBackgroundGLSurfaceView5 != null) {
                dynamicBackgroundGLSurfaceView5.c();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "virbg: added");
        }
    }

    public final synchronized void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "stopDynamicBg keepGradientBgViewVisible:" + z17);
        if (z17) {
            com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientBgView = getGradientBgView();
            if (gradientBgView != null) {
                gradientBgView.setVisibility(0);
            }
        } else {
            setVisibility(8);
            com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientBgView2 = getGradientBgView();
            if (gradientBgView2 != null) {
                gradientBgView2.setVisibility(8);
            }
        }
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientBgView3 = getGradientBgView();
        if (gradientBgView3 != null) {
            gradientBgView3.setAlpha(1.0f);
        }
        com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView = this.dynamicBgSurfaceView;
        if (dynamicBackgroundGLSurfaceView != null) {
            if (((hh4.m) i95.n0.c(hh4.m.class)) != null) {
                jh4.e.a();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "stop dynamicBg");
            dynamicBackgroundGLSurfaceView.b();
            dynamicBackgroundGLSurfaceView.setVisibility(8);
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView2 = this.dynamicBgSurfaceView;
            if (dynamicBackgroundGLSurfaceView2 != null) {
                sk3.b bVar = new sk3.b();
                nq.s sVar = dynamicBackgroundGLSurfaceView2.f64882f;
                sVar.f338900d = new nq.h(dynamicBackgroundGLSurfaceView2, bVar);
                if (sVar.f338902f.isAlive()) {
                    sVar.f338903g.sendEmptyMessage(5);
                }
            }
            removeView(this.dynamicBgSurfaceView);
            this.dynamicBgSurfaceView = null;
        }
    }

    public final void c() {
        com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative dynamicBackgroundNative;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskViewBgParticleColorConfig", "getColorConfig " + com.tencent.mm.ui.bk.C());
        sk3.d dVar = com.tencent.mm.ui.bk.C() ? sk3.d.f408955f : sk3.d.f408956g;
        com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView = this.dynamicBgSurfaceView;
        if (dynamicBackgroundGLSurfaceView != null) {
            int i17 = dVar.f408957a;
            int i18 = dVar.f408958b;
            int i19 = dVar.f408959c;
            int i27 = dVar.f408960d;
            int i28 = dVar.f408961e;
            nq.f fVar = dynamicBackgroundGLSurfaceView.f64878t;
            if (fVar != null) {
                fVar.f338877k = new nq.a(i17, i18, i19, i27, i28);
                if (fVar.f338878l && (dynamicBackgroundNative = fVar.f338867a) != null) {
                    long j17 = dynamicBackgroundNative.f64876a;
                    if (j17 > 0) {
                        dynamicBackgroundNative.setColor(j17, i17, i18, i19, i27, i28);
                    }
                }
            }
        }
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientBgView = getGradientBgView();
        int i29 = dVar.f408961e;
        int i37 = dVar.f408960d;
        if (gradientBgView != null) {
            gradientBgView.post(new nq.y(gradientBgView, i37, i29));
        }
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientBgView2 = getGradientBgView();
        if (gradientBgView2 != null) {
            gradientBgView2.setUpdateMode(1);
        }
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView = this.bottomGradientBgView;
        gradientColorBackgroundView.getClass();
        gradientColorBackgroundView.post(new nq.y(gradientColorBackgroundView, i37, i29));
        gradientColorBackgroundView.setUpdateMode(1);
    }

    public final com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView getBottomGradientBgView() {
        return this.bottomGradientBgView;
    }

    public final com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView getDynamicBgSurfaceView() {
        return this.dynamicBgSurfaceView;
    }

    @Override // sk3.c
    public com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView getGradientBgView() {
        return this.gradientBgView;
    }

    public final boolean getReleased() {
        return this.released;
    }

    public final void setDynamicBgSurfaceView(com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView) {
        this.dynamicBgSurfaceView = dynamicBackgroundGLSurfaceView;
    }

    @Override // sk3.c
    public void setGradientBgView(com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView) {
        this.gradientBgView = gradientColorBackgroundView;
        c();
    }

    public final void setGradientBgViewVisibility(int i17) {
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientBgView = getGradientBgView();
        if (gradientBgView == null) {
            return;
        }
        gradientBgView.setVisibility(i17);
    }

    public final void setReleased(boolean z17) {
        this.released = z17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "virbg: set visibility " + i17);
    }

    public /* synthetic */ DynamicBgContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicBgContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView = new com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView(context2);
        this.bottomGradientBgView = gradientColorBackgroundView;
        addView(gradientColorBackgroundView, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        if (((hh4.m) i95.n0.c(hh4.m.class)) != null) {
            gh4.j0.a();
        }
    }
}
