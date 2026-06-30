package com.tencent.mm.ui.applet;

/* loaded from: classes14.dex */
public class SecurityImage extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f197190p = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f197191d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f197192e;

    /* renamed from: f, reason: collision with root package name */
    public int f197193f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f197194g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f197195h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f197196i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.EditText f197197m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f197198n;

    /* renamed from: o, reason: collision with root package name */
    public bb5.k f197199o;

    public SecurityImage(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197191d = null;
        this.f197192e = null;
        this.f197193f = 0;
        this.f197194g = null;
        this.f197195h = null;
        this.f197196i = null;
        this.f197197m = null;
        this.f197198n = null;
    }

    public final void a(boolean z17) {
        this.f197195h.setAlpha(z17 ? 255 : 40);
        this.f197195h.setBackgroundColor(z17 ? 0 : -5592406);
        this.f197194g.setVisibility(z17 ? 4 : 0);
    }

    public void b(int i17, byte[] bArr, java.lang.String str, java.lang.String str2) {
        a(true);
        this.f197191d = str;
        this.f197192e = str2;
        this.f197193f = i17;
        android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(bArr);
        if (G != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SecurityImage", "dkwt setSecImg sid:%s key:%s imgBuf:%d [%d %d]", str, str2, java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(G.getWidth()), java.lang.Integer.valueOf(G.getHeight()));
            this.f197191d = str;
            this.f197192e = str2;
            this.f197193f = i17;
            this.f197195h.setImageBitmap(G);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
        com.tencent.mars.xlog.Log.e("MicroMsg.SecurityImage", "dkwt setSecImg ERROR sid:%s key:%s imgBuf:%d", objArr);
    }

    public int getSecCodeType() {
        return this.f197193f;
    }

    public java.lang.String getSecImgCode() {
        android.widget.EditText editText = this.f197197m;
        return editText == null ? "" : editText.getText().toString().trim();
    }

    public java.lang.String getSecImgEncryptKey() {
        return this.f197192e;
    }

    public java.lang.String getSecImgSid() {
        return this.f197191d;
    }

    public void setNetworkModel(bb5.k kVar) {
        bb5.k kVar2 = this.f197199o;
        if (kVar2 != null) {
            kVar2.f19140a = null;
        }
        this.f197199o = kVar;
        kVar.f19140a = this;
    }
}
