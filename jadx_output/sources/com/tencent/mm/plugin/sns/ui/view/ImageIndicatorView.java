package com.tencent.mm.plugin.sns.ui.view;

/* loaded from: classes4.dex */
public class ImageIndicatorView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f170650d;

    /* renamed from: e, reason: collision with root package name */
    public int f170651e;

    /* renamed from: f, reason: collision with root package name */
    public int f170652f;

    /* renamed from: g, reason: collision with root package name */
    public int f170653g;

    /* renamed from: h, reason: collision with root package name */
    public int f170654h;

    /* renamed from: i, reason: collision with root package name */
    public int f170655i;

    public ImageIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170650d = new android.graphics.Paint();
        this.f170651e = 0;
        this.f170652f = 0;
        this.f170653g = 0;
        this.f170654h = 0;
        this.f170655i = 0;
        this.f170652f = com.tencent.mm.ui.zk.a(getContext(), 4);
        this.f170653g = com.tencent.mm.ui.zk.a(getContext(), 2);
    }

    public void a(int i17) {
        this.f170651e = i17;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f170651e > 0) {
            int measuredWidth = getMeasuredWidth() / 2;
            int i17 = this.f170651e;
            if (i17 > 1) {
                int i18 = this.f170653g;
                measuredWidth -= (((i18 + i18) * i17) + ((i17 - 1) * this.f170652f)) / 2;
            }
            for (int i19 = 0; i19 < this.f170651e; i19++) {
                android.graphics.Paint paint = this.f170650d;
                if (i19 == 0) {
                    if (this.f170654h != 0) {
                        paint.setColor(getContext().getResources().getColor(this.f170654h));
                    } else {
                        paint.setColor(getContext().getResources().getColor(com.tencent.mm.R.color.Orange_100));
                    }
                } else if (this.f170655i != 0) {
                    paint.setColor(getContext().getResources().getColor(this.f170655i));
                } else {
                    paint.setColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_90));
                }
                int measuredHeight = getMeasuredHeight() - (getPaddingBottom() + getPaddingTop());
                int i27 = this.f170652f;
                int i28 = this.f170653g;
                canvas.drawCircle(((i27 + i28 + i28) * i19) + measuredWidth, getPaddingTop() + (measuredHeight / 2), this.f170653g, paint);
            }
        }
    }

    public ImageIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f170650d = new android.graphics.Paint();
        this.f170651e = 0;
        this.f170652f = 0;
        this.f170653g = 0;
        this.f170654h = 0;
        this.f170655i = 0;
        this.f170652f = com.tencent.mm.ui.zk.a(getContext(), 4);
        this.f170653g = com.tencent.mm.ui.zk.a(getContext(), 2);
    }
}
