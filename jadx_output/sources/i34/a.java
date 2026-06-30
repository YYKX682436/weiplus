package i34;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f288303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f288305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288306g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f288307h;

    public a(android.widget.ImageView imageView, java.lang.String str, int i17, java.lang.String str2, int i18) {
        this.f288303d = imageView;
        this.f288304e = str;
        this.f288305f = i17;
        this.f288306g = str2;
        this.f288307h = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView = this.f288303d;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        java.lang.String str = this.f288304e;
        i34.d dVar = (drawable == null || !(drawable instanceof i34.d)) ? new i34.d(imageView, str, this.f288305f) : (i34.d) drawable;
        java.lang.String str2 = dVar.f288314e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.f288306g;
        if (str2.equals(str3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeAvatarDrawable", "same: %s", str3);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeAvatarDrawable", "not same refresh :%s, old: %s", str3, dVar.f288314e);
            imageView.setImageDrawable(null);
            dVar.f288313d = this.f288307h;
            dVar.f288314e = str3;
            dVar.f288315f = str;
        }
        imageView.setImageDrawable(dVar);
    }
}
