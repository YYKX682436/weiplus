package sm3;

/* loaded from: classes10.dex */
public final class a0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public int f409822d;

    /* renamed from: e, reason: collision with root package name */
    public final int f409823e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f409824f;

    /* renamed from: g, reason: collision with root package name */
    public final int f409825g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f409826h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.BitmapDrawable f409827i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f409828m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.PorterDuffColorFilter f409829n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.PorterDuffColorFilter f409830o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f409831p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f409832q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f409833r;

    public a0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int b17 = i65.a.b(context, 22);
        this.f409823e = b17;
        this.f409824f = new java.util.ArrayList();
        this.f409825g = i65.a.b(context, 16);
        int b18 = i65.a.b(context, 3);
        this.f409826h = new android.graphics.Rect();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), com.tencent.mm.sdk.platformtools.x.d0(com.tencent.mm.R.raw.icons_filled_transform, context.getResources().getDisplayMetrics().density));
        this.f409827i = bitmapDrawable;
        android.graphics.drawable.Drawable drawable = b3.l.getDrawable(context, com.tencent.mm.R.drawable.asg);
        kotlin.jvm.internal.o.d(drawable);
        this.f409828m = drawable;
        this.f409829n = new android.graphics.PorterDuffColorFilter(b3.l.getColor(context, com.tencent.mm.R.color.f478526a7), android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.f409830o = new android.graphics.PorterDuffColorFilter(b3.l.getColor(context, com.tencent.mm.R.color.BW_50), android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.f409831p = new java.util.LinkedList();
        this.f409832q = true;
        this.f409833r = true;
        drawable.setBounds(0, 0, b17, b17);
        int i17 = b17 - b18;
        bitmapDrawable.setBounds(b18, b18, i17, i17);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDrawOver(canvas, parent, state);
        if (this.f409832q && (!fm3.b.f264027f.isEmpty())) {
            androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.mv.ui.widget.MvTracksAdapter");
            int size = ((sm3.o) adapter).f409897e.getTracks().size();
            this.f409822d = 0;
            int childCount = parent.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = parent.getChildAt(i17);
                int u07 = parent.u0(childAt) - 1;
                android.graphics.Rect rect = this.f409826h;
                parent.y0(childAt, rect);
                if (!this.f409833r && u07 == size - 1) {
                    return;
                }
                if (u07 >= 0 && u07 < size) {
                    int top = childAt.getTop() + childAt.getBottom();
                    int i18 = this.f409823e;
                    float right = (rect.right + childAt.getRight()) / 2;
                    float f17 = i18;
                    float f18 = right - (f17 / 2.0f);
                    float f19 = f17 + f18;
                    canvas.save();
                    canvas.translate(f18, (top - i18) / 2.0f);
                    this.f409828m.draw(canvas);
                    boolean contains = this.f409831p.contains(java.lang.Integer.valueOf(u07));
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f409827i;
                    bitmapDrawable.setColorFilter(contains ? this.f409829n : this.f409830o);
                    bitmapDrawable.draw(canvas);
                    canvas.restore();
                    int i19 = this.f409822d;
                    java.util.ArrayList arrayList = (java.util.ArrayList) this.f409824f;
                    int size2 = arrayList.size();
                    int i27 = this.f409825g;
                    if (i19 < size2) {
                        sm3.z zVar = (sm3.z) arrayList.get(this.f409822d);
                        float f27 = i27;
                        zVar.f409919a = u07;
                        zVar.f409920b = f18 - f27;
                        zVar.f409921c = f19 + f27;
                    } else {
                        float f28 = i27;
                        arrayList.add(new sm3.z(this, u07, f18 - f28, f19 + f28));
                    }
                    this.f409822d++;
                }
            }
        }
    }
}
