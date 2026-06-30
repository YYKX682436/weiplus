package uj3;

/* loaded from: classes14.dex */
public final class h implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.i f428281d;

    public h(uj3.i iVar) {
        this.f428281d = iVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.FrameLayout frameLayout;
        ct0.b bVar = new ct0.b(null, null, false, 0, 0, null, null, 0, 0, null, null, null, false, null, null, 0, 65535, null);
        uj3.i iVar = this.f428281d;
        if (iVar.getMCurrentPageWidth() == 0) {
            android.widget.FrameLayout mEditLayout = iVar.getMEditLayout();
            if ((mEditLayout != null && iVar.getMCurrentPageWidth() == mEditLayout.getMeasuredWidth()) && iVar.getMCurrentPageHeight() == 0) {
                android.widget.FrameLayout mEditLayout2 = iVar.getMEditLayout();
                if (mEditLayout2 != null && iVar.getMCurrentPageHeight() == mEditLayout2.getMeasuredHeight()) {
                    return;
                }
            }
        }
        android.view.ViewTreeObserver viewTreeObserver = iVar.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        android.widget.FrameLayout mEditLayout3 = iVar.getMEditLayout();
        iVar.setMCurrentPageWidth(mEditLayout3 != null ? mEditLayout3.getMeasuredWidth() : 0);
        android.widget.FrameLayout mEditLayout4 = iVar.getMEditLayout();
        iVar.setMCurrentPageHeight(mEditLayout4 != null ? mEditLayout4.getMeasuredHeight() : 0);
        android.widget.FrameLayout mEditLayout5 = iVar.getMEditLayout();
        int measuredWidth = mEditLayout5 != null ? mEditLayout5.getMeasuredWidth() : 0;
        android.widget.FrameLayout mEditLayout6 = iVar.getMEditLayout();
        bVar.f222218o = new android.graphics.Rect(0, 0, measuredWidth, mEditLayout6 != null ? mEditLayout6.getMeasuredHeight() : 0);
        bVar.f222219p = iVar.getResources().getColor(com.tencent.mm.R.color.f478518a0);
        uj3.c multiTalkStrokeContext = iVar.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.b(bVar, null);
        }
        uj3.c multiTalkStrokeContext2 = iVar.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext2 != null && (frameLayout = multiTalkStrokeContext2.f428242a) != null) {
            frameLayout.setVisibility(0);
        }
        uj3.c multiTalkStrokeContext3 = iVar.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext3 != null) {
            multiTalkStrokeContext3.f428244c = iVar.getMCurrentPageHeight();
        }
        uj3.c multiTalkStrokeContext4 = iVar.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext4 != null) {
            multiTalkStrokeContext4.f428243b = iVar.getMCurrentPageWidth();
        }
        uj3.c multiTalkStrokeContext5 = iVar.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext5 != null) {
            multiTalkStrokeContext5.c(1.0f, 0, 0, false, false);
        }
        iVar.s(true);
    }
}
