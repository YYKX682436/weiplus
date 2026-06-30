package yp;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f464394a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f464395b = new android.graphics.RectF();

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f464396c = new android.graphics.Paint();

    public o(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("itemView may not be null");
        }
        this.f464394a = view;
    }

    public int a() {
        return this.f464394a.getMeasuredHeight();
    }

    public int b() {
        return this.f464394a.getMeasuredWidth();
    }

    public final android.view.View c(android.view.View view, float f17, float f18) {
        android.graphics.RectF rectF = new android.graphics.RectF();
        java.util.Iterator<android.view.View> it = view.getTouchables().iterator();
        boolean z17 = false;
        android.view.View view2 = null;
        while (it.hasNext()) {
            android.view.View next = it.next();
            float x17 = next.getX();
            float y17 = next.getY();
            rectF.set(x17, y17, next.getMeasuredWidth() + x17, next.getMeasuredWidth() + y17);
            if (rectF.contains(f17, f18)) {
                if (next.equals(view)) {
                    z17 = true;
                } else {
                    if (!(next instanceof android.view.ViewGroup)) {
                        return next;
                    }
                    view2 = c(view, f17 - x17, f18 - f17);
                }
            }
        }
        return (z17 && view2 == null) ? view : view2;
    }

    public android.view.View d(zp.m mVar) {
        android.graphics.Point point = mVar.f474923b;
        return c(this.f464394a, point.x - mVar.f474925d, point.y - mVar.f474926e);
    }

    public void e(int i17, int i18) {
        this.f464394a.measure(i17, i18);
    }

    public void f() {
    }
}
