package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes8.dex */
public final class m5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f116473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView f116474e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f116474e = finderLiveGameWelfareTaskProgressView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.view.m5(this.f116474e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.view.m5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f116473d;
        int i18 = 1;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskProgressView", "#render mainScope.launch");
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        do {
            com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView = this.f116474e;
            if (((finderLiveGameWelfareTaskProgressView.f115930o.isEmpty() ? 1 : 0) ^ i18) == 0) {
                com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskProgressView", "#render taskList is empty");
                finderLiveGameWelfareTaskProgressView.f115931p = null;
                finderLiveGameWelfareTaskProgressView.f115925g.removeAllViews();
                finderLiveGameWelfareTaskProgressView.f115932q = null;
                return jz5.f0.f302826a;
            }
            if (finderLiveGameWelfareTaskProgressView.f115931p == null) {
                finderLiveGameWelfareTaskProgressView.f115931p = (r45.s73) kz5.n0.Z(finderLiveGameWelfareTaskProgressView.f115930o);
            } else {
                int i19 = 0;
                int i27 = 0;
                for (java.lang.Object obj2 : finderLiveGameWelfareTaskProgressView.f115930o) {
                    int i28 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.s73 s73Var = (r45.s73) obj2;
                    r45.s73 s73Var2 = finderLiveGameWelfareTaskProgressView.f115931p;
                    if (kotlin.jvm.internal.o.b(s73Var2 != null ? s73Var2.getString(7) : null, s73Var.getString(7)) && i28 < ((java.util.ArrayList) finderLiveGameWelfareTaskProgressView.f115930o).size()) {
                        i27 = i28;
                    }
                    i19 = i28;
                }
                finderLiveGameWelfareTaskProgressView.f115931p = (r45.s73) kz5.n0.a0(finderLiveGameWelfareTaskProgressView.f115930o, i27);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#render currentShowTask task id: ");
            r45.s73 s73Var3 = finderLiveGameWelfareTaskProgressView.f115931p;
            sb6.append(s73Var3 != null ? s73Var3.getString(7) : null);
            com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskProgressView", sb6.toString());
            r45.s73 s73Var4 = finderLiveGameWelfareTaskProgressView.f115931p;
            if (s73Var4 != null) {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((ml2.r0) c17).Vj(ml2.d2.f327351e, s73Var4.getByteString(6), 0);
                com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView = finderLiveGameWelfareTaskProgressView.f115932q;
                android.widget.RelativeLayout relativeLayout = finderLiveGameWelfareTaskProgressView.f115925g;
                if (finderLiveGameWelfareTaskProgressItemView == null) {
                    com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskProgressView", "#render first time to show child view");
                    android.content.Context context = finderLiveGameWelfareTaskProgressView.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView2 = new com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView(context, null, 2, null);
                    finderLiveGameWelfareTaskProgressItemView2.a(s73Var4);
                    relativeLayout.addView(finderLiveGameWelfareTaskProgressItemView2);
                    finderLiveGameWelfareTaskProgressView.f115932q = finderLiveGameWelfareTaskProgressItemView2;
                } else if (((java.util.ArrayList) finderLiveGameWelfareTaskProgressView.f115930o).size() == i18) {
                    com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskProgressView", "#render taskList.size == 1");
                    com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView3 = finderLiveGameWelfareTaskProgressView.f115932q;
                    if (finderLiveGameWelfareTaskProgressItemView3 != null) {
                        finderLiveGameWelfareTaskProgressItemView3.a(s73Var4);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskProgressView", "#render not first time to show child view");
                    com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView4 = finderLiveGameWelfareTaskProgressView.f115932q;
                    android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                    translateAnimation.setAnimationListener(new com.tencent.mm.plugin.finder.live.view.l5(finderLiveGameWelfareTaskProgressView, finderLiveGameWelfareTaskProgressItemView4));
                    translateAnimation.setDuration(400L);
                    if (finderLiveGameWelfareTaskProgressItemView4 != null) {
                        finderLiveGameWelfareTaskProgressItemView4.startAnimation(translateAnimation);
                    }
                    android.content.Context context2 = finderLiveGameWelfareTaskProgressView.getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView5 = new com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView(context2, null, 2, null);
                    finderLiveGameWelfareTaskProgressItemView5.a(s73Var4);
                    relativeLayout.addView(finderLiveGameWelfareTaskProgressItemView5);
                    finderLiveGameWelfareTaskProgressView.f115932q = finderLiveGameWelfareTaskProgressItemView5;
                    android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                    translateAnimation2.setDuration(400L);
                    finderLiveGameWelfareTaskProgressItemView5.startAnimation(translateAnimation2);
                }
                i18 = 1;
            }
            this.f116473d = i18;
        } while (kotlinx.coroutines.k1.b(5000L, this) != aVar);
        return aVar;
    }
}
