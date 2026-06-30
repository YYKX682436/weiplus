package qn2;

/* loaded from: classes3.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f365210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.z f365211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f365212f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(qn2.z zVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f365211e = zVar;
        this.f365212f = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(qn2.z r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof qn2.x
            if (r0 == 0) goto L13
            r0 = r7
            qn2.x r0 = (qn2.x) r0
            int r1 = r0.f365208f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f365208f = r1
            goto L18
        L13:
            qn2.x r0 = new qn2.x
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f365207e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f365208f
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.f365206d
            qn2.z r6 = (qn2.z) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto La4
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.mm.view.MMPAGView r7 = r6.f365222r
            if (r7 != 0) goto L73
            com.tencent.mm.view.MMPAGView r7 = new com.tencent.mm.view.MMPAGView
            android.view.ViewGroup r2 = r6.f365323d
            android.content.Context r2 = r2.getContext()
            java.lang.String r4 = "getContext(...)"
            kotlin.jvm.internal.o.f(r2, r4)
            r7.<init>(r2)
            r6.f365222r = r7
            ym5.l2 r7 = ym5.l2.f463424a
            ym5.j2[] r7 = ym5.j2.f463392d
            com.tencent.mm.view.MMPAGView r7 = r6.f365222r
            if (r7 == 0) goto L60
            ae2.in r2 = ae2.in.f3688a
            ym5.f6 r4 = ym5.f6.f463301a2
            boolean r2 = r2.a(r4)
            r7.o(r2)
        L60:
            qn2.r r7 = new qn2.r
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r6)
            r7.<init>(r6, r2)
            r6.f365224t = r7
            com.tencent.mm.view.MMPAGView r2 = r6.f365222r
            if (r2 == 0) goto L73
            r2.a(r7)
        L73:
            android.widget.FrameLayout r7 = r6.f365221q
            r2 = 0
            r4 = -1
            if (r7 == 0) goto L82
            com.tencent.mm.view.MMPAGView r5 = r6.f365222r
            int r7 = r7.indexOfChild(r5)
            if (r7 != r4) goto L82
            r2 = r3
        L82:
            if (r2 == 0) goto Lb5
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r4, r4)
            com.tencent.mm.view.MMPAGView r2 = r6.f365222r
            if (r2 != 0) goto L8e
            goto L91
        L8e:
            r2.setLayoutParams(r7)
        L91:
            com.tencent.mm.view.MMPAGView r7 = r6.f365222r
            if (r7 == 0) goto La4
            vl2.s r2 = vl2.s.f437868a
            vl2.h r4 = vl2.h.f437826o
            r0.f365206d = r6
            r0.f365208f = r3
            java.lang.Object r7 = r2.d(r4, r7, r0)
            if (r7 != r1) goto La4
            return r1
        La4:
            android.widget.FrameLayout r7 = r6.f365221q
            if (r7 == 0) goto Lad
            com.tencent.mm.view.MMPAGView r0 = r6.f365222r
            r7.addView(r0)
        Lad:
            android.widget.FrameLayout r6 = r6.f365221q
            if (r6 != 0) goto Lb2
            goto Lb5
        Lb2:
            r6.setClickable(r3)
        Lb5:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.y.a(qn2.z, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qn2.y(this.f365211e, this.f365212f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qn2.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.view.MMPAGView mMPAGView;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f365210d;
        qn2.z zVar = this.f365211e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.view.MMPAGView mMPAGView2 = zVar.f365222r;
            if ((mMPAGView2 != null && mMPAGView2.f()) && (mMPAGView = zVar.f365222r) != null) {
                mMPAGView.n();
            }
            this.f365210d = 1;
            if (a(zVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        zVar.K0(0);
        android.view.View view = zVar.f365225u;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$showLottering$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$showLottering$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        qn2.r rVar = zVar.f365224t;
        if (rVar != null) {
            yz5.a callback = this.f365212f;
            kotlin.jvm.internal.o.g(callback, "callback");
            rVar.f365143f = callback;
        }
        com.tencent.mm.view.MMPAGView mMPAGView3 = zVar.f365222r;
        if (mMPAGView3 != null) {
            mMPAGView3.setProgress(0.0d);
        }
        com.tencent.mm.view.MMPAGView mMPAGView4 = zVar.f365222r;
        if (mMPAGView4 != null) {
            mMPAGView4.d();
        }
        com.tencent.mm.view.MMPAGView mMPAGView5 = zVar.f365222r;
        if (mMPAGView5 != null) {
            mMPAGView5.g();
        }
        return jz5.f0.f302826a;
    }
}
