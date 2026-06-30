package lm4;

/* loaded from: classes14.dex */
public final class b extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lm4.d f319529a;

    public b(lm4.d dVar) {
        this.f319529a = dVar;
    }

    @Override // androidx.customview.widget.k
    public int a(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        return 0;
    }

    @Override // androidx.customview.widget.k
    public int b(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        if (kotlin.jvm.internal.o.b(child, this.f319529a.f319550g)) {
            com.tencent.mars.xlog.Log.i("DragDownCloseLayout", "clampViewPositionVertical top:" + i17 + ", dy:" + i18);
        }
        if (i17 >= 0) {
            return i17;
        }
        return 0;
    }

    @Override // androidx.customview.widget.k
    public int d(android.view.View child) {
        kotlin.jvm.internal.o.g(child, "child");
        return this.f319529a.f319553m;
    }

    @Override // androidx.customview.widget.k
    public void i(android.view.View changedView, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(changedView, "changedView");
        lm4.d dVar = this.f319529a;
        if (kotlin.jvm.internal.o.b(changedView, dVar.f319550g)) {
            float f17 = i18 / dVar.f319553m;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            yz5.p pVar = dVar.f319549f;
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(f17));
            }
            com.tencent.mars.xlog.Log.i("DragDownCloseLayout", "onViewPositionChanged: top:" + i18 + ", mScreenHeight:" + dVar.f319553m);
        }
        if (changedView != dVar.f319550g || i18 < dVar.f319553m || dVar.f319554n) {
            return;
        }
        dVar.f319554n = true;
        yz5.a onDragToClose = dVar.getOnDragToClose();
        if (onDragToClose != null) {
            onDragToClose.invoke();
        }
    }

    @Override // androidx.customview.widget.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        kotlin.jvm.internal.o.g(releasedChild, "releasedChild");
        float top = releasedChild.getTop();
        lm4.d dVar = this.f319529a;
        if (top <= dVar.f319552i) {
            androidx.customview.widget.l lVar = dVar.f319551h;
            if (lVar == null) {
                kotlin.jvm.internal.o.o("mViewDragHelper");
                throw null;
            }
            lVar.s(0, 0);
        } else {
            androidx.customview.widget.l lVar2 = dVar.f319551h;
            if (lVar2 == null) {
                kotlin.jvm.internal.o.o("mViewDragHelper");
                throw null;
            }
            lVar2.s(0, dVar.f319553m);
        }
        dVar.invalidate();
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        return true;
    }
}
