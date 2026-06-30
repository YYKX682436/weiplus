package com.tencent.mm.pluginsdk.ui.wallet;

/* loaded from: classes9.dex */
public class WalletIconImageView extends com.tencent.mm.ui.widget.imageview.WeImageView {

    /* renamed from: r, reason: collision with root package name */
    public int f192038r;

    /* renamed from: s, reason: collision with root package name */
    public int f192039s;

    /* renamed from: t, reason: collision with root package name */
    public int f192040t;

    /* renamed from: u, reason: collision with root package name */
    public int f192041u;

    /* renamed from: v, reason: collision with root package name */
    public int f192042v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f192043w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View.OnClickListener f192044x;

    public WalletIconImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f192038r = -1;
        this.f192039s = 0;
        this.f192040t = 4;
        this.f192041u = -1;
        this.f192042v = -1;
        this.f192044x = null;
    }

    public void setIconContentDescription(java.lang.String str) {
        this.f192043w = str;
    }

    @Override // com.tencent.mm.ui.widget.imageview.WeImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i17) {
        this.f192038r = i17;
        if (i17 != -1) {
            super.setImageResource(i17);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f192044x = onClickListener;
    }

    public void setToClearState(android.view.View.OnClickListener onClickListener) {
        super.setVisibility(0);
        int i17 = this.f192041u;
        if (i17 != -1) {
            super.setImageResource(i17);
            int i18 = this.f192042v;
            if (i18 != -1) {
                super.setColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP);
                setIconColor(this.f192042v);
            }
        } else {
            super.setImageResource(com.tencent.mm.R.drawable.f481913aj3);
            int i19 = this.f192042v;
            if (i19 != -1) {
                super.setColorFilter(i19, android.graphics.PorterDuff.Mode.SRC_ATOP);
                setIconColor(this.f192042v);
            } else {
                super.setColorFilter(getResources().getColor(com.tencent.mm.R.color.FG_2), android.graphics.PorterDuff.Mode.SRC_ATOP);
                setIconColor(getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
        }
        super.setContentDescription(getContext().getString(com.tencent.mm.R.string.f490919b91));
        super.setOnClickListener(onClickListener);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i17) {
        this.f192040t = i17;
        super.setVisibility(i17);
    }

    public void setmUserSetImageIconColor(int i17) {
        this.f192039s = i17;
        if (i17 != -1) {
            setIconColor(i17);
        }
    }

    public void t() {
        super.setVisibility(this.f192040t);
        setImageResource(this.f192038r);
        setContentDescription(this.f192043w);
        int i17 = this.f192039s;
        if (i17 != -1) {
            super.setColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP);
            setIconColor(this.f192039s);
        }
        android.view.View.OnClickListener onClickListener = this.f192044x;
        if (onClickListener != null) {
            super.setOnClickListener(onClickListener);
        }
    }

    public WalletIconImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public WalletIconImageView(android.content.Context context) {
        super(context);
        this.f192038r = -1;
        this.f192039s = 0;
        this.f192040t = 4;
        this.f192041u = -1;
        this.f192042v = -1;
        this.f192044x = null;
    }
}
