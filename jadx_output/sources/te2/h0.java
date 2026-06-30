package te2;

/* loaded from: classes10.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.i0 f418049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f418050f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(te2.i0 i0Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418049e = i0Var;
        this.f418050f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.h0(this.f418049e, this.f418050f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418048d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        int i18 = this.f418050f;
        te2.i0 i0Var = this.f418049e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!i0Var.f418097q) {
                com.tencent.mars.xlog.Log.i(i0Var.f418093m, "has released, return");
                return f0Var;
            }
            if (i18 == 1) {
                com.tencent.mm.view.MMPAGView D = i0Var.D();
                if (D != null) {
                    vl2.s sVar = vl2.s.f437868a;
                    vl2.h hVar = vl2.h.f437834v;
                    this.f418048d = 1;
                    if (sVar.d(hVar, D, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i0Var.f418096p < 1) {
                com.tencent.mm.view.MMPAGView D2 = i0Var.D();
                if (D2 != null) {
                    vl2.s sVar2 = vl2.s.f437868a;
                    vl2.h hVar2 = vl2.h.f437836x;
                    this.f418048d = 2;
                    if (sVar2.d(hVar2, D2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                com.tencent.mm.view.MMPAGView D3 = i0Var.D();
                if (D3 != null) {
                    vl2.s sVar3 = vl2.s.f437868a;
                    vl2.h hVar3 = vl2.h.f437835w;
                    this.f418048d = 3;
                    if (sVar3.d(hVar3, D3, this) == aVar) {
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
        i0Var.f418096p = i18;
        com.tencent.mm.view.MMPAGView D4 = i0Var.D();
        if (D4 != null) {
            D4.setProgress(0.0d);
        }
        com.tencent.mm.view.MMPAGView D5 = i0Var.D();
        if (D5 != null) {
            D5.setRepeatCount(1);
        }
        com.tencent.mm.view.MMPAGView D6 = i0Var.D();
        if (D6 != null) {
            D6.g();
        }
        com.tencent.mm.view.MMPAGView D7 = i0Var.D();
        if (D7 != null) {
            D7.a(i0Var.f418094n);
        }
        if (i0Var.u().getVisibility() == 8) {
            android.view.View u17 = i0Var.u();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback$updateLuckyMoneyCount$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(u17, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback$updateLuckyMoneyCount$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i0Var.z();
        }
        if (i0Var.x()) {
            android.widget.TextView C = i0Var.C();
            if (C != null) {
                C.setVisibility(0);
            }
            com.tencent.mm.ui.MMActivity mMActivity = i0Var.f418091h;
            if (i18 <= 1) {
                android.widget.TextView C2 = i0Var.C();
                if (C2 != null) {
                    C2.setText(mMActivity.getResources().getString(com.tencent.mm.R.string.dsp));
                }
            } else {
                if (2 <= i18 && i18 < 10) {
                    android.widget.TextView C3 = i0Var.C();
                    if (C3 != null) {
                        C3.setText(mMActivity.getResources().getString(com.tencent.mm.R.string.dso, java.lang.Integer.valueOf(i18)));
                    }
                } else {
                    android.widget.TextView C4 = i0Var.C();
                    if (C4 != null) {
                        C4.setText("x" + i18);
                    }
                }
            }
        } else {
            android.widget.TextView C5 = i0Var.C();
            if (C5 != null) {
                C5.setText("x" + i18);
            }
            android.widget.TextView C6 = i0Var.C();
            if (C6 != null) {
                C6.setVisibility(i18 == 1 ? 8 : 0);
            }
        }
        return f0Var;
    }
}
