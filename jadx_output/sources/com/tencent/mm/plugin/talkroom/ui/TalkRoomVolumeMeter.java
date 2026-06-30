package com.tencent.mm.plugin.talkroom.ui;

/* loaded from: classes15.dex */
public class TalkRoomVolumeMeter extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public fh4.d0 f172476d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f172477e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f172478f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f172479g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f172480h;

    public TalkRoomVolumeMeter(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }

    private void setShowErr(boolean z17) {
        this.f172479g.setVisibility(z17 ? 0 : 8);
    }

    private void setShowRed(boolean z17) {
        this.f172476d.f262688w = z17;
    }

    public final void a() {
        this.f172476d = new fh4.d0(this, getContext());
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f172477e = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        this.f172477e.setImageResource(com.tencent.mm.R.drawable.bo6);
        this.f172477e.setVisibility(0);
        android.widget.ImageView imageView2 = new android.widget.ImageView(getContext());
        this.f172478f = imageView2;
        imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.f172478f.setImageResource(com.tencent.mm.R.drawable.f482158bo5);
        this.f172478f.setVisibility(8);
        android.widget.ImageView imageView3 = new android.widget.ImageView(getContext());
        this.f172479g = imageView3;
        imageView3.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.f172479g.setImageResource(com.tencent.mm.R.drawable.f482155bo2);
        this.f172479g.setVisibility(8);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.f172480h = frameLayout;
        frameLayout.addView(this.f172476d);
        this.f172480h.addView(this.f172478f);
        this.f172480h.setVisibility(8);
        addView(this.f172480h);
        addView(this.f172479g);
        addView(this.f172477e);
        setBackgroundColor(-16777216);
        bringChildToFront(this.f172477e);
    }

    public void setMax(int i17) {
        this.f172476d.f262672d = i17;
    }

    public void setMaxPos(int i17) {
        this.f172476d.f262674f = i17;
    }

    public void setMinPos(int i17) {
        this.f172476d.f262673e = i17;
    }

    public void setShowFlame(boolean z17) {
        android.graphics.Canvas lockCanvas;
        this.f172480h.setVisibility(z17 ? 0 : 8);
        if (z17) {
            fh4.d0 d0Var = this.f172476d;
            if (d0Var.f262689x) {
                return;
            }
            d0Var.f262689x = true;
            d0Var.f262683r.c(100L, 100L);
            return;
        }
        fh4.d0 d0Var2 = this.f172476d;
        if (d0Var2.f262689x) {
            d0Var2.f262689x = false;
            float f17 = d0Var2.f262686u;
            if (f17 >= d0Var2.f262673e && f17 <= d0Var2.f262674f && d0Var2.f262677i != null && d0Var2.f262676h != null && (lockCanvas = d0Var2.f262675g.lockCanvas()) != null && d0Var2.f262680o != null) {
                lockCanvas.setDrawFilter(d0Var2.f262687v);
                int i17 = (int) 0.0f;
                d0Var2.f262680o.set(0, i17, d0Var2.f262682q, d0Var2.f262681p + i17);
                lockCanvas.drawBitmap(d0Var2.f262688w ? d0Var2.f262677i : d0Var2.f262676h, (android.graphics.Rect) null, d0Var2.f262680o, d0Var2.f262679n);
                d0Var2.f262675g.unlockCanvasAndPost(lockCanvas);
            }
            d0Var2.f262683r.d();
        }
    }

    public void setValue(int i17) {
        fh4.d0 d0Var = this.f172476d;
        if (i17 < 0) {
            i17 = 0;
        } else {
            int i18 = d0Var.f262672d;
            if (i17 > i18) {
                i17 = i18;
            }
        }
        d0Var.getClass();
        float f17 = d0Var.f262674f;
        d0Var.f262686u = f17 - ((f17 - d0Var.f262673e) * ((i17 * 1.0f) / d0Var.f262672d));
    }

    public TalkRoomVolumeMeter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
