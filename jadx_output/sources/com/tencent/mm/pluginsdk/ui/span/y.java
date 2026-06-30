package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes15.dex */
public class y extends com.tencent.neattextview.textview.view.i {

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnTouchListener f191299i;

    public y(com.tencent.neattextview.textview.view.NeatTextView neatTextView, android.view.View.OnTouchListener onTouchListener) {
        super(neatTextView.getContext(), neatTextView, new android.os.Handler(android.os.Looper.getMainLooper()));
        this.f191299i = onTouchListener;
    }

    @Override // com.tencent.neattextview.textview.view.i
    public void a(int i17) {
        js5.c cVar = this.f215211g;
        if (cVar != null) {
            android.text.style.CharacterStyle characterStyle = cVar.f301571g;
            if (characterStyle instanceof com.tencent.mm.pluginsdk.ui.span.z0) {
                ((com.tencent.mm.pluginsdk.ui.span.z0) characterStyle).setIsPressed(false);
            }
        }
        super.a(i17);
    }

    @Override // com.tencent.neattextview.textview.view.i, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        boolean onDown = super.onDown(motionEvent);
        js5.c cVar = this.f215211g;
        if (cVar == null) {
            return onDown;
        }
        android.text.style.CharacterStyle characterStyle = cVar.f301571g;
        if (characterStyle instanceof com.tencent.mm.pluginsdk.ui.span.z0) {
            ((com.tencent.mm.pluginsdk.ui.span.z0) characterStyle).setIsPressed(true);
        }
        return true;
    }

    @Override // com.tencent.neattextview.textview.view.i, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        android.view.View view;
        if (this.f215211g != null && (view = this.f215212h) != null) {
            view.performLongClick();
        }
        a(1);
    }

    @Override // com.tencent.neattextview.textview.view.i, android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        view.setTag(com.tencent.mm.R.id.ohu, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
        boolean z17 = view instanceof com.tencent.neattextview.textview.view.NeatTextView;
        android.view.View.OnTouchListener onTouchListener = this.f191299i;
        if (z17) {
            com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) view;
            if (!neatTextView.h() || neatTextView.f215178e) {
                if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    neatTextView.getWrappedTextView().setPressed(false);
                } else if (motionEvent.getAction() == 0) {
                    neatTextView.getWrappedTextView().setPressed(true);
                }
                neatTextView.getWrappedTextView().setTag(view.getTag());
                return onTouchListener.onTouch(neatTextView.getWrappedTextView(), motionEvent);
            }
        } else {
            onTouchListener.onTouch(view, motionEvent);
        }
        return super.onTouch(view, motionEvent);
    }
}
