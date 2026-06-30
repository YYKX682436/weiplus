package gx4;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: j, reason: collision with root package name */
    public static final int f277400j;

    /* renamed from: a, reason: collision with root package name */
    public gx4.b f277401a;

    /* renamed from: b, reason: collision with root package name */
    public final gx4.c f277402b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f277403c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.PointF f277404d = new android.graphics.PointF();

    /* renamed from: e, reason: collision with root package name */
    public boolean f277405e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f277406f;

    /* renamed from: g, reason: collision with root package name */
    public int f277407g;

    /* renamed from: h, reason: collision with root package name */
    public int f277408h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f277409i;

    static {
        int i17 = gx4.e.f277415f;
        f277400j = i17 * i17;
    }

    public d(gx4.c cVar) {
        this.f277402b = cVar;
        android.view.WindowManager windowManager = (android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        if (fp.h.c(26)) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.format = 1;
        layoutParams.flags = 40;
        layoutParams.gravity = 85;
        int i17 = gx4.e.f277416g;
        layoutParams.width = i17;
        layoutParams.height = i17;
        layoutParams.x = 0;
        layoutParams.y = 0;
        gx4.b bVar = new gx4.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f277401a = bVar;
        try {
            bVar.setVisibility(8);
            windowManager.addView(this.f277401a, layoutParams);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BagCancelController", "showCanceller add failed %s", e17);
        }
    }
}
