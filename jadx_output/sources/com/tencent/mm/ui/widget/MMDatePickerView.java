package com.tencent.mm.ui.widget;

/* loaded from: classes.dex */
public class MMDatePickerView extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f211312d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f211313e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f211314f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSpinnerDatePicker f211315g;

    public MMDatePickerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.byb, this);
        this.f211312d = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.ptb);
        this.f211313e = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.jqe);
        this.f211314f = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.cqv);
        this.f211315g = (com.tencent.mm.ui.widget.MMSpinnerDatePicker) inflate.findViewById(com.tencent.mm.R.id.jlu);
        this.f211312d.setOnClickListener(this);
        this.f211313e.setOnClickListener(this);
        this.f211314f.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/MMDatePickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        if (id6 == com.tencent.mm.R.id.ptb) {
            this.f211315g.setPickerMode(0);
        } else if (id6 == com.tencent.mm.R.id.jqe) {
            this.f211315g.setPickerMode(1);
        } else {
            this.f211315g.setPickerMode(2);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/MMDatePickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public MMDatePickerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
