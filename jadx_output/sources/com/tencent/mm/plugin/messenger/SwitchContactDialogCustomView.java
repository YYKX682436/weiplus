package com.tencent.mm.plugin.messenger;

/* loaded from: classes4.dex */
public class SwitchContactDialogCustomView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f148612d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f148613e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f148614f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f148615g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f148616h;

    public SwitchContactDialogCustomView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487995du, this);
        this.f148612d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        this.f148613e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cgi);
        this.f148614f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486304kv1);
        this.f148615g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484050cu2);
        this.f148616h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nqa);
    }

    public void setContent(java.lang.String str) {
        this.f148613e.setText(str);
    }

    public void setDesc(java.lang.String str) {
        this.f148615g.setText(str);
    }

    public void setOnPhotoOnClick(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView = this.f148614f;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setPhoto(java.lang.String str) {
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f148614f, str, null);
    }

    public void setSubDesc(java.lang.String str) {
        this.f148616h.setText(str);
    }

    public void setTilte(java.lang.String str) {
        this.f148612d.setText(str);
    }
}
