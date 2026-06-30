package hf2;

/* loaded from: classes10.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final hf2.x f281006a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f281007b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f281008c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f281009d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f281010e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f281011f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f281012g;

    /* renamed from: h, reason: collision with root package name */
    public float f281013h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f281014i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f281015j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f281016k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f281017l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f281018m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f281019n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f281020o;

    /* renamed from: p, reason: collision with root package name */
    public int f281021p;

    /* renamed from: q, reason: collision with root package name */
    public int f281022q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f281023r;

    public b2(hf2.x controller) {
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f281006a = controller;
        this.f281007b = controller.f281181m + "_TextOption";
        this.f281008c = jz5.h.b(hf2.q1.f281147d);
        this.f281009d = jz5.h.b(hf2.r1.f281159d);
        this.f281010e = jz5.h.b(hf2.s1.f281165d);
        this.f281011f = jz5.h.b(hf2.t1.f281170d);
        this.f281020o = jz5.h.b(new hf2.v1(this));
    }

    public static final void a(hf2.b2 b2Var, java.lang.String str) {
        android.view.View view = b2Var.f281015j;
        if (view != null) {
            int left = view.getLeft() + (view.getWidth() / 2);
            int top = view.getTop() + (view.getHeight() / 2);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(" updateStickerPos editerContainer left:");
            sb6.append(view.getLeft());
            sb6.append(", leftMargin:");
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            sb6.append(marginLayoutParams != null ? java.lang.Integer.valueOf(marginLayoutParams.leftMargin) : null);
            sb6.append(",top:");
            sb6.append(view.getTop());
            sb6.append(", topMargin:");
            android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            sb6.append(marginLayoutParams2 != null ? java.lang.Integer.valueOf(marginLayoutParams2.topMargin) : null);
            sb6.append(",width:");
            sb6.append(view.getWidth());
            sb6.append(",height:");
            sb6.append(view.getHeight());
            sb6.append(",centerX:");
            sb6.append(left);
            sb6.append(",centerY:");
            sb6.append(top);
            sb6.append(",location:");
            sb6.append(iArr[0]);
            sb6.append('*');
            sb6.append(iArr[1]);
            sb6.append(';');
            com.tencent.mars.xlog.Log.i(b2Var.f281007b, sb6.toString());
            hf2.x xVar = b2Var.f281006a;
            float f17 = left;
            float f18 = top;
            qc0.g1 g1Var = xVar.f7().f281072c;
            r45.ei0 i17 = g1Var != null ? ((com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer) g1Var).i(1, f17, f18) : null;
            xVar.t7(str + "_updateStickerPos", i17);
            ((je2.g) xVar.business(je2.g.class)).Y6(i17);
        }
    }

    public final int b() {
        return ((java.lang.Number) ((jz5.n) this.f281011f).getValue()).intValue();
    }

    public final int c() {
        return ((java.lang.Number) ((jz5.n) this.f281008c).getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r20, android.graphics.Bitmap r21, float r22) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.b2.d(java.lang.String, android.graphics.Bitmap, float):void");
    }

    public final void e(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        je2.g gVar = (je2.g) this.f281006a.business(je2.g.class);
        android.graphics.Bitmap bitmap = this.f281012g;
        float f17 = this.f281013h;
        gVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(source);
        sb6.append(" saveTextBitmap from ");
        android.graphics.Bitmap bitmap2 = gVar.f299223h;
        sb6.append(bitmap2 != null ? bitmap2.hashCode() : 0);
        sb6.append(" to ");
        sb6.append(bitmap != null ? bitmap.hashCode() : 0);
        sb6.append(",tmpTextEditorBitmapScale:");
        sb6.append(f17);
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorStickerSlice", sb6.toString());
        gVar.f299223h = bitmap;
        gVar.f299224i = f17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        if (r2 != null) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.b2.f(java.lang.String, boolean):void");
    }

    public final java.lang.Object g(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        android.graphics.Bitmap bitmap;
        jz5.f0 f0Var;
        android.view.ViewTreeObserver viewTreeObserver;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mars.xlog.Log.i(this.f281007b, str + " show,editorRoot:" + this.f281014i);
        v65.n nVar = new v65.n(rVar);
        if (this.f281014i == null) {
            hf2.x xVar = this.f281006a;
            je2.g gVar = (je2.g) xVar.business(je2.g.class);
            android.graphics.Bitmap bitmap2 = gVar.f299223h;
            if (bitmap2 != null) {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Boolean.TRUE);
                arrayList.add(config);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(bitmap2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/business/LiveAnchorStickerSlice", "cloneLastTextEditBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap copy = bitmap2.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
                yj0.a.e(bitmap2, copy, "com/tencent/mm/plugin/finder/live/business/LiveAnchorStickerSlice", "cloneLastTextEditBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                bitmap = copy;
            } else {
                bitmap = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("textEditorBitmap:");
            android.graphics.Bitmap bitmap3 = gVar.f299223h;
            sb6.append(bitmap3 != null ? bitmap3.hashCode() : 0);
            sb6.append(",cloneBitmap:");
            sb6.append(bitmap != null ? bitmap.hashCode() : 0);
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorStickerSlice", sb6.toString());
            this.f281012g = bitmap;
            this.f281013h = ((je2.g) xVar.business(je2.g.class)).f299224i;
            android.view.View view = this.f281014i;
            if (view != null) {
                zl2.r4.f473950a.Q2(view);
            }
            android.view.View inflate = android.view.LayoutInflater.from(xVar.O6()).inflate(com.tencent.mm.R.layout.def, (android.view.ViewGroup) null);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.cg7);
            this.f281015j = findViewById;
            if (findViewById != null) {
                findViewById.setOnTouchListener(new hf2.x1(this));
            }
            android.view.View view2 = this.f281015j;
            jz5.g gVar2 = this.f281020o;
            if (view2 != null) {
                view2.setOnClickListener((android.view.View.OnClickListener) ((jz5.n) gVar2).getValue());
            }
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.q3w);
            this.f281016k = findViewById2;
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new hf2.y1(this));
            }
            android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.q4o);
            this.f281017l = findViewById3;
            if (findViewById3 != null) {
                findViewById3.setOnClickListener((android.view.View.OnClickListener) ((jz5.n) gVar2).getValue());
            }
            this.f281018m = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.q4k);
            this.f281019n = inflate.findViewById(com.tencent.mm.R.id.q4n);
            this.f281014i = inflate;
            xVar.e7();
            android.view.ViewGroup viewGroup = xVar.f281191w;
            if (viewGroup != null) {
                viewGroup.addView(this.f281014i, 0, new android.view.ViewGroup.LayoutParams(xVar.f281189u.f281161b.getWidth(), xVar.f281189u.f281161b.getHeight()));
            }
            android.view.View view3 = this.f281014i;
            android.view.ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = xVar.f281189u.f281160a.y;
            }
            android.view.View view4 = this.f281014i;
            if (view4 == null || (viewTreeObserver = view4.getViewTreeObserver()) == null) {
                f0Var = null;
            } else {
                viewTreeObserver.addOnGlobalLayoutListener(new hf2.a2(this, nVar));
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                nVar.a(java.lang.Boolean.FALSE);
            }
        } else {
            nVar.a(java.lang.Boolean.TRUE);
            android.view.View view5 = this.f281014i;
            if (view5 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextOptionWidget", "show", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextOptionWidget", "show", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final android.graphics.Rect h(java.lang.String str, android.util.Size size, android.graphics.Rect rect, android.graphics.Rect rect2) {
        int i17 = rect.left;
        int i18 = rect.right;
        int i19 = rect.top;
        int i27 = rect.bottom;
        int i28 = rect2.left;
        java.lang.String str2 = this.f281007b;
        if (i17 < i28) {
            com.tencent.mars.xlog.Log.i(str2, str + " tryFixViewRect left:" + i17 + ",safeRect.left:" + rect2.left + ", out of left safe rect，move x direction " + (rect2.left - i17) + ",left change to:" + rect2.left + ",right:" + (rect2.left + size.getWidth()));
            i17 = rect2.left;
            i18 = size.getWidth() + i17;
        }
        if (i18 > rect2.right) {
            com.tencent.mars.xlog.Log.i(str2, str + " tryFixViewRect left:" + i18 + ",safeRect.right:" + rect2.right + ",out of right safe rect，move x direction -" + (rect2.right - i18) + ",left change to:" + (rect2.right - size.getWidth()) + ",right:" + rect2.right);
            i18 = rect2.right;
            i17 = i18 - size.getWidth();
        }
        if (i19 < rect2.top) {
            com.tencent.mars.xlog.Log.i(str2, str + " tryFixViewRect top:" + i19 + ",safeRect.top:" + rect2.top + ",out of top safe rect，move y direction " + (rect2.top - i19) + ",top change to:" + rect2.top + ",bottom:" + (rect2.top + size.getHeight()));
            i19 = rect2.top;
            i27 = size.getHeight() + i19;
        }
        if (i27 > rect2.bottom) {
            com.tencent.mars.xlog.Log.i(str2, str + " tryFixViewRect bottom:" + i27 + ",safeRect.bottom:" + rect2.bottom + ",out of bottom safe rect，move y direction -" + (i27 - rect2.bottom) + ",top change to:" + (rect2.bottom - size.getHeight()) + ",bottom:" + rect2.bottom);
            i27 = rect2.bottom;
            i19 = i27 - size.getHeight();
        }
        android.graphics.Rect rect3 = new android.graphics.Rect(i17, i19, i18, i27);
        com.tencent.mars.xlog.Log.i(str2, str + " tryFixViewRect viewSize:" + size + " ,safeRect " + rect2 + ",final rect:" + rect3);
        return rect3;
    }
}
