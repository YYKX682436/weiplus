package pg2;

/* loaded from: classes3.dex */
public final class i0 extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f354120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nn0.c f354121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f354122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f354123h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c50.e1 f354124i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f354125m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f354126n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f354127o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354128p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f354129q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yz5.q f354130r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f354131s;

    public i0(boolean z17, nn0.c cVar, boolean z18, pg2.j0 j0Var, c50.e1 e1Var, boolean z19, android.graphics.Rect rect, kotlin.jvm.internal.h0 h0Var, android.view.View view, boolean z27, yz5.q qVar, long j17) {
        this.f354120e = z17;
        this.f354121f = cVar;
        this.f354122g = z18;
        this.f354123h = j0Var;
        this.f354124i = e1Var;
        this.f354125m = z19;
        this.f354126n = rect;
        this.f354127o = h0Var;
        this.f354128p = view;
        this.f354129q = z27;
        this.f354130r = qVar;
        this.f354131s = j17;
    }

    @Override // ug5.h
    public void a(android.animation.Animator animation, ug5.v performer) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.a(animation, performer);
        ug5.g gVar = performer.f427658a;
        java.lang.Object obj = gVar.f427595i.get("key_first_frame_render");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPerformAnimationEnd firstFrameRender=");
        sb6.append(booleanValue);
        sb6.append(" isAudioMode=");
        boolean z17 = this.f354125m;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", sb6.toString());
        java.util.HashMap hashMap = gVar.f427595i;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        hashMap.put("key_enter_anim_complete", bool2);
        if (!this.f354129q && !z17) {
            pg2.j0.aj(this.f354123h, performer, this.f354121f, this.f354124i, null, 8, null);
        }
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.e();
        }
        nn0.c cVar = this.f354121f;
        nn0.c cVar2 = cVar instanceof nn0.c ? cVar : null;
        if (cVar2 != null) {
            cVar2.Y(new android.graphics.RectF());
        }
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f354131s));
        this.f354130r.invoke(bool2, performer, intent);
    }

    @Override // ug5.h
    public void b(ug5.v performer) {
        kotlin.jvm.internal.o.g(performer, "performer");
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f354131s));
        this.f354130r.invoke(java.lang.Boolean.FALSE, performer, intent);
    }

    @Override // ug5.h
    public void c(android.animation.Animator animation, ug5.v performer) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.c(animation, performer);
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            c50.e1 e1Var = this.f354124i;
            eVar.f(e1Var != null ? e1Var.f38598b : 240L);
        }
        android.view.View view = this.f354128p;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformAnimationStart", "(Landroid/animation/Animator;Lcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformAnimationStart", "(Landroid/animation/Animator;Lcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformAnimationStart", "(Landroid/animation/Animator;Lcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformAnimationStart", "(Landroid/animation/Animator;Lcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // ug5.h
    public void d(float f17, android.graphics.Rect clipRect, android.graphics.Rect canvasRect, ug5.v performer) {
        kotlin.jvm.internal.o.g(clipRect, "clipRect");
        kotlin.jvm.internal.o.g(canvasRect, "canvasRect");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.d(f17, clipRect, canvasRect, performer);
        if (this.f354120e) {
            android.graphics.Rect rect = this.f354126n;
            int i17 = rect.top - ((int) ((r0 - r0) * f17));
            int i18 = rect.left - ((int) ((r1 - r1) * f17));
            float width = rect.width();
            int width2 = rect.width();
            kotlin.jvm.internal.h0 h0Var = this.f354127o;
            com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "onPerformClipRectUpdate animatedFraction: " + f17 + " currentRect: " + new android.graphics.Rect(i18, i17, ((int) (width - ((width2 - ((android.graphics.Rect) h0Var.f310123d).width()) * f17))) + i18, ((int) (rect.height() - ((rect.height() - ((android.graphics.Rect) h0Var.f310123d).height()) * f17))) + i17) + " clipRect: " + clipRect + " canvasRect: " + canvasRect);
        } else {
            nn0.c cVar = this.f354121f;
            if (!(cVar instanceof nn0.c)) {
                cVar = null;
            }
            if (cVar != null) {
                cVar.Y(ug5.x.g(clipRect, canvasRect));
            }
        }
        android.view.View view = this.f354128p;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformClipRectUpdate", "(FLandroid/graphics/Rect;Landroid/graphics/Rect;Lcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformClipRectUpdate", "(FLandroid/graphics/Rect;Landroid/graphics/Rect;Lcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // ug5.h
    public void e(android.content.Context context, boolean z17, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.e(context, z17, performer);
        pg2.j0.Ai(this.f354123h, performer, z17);
        android.view.View view = this.f354128p;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformCompleted", "(Landroid/content/Context;ZLcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformCompleted", "(Landroid/content/Context;ZLcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ug5.h
    public void f() {
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // ug5.h
    public void g(android.content.Context context, ug5.v performer) {
        gp1.v Bi;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.g(context, performer);
        boolean z17 = this.f354120e;
        ug5.g gVar = performer.f427658a;
        if (z17) {
            gVar.f427595i.put("key_first_frame_render", java.lang.Boolean.TRUE);
        } else {
            ez2.e eVar = ez2.g.f257902a;
            if (eVar != null) {
                eVar.d();
            }
            nn0.c cVar = this.f354121f;
            performer.f("key_player_view", new java.lang.ref.WeakReference(cVar.o()));
            java.util.HashMap hashMap = gVar.f427595i;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            hashMap.put("key_enter_anim_from_opt", bool);
            if (this.f354122g) {
                gVar.f427595i.put("key_first_frame_render", bool);
                pg2.j0.aj(this.f354123h, performer, this.f354121f, this.f354124i, null, 8, null);
            } else if (!this.f354125m) {
                pg2.j0 j0Var = this.f354123h;
                j0Var.getClass();
                cVar.J(new pg2.i(performer, j0Var));
            }
        }
        java.lang.Object d17 = performer.d("key_ball_info");
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = d17 instanceof com.tencent.mm.plugin.ball.model.BallInfo ? (com.tencent.mm.plugin.ball.model.BallInfo) d17 : null;
        if (ballInfo == null || (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) == null) {
            return;
        }
        Bi.k(ballInfo, 0.001f);
    }
}
