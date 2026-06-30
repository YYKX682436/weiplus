package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class ToolsBar extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f198348d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f198349e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f198350f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f198351g;

    public ToolsBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        setGravity(16);
        setBackground(com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478323gq));
        this.f198351g = new android.widget.LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479923j2), 1.0f);
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = new com.tencent.mm.ui.widget.imageview.WeImageButton(getContext());
        this.f198348d = weImageButton;
        weImageButton.setImageResource(com.tencent.mm.R.drawable.f481159m4);
        this.f198348d.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f198348d.setBackgroundResource(0);
        this.f198348d.setContentDescription(context.getString(com.tencent.mm.R.string.b4q));
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton2 = new com.tencent.mm.ui.widget.imageview.WeImageButton(getContext());
        this.f198349e = weImageButton2;
        weImageButton2.setImageResource(com.tencent.mm.R.drawable.f481155m1);
        this.f198349e.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f198349e.setBackgroundResource(0);
        this.f198349e.setContentDescription(context.getString(com.tencent.mm.R.string.b4o));
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton3 = new com.tencent.mm.ui.widget.imageview.WeImageButton(getContext());
        this.f198350f = weImageButton3;
        weImageButton3.setImageResource(com.tencent.mm.R.drawable.f481157m3);
        this.f198350f.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f198350f.setBackgroundResource(0);
        this.f198350f.setContentDescription(context.getString(com.tencent.mm.R.string.b4p));
        removeAllViews();
        addView(this.f198348d, this.f198351g);
        addView(this.f198349e, this.f198351g);
        addView(this.f198350f, this.f198351g);
    }

    public void a(int i17, android.view.View.OnClickListener onClickListener) {
        if (i17 == 0) {
            this.f198348d.setOnClickListener(onClickListener);
            return;
        }
        if (i17 == 1) {
            this.f198349e.setOnClickListener(onClickListener);
        } else if (i17 != 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ToolsBar", "set button listener error button index %d", java.lang.Integer.valueOf(i17));
        } else {
            this.f198350f.setOnClickListener(onClickListener);
        }
    }
}
