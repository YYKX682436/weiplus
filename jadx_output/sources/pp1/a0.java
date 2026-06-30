package pp1;

/* loaded from: classes14.dex */
public interface a0 {
    static void a(pp1.a0 a0Var, boolean z17, int i17, java.lang.Integer num, java.lang.Integer num2, boolean z18, boolean z19, boolean z27, int i18, java.lang.Object obj) {
        java.lang.Integer num3;
        boolean z28;
        pp1.z zVar;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateByOverScrollStart");
        }
        java.lang.Integer num4 = (i18 & 4) != 0 ? null : num;
        java.lang.Integer num5 = (i18 & 8) != 0 ? null : num2;
        boolean z29 = (i18 & 16) != 0 ? true : z18;
        boolean z37 = (i18 & 32) != 0 ? false : z19;
        boolean z38 = (i18 & 64) != 0 ? false : z27;
        pp1.z zVar2 = (pp1.z) a0Var;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = zVar2.f357448f;
        if (contentFloatBallView == null) {
            return;
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = zVar2.f357446d;
        java.lang.Object layoutManager = contentFloatBallRecyclerView != null ? contentFloatBallRecyclerView.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int itemCount = linearLayoutManager.getItemCount();
        int floatBallCurrentWidth = contentFloatBallView.getFloatBallCurrentWidth() - contentFloatBallView.getFloatBallWidth();
        float collapseScale = contentFloatBallView.getCollapseScale();
        int n17 = contentFloatBallView.n(false);
        if (!z17 && z37) {
            n17 += floatBallCurrentWidth;
        }
        int n18 = contentFloatBallView.n(true);
        if (!z17 && !z37) {
            n18 -= floatBallCurrentWidth;
        }
        int i19 = n18;
        float floatBallWidth = ((contentFloatBallView.getFloatBallWidth() + n17) - qp1.c0.f365700i) + pp1.b.f357396e;
        if (num5 != null) {
            if (num5.intValue() > n17) {
                n17 = num5.intValue();
            }
            if (num5.intValue() > floatBallWidth) {
                floatBallWidth = num5.intValue();
            }
        }
        float f17 = 1.0f;
        float min = java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, ((i17 - n17) * 1.0f) / (i19 - n17)));
        float f18 = i17;
        if (f18 >= floatBallWidth) {
            float min2 = java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, (f18 - floatBallWidth) / (i19 - floatBallWidth)));
            float f19 = ((collapseScale - 1.0f) * min2) + 1.0f;
            int i27 = 0;
            while (i27 < itemCount) {
                android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(i27);
                android.view.View g17 = zVar2.g(findViewByPosition);
                float f27 = 1.0f - min;
                float d17 = zVar2.d(i27, z17, itemCount) + ((0 - r4) * f27);
                if (g17 != null) {
                    g17.setPivotX(0.0f);
                    g17.setPivotY(g17.getHeight() / 2.0f);
                    g17.setScaleX(f19);
                    g17.setScaleY(f19);
                    g17.setTranslationX(d17);
                    g17.setTranslationY(0.0f);
                }
                zVar2.r(z17, findViewByPosition, i27, itemCount, f27, z38);
                int i28 = i27;
                float f28 = f19;
                zVar2.o(z17, findViewByPosition, i28, itemCount, min2, f28, z38);
                i27 = i28 + 1;
                itemCount = itemCount;
                zVar2 = zVar2;
                f19 = f28;
                linearLayoutManager = linearLayoutManager;
                z29 = z29;
                num4 = num4;
                f17 = 1.0f;
            }
            num3 = num4;
            float f29 = f17;
            z28 = z29;
            float f37 = f19;
            zVar = zVar2;
            zVar.t(f29 - min2, z38);
            if (z38) {
                zVar.n(z17, true, min2, f37, z37);
            } else {
                zVar.n(z17, true, 0.0f, f37, z37);
            }
        } else {
            num3 = num4;
            z28 = z29;
            zVar = zVar2;
            for (int i29 = 0; i29 < itemCount; i29++) {
                android.view.View findViewByPosition2 = linearLayoutManager.findViewByPosition(i29);
                float f38 = 1.0f - min;
                zVar.s(zVar.g(findViewByPosition2), zVar.d(i29, z17, itemCount) + ((0 - r0) * f38));
                zVar.r(z17, findViewByPosition2, i29, itemCount, f38, z38);
                zVar.o(z17, findViewByPosition2, i29, itemCount, 0.0f, 1.0f, z38);
            }
            zVar.t(1.0f, z38);
            zVar.n(z17, true, 0.0f, 1.0f, z37);
        }
        zVar.q(true, 1.0f - min);
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView2 = zVar.f357448f;
        if (contentFloatBallView2 != null) {
            com.tencent.mm.plugin.ball.view.ContentFloatBallView.P(contentFloatBallView2, i17, num3, false, z28, true, false, 32, null);
        }
    }

    static void b(pp1.a0 a0Var, boolean z17, int i17, java.lang.Integer num, java.lang.Integer num2, boolean z18, boolean z19, boolean z27, int i18, java.lang.Object obj) {
        pp1.z zVar;
        float f17;
        boolean z28;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateByOverScrollEnd");
        }
        java.lang.Integer num3 = (i18 & 4) != 0 ? null : num;
        java.lang.Integer num4 = (i18 & 8) != 0 ? null : num2;
        boolean z29 = (i18 & 16) != 0 ? true : z18;
        boolean z37 = (i18 & 32) != 0 ? false : z19;
        boolean z38 = (i18 & 64) != 0 ? false : z27;
        pp1.z zVar2 = (pp1.z) a0Var;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = zVar2.f357448f;
        if (contentFloatBallView == null) {
            return;
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = zVar2.f357446d;
        java.lang.Object layoutManager = contentFloatBallRecyclerView != null ? contentFloatBallRecyclerView.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int itemCount = linearLayoutManager.getItemCount();
        int floatBallCurrentWidth = z37 ? contentFloatBallView.getFloatBallCurrentWidth() : contentFloatBallView.getFloatBallWidth();
        float collapseScale = contentFloatBallView.getCollapseScale();
        int p17 = contentFloatBallView.p(z17, true, (int) ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.ball.view.ContentFloatBallView.f93415p0).getValue()).floatValue(), floatBallCurrentWidth);
        int m17 = contentFloatBallView.m(false);
        float f18 = ((-pp1.b.f357396e) - floatBallCurrentWidth) + qp1.c0.f365700i;
        if (num4 != null) {
            if (num4.intValue() <= m17) {
                m17 = num4.intValue();
            }
            if (num4.intValue() <= f18) {
                f18 = num4.intValue();
            }
        }
        float f19 = i17 - p17;
        float min = java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, (f19 * 1.0f) / (m17 - p17)));
        if (i17 <= f18) {
            float f27 = f19 / (f18 - p17);
            float f28 = collapseScale + ((1.0f - collapseScale) * f27);
            int i19 = 0;
            while (i19 < itemCount) {
                android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(i19);
                android.view.View g17 = zVar2.g(findViewByPosition);
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                float d17 = zVar2.d(i19, z17, itemCount) + ((0 - r1) * min);
                if (g17 != null) {
                    g17.setPivotX(g17.getWidth());
                    g17.setPivotY(g17.getHeight() / 2.0f);
                    g17.setScaleX(f28);
                    g17.setScaleY(f28);
                    g17.setTranslationX(d17);
                    z28 = false;
                    g17.setTranslationY(0.0f);
                } else {
                    z28 = false;
                }
                zVar2.r(z17, findViewByPosition, i19, itemCount, min, z38);
                zVar2.o(z17, findViewByPosition, i19, itemCount, 1.0f - f27, f28, z38);
                i19++;
                zVar2 = zVar2;
                min = min;
                itemCount = itemCount;
                linearLayoutManager = linearLayoutManager2;
            }
            float f29 = min;
            zVar = zVar2;
            zVar.t(f27, z38);
            if (z38) {
                zVar.n(z17, true, 1.0f - f27, f28, z37);
            } else {
                zVar.n(z17, true, 0.0f, f28, z37);
            }
            f17 = f29;
        } else {
            float f37 = min;
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager3 = linearLayoutManager;
            zVar = zVar2;
            int i27 = 0;
            while (i27 < itemCount) {
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager4 = linearLayoutManager3;
                android.view.View findViewByPosition2 = linearLayoutManager4.findViewByPosition(i27);
                float f38 = f37;
                zVar.s(zVar.g(findViewByPosition2), zVar.d(i27, z17, itemCount) + ((0 - r0) * f38));
                zVar.r(z17, findViewByPosition2, i27, itemCount, f38, z38);
                zVar.o(z17, findViewByPosition2, i27, itemCount, 0.0f, 1.0f, z38);
                i27++;
                linearLayoutManager3 = linearLayoutManager4;
                f37 = f38;
            }
            zVar.t(1.0f, z38);
            zVar.n(z17, true, 0.0f, 1.0f, z37);
            f17 = f37;
        }
        zVar.q(true, f17);
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView2 = zVar.f357448f;
        if (contentFloatBallView2 != null) {
            com.tencent.mm.plugin.ball.view.ContentFloatBallView.P(contentFloatBallView2, i17, num3, false, z29, true, false, 32, null);
        }
    }
}
