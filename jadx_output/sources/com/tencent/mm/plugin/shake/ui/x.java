package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.ImageView f162340a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f162341b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f162342c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f162343d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f162344e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f162345f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f162346g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f162347h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f162348i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.LinearLayout f162349j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f162350k;

    public x(com.tencent.mm.plugin.shake.ui.y yVar) {
    }

    public void a() {
        android.widget.ImageView imageView = this.f162340a;
        if (imageView != null) {
            imageView.setImageDrawable(null);
            this.f162340a.setVisibility(8);
        }
        android.widget.TextView textView = this.f162341b;
        if (textView != null) {
            textView.setText("");
            this.f162341b.setVisibility(8);
        }
        android.widget.TextView textView2 = this.f162343d;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.ImageView imageView2 = this.f162344e;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        android.widget.TextView textView3 = this.f162345f;
        if (textView3 != null) {
            textView3.setText("");
            this.f162345f.setVisibility(8);
        }
        android.widget.TextView textView4 = this.f162346g;
        if (textView4 != null) {
            textView4.setVisibility(8);
            android.view.View view = this.f162342c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$ShakeItemListAdapter$ViewHolder", "clear", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$ShakeItemListAdapter$ViewHolder", "clear", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView3 = this.f162347h;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        android.widget.TextView textView5 = this.f162348i;
        if (textView5 != null) {
            textView5.setText("");
            this.f162348i.setVisibility(8);
        }
    }
}
