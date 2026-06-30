package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes5.dex */
public class RichTextImageView extends android.widget.LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f166615m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f166616d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f166617e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f166618f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f166619g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f166620h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f166621i;

    public RichTextImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166620h = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("iniViews", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        android.view.View inflate = android.view.View.inflate((android.app.Activity) context, com.tencent.mm.R.layout.ctc, this);
        this.f166617e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m4o);
        this.f166616d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odj);
        this.f166618f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483455aw5);
        this.f166619g = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h9t);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("iniViews", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    public android.widget.ImageView getImageView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageView", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        android.widget.ImageView imageView = this.f166619g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageView", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        return imageView;
    }

    public android.widget.TextView getTitle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        android.widget.TextView textView = this.f166616d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        return textView;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        super.onLayout(z17, i17, i18, i19, i27);
        if (!this.f166620h) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            return;
        }
        if (this.f166621i == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            return;
        }
        this.f166617e.getHeight();
        this.f166617e.getLineHeight();
        int height = this.f166617e.getHeight() / this.f166617e.getLineHeight();
        int lineCount = this.f166617e.getLineCount();
        android.graphics.Rect rect = new android.graphics.Rect();
        int i28 = 0;
        int i29 = 0;
        while (i28 < height) {
            try {
                this.f166617e.getLineBounds(i28, rect);
                i29 += rect.height();
                if (i29 > this.f166617e.getHeight()) {
                    break;
                } else {
                    i28++;
                }
            } catch (java.lang.IndexOutOfBoundsException unused) {
            }
        }
        if (lineCount >= i28 && this.f166620h) {
            if (i28 < 1) {
                i28 = 1;
            }
            int lineVisibleEnd = this.f166617e.getLayout().getLineVisibleEnd(i28 - 1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bottomH:");
            sb6.append(this.f166618f.getHeight());
            sb6.append("length");
            java.lang.String str = this.f166621i;
            sb6.append(str.substring(lineVisibleEnd, str.length()).length());
            com.tencent.mars.xlog.Log.e("test", sb6.toString());
            com.tencent.mars.xlog.Log.e("test", "bottomH:" + this.f166618f.getHeight());
            if (this.f166618f.getText().length() > 0) {
                this.f166618f.setVisibility(0);
                this.f166620h = false;
                new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.plugin.sns.ui.g8(this, lineVisibleEnd));
            }
            com.tencent.mars.xlog.Log.e("test", "bottom:" + i27 + "   mesH:" + this.f166618f.getMeasuredHeight());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    public void setImage(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImage", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        this.f166619g.setImageResource(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    public void setText(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        this.f166620h = true;
        if (str == null) {
            str = "";
        }
        this.f166621i = str;
        this.f166617e.setText(str);
        requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    public void setTitle(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitle", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        this.f166616d.setText(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitle", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    public void setImage(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImage", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        this.f166619g.setImageBitmap(bitmap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }
}
