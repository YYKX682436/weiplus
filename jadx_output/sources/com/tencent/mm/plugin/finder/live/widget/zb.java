package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class zb extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f120556d;

    /* renamed from: e, reason: collision with root package name */
    public float f120557e;

    /* renamed from: f, reason: collision with root package name */
    public float f120558f;

    /* renamed from: g, reason: collision with root package name */
    public float f120559g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Path f120560h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f120561i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f120560h = new android.graphics.Path();
        this.f120561i = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (!this.f120556d) {
            super.onDraw(canvas);
            return;
        }
        boolean z17 = this.f120561i;
        android.graphics.Path path = this.f120560h;
        if (z17) {
            path.reset();
            if (this.f120556d) {
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                path.addCircle(width, height, this.f120557e, android.graphics.Path.Direction.CW);
                android.graphics.Path path2 = new android.graphics.Path();
                path2.addCircle(width + this.f120558f, height, this.f120557e + this.f120559g, android.graphics.Path.Direction.CW);
                path.op(path2, android.graphics.Path.Op.DIFFERENCE);
                this.f120561i = false;
            } else {
                this.f120561i = false;
            }
        }
        int save = canvas.save();
        canvas.clipPath(path);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f120561i = true;
    }
}
