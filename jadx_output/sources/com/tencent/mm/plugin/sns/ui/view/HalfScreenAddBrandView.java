package com.tencent.mm.plugin.sns.ui.view;

/* loaded from: classes.dex */
public class HalfScreenAddBrandView extends android.widget.RelativeLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f170648d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f170649e;

    public HalfScreenAddBrandView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/view/HalfScreenAddBrandView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.f483481b01) {
            throw null;
        }
        if (view.getId() == com.tencent.mm.R.id.bys) {
            throw null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/view/HalfScreenAddBrandView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
    }

    public HalfScreenAddBrandView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489168bj5, this);
        this.f170648d = inflate;
        this.f170649e = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.bys);
        ((android.widget.Button) this.f170648d.findViewById(com.tencent.mm.R.id.f483481b01)).setOnClickListener(this);
        this.f170649e.setOnClickListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
    }
}
