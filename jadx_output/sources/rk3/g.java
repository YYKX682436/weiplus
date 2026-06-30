package rk3;

/* loaded from: classes3.dex */
public final class g extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk3.i f396518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f396519e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(rk3.i iVar, android.view.View view, android.content.Context context) {
        super(context);
        this.f396518d = iVar;
        this.f396519e = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Float valueOf = motionEvent != null ? java.lang.Float.valueOf(motionEvent.getRawX()) : null;
        java.lang.Float valueOf2 = motionEvent != null ? java.lang.Float.valueOf(motionEvent.getRawY()) : null;
        this.f396518d.getClass();
        android.view.View view = this.f396519e;
        kotlin.jvm.internal.o.g(view, "view");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        android.graphics.RectF rectF = new android.graphics.RectF(iArr[0], iArr[1], r5 + view.getWidth(), iArr[1] + view.getHeight());
        if (valueOf != null && valueOf2 != null) {
            if (rectF.contains(valueOf.floatValue(), valueOf2.floatValue())) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
