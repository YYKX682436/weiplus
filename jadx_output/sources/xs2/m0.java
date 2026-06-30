package xs2;

/* loaded from: classes3.dex */
public final class m0 extends yp.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f456352d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f456353e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f456354f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f456355g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.DanmakuStrokeTextView f456356h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f456357i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f456358j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View f456359k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f456352d = itemView;
        this.f456353e = jz5.h.b(xs2.k0.f456345d);
        this.f456354f = jz5.h.b(new xs2.l0(this));
        this.f456355g = jz5.h.b(new xs2.j0(this));
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.i8m);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f456356h = (com.tencent.mm.plugin.finder.view.DanmakuStrokeTextView) findViewById;
        this.f456357i = itemView.findViewById(com.tencent.mm.R.id.ltj);
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.qcw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f456358j = findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.c7g);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f456359k = findViewById3;
    }

    private final android.view.View c(android.view.View view, float f17, float f18) {
        boolean z17;
        android.graphics.RectF rectF = new android.graphics.RectF();
        java.util.ArrayList<android.view.View> touchables = view.getTouchables();
        kotlin.jvm.internal.o.f(touchables, "getTouchables(...)");
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = touchables.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((android.view.View) next).getVisibility() == 0) {
                arrayList.add(next);
            }
        }
        android.view.View view2 = null;
        for (android.view.View view3 : arrayList) {
            float x17 = view3.getX();
            float y17 = view3.getY();
            rectF.set(x17, y17, view3.getMeasuredWidth() + x17, view3.getMeasuredWidth() + y17);
            if (rectF.contains(f17, f18)) {
                if (kotlin.jvm.internal.o.b(view3, view)) {
                    z17 = true;
                } else {
                    if (!(view3 instanceof android.view.ViewGroup)) {
                        return view3;
                    }
                    view2 = c(view, f17 - x17, f18 - f17);
                }
            }
        }
        return (z17 && view2 == null) ? view : view2;
    }

    public static final void h(xs2.m0 m0Var, boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.finder.view.DanmakuStrokeTextView danmakuStrokeTextView = m0Var.f456356h;
            danmakuStrokeTextView.setTextColor(danmakuStrokeTextView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
            m0Var.f456358j.setBackgroundResource(com.tencent.mm.R.drawable.a1x);
        } else {
            com.tencent.mm.plugin.finder.view.DanmakuStrokeTextView danmakuStrokeTextView2 = m0Var.f456356h;
            danmakuStrokeTextView2.setTextColor(danmakuStrokeTextView2.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            m0Var.f456358j.setBackground(null);
        }
    }

    @Override // yp.o
    public android.view.View d(zp.m touchPoint) {
        kotlin.jvm.internal.o.g(touchPoint, "touchPoint");
        android.view.View mItemView = this.f464394a;
        kotlin.jvm.internal.o.f(mItemView, "mItemView");
        android.graphics.Point point = touchPoint.f474923b;
        return c(mItemView, point.x - touchPoint.f474925d, point.y - touchPoint.f474926e);
    }

    @Override // yp.o
    public void e(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        jz5.g gVar = this.f456355g;
        if (mode != Integer.MIN_VALUE) {
            super.e(i17, ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
            return;
        }
        int intValue = ((java.lang.Number) ((jz5.n) this.f456354f).getValue()).intValue();
        if (i17 < intValue) {
            i17 = intValue;
        }
        super.e(i17, ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
    }

    public void g(xs2.q config) {
        int i17;
        kotlin.jvm.internal.o.g(config, "config");
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i("ViewDanmakuRender", "debug setBackground config:" + config);
        }
        boolean z17 = config.f456365a;
        if (!config.f456366b) {
            h(this, z17);
            return;
        }
        java.lang.Object obj = config.f456367c;
        dk2.zf zfVar = obj instanceof dk2.zf ? (dk2.zf) obj : null;
        if (zfVar == null) {
            if ((obj instanceof lm2.c ? (lm2.c) obj : null) != null) {
                h(this, z17);
                return;
            }
            return;
        }
        r45.yl1 b17 = mm2.j2.F.b(zfVar);
        boolean z18 = false;
        java.lang.Integer valueOf = b17 != null ? java.lang.Integer.valueOf(b17.getInteger(0)) : null;
        if (valueOf == null || valueOf.intValue() != 2) {
            if (valueOf != null && valueOf.intValue() == 4) {
                h(this, z17);
                return;
            }
            return;
        }
        int integer = b17.getInteger(2);
        android.view.View view = this.f456358j;
        com.tencent.mm.plugin.finder.view.DanmakuStrokeTextView danmakuStrokeTextView = this.f456356h;
        if (!z17) {
            danmakuStrokeTextView.setTextColor(danmakuStrokeTextView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            view.setBackground(hk2.b.f281879a.a(integer));
            return;
        }
        danmakuStrokeTextView.setTextColor(danmakuStrokeTextView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
        hk2.b bVar = hk2.b.f281879a;
        if (40 <= integer && integer < 50) {
            i17 = com.tencent.mm.R.drawable.f481711a21;
        } else {
            if (50 <= integer && integer < 60) {
                i17 = com.tencent.mm.R.drawable.f481713a23;
            } else {
                if (60 <= integer && integer < 70) {
                    i17 = com.tencent.mm.R.drawable.f481715a25;
                } else {
                    if (70 <= integer && integer < 80) {
                        i17 = com.tencent.mm.R.drawable.a27;
                    } else {
                        if (80 <= integer && integer < 90) {
                            i17 = com.tencent.mm.R.drawable.a29;
                        } else {
                            if (90 <= integer && integer < 100) {
                                z18 = true;
                            }
                            i17 = z18 ? com.tencent.mm.R.drawable.a2a : com.tencent.mm.R.drawable.a1z;
                        }
                    }
                }
            }
        }
        android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(i17, null);
        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
        view.setBackground(drawable);
    }
}
