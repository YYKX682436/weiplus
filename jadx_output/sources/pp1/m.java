package pp1;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f357429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f357430f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pp1.z zVar, boolean z17, android.animation.ValueAnimator valueAnimator) {
        super(0);
        this.f357428d = zVar;
        this.f357429e = z17;
        this.f357430f = valueAnimator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0.w() == true) goto L8;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r10 = this;
            pp1.z r0 = r10.f357428d
            com.tencent.mm.plugin.ball.view.ContentFloatBallView r0 = r0.f357448f
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r0 = r0.w()
            r2 = 1
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L74
            boolean r0 = r10.f357429e
            if (r0 == 0) goto L1e
            pp1.z r0 = r10.f357428d
            int r0 = r0.e()
            int r1 = r0 + (-1)
        L1e:
            r5 = r1
            pp1.z r0 = r10.f357428d
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager r0 = r0.f()
            android.view.View r4 = r0.findViewByPosition(r5)
            pp1.z r0 = r10.f357428d
            android.view.View r0 = r0.g(r4)
            pp1.z r1 = r10.f357428d
            com.tencent.mm.plugin.ball.view.ContentFloatBallView r1 = r1.f357448f
            kotlin.jvm.internal.o.d(r1)
            float r8 = r1.getCollapseScale()
            if (r0 == 0) goto L62
            boolean r1 = r10.f357429e
            r2 = 0
            if (r1 == 0) goto L47
            int r1 = r0.getWidth()
            float r1 = (float) r1
            goto L48
        L47:
            r1 = r2
        L48:
            r0.setPivotX(r1)
            int r1 = r0.getHeight()
            float r1 = (float) r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            r0.setPivotY(r1)
            r0.setScaleX(r8)
            r0.setScaleY(r8)
            r0.setTranslationX(r2)
            r0.setTranslationY(r2)
        L62:
            pp1.z r2 = r10.f357428d
            boolean r3 = r10.f357429e
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager r0 = r2.f()
            int r6 = r0.getItemCount()
            r7 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r2.o(r3, r4, r5, r6, r7, r8, r9)
        L74:
            ku5.u0 r0 = ku5.t0.f312615d
            pp1.l r1 = new pp1.l
            pp1.z r2 = r10.f357428d
            boolean r3 = r10.f357429e
            android.animation.ValueAnimator r4 = r10.f357430f
            r1.<init>(r2, r3, r4)
            ku5.t0 r0 = (ku5.t0) r0
            wu5.c r0 = r0.B(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pp1.m.invoke():java.lang.Object");
    }
}
