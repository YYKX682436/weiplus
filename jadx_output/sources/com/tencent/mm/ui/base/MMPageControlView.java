package com.tencent.mm.ui.base;

/* loaded from: classes12.dex */
public class MMPageControlView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f197513d;

    /* renamed from: e, reason: collision with root package name */
    public int f197514e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f197515f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f197516g;

    /* renamed from: h, reason: collision with root package name */
    public int f197517h;

    public MMPageControlView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197515f = new java.util.HashMap();
        this.f197517h = com.tencent.mm.R.layout.c1t;
        this.f197513d = context;
    }

    public void a(int i17) {
        removeAllViews();
        int i18 = this.f197514e;
        if (i17 >= i18) {
            return;
        }
        for (int i19 = 0; i19 < i18; i19++) {
            this.f197516g = null;
            java.util.Map map = this.f197515f;
            if (i17 == i19) {
                if (((java.util.HashMap) map).size() > i19) {
                    this.f197516g = (android.widget.ImageView) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i19));
                }
                if (this.f197516g == null) {
                    this.f197516g = (android.widget.ImageView) android.view.View.inflate(this.f197513d, this.f197517h, null).findViewById(com.tencent.mm.R.id.jmn);
                    ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i19), this.f197516g);
                }
                this.f197516g.setSelected(true);
            } else {
                if (((java.util.HashMap) map).size() > i19) {
                    this.f197516g = (android.widget.ImageView) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i19));
                }
                if (this.f197516g == null) {
                    this.f197516g = (android.widget.ImageView) android.view.View.inflate(this.f197513d, this.f197517h, null).findViewById(com.tencent.mm.R.id.jmn);
                    ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i19), this.f197516g);
                }
                this.f197516g.setSelected(false);
            }
            if (i19 == 0) {
                this.f197516g.setPadding(0, 0, 0, 0);
            }
            addView(this.f197516g);
        }
    }

    public int getCount() {
        return this.f197514e;
    }

    public void setIndicatorLayoutRes(int i17) {
        this.f197517h = i17;
    }

    public void setPage(int i17) {
        a(i17);
    }
}
