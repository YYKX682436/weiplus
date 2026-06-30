package fp3;

/* loaded from: classes9.dex */
public class n implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f265317d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f265318e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f265319f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f265320g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f265321h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f265322i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f265323m;

    public n(com.tencent.mm.plugin.order.ui.MallOrderProductListUI mallOrderProductListUI, fp3.k kVar) {
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (str == null || !str.equals(this.f265318e)) {
            return;
        }
        this.f265317d.post(new fp3.m(this, bitmap));
    }
}
