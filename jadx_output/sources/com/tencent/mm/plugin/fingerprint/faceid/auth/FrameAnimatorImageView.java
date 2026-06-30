package com.tencent.mm.plugin.fingerprint.faceid.auth;

/* loaded from: classes13.dex */
public class FrameAnimatorImageView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f136978d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.DrawFilter f136979e;

    public FrameAnimatorImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f136978d = null;
        this.f136979e = new android.graphics.PaintFlagsDrawFilter(0, 3);
    }

    public void a(int i17, lz2.c cVar) {
        android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(i17);
        setImageDrawable(drawable);
        if (drawable instanceof android.graphics.drawable.AnimationDrawable) {
            android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) drawable;
            animationDrawable.start();
            if (cVar != null) {
                cVar.onStart();
            }
            if (animationDrawable.isOneShot()) {
                int i18 = 0;
                for (int i19 = 0; i19 < animationDrawable.getNumberOfFrames(); i19++) {
                    i18 += animationDrawable.getDuration(i19);
                }
                if (cVar != null) {
                    lz2.b bVar = new lz2.b(this, cVar);
                    this.f136978d = bVar;
                    com.tencent.mm.sdk.platformtools.u3.i(bVar, i18);
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.setDrawFilter(this.f136979e);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        com.tencent.mm.sdk.platformtools.u3.l(this.f136978d);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.sdk.platformtools.u3.l(this.f136978d);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i17) {
        com.tencent.mm.sdk.platformtools.u3.l(this.f136978d);
        super.setImageResource(i17);
    }

    public FrameAnimatorImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f136978d = null;
        this.f136979e = new android.graphics.PaintFlagsDrawFilter(0, 3);
    }
}
