package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class VideoSeekBarEditorView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar f149259d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f149260e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f149261f;

    public VideoSeekBarEditorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f149259d = (com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar) findViewById(com.tencent.mm.R.id.p0o);
        this.f149260e = (android.widget.Button) findViewById(com.tencent.mm.R.id.d6s);
        this.f149261f = (android.widget.Button) findViewById(com.tencent.mm.R.id.d6w);
    }

    public void b() {
        this.f149259d.g();
        android.view.ViewParent parent = this.f149259d.getParent();
        if (parent instanceof android.widget.LinearLayout) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) parent;
            int indexOfChild = linearLayout.indexOfChild(this.f149259d);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f149259d.getLayoutParams();
            linearLayout.removeView(this.f149259d);
            com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = new com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar(getContext());
            this.f149259d = recyclerThumbSeekBar;
            linearLayout.addView(recyclerThumbSeekBar, indexOfChild, layoutParams);
        }
    }

    public void setCancelButtonClickListener(android.view.View.OnClickListener onClickListener) {
        this.f149260e.setOnClickListener(onClickListener);
    }

    public void setFinishButtonClickListener(android.view.View.OnClickListener onClickListener) {
        this.f149261f.setOnClickListener(onClickListener);
    }

    public void setTextColor(java.lang.String str) {
        if (str != null) {
            this.f149261f.setTextColor(android.graphics.Color.parseColor(str));
        }
    }

    public VideoSeekBarEditorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
