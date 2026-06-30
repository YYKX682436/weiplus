package n34;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f334635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f334636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n34.p f334637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f334638g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f334639h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.ui.widget.dialog.u3 u3Var, int i17, n34.p pVar, int i18, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334635d = u3Var;
        this.f334636e = i17;
        this.f334637f = pVar;
        this.f334638g = i18;
        this.f334639h = snsInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        n34.j jVar = new n34.j(this.f334635d, this.f334636e, this.f334637f, this.f334638g, this.f334639h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        n34.j jVar = (n34.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f334635d.dismiss();
        if (this.f334636e == 1) {
            n34.p pVar = this.f334637f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setStarFeed$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            pVar.f334706g = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setStarFeed$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            db5.t7.e(this.f334637f.c(), this.f334637f.c().getString(com.tencent.mm.R.string.jf7), com.tencent.mm.R.raw.sns_icons_filled_top);
            ta4.g1.f416747a.a(1, this.f334638g, this.f334639h);
            n34.p pVar2 = this.f334637f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doScaleVisibleAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            pVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScaleVisibleAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            android.view.View d17 = pVar2.d();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/sns/CommentDetailStarHelper", "doScaleVisibleAni", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(d17, "com/tencent/mm/plugin/sns/CommentDetailStarHelper", "doScaleVisibleAni", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(pVar2.d(), "scaleX", 0.0f, 1.0f);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(pVar2.d(), "scaleY", 0.0f, 1.0f);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.setDuration(200L);
            animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScaleVisibleAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doScaleVisibleAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            n34.p pVar3 = this.f334637f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getClickCallback$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            n34.o2 o2Var = pVar3.f334704e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getClickCallback$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            if (o2Var != null) {
                ((com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$d) o2Var).a();
            }
        } else {
            n34.p pVar4 = this.f334637f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setStarFeed$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            pVar4.f334706g = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setStarFeed$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            db5.t7.e(this.f334637f.c(), this.f334637f.c().getString(com.tencent.mm.R.string.jey), com.tencent.mm.R.raw.sns_icons_filled_top_off);
            ta4.g1.f416747a.a(2, this.f334638g, this.f334639h);
            n34.p pVar5 = this.f334637f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doScaleGoneAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            pVar5.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScaleGoneAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(pVar5.d(), "scaleX", 1.0f, 0.0f);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(pVar5.d(), "scaleY", 1.0f, 0.0f);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.setDuration(200L);
            animatorSet2.setInterpolator(new android.view.animation.LinearInterpolator());
            animatorSet2.addListener(new n34.m(pVar5));
            animatorSet2.play(ofFloat3).with(ofFloat4);
            animatorSet2.start();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScaleGoneAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doScaleGoneAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        }
        if (this.f334638g == 1) {
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).i7(this.f334639h.field_snsId, o75.b.f343583d);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        return f0Var;
    }
}
