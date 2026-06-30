package ym5;

/* loaded from: classes10.dex */
public final class u5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f463551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(ym5.y5 y5Var) {
        super(0);
        this.f463551d = y5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dl.f0 f0Var;
        ym5.y5 y5Var = this.f463551d;
        l45.q presenter = y5Var.getPresenter();
        if (presenter != null && (f0Var = (dl.f0) ((l45.n) presenter).d(y5Var.getTargetFeatureType())) != null) {
            um.m d17 = f0Var.d();
            um.t tVar = d17 instanceof um.t ? (um.t) d17 : null;
            if (tVar != null) {
                java.util.Stack stack = tVar.f428699f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOnRestoreLastItem: item deleted=");
                sb6.append(!stack.empty());
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = y5Var.f463581x;
                com.tencent.mars.xlog.Log.i(str, sb7);
                if (stack.empty()) {
                    xk0.f g17 = tVar.g();
                    if (g17 != null) {
                        com.tencent.mars.xlog.Log.i(f0Var.P, "doRestoreInitialAnim: ");
                        f0Var.E(true);
                        float f17 = g17.f454958p;
                        if (g17 instanceof yk0.a) {
                            yk0.a aVar = (yk0.a) g17;
                            f17 = aVar.z(aVar.f454957o);
                        }
                        int i17 = g17.f454956n;
                        float f18 = (0.0f - i17) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
                        if (f18 > 180.0f) {
                            i17 += com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
                        } else if (f18 < -180.0f) {
                            i17 += org.chromium.net.NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY;
                        }
                        ok.i iVar = f0Var.R;
                        iVar.f345927a = true;
                        android.graphics.PointF pointF = g17.f454955m;
                        kotlin.jvm.internal.o.f(pointF, "getPoint(...)");
                        if (g17.f454967y == null) {
                            android.graphics.PointF pointF2 = g17.f454955m;
                            g17.x(pointF2.x, pointF2.y);
                        }
                        android.graphics.PointF pointF3 = g17.f454967y;
                        kotlin.jvm.internal.o.f(pointF3, "getInitialCommitPoint(...)");
                        float f19 = g17.f454957o;
                        java.lang.String q17 = g17.q();
                        kotlin.jvm.internal.o.f(q17, "getEmojiId(...)");
                        float f27 = pointF.x;
                        float f28 = pointF.y;
                        float f29 = pointF3.x;
                        float f37 = pointF3.y;
                        iVar.f345934f = f29 - f27;
                        float f38 = f37 - f28;
                        float[] fArr = iVar.f345937i;
                        fArr[0] = i17;
                        fArr[1] = 0.0f;
                        float[] fArr2 = iVar.f345938j;
                        fArr2[0] = f19;
                        fArr2[1] = f17;
                        iVar.f345933e = q17;
                        if (iVar.f345927a) {
                            iVar.f345928b = true;
                            android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("deltaY", 0.0f, f38), android.animation.PropertyValuesHolder.ofFloat("deltaX", 0.0f, iVar.f345934f), android.animation.PropertyValuesHolder.ofFloat("scaleY", fArr2[0], fArr2[1]), android.animation.PropertyValuesHolder.ofFloat("scaleX", fArr2[0], fArr2[1]), android.animation.PropertyValuesHolder.ofFloat("rotation", fArr[0], fArr[1]));
                            iVar.f345932d = ofPropertyValuesHolder;
                            if (ofPropertyValuesHolder != null) {
                                ofPropertyValuesHolder.addUpdateListener(new ok.g(iVar));
                            }
                            android.animation.ValueAnimator valueAnimator = iVar.f345932d;
                            if (valueAnimator != null) {
                                valueAnimator.addListener(new ok.h(iVar));
                            }
                            android.animation.ValueAnimator valueAnimator2 = iVar.f345932d;
                            if (valueAnimator2 != null) {
                                valueAnimator2.setInterpolator(new android.view.animation.LinearInterpolator());
                            }
                            android.animation.ValueAnimator valueAnimator3 = iVar.f345932d;
                            if (valueAnimator3 != null) {
                                valueAnimator3.setDuration(100L);
                            }
                            android.animation.ValueAnimator valueAnimator4 = iVar.f345932d;
                            if (valueAnimator4 != null) {
                                valueAnimator4.start();
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i(str, "doOnRestoreLastItem: error. no item");
                    }
                } else {
                    xk0.f fVar = (xk0.f) stack.pop();
                    if (fVar != null) {
                        yk0.a aVar2 = fVar instanceof yk0.a ? (yk0.a) fVar : null;
                        if (aVar2 != null) {
                            if (aVar2.f454967y == null) {
                                android.graphics.PointF pointF4 = aVar2.f454955m;
                                aVar2.x(pointF4.x, pointF4.y);
                            }
                            android.graphics.PointF pointF5 = aVar2.f454967y;
                            float f39 = pointF5.x;
                            if (pointF5 == null) {
                                android.graphics.PointF pointF6 = aVar2.f454955m;
                                aVar2.x(pointF6.x, pointF6.y);
                            }
                            aVar2.v(f39, aVar2.f454967y.y);
                            float z17 = aVar2.z(aVar2.f454957o);
                            aVar2.f454957o = z17;
                            if (z17 < aVar2.f454963u) {
                                aVar2.f454963u = z17;
                            }
                            aVar2.f454956n = 0;
                            aVar2.f454964v = false;
                            aVar2.E = false;
                        }
                        tVar.add(fVar);
                    }
                    ((l45.n) f0Var.f235039a).f316460a.getBaseBoardView().invalidate();
                }
            }
        }
        ym5.y5.e(y5Var, c01.s2.f37442r, false, 2, null);
        return jz5.f0.f302826a;
    }
}
