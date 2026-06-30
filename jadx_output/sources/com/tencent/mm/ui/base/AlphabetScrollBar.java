package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class AlphabetScrollBar extends com.tencent.mm.ui.base.VerticalScrollBar {
    public int C;
    public android.graphics.drawable.Drawable D;
    public android.graphics.drawable.Drawable E;
    public int F;
    public android.graphics.drawable.Drawable G;
    public android.graphics.drawable.Drawable H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public android.graphics.drawable.Drawable f197223J;
    public android.graphics.drawable.Drawable K;
    public int L;
    public com.tencent.mm.ui.widget.imageview.WeImageView M;
    public com.tencent.mm.ui.widget.imageview.WeImageView N;

    public AlphabetScrollBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = -1;
        this.F = 0;
        this.I = 0;
        this.L = 0;
    }

    @Override // com.tencent.mm.ui.base.VerticalScrollBar
    public void a(android.graphics.Canvas canvas, float f17, float f18, float f19, android.graphics.Paint paint, int i17) {
        java.lang.String[] strArr = this.f197706f;
        if (i17 < strArr.length && strArr[i17].equals("🔍")) {
            f18 -= 10.0f;
        }
        canvas.drawCircle(f17, f18, f19, paint);
    }

    @Override // com.tencent.mm.ui.base.VerticalScrollBar
    public void b(android.graphics.Canvas canvas, float f17, float f18, android.graphics.Paint paint, int i17, boolean z17) {
        java.lang.String[] strArr = this.f197706f;
        if (i17 < strArr.length && "🔍".equals(strArr[i17])) {
            if (this.D == null || this.E == null) {
                if (this.C != -1) {
                    android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_search);
                    com.tencent.mm.ui.uk.f(drawable, this.C);
                    this.D = drawable;
                } else if (com.tencent.mm.ui.bk.C()) {
                    android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_search);
                    com.tencent.mm.ui.uk.f(drawable2, getResources().getColor(com.tencent.mm.R.color.FG_2));
                    this.D = drawable2;
                } else {
                    android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_search);
                    com.tencent.mm.ui.uk.f(drawable3, getResources().getColor(com.tencent.mm.R.color.FG_0));
                    this.D = drawable3;
                }
                this.F = i65.a.b(getContext(), 13);
                android.graphics.drawable.Drawable drawable4 = getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_search);
                com.tencent.mm.ui.uk.f(drawable4, getResources().getColor(com.tencent.mm.R.color.f478553an));
                this.E = drawable4;
            }
            if (!z17) {
                android.graphics.drawable.Drawable drawable5 = this.D;
                int i18 = this.F;
                drawable5.setBounds((int) (f17 - (i18 / 2)), (int) ((f18 - (i18 / 2)) - 10.0f), (int) (f17 + (i18 / 2)), (int) ((f18 + (i18 / 2)) - 10.0f));
                this.D.draw(canvas);
                return;
            }
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f197718u);
            canvas.drawCircle(f17, f18 - 10.0f, this.f197719v, paint);
            android.graphics.drawable.Drawable drawable6 = this.E;
            int i19 = this.F;
            drawable6.setBounds((int) (f17 - (i19 / 2)), (int) ((f18 - (i19 / 2)) - 10.0f), (int) (f17 + (i19 / 2)), (int) ((f18 + (i19 / 2)) - 10.0f));
            this.E.draw(canvas);
            return;
        }
        java.lang.String[] strArr2 = this.f197706f;
        if (i17 < strArr2.length && (com.tencent.shadow.core.common.HostConstants.MANAGER_APPID.equals(strArr2[i17]) || "owner".equals(this.f197706f[i17]))) {
            if (this.G == null || this.H == null) {
                if (com.tencent.mm.ui.bk.C()) {
                    android.graphics.drawable.Drawable drawable7 = getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_me);
                    com.tencent.mm.ui.uk.f(drawable7, getResources().getColor(com.tencent.mm.R.color.FG_2));
                    this.G = drawable7;
                } else {
                    android.graphics.drawable.Drawable drawable8 = getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_me);
                    com.tencent.mm.ui.uk.f(drawable8, getResources().getColor(com.tencent.mm.R.color.FG_0));
                    this.G = drawable8;
                }
                this.I = i65.a.b(getContext(), 13);
                android.graphics.drawable.Drawable drawable9 = getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_me);
                com.tencent.mm.ui.uk.f(drawable9, getResources().getColor(com.tencent.mm.R.color.f478553an));
                this.H = drawable9;
            }
            if (!z17) {
                android.graphics.drawable.Drawable drawable10 = this.G;
                int i27 = this.I;
                drawable10.setBounds((int) (f17 - (i27 / 2)), (int) ((f18 - (i27 / 2)) - 10.0f), (int) (f17 + (i27 / 2)), (int) ((f18 + (i27 / 2)) - 10.0f));
                this.G.draw(canvas);
                return;
            }
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f197718u);
            canvas.drawCircle(f17, f18 - 10.0f, this.f197719v, paint);
            android.graphics.drawable.Drawable drawable11 = this.H;
            int i28 = this.I;
            drawable11.setBounds((int) (f17 - (i28 / 2)), (int) ((f18 - (i28 / 2)) - 10.0f), (int) (f17 + (i28 / 2)), (int) ((f18 + (i28 / 2)) - 10.0f));
            this.H.draw(canvas);
            return;
        }
        java.lang.String[] strArr3 = this.f197706f;
        if (i17 >= strArr3.length || !"openIm".equals(strArr3[i17])) {
            super.b(canvas, f17, f18, paint, i17, z17);
            return;
        }
        if (this.f197223J == null) {
            if (com.tencent.mm.ui.bk.C()) {
                android.graphics.drawable.Drawable drawable12 = getResources().getDrawable(com.tencent.mm.R.raw.open_im_gray_logo);
                com.tencent.mm.ui.uk.f(drawable12, getResources().getColor(com.tencent.mm.R.color.FG_2));
                this.f197223J = drawable12;
            } else {
                android.graphics.drawable.Drawable drawable13 = getResources().getDrawable(com.tencent.mm.R.raw.open_im_gray_logo);
                com.tencent.mm.ui.uk.f(drawable13, getResources().getColor(com.tencent.mm.R.color.FG_0));
                this.f197223J = drawable13;
            }
            android.graphics.drawable.Drawable drawable14 = getResources().getDrawable(com.tencent.mm.R.raw.open_im_gray_logo);
            com.tencent.mm.ui.uk.f(drawable14, getResources().getColor(com.tencent.mm.R.color.f478553an));
            this.K = drawable14;
            this.L = i65.a.b(getContext(), 13);
        }
        if (!z17) {
            android.graphics.drawable.Drawable drawable15 = this.f197223J;
            int i29 = this.L;
            drawable15.setBounds((int) (f17 - (i29 / 2)), (int) ((f18 - (i29 / 2)) - 10.0f), (int) (f17 + (i29 / 2)), (int) ((f18 + (i29 / 2)) - 10.0f));
            this.f197223J.draw(canvas);
            return;
        }
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(this.f197718u);
        canvas.drawCircle(f17, f18 - 10.0f, this.f197719v, paint);
        android.graphics.drawable.Drawable drawable16 = this.K;
        int i37 = this.L;
        drawable16.setBounds((int) (f17 - (i37 / 2)), (int) ((f18 - (i37 / 2)) - 10.0f), (int) (f17 + (i37 / 2)), (int) ((f18 + (i37 / 2)) - 10.0f));
        this.K.draw(canvas);
    }

    @Override // com.tencent.mm.ui.base.VerticalScrollBar
    public void c() {
        this.f197706f = new java.lang.String[]{"↑", "☆", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "U", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "#"};
        this.f197704d = 1.6f;
        this.f197705e = 79;
    }

    @Override // com.tencent.mm.ui.base.VerticalScrollBar
    public void d(java.lang.String str) {
        if (this.M == null) {
            this.M = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f197723z.findViewById(com.tencent.mm.R.id.mvc);
        }
        if (this.N == null) {
            this.N = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f197723z.findViewById(com.tencent.mm.R.id.mvn);
        }
        if (str.equals("🔍")) {
            this.M.setImageResource(com.tencent.mm.R.raw.icons_filled_search);
            this.M.setVisibility(0);
            this.f197713p.setVisibility(8);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.N;
            if (weImageView != null) {
                weImageView.setVisibility(8);
                return;
            }
            return;
        }
        if (str.equals(com.tencent.shadow.core.common.HostConstants.MANAGER_APPID) || str.equals("owner")) {
            this.M.setImageResource(com.tencent.mm.R.raw.icons_outlined_me);
            this.M.setVisibility(0);
            this.f197713p.setVisibility(8);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.N;
            if (weImageView2 != null) {
                weImageView2.setVisibility(8);
                return;
            }
            return;
        }
        if (str.equals("openIm")) {
            this.M.setVisibility(8);
            this.f197713p.setVisibility(8);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.N;
            if (weImageView3 != null) {
                weImageView3.setVisibility(0);
                return;
            }
            return;
        }
        this.f197713p.setVisibility(0);
        this.M.setVisibility(8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.N;
        if (weImageView4 != null) {
            weImageView4.setVisibility(8);
        }
        super.d(str);
    }

    @Override // com.tencent.mm.ui.base.VerticalScrollBar
    public int getToastLayoutId() {
        return com.tencent.mm.R.layout.cna;
    }

    public void setAlphabet(java.lang.String[] strArr) {
        this.f197706f = strArr;
        this.f197709i = 0.0f;
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        this.f197718u = i17;
    }

    public void setSearchIconColor(int i17) {
        this.C = i17;
    }

    public void setTextColor(int i17) {
        this.f197716s = i17;
    }

    public void setWhiteTextColor(int i17) {
        this.f197717t = i17;
    }
}
