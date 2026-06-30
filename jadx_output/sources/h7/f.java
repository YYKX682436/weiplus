package h7;

/* loaded from: classes13.dex */
public class f extends android.graphics.drawable.Drawable implements h7.k, android.graphics.drawable.Animatable {

    /* renamed from: d, reason: collision with root package name */
    public final h7.e f279333d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f279334e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f279335f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f279336g;

    /* renamed from: i, reason: collision with root package name */
    public int f279338i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f279340n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Paint f279341o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Rect f279342p;

    /* renamed from: h, reason: collision with root package name */
    public boolean f279337h = true;

    /* renamed from: m, reason: collision with root package name */
    public final int f279339m = -1;

    public f(h7.e eVar) {
        q7.n.b(eVar);
        this.f279333d = eVar;
    }

    public final void a() {
        q7.n.a(!this.f279336g, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        h7.m mVar = this.f279333d.f279332a;
        if (((s6.f) mVar.f279349a).f403304l.f403280c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f279334e) {
            return;
        }
        this.f279334e = true;
        if (mVar.f279358j) {
            throw new java.lang.IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) mVar.f279351c;
        if (arrayList.contains(this)) {
            throw new java.lang.IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (isEmpty && !mVar.f279354f) {
            mVar.f279354f = true;
            mVar.f279358j = false;
            mVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.f279336g) {
            return;
        }
        if (this.f279340n) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            android.graphics.Rect bounds = getBounds();
            if (this.f279342p == null) {
                this.f279342p = new android.graphics.Rect();
            }
            android.view.Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f279342p);
            this.f279340n = false;
        }
        h7.m mVar = this.f279333d.f279332a;
        h7.j jVar = mVar.f279357i;
        android.graphics.Bitmap bitmap = jVar != null ? jVar.f279347m : mVar.f279360l;
        if (this.f279342p == null) {
            this.f279342p = new android.graphics.Rect();
        }
        android.graphics.Rect rect = this.f279342p;
        if (this.f279341o == null) {
            this.f279341o = new android.graphics.Paint(2);
        }
        canvas.drawBitmap(bitmap, (android.graphics.Rect) null, rect, this.f279341o);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.f279333d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f279333d.f279332a.f279364p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f279333d.f279332a.f279363o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f279334e;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.f279340n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        if (this.f279341o == null) {
            this.f279341o = new android.graphics.Paint(2);
        }
        this.f279341o.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.f279341o == null) {
            this.f279341o = new android.graphics.Paint(2);
        }
        this.f279341o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z17, boolean z18) {
        q7.n.a(!this.f279336g, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f279337h = z17;
        if (!z17) {
            this.f279334e = false;
            h7.m mVar = this.f279333d.f279332a;
            java.util.ArrayList arrayList = (java.util.ArrayList) mVar.f279351c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                mVar.f279354f = false;
            }
        } else if (this.f279335f) {
            a();
        }
        return super.setVisible(z17, z18);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f279335f = true;
        this.f279338i = 0;
        if (this.f279337h) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f279335f = false;
        this.f279334e = false;
        h7.m mVar = this.f279333d.f279332a;
        java.util.ArrayList arrayList = (java.util.ArrayList) mVar.f279351c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            mVar.f279354f = false;
        }
    }
}
