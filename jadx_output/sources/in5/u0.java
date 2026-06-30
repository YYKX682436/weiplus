package in5;

/* loaded from: classes3.dex */
public final class u0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final in5.q f293136d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f293137e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f293138f;

    /* renamed from: g, reason: collision with root package name */
    public final int f293139g;

    /* renamed from: h, reason: collision with root package name */
    public final int f293140h;

    /* renamed from: i, reason: collision with root package name */
    public final int f293141i;

    /* renamed from: m, reason: collision with root package name */
    public final int f293142m;

    public u0(in5.q qVar, int[] iArr, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, kotlin.jvm.internal.i iVar) {
        this.f293136d = qVar;
        this.f293137e = iArr;
        this.f293138f = paint;
        this.f293139g = i17;
        this.f293140h = i18;
        this.f293141i = i19;
        this.f293142m = i27;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = this.f293139g;
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        android.graphics.Paint paint;
        int i17;
        float f17;
        float f18;
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        int childCount = parent.getChildCount();
        float paddingLeft = parent.getPaddingLeft();
        float width = parent.getWidth() - parent.getPaddingRight();
        float f19 = paddingLeft + this.f293140h;
        float f27 = width - this.f293141i;
        int ordinal = this.f293136d.ordinal();
        int i18 = 0;
        if (ordinal == 0) {
            paint = new android.graphics.Paint();
            paint.setColor(this.f293137e[0]);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            paint = new android.graphics.Paint();
            paint.setShader(new android.graphics.LinearGradient(f19, 0.0f, f27, 0.0f, this.f293137e, new float[]{0.0f, 0.5f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            paint.setAlpha(255);
        }
        android.graphics.Paint paint2 = paint;
        int i19 = 0;
        while (i19 < childCount) {
            float bottom = parent.getChildAt(i19).getBottom();
            float bottom2 = r1.getBottom() + this.f293139g;
            if (i19 == childCount - 1) {
                i17 = i18;
                f17 = f27;
                c17.drawRect(paddingLeft + this.f293142m, bottom, width - i18, bottom2, this.f293138f);
                f18 = f19;
            } else {
                i17 = i18;
                f17 = f27;
                f18 = f19;
                c17.drawRect(new android.graphics.RectF(f18, bottom, f17, bottom2), paint2);
            }
            i19++;
            f19 = f18;
            f27 = f17;
            i18 = i17;
        }
    }
}
