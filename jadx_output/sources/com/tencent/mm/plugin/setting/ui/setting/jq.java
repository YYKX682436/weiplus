package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class jq {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.LinearLayout f161211a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f161212b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f161213c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f161214d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f161215e;

    public void a(java.lang.String str) {
        if (str.equals("downloading")) {
            this.f161211a.setVisibility(0);
            this.f161212b.setVisibility(8);
            this.f161213c.setVisibility(8);
            this.f161214d.setVisibility(8);
            this.f161215e.setVisibility(8);
            return;
        }
        if (str.equals("downloaded")) {
            this.f161211a.setVisibility(8);
            this.f161212b.setVisibility(0);
            this.f161213c.setVisibility(8);
            this.f161214d.setVisibility(8);
            this.f161215e.setVisibility(8);
            return;
        }
        if (str.equals("undownloaded")) {
            this.f161211a.setVisibility(8);
            this.f161212b.setVisibility(8);
            this.f161213c.setVisibility(0);
            this.f161214d.setVisibility(8);
            this.f161215e.setVisibility(8);
            return;
        }
        if (str.equals("using")) {
            this.f161211a.setVisibility(8);
            this.f161212b.setVisibility(8);
            this.f161213c.setVisibility(8);
            this.f161214d.setVisibility(0);
            this.f161215e.setVisibility(8);
            return;
        }
        if (str.equals("canceling")) {
            this.f161211a.setVisibility(8);
            this.f161212b.setVisibility(8);
            this.f161213c.setVisibility(8);
            this.f161214d.setVisibility(8);
            this.f161215e.setVisibility(0);
        }
    }
}
