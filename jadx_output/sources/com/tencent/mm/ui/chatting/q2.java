package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class q2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingAnimFrame f202597d;

    public q2(com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame) {
        this.f202597d = chattingAnimFrame;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        android.animation.ObjectAnimator objectAnimator;
        android.animation.ObjectAnimator objectAnimator2;
        com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = this.f202597d;
        if (chattingAnimFrame.Q) {
            if (chattingAnimFrame.I == null) {
                chattingAnimFrame.I = new android.view.animation.LinearInterpolator();
            }
            if (chattingAnimFrame.f198189J == null) {
                chattingAnimFrame.f198189J = new android.view.animation.LinearInterpolator();
            }
            float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            int i17 = chattingAnimFrame.K;
            if (i17 == 2) {
                chattingAnimFrame.H = chattingAnimFrame.f198195i - chattingAnimFrame.L;
            } else if (i17 == 3) {
                float f17 = chattingAnimFrame.f198195i;
                chattingAnimFrame.G = chattingAnimFrame.C * f17;
                chattingAnimFrame.H = f17 * chattingAnimFrame.D;
            }
            float f18 = chattingAnimFrame.E;
            float interpolation = f18 + ((chattingAnimFrame.F - f18) * chattingAnimFrame.I.getInterpolation(floatValue));
            float f19 = chattingAnimFrame.G;
            float interpolation2 = f19 + ((chattingAnimFrame.H - f19) * chattingAnimFrame.f198189J.getInterpolation(floatValue));
            com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = chattingAnimFrame.f198204u;
            if (mMAnimateView != null) {
                mMAnimateView.setX(interpolation);
                chattingAnimFrame.f198204u.setY(interpolation2);
                boolean z17 = chattingAnimFrame.f198208y;
                float f27 = chattingAnimFrame.f198207x;
                if (!z17 && floatValue > f27) {
                    chattingAnimFrame.f198208y = true;
                    if (chattingAnimFrame.f198204u != null && (objectAnimator2 = chattingAnimFrame.T) != null && chattingAnimFrame.Q) {
                        objectAnimator2.start();
                    }
                }
                if (chattingAnimFrame.f198209z || floatValue <= f27 * 3.0f) {
                    return;
                }
                chattingAnimFrame.f198209z = true;
                if (chattingAnimFrame.f198204u == null || (objectAnimator = chattingAnimFrame.T) == null || !chattingAnimFrame.Q) {
                    return;
                }
                objectAnimator.start();
            }
        }
    }
}
