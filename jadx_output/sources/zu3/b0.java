package zu3;

/* loaded from: classes10.dex */
public final class b0 extends zu3.c {
    public final java.lang.String C;
    public zu3.a0 D;
    public java.lang.String E;

    public b0(android.content.Context context) {
        super(context);
        this.C = "MicroMsg.TextItemView";
        setTextSize(getResources().getDimension(com.tencent.mm.R.dimen.f480341v2));
        this.E = "";
    }

    public final android.graphics.Bitmap c(zu3.a0 item) {
        android.graphics.Bitmap createBitmap;
        kotlin.jvm.internal.o.g(item, "item");
        setSourceDataType(zu3.e.f475796e);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText photoEditText = new com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText(context);
        int b17 = i65.a.b(getContext(), 16);
        int b18 = i65.a.b(getContext(), 8);
        photoEditText.setPadding(b17, b18, b17, b18);
        photoEditText.setTextColor(item.f475765h);
        photoEditText.setTextBackground(item.f475766i);
        photoEditText.setTextSize(0, getTextSize());
        photoEditText.setText(java.lang.String.valueOf(item.f475764g));
        photoEditText.setSingleLine(false);
        if (!(item.f475768k.length() > 0)) {
            photoEditText.setTypeface(photoEditText.getTypeface(), 1);
        } else if (com.tencent.mm.vfs.w6.j(item.f475768k)) {
            photoEditText.setTypeface(android.graphics.Typeface.createFromFile(item.f475768k));
        } else {
            photoEditText.setTypeface(android.graphics.Typeface.DEFAULT);
        }
        if (item.f475766i == 0 && item.f475765h != -16777216) {
            pm0.v.c(photoEditText);
        }
        lt3.n nVar = lt3.n.f321260a;
        android.graphics.Rect rect = lt3.n.f321262c;
        int width = rect.width();
        if (width > 0) {
            photoEditText.setMaxWidth(width);
        }
        photoEditText.measure(0, 0);
        int width2 = (photoEditText.getMeasuredWidth() <= 0 || photoEditText.getMeasuredWidth() > rect.width()) ? rect.width() : photoEditText.getMeasuredWidth();
        int height = (photoEditText.getMeasuredHeight() <= 0 || photoEditText.getMeasuredHeight() > rect.height()) ? rect.height() : photoEditText.getMeasuredHeight();
        if (width2 <= 0 || height <= 0) {
            com.tencent.mars.xlog.Log.w(this.C, "create bitmap size error: " + width2 + ", " + height);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(1);
            arrayList.add(1);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/item/TextItemView", "createBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/TextItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/ui/editor/item/TextItemView", "createBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/TextItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        } else {
            android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(config2);
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(height));
            arrayList2.add(java.lang.Integer.valueOf(width2));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/item/TextItemView", "createBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/TextItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/recordvideo/ui/editor/item/TextItemView", "createBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/TextItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        }
        kotlin.jvm.internal.o.d(createBitmap);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        photoEditText.draw(canvas);
        canvas.save();
        canvas.translate(b17, b18);
        photoEditText.getLayout().draw(canvas);
        canvas.restore();
        return createBitmap;
    }

    public final av3.c d(zu3.a0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        av3.c cVar = new av3.c(c(item), item.f475763f);
        r45.bi0 bi0Var = new r45.bi0();
        bv3.d dVar = item.f475760c;
        bi0Var.f370772d = dVar.c();
        bi0Var.f370773e = dVar.b();
        cVar.f14213c = bi0Var;
        return cVar;
    }

    public final void f(float f17, float f18) {
        if (f17 == 0.0f) {
            return;
        }
        if (f18 == 0.0f) {
            return;
        }
        getTouchTracker().f24917g.setScale(f17, f18);
    }

    @Override // zu3.c, zu3.n
    public zu3.a g() {
        zu3.a g17 = super.g();
        zu3.a0 a0Var = this.D;
        if (a0Var != null) {
            if (g17 != null) {
                bv3.d range = a0Var.f475760c;
                kotlin.jvm.internal.o.g(range, "range");
                g17.f475760c.d(range.c(), range.b());
            }
            if (g17 != null) {
                g17.f475761d = a0Var.f475761d;
            }
            if (g17 instanceof zu3.a0) {
                zu3.a0 a0Var2 = (zu3.a0) g17;
                java.lang.String str = this.E;
                a0Var2.getClass();
                kotlin.jvm.internal.o.g(str, "<set-?>");
                a0Var2.f475768k = str;
            }
        }
        return g17;
    }

    @Override // zu3.c, cw3.s
    public zu3.a getEditorData() {
        return this.D;
    }

    public final java.lang.String getFont() {
        return this.E;
    }

    @Override // zu3.c, cw3.s
    public cw3.j getType() {
        return cw3.j.f224165d;
    }

    public final void k(zu3.a0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        setText(item);
        setViewMatrix(item.f475763f);
        getTouchTracker().f24917g.set(item.f475763f);
        setSourceDataType(zu3.e.f475796e);
    }

    public final void setFont(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.E = str;
    }

    public final void setText(zu3.a0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.D = item;
        android.graphics.Bitmap c17 = c(item);
        setText(item.f475764g);
        setSourceDataType(zu3.e.f475796e);
        setColor(item.f475765h);
        setTextBg(item.f475766i);
        this.E = item.f475768k;
        if (getBitmap() == null) {
            getTouchTracker().f24917g.postTranslate((-getWidth()) / 2.0f, -((((getDisplayRect().top + getDisplayRect().bottom) / 2) - ((getValidRect().top + getValidRect().bottom) / 2.0f)) + (getHeight() / 2.0f)));
        }
        if (getBitmap() != null) {
            getTouchTracker().f24917g.preTranslate(r7.getWidth() / 2.0f, r7.getHeight() / 2.0f);
        }
        setBitmap(c17);
        postInvalidate();
    }
}
