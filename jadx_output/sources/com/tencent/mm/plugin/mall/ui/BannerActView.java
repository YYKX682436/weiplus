package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes3.dex */
public class BannerActView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f148227d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f148228e;

    public BannerActView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f148228e = (android.widget.TextView) android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488193k3, (android.view.ViewGroup) this, true).findViewById(com.tencent.mm.R.id.j9g);
        setOnClickListener(new com.tencent.mm.plugin.mall.ui.a(this));
    }

    public void setActivityList(java.util.List<bt4.a> list) {
        this.f148227d = list;
        if (list != null) {
            boolean z17 = true;
            if (list.size() >= 1) {
                java.util.List list2 = this.f148227d;
                gm0.j1.i();
                int intValue = ((java.lang.Integer) gm0.j1.u().c().l(270342, 0)).intValue();
                if (list2 != null) {
                    for (int size = list2.size() - 1; size >= 0; size--) {
                        int i17 = ((bt4.a) list2.get(size)).f24466a;
                        if (((bt4.a) list2.get(size)).f24466a > intValue) {
                            break;
                        }
                    }
                }
                z17 = false;
                if (!z17) {
                    setVisibility(8);
                    return;
                } else {
                    this.f148228e.setText(((bt4.a) this.f148227d.get(0)).f24467b);
                    setVisibility(0);
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BannerActivityView", "func[setActivityList] actList null");
        setVisibility(8);
    }

    public void setData(at4.c1 c1Var) {
        if (c1Var == null) {
            setVisibility(8);
        } else {
            this.f148228e.setText(c1Var.field_bulletin_content);
            setVisibility(0);
        }
    }
}
