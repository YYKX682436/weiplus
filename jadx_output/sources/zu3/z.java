package zu3;

/* loaded from: classes10.dex */
public final class z extends zu3.c {
    public final java.lang.String C;
    public final int D;
    public final int E;
    public final int F;
    public final android.graphics.Matrix G;
    public zu3.s H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.C = "MicroMsg.PositionItemView";
        this.D = -1;
        this.E = -1;
        this.F = com.tencent.mm.ui.zk.a(context, 32);
        this.G = new android.graphics.Matrix();
    }

    public final android.graphics.Bitmap c(zu3.s sVar) {
        this.H = sVar;
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(getContext());
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cwe, (android.view.ViewGroup) relativeLayout, true);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.bws);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kys);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.npg);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.nph);
        kotlin.jvm.internal.o.d(textView);
        pm0.v.c(textView);
        kotlin.jvm.internal.o.d(textView2);
        pm0.v.c(textView2);
        textView.setText(sVar.f475826g);
        java.lang.String str = sVar.f475827h;
        textView2.setText(str);
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_location, -1));
        if (android.text.TextUtils.isEmpty(r26.n0.u0(str).toString())) {
            textView.setTextSize(0, com.tencent.mm.ui.zk.a(getContext(), 20));
            imageView2.setVisibility(8);
            textView2.setVisibility(8);
        }
        if (android.text.TextUtils.isEmpty(r26.n0.u0(sVar.f475826g).toString())) {
            textView2.setTextSize(0, com.tencent.mm.ui.zk.a(getContext(), 20));
            textView.setVisibility(8);
            imageView2.setVisibility(8);
        }
        lt3.n nVar = lt3.n.f321260a;
        android.graphics.Rect rect = lt3.n.f321262c;
        int i17 = rect.left;
        int i18 = this.F;
        textView2.setMaxWidth(i18 >= i17 ? rect.width() - ((i18 - rect.left) * 2) : rect.width());
        inflate.measure(0, 0);
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
        com.tencent.mars.xlog.Log.i(this.C, sVar + " parent.measuredWidth:" + inflate.getMeasuredWidth() + " , parent.measuredHeight:" + inflate.getMeasuredHeight());
        int width = (inflate.getMeasuredWidth() <= 0 || inflate.getMeasuredWidth() > rect.width()) ? rect.width() : inflate.getMeasuredWidth();
        int height = (inflate.getMeasuredHeight() <= 0 || inflate.getMeasuredHeight() > rect.height()) ? rect.height() : inflate.getMeasuredHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/item/PositionItemView", "createPositionBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/LocationItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/ui/editor/item/PositionItemView", "createPositionBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/LocationItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        relativeLayout.draw(new android.graphics.Canvas(createBitmap));
        setColor(this.D);
        setTextBg(this.E);
        setSourceDataType(zu3.e.f475798g);
        setLocation(sVar);
        setBitmap(createBitmap);
        return createBitmap;
    }

    public final void d(zu3.s item) {
        kotlin.jvm.internal.o.g(item, "item");
        c(item);
        setViewMatrix(item.f475763f);
        getTouchTracker().f24917g.set(item.f475763f);
        setSourceDataType(zu3.e.f475798g);
    }

    @Override // zu3.c, cw3.s
    public zu3.a getEditorData() {
        return this.H;
    }

    @Override // zu3.c, cw3.s
    public cw3.j getType() {
        return cw3.j.f224167f;
    }

    @Override // zu3.c, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        android.graphics.Matrix matrix = this.G;
        matrix.set(getTouchTracker().f24917g);
        boolean onTouchEvent = super.onTouchEvent(event);
        getTouchTracker().f24917g.set(matrix);
        return onTouchEvent;
    }

    public final void setLocation(r45.tl5 location) {
        kotlin.jvm.internal.o.g(location, "location");
        java.lang.String City = location.f386554f;
        kotlin.jvm.internal.o.f(City, "City");
        java.lang.String poiName = location.f386555g;
        kotlin.jvm.internal.o.f(poiName, "poiName");
        c(new zu3.s(City, poiName, location.f386552d, location.f386553e, new android.graphics.Matrix()));
        if (getBitmap() != null) {
            float height = ((getValidRect().height() - com.tencent.mm.ui.zk.a(getContext(), 128)) - com.tencent.mm.ui.bl.c(getContext())) - r8.getHeight();
            lt3.n nVar = lt3.n.f321260a;
            int i17 = lt3.n.f321262c.left;
            int i18 = this.F;
            getTouchTracker().f24917g.setTranslate(i18 >= i17 ? i18 : i17, height);
        }
    }

    @Override // zu3.c, cw3.s
    public void setValidArea(android.graphics.Rect validRect) {
        kotlin.jvm.internal.o.g(validRect, "validRect");
        getValidRect().set(validRect);
    }
}
