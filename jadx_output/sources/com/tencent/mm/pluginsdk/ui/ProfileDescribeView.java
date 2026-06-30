package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class ProfileDescribeView extends com.tencent.mm.pluginsdk.ui.ProfileItemView {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f189801e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f189802f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f189803g;

    public ProfileDescribeView(android.content.Context context) {
        super(context, null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ProfileItemView
    public void a() {
        this.f189801e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ccr);
        this.f189802f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cct);
        this.f189803g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.cul);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ProfileItemView
    public int getLayout() {
        return com.tencent.mm.R.layout.cav;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public ProfileDescribeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileDescribeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
