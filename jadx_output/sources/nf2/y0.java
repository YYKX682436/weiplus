package nf2;

/* loaded from: classes2.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f336825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f336826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f336827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f336828g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.view.MMPAGView mMPAGView, android.view.View view, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f336826e = mMPAGView;
        this.f336827f = view;
        this.f336828g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nf2.y0(this.f336826e, this.f336827f, this.f336828g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nf2.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f336825d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = true;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f336826e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView.o(false);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.B;
            this.f336825d = 1;
            a17 = sVar.a(hVar, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                android.view.View view = this.f336827f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$showGestureEducation$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$showGestureEducation$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mMPAGView.setVisibility(0);
                mMPAGView.setScaleMode(2);
                mMPAGView.setRepeatCount(-1);
                mMPAGView.d();
                mMPAGView.g();
                this.f336828g.invoke();
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        java.lang.String str = (java.lang.String) a17;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return f0Var;
        }
        vl2.s sVar2 = vl2.s.f437868a;
        vl2.h hVar2 = vl2.h.B;
        this.f336825d = 2;
        if (sVar2.d(hVar2, mMPAGView, this) == aVar) {
            return aVar;
        }
        android.view.View view2 = this.f336827f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$showGestureEducation$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$showGestureEducation$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mMPAGView.setVisibility(0);
        mMPAGView.setScaleMode(2);
        mMPAGView.setRepeatCount(-1);
        mMPAGView.d();
        mMPAGView.g();
        this.f336828g.invoke();
        return f0Var;
    }
}
