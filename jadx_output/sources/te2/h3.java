package te2;

/* loaded from: classes10.dex */
public final class h3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f418054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.i3 f418055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(int i17, te2.i3 i3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418054e = i17;
        this.f418055f = i3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.h3(this.f418054e, this.f418055f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.h3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418053d;
        int i18 = this.f418054e;
        te2.i3 i3Var = this.f418055f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (i18 == 1) {
                com.tencent.mm.view.MMPAGView mMPAGView = i3Var.f418109m;
                if (mMPAGView != null) {
                    vl2.s sVar = vl2.s.f437868a;
                    vl2.h hVar = vl2.h.f437834v;
                    this.f418053d = 1;
                    if (sVar.d(hVar, mMPAGView, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i3Var.f418112p < 1) {
                com.tencent.mm.view.MMPAGView mMPAGView2 = i3Var.f418109m;
                if (mMPAGView2 != null) {
                    vl2.s sVar2 = vl2.s.f437868a;
                    vl2.h hVar2 = vl2.h.f437836x;
                    this.f418053d = 2;
                    if (sVar2.d(hVar2, mMPAGView2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                com.tencent.mm.view.MMPAGView mMPAGView3 = i3Var.f418109m;
                if (mMPAGView3 != null) {
                    vl2.s sVar3 = vl2.s.f437868a;
                    vl2.h hVar3 = vl2.h.f437835w;
                    this.f418053d = 3;
                    if (sVar3.d(hVar3, mMPAGView3, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1 && i17 != 2 && i17 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        i3Var.f418112p = i18;
        com.tencent.mm.view.MMPAGView mMPAGView4 = i3Var.f418109m;
        if (mMPAGView4 != null) {
            mMPAGView4.setRepeatCount(1);
        }
        com.tencent.mm.view.MMPAGView mMPAGView5 = i3Var.f418109m;
        if (mMPAGView5 != null) {
            mMPAGView5.g();
        }
        com.tencent.mm.view.MMPAGView mMPAGView6 = i3Var.f418109m;
        if (mMPAGView6 != null) {
            mMPAGView6.a(i3Var.f418110n);
        }
        android.view.View view = i3Var.f418106g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback$updateLuckyMoneyCount$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback$updateLuckyMoneyCount$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = i3Var.f418108i;
        if (textView != null) {
            textView.setText("x" + i18);
        }
        android.widget.TextView textView2 = i3Var.f418108i;
        if (textView2 != null) {
            textView2.setVisibility(i18 == 1 ? 8 : 0);
        }
        return jz5.f0.f302826a;
    }
}
