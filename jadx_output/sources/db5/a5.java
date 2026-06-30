package db5;

/* loaded from: classes4.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMOverScrollView f228278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f228279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f228280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f228281g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.tencent.mm.ui.base.MMOverScrollView mMOverScrollView, android.view.MotionEvent motionEvent, android.view.View view, android.graphics.PointF pointF) {
        super(0);
        this.f228278d = mMOverScrollView;
        this.f228279e = motionEvent;
        this.f228280f = view;
        this.f228281g = pointF;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.MMOverScrollView mMOverScrollView = this.f228278d;
        if (!mMOverScrollView.f197505o) {
            mMOverScrollView.f197505o = true;
            android.view.MotionEvent motionEvent = this.f228279e;
            int action = motionEvent.getAction();
            motionEvent.setAction(3);
            super/*android.view.View*/.dispatchTouchEvent(motionEvent);
            android.view.View view = this.f228280f;
            if (view != null) {
                mMOverScrollView.b(view, motionEvent, this.f228281g);
            }
            motionEvent.setAction(action);
        }
        return jz5.f0.f302826a;
    }
}
