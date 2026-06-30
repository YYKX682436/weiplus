package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class CustomOptionPickNew extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f212210d;

    /* renamed from: e, reason: collision with root package name */
    public final w51.e f212211e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f212212f;

    /* renamed from: g, reason: collision with root package name */
    public int f212213g;

    /* renamed from: h, reason: collision with root package name */
    public int f212214h;

    public CustomOptionPickNew(android.content.Context context) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve));
        this.f212212f = context;
        this.f212211e = new w51.e(context);
        b();
    }

    public java.lang.String a() {
        this.f212211e.e();
        return this.f212210d[this.f212213g];
    }

    public void b() {
        com.tencent.mm.ui.widget.picker.d dVar = new com.tencent.mm.ui.widget.picker.d(this);
        android.content.Context context = this.f212212f;
        t51.a aVar = new t51.a(context, dVar);
        int i17 = this.f212214h;
        u51.a aVar2 = aVar.f415707a;
        aVar2.f424784e = i17;
        aVar2.f424791l = b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_1);
        w51.e eVar = this.f212211e;
        aVar.a(eVar);
        setDividerHeight(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480137pc));
        setItemHeight(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz));
        setDividerColor(b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_1));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        w51.i iVar = eVar.f442972p;
        iVar.f442981b.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize2);
        com.tencent.mm.picker.base.view.WheelView wheelView = iVar.f442981b;
        wheelView.e(b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_9));
        wheelView.f72379d = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        wheelView.invalidate();
        wheelView.setBackgroundColor(b3.l.getColor(context, com.tencent.mm.R.color.f478494f));
    }

    public void c(int i17) {
        this.f212211e.d().setCurrentItem(i17);
    }

    public int getValue() {
        this.f212211e.e();
        return this.f212213g;
    }

    public com.tencent.mm.picker.base.view.WheelView getView() {
        return this.f212211e.d();
    }

    public void setDividerColor(int i17) {
        this.f212211e.f442972p.f442981b.setDividerColor(i17);
    }

    public void setDividerHeight(float f17) {
        this.f212211e.f442972p.f442981b.setDividerHeight(f17);
    }

    public void setItemHeight(int i17) {
        this.f212211e.f442972p.getClass();
    }

    public void setOnValueChangedListener(v51.c cVar) {
        w51.e eVar = this.f212211e;
        eVar.f442966g.f424783d = cVar;
        eVar.f442972p.f442983d = cVar;
    }

    public void setOptionsArray(java.lang.String[] strArr) {
        this.f212210d = strArr;
        this.f212211e.f(java.util.Arrays.asList(strArr));
    }

    public void setValue(int i17) {
        this.f212214h = i17;
    }

    public CustomOptionPickNew(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve), attributeSet);
        this.f212212f = context;
        this.f212211e = new w51.e(context);
        b();
    }

    public CustomOptionPickNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212212f = context;
        this.f212211e = new w51.e(context);
        b();
    }
}
