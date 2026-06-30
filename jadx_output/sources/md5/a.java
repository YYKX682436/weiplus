package md5;

/* loaded from: classes8.dex */
public class a extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public boolean f325879q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f325880r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f325881s;

    public a(android.app.Activity activity) {
        super(activity);
        this.f325879q = false;
        this.f325880r = false;
    }

    @Override // ak3.i, ak3.c
    public android.graphics.Bitmap getBitmap() {
        if (al3.a.f5845a.a(4)) {
            return null;
        }
        if (!this.f325879q) {
            if (this.f325880r) {
                return super.getBitmap();
            }
            return null;
        }
        return al3.b.f5849a.a(com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir().getAbsolutePath() + "//" + this.f325881s, null);
    }

    @Override // ak3.i, ak3.c
    public android.view.View getContentView() {
        android.view.View contentView = super.getContentView();
        if (contentView != null) {
            return contentView;
        }
        android.view.ViewGroup a17 = a();
        int i17 = 1;
        android.view.View view = null;
        int i18 = 1;
        for (int i19 = 0; i19 < a17.getChildCount(); i19++) {
            android.view.View childAt = a17.getChildAt(i19);
            if (childAt != null && childAt.getHeight() * childAt.getWidth() > i17 * i18) {
                i17 = childAt.getWidth();
                i18 = childAt.getHeight();
                view = childAt;
            }
        }
        return view;
    }

    @Override // ak3.i, ak3.c
    public android.view.View getMaskView() {
        android.view.ViewGroup a17 = a();
        int i17 = 1;
        android.view.View view = null;
        int i18 = 1;
        for (int i19 = 0; i19 < a17.getChildCount(); i19++) {
            android.view.View childAt = a17.getChildAt(i19);
            if (childAt != null && childAt.getHeight() * childAt.getWidth() > i17 * i18) {
                i17 = childAt.getWidth();
                i18 = childAt.getHeight();
                view = childAt;
            }
        }
        return view;
    }
}
