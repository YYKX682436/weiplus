package dm2;

/* loaded from: classes3.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f241666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView f241667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView finderLiveLogoGroupView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f241667e = finderLiveLogoGroupView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dm2.b(this.f241667e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dm2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f241666d;
        boolean z17 = true;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("FinderLiveLogoGroupView", "#render mainScope.launch");
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        do {
            com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView finderLiveLogoGroupView = this.f241667e;
            if (!(finderLiveLogoGroupView.f116311g.isEmpty() ^ z17)) {
                com.tencent.mars.xlog.Log.i("FinderLiveLogoGroupView", "#render taskList is empty");
                finderLiveLogoGroupView.f116312h = null;
                finderLiveLogoGroupView.f116310f.removeAllViews();
                finderLiveLogoGroupView.f116313i = null;
                return jz5.f0.f302826a;
            }
            if (finderLiveLogoGroupView.f116312h == null) {
                i17 = (int) (java.lang.System.currentTimeMillis() % ((java.util.ArrayList) finderLiveLogoGroupView.f116311g).size());
                finderLiveLogoGroupView.f116312h = (r45.rd4) kz5.n0.a0(finderLiveLogoGroupView.f116311g, i17);
            } else {
                int i19 = 0;
                int i27 = 0;
                for (java.lang.Object obj2 : finderLiveLogoGroupView.f116311g) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.rd4 rd4Var = (r45.rd4) obj2;
                    r45.rd4 rd4Var2 = finderLiveLogoGroupView.f116312h;
                    if (kotlin.jvm.internal.o.b(rd4Var2 != null ? rd4Var2.getString(2) : null, rd4Var.getString(2)) && i28 < ((java.util.ArrayList) finderLiveLogoGroupView.f116311g).size()) {
                        i19 = i28;
                    }
                    i27 = i28;
                }
                finderLiveLogoGroupView.f116312h = (r45.rd4) kz5.n0.a0(finderLiveLogoGroupView.f116311g, i19);
                i17 = i19;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveLogoGroupView", "#render currentShowTask: index=" + i17 + ' ' + finderLiveLogoGroupView.f116312h);
            r45.rd4 rd4Var3 = finderLiveLogoGroupView.f116312h;
            if (rd4Var3 != null) {
                com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView finderLiveLogoItemView = finderLiveLogoGroupView.f116313i;
                android.widget.RelativeLayout relativeLayout = finderLiveLogoGroupView.f116310f;
                if (finderLiveLogoItemView == null) {
                    com.tencent.mars.xlog.Log.i("FinderLiveLogoGroupView", "#render first time to show child view");
                    android.content.Context context = finderLiveLogoGroupView.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView finderLiveLogoItemView2 = new com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView(context, null, 2, null);
                    finderLiveLogoItemView2.a(rd4Var3);
                    relativeLayout.addView(finderLiveLogoItemView2);
                    finderLiveLogoGroupView.f116313i = finderLiveLogoItemView2;
                } else if (((java.util.ArrayList) finderLiveLogoGroupView.f116311g).size() == z17) {
                    com.tencent.mars.xlog.Log.i("FinderLiveLogoGroupView", "#render taskList.size == 1");
                    com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView finderLiveLogoItemView3 = finderLiveLogoGroupView.f116313i;
                    if (finderLiveLogoItemView3 != null) {
                        finderLiveLogoItemView3.a(rd4Var3);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("FinderLiveLogoGroupView", "#render not first time to show child view");
                    com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView finderLiveLogoItemView4 = finderLiveLogoGroupView.f116313i;
                    android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, -1.0f, 1, 0.0f, 1, 0.0f);
                    translateAnimation.setAnimationListener(new dm2.a(finderLiveLogoGroupView, finderLiveLogoItemView4));
                    translateAnimation.setDuration(400L);
                    if (finderLiveLogoItemView4 != null) {
                        finderLiveLogoItemView4.startAnimation(translateAnimation);
                    }
                    android.content.Context context2 = finderLiveLogoGroupView.getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView finderLiveLogoItemView5 = new com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView(context2, null, 2, null);
                    finderLiveLogoItemView5.a(rd4Var3);
                    relativeLayout.addView(finderLiveLogoItemView5);
                    finderLiveLogoGroupView.f116313i = finderLiveLogoItemView5;
                    android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                    translateAnimation2.setDuration(400L);
                    finderLiveLogoItemView5.startAnimation(translateAnimation2);
                }
            }
            r45.rd4 rd4Var4 = finderLiveLogoGroupView.f116312h;
            long j18 = (rd4Var4 != null ? rd4Var4.getLong(5) : 0L) * 1000;
            if (j18 == 0) {
                j18 = 3000;
            }
            j17 = j18 >= 3000 ? j18 : 3000L;
            z17 = true;
            this.f241666d = 1;
        } while (kotlinx.coroutines.k1.b(j17, this) != aVar);
        return aVar;
    }
}
