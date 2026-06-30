package lx4;

/* loaded from: classes5.dex */
public abstract class a extends androidx.appcompat.app.i0 {
    public a(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494078dt);
    }

    public abstract android.view.View D();

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.view.WindowManager.LayoutParams attributes;
        android.view.View decorView;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrowseChooseDialog", "BrowserDialog onCreate");
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        android.view.Window window5 = getWindow();
        if (window5 != null && (decorView = window5.getDecorView()) != null) {
            android.content.Context context = decorView.getContext();
            decorView.setMinimumWidth((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? i65.a.B(decorView.getContext()) : displayMetrics.widthPixels);
            decorView.setPadding(0, 0, 0, 0);
        }
        android.view.Window window6 = getWindow();
        if (window6 != null && (attributes = window6.getAttributes()) != null) {
            attributes.width = -1;
            attributes.height = -2;
            attributes.gravity = 80;
        }
        setContentView(D());
    }
}
