package za3;

/* loaded from: classes15.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f470930a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f470931b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f470932c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f470933d = true;

    /* renamed from: e, reason: collision with root package name */
    public final int f470934e = android.graphics.Color.parseColor("#44FEBB");

    /* renamed from: f, reason: collision with root package name */
    public final int f470935f = android.graphics.Color.parseColor("#FFFFFF");

    /* renamed from: g, reason: collision with root package name */
    public final int f470936g = android.graphics.Color.parseColor("#E54646");

    /* renamed from: h, reason: collision with root package name */
    public final int f470937h = android.graphics.Color.parseColor("#FFC90C");

    /* renamed from: i, reason: collision with root package name */
    public boolean f470938i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f470939j = false;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f470940k = "";

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f470941l = new za3.h0(this, android.os.Looper.getMainLooper());

    public i0(android.content.Context context, android.view.ViewGroup viewGroup, java.lang.String str) {
        this.f470931b = context;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.obc);
        this.f470930a = textView;
        textView.invalidate();
        this.f470932c = new java.util.ArrayList();
        java.util.Iterator it = va3.j0.Ui().b(str).iterator();
        while (it.hasNext()) {
            this.f470932c.add((java.lang.String) it.next());
        }
        b(false);
    }

    public static void a(za3.i0 i0Var, boolean z17) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = i0Var.f470941l;
        n3Var.removeMessages(1);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        if (z17) {
            n3Var.sendMessageDelayed(obtain, 100L);
        } else {
            n3Var.sendMessage(obtain);
        }
    }

    public final void b(boolean z17) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f470941l;
        n3Var.removeMessages(2);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 2;
        obtain.obj = java.lang.Integer.valueOf(this.f470932c.size());
        this.f470932c.size();
        if (z17) {
            n3Var.sendMessageDelayed(obtain, 100L);
        } else {
            n3Var.sendMessage(obtain);
        }
    }
}
