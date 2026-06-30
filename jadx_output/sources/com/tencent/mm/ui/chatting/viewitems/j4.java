package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f204226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f204227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f204228g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204229h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f204230i;

    public j4(java.lang.String str, android.view.View view, android.widget.ImageView imageView, android.widget.ImageView imageView2, java.lang.String str2, boolean z17) {
        this.f204225d = str;
        this.f204226e = view;
        this.f204227f = imageView;
        this.f204228g = imageView2;
        this.f204229h = str2;
        this.f204230i = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2CHoneyPay", "get background url: %s", this.f204225d);
        android.view.View view = this.f204226e;
        int height = view.getHeight();
        int width = view.getWidth();
        android.widget.ImageView imageView = this.f204227f;
        if (height > 0 && width > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = height;
            imageView.setLayoutParams(layoutParams);
            android.widget.ImageView imageView2 = this.f204228g;
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            layoutParams2.width = width;
            layoutParams2.height = height;
            imageView2.setLayoutParams(layoutParams2);
        }
        j70.e eVar = (j70.e) ((k70.v) i95.n0.c(k70.v.class));
        java.lang.String str = this.f204229h;
        android.graphics.Bitmap Bi = eVar.Bi(str);
        if (Bi != null) {
            imageView.setImageBitmap(com.tencent.mm.ui.chatting.viewitems.p4.f(Bi, height, width, !this.f204230i));
            return;
        }
        imageView.setTag(com.tencent.mm.R.id.nvv, str);
        ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, new com.tencent.mm.ui.chatting.viewitems.i4(this, height, width));
    }
}
