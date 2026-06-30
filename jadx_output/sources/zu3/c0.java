package zu3;

/* loaded from: classes10.dex */
public final class c0 extends zu3.c {
    public final java.lang.String C;
    public final int D;
    public final android.graphics.Matrix E;
    public zu3.a0 F;

    public c0(android.content.Context context) {
        super(context);
        this.C = "MicroMsg.TipItemView";
        this.D = com.tencent.mm.ui.zk.a(context, 32);
        this.E = new android.graphics.Matrix();
        setTextSize(getResources().getDimension(com.tencent.mm.R.dimen.f480345v6));
    }

    public final android.graphics.Bitmap c(zu3.a0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        setSourceDataType(zu3.e.f475799h);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText photoEditText = new com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText(context);
        photoEditText.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingLeft(), getPaddingTop());
        photoEditText.setTextColor(item.f475765h);
        photoEditText.setTextBackground(item.f475766i);
        photoEditText.setTextSize(0, getTextSize());
        photoEditText.setText(item.f475764g);
        photoEditText.setSingleLine(false);
        photoEditText.setTypeface(photoEditText.getTypeface(), 1);
        if (item.f475766i == 0 && item.f475765h != -16777216) {
            pm0.v.c(photoEditText);
        }
        lt3.n nVar = lt3.n.f321260a;
        android.graphics.Rect rect = lt3.n.f321262c;
        int i17 = rect.left;
        int i18 = this.D;
        photoEditText.setMaxWidth(i18 >= i17 ? rect.width() - ((i18 - rect.left) * 2) : rect.width());
        photoEditText.measure(0, 0);
        int width = (photoEditText.getMeasuredWidth() <= 0 || photoEditText.getMeasuredWidth() > rect.width()) ? rect.width() : photoEditText.getMeasuredWidth();
        int height = (photoEditText.getMeasuredHeight() <= 0 || photoEditText.getMeasuredHeight() > rect.height()) ? rect.height() : photoEditText.getMeasuredHeight();
        com.tencent.mars.xlog.Log.i(this.C, "measuredWidth:" + photoEditText.getMeasuredWidth() + " , measuredHeight:" + photoEditText.getMeasuredHeight());
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/item/TipItemView", "createBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/TextItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/ui/editor/item/TipItemView", "createBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/TextItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        photoEditText.draw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        photoEditText.getLayout().draw(canvas);
        canvas.restore();
        return createBitmap;
    }

    @Override // zu3.c, zu3.n
    public zu3.a g() {
        zu3.a g17 = super.g();
        if (g17 != null) {
            g17.f475758a = zu3.e.f475799h;
        }
        return g17;
    }

    @Override // zu3.c, cw3.s
    public zu3.a getEditorData() {
        android.graphics.Matrix matrix;
        zu3.a0 a0Var = this.F;
        if (a0Var != null && (matrix = a0Var.f475763f) != null) {
            matrix.set(getTouchTracker().f24917g);
        }
        zu3.a0 a0Var2 = this.F;
        if (a0Var2 != null) {
            a0Var2.f475758a = zu3.e.f475799h;
        }
        return this.F;
    }

    @Override // zu3.c, cw3.s
    public cw3.j getType() {
        return cw3.j.f224166e;
    }

    @Override // zu3.c, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        android.graphics.Matrix matrix = this.E;
        matrix.set(getTouchTracker().f24917g);
        boolean onTouchEvent = super.onTouchEvent(event);
        getTouchTracker().f24917g.set(matrix);
        return onTouchEvent;
    }

    public final void setText(zu3.a0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.F = item;
        setText(item.f475764g);
        android.graphics.Bitmap c17 = c(item);
        setSourceDataType(zu3.e.f475799h);
        setColor(item.f475765h);
        setTextBg(item.f475766i);
        int i17 = item.f475767j;
        if (i17 != 0) {
            i17 += com.tencent.mm.ui.zk.a(getContext(), 24);
        }
        setMarginBottom(i17);
        setBitmap(c17);
        if (getBitmap() != null) {
            float height = (((getValidRect().height() - com.tencent.mm.ui.zk.a(getContext(), 128)) - com.tencent.mm.ui.bl.c(getContext())) - getMarginBottom()) - r4.getHeight();
            lt3.n nVar = lt3.n.f321260a;
            int i18 = lt3.n.f321262c.left;
            int i19 = this.D;
            getTouchTracker().f24917g.setTranslate(i19 >= i18 ? i19 : i18, height);
        }
        postInvalidate();
    }
}
