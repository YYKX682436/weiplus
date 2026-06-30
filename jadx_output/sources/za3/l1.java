package za3;

/* loaded from: classes13.dex */
public class l1 implements za3.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f470981d = true;

    /* renamed from: e, reason: collision with root package name */
    public double f470982e = 1000000.0d;

    /* renamed from: f, reason: collision with root package name */
    public double f470983f = 1000000.0d;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f470984g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f470985h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f470986i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.FrameLayout f470987m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f470988n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f470989o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.location_soso.ViewManager f470990p;

    public l1(ab3.h hVar, android.content.Context context, boolean z17) {
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f470986i = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.f470987m = (android.widget.FrameLayout) android.view.View.inflate(context, com.tencent.mm.R.layout.bwy, null);
        if (z17) {
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
            imageView.setImageResource(com.tencent.mm.R.drawable.c8i);
        } else {
            imageView.setImageResource(j65.e.b() ? com.tencent.mm.R.drawable.c8k : com.tencent.mm.R.drawable.c8j);
        }
        this.f470990p = (com.tencent.mm.plugin.location_soso.ViewManager) hVar.getViewManager();
    }

    public void a(float f17) {
        com.tencent.mars.xlog.Log.i("ZItemOverlay", "setArrowIvAlpha:%s", java.lang.Float.valueOf(f17));
        android.widget.ImageView imageView = this.f470986i;
        imageView.getDrawable().setAlpha((int) (255.0f * f17));
        imageView.setAlpha(f17);
        this.f470990p.updateMarkerView(imageView);
    }

    @Override // za3.c
    public java.lang.String getPreText() {
        return "";
    }

    @Override // za3.c
    public void setText(java.lang.String str) {
        android.widget.FrameLayout frameLayout = this.f470987m;
        this.f470984g = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.inx);
        this.f470985h = (android.widget.ProgressBar) frameLayout.findViewById(com.tencent.mm.R.id.ine);
        this.f470988n = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.inp);
        if (str == null || str.equals("")) {
            this.f470985h.setVisibility(0);
        } else {
            this.f470985h.setVisibility(8);
            this.f470984g.setVisibility(0);
            this.f470984g.setText(str);
        }
        java.lang.String str2 = this.f470989o;
        if (str2 == null || str2.equals("")) {
            this.f470988n.setText("");
            this.f470988n.setVisibility(8);
        } else {
            this.f470988n.setVisibility(0);
            this.f470988n.setText(this.f470989o);
        }
        if (this.f470981d) {
            this.f470990p.updateViewLayout(this.f470986i, this.f470982e, this.f470983f, false);
        }
    }
}
