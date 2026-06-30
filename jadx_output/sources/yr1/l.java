package yr1;

/* loaded from: classes14.dex */
public final class l extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yr1.m f464649a;

    public l(yr1.m mVar) {
        this.f464649a = mVar;
    }

    @Override // androidx.customview.widget.k
    public int a(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        return 0;
    }

    @Override // androidx.customview.widget.k
    public int b(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        if (kotlin.jvm.internal.o.b(child, this.f464649a.f464653g)) {
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
        return this.f464649a.f464656m;
    }

    @Override // androidx.customview.widget.k
    public void i(android.view.View changedView, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(changedView, "changedView");
        yr1.m mVar = this.f464649a;
        if (kotlin.jvm.internal.o.b(changedView, mVar.f464653g)) {
            float f17 = i18 / mVar.f464656m;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            yz5.p pVar = mVar.f464652f;
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(f17));
            }
            com.tencent.mars.xlog.Log.i("DragDownCloseLayout", "onViewPositionChanged: top:" + i18 + ", mScreenHeight:" + mVar.f464656m);
        }
        if (changedView != mVar.f464653g || i18 < mVar.f464656m || mVar.f464657n) {
            return;
        }
        mVar.f464657n = true;
        yz5.a onDragToClose = mVar.getOnDragToClose();
        if (onDragToClose != null) {
            onDragToClose.invoke();
        }
    }

    @Override // androidx.customview.widget.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        kotlin.jvm.internal.o.g(releasedChild, "releasedChild");
        float top = releasedChild.getTop();
        yr1.m mVar = this.f464649a;
        if (top <= mVar.f464655i) {
            androidx.customview.widget.l lVar = mVar.f464654h;
            if (lVar == null) {
                kotlin.jvm.internal.o.o("mViewDragHelper");
                throw null;
            }
            lVar.s(0, 0);
        } else {
            androidx.customview.widget.l lVar2 = mVar.f464654h;
            if (lVar2 == null) {
                kotlin.jvm.internal.o.o("mViewDragHelper");
                throw null;
            }
            lVar2.s(0, mVar.f464656m);
        }
        mVar.invalidate();
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        return true;
    }
}
