package db5;

/* loaded from: classes.dex */
public abstract class r7 {

    /* renamed from: a, reason: collision with root package name */
    public static android.widget.Toast f228495a;

    /* renamed from: b, reason: collision with root package name */
    public static int f228496b;

    public static void a(android.content.Context context, int i17) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (f228496b != i17) {
            f228495a = null;
            f228496b = i17;
        }
        if (f228495a == null) {
            f228495a = android.widget.Toast.makeText(applicationContext, "", 1);
        }
        android.view.View inflate = android.view.View.inflate(applicationContext, com.tencent.mm.R.layout.cig, null);
        if (i17 == 1) {
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mcu)).setText(com.tencent.mm.R.string.gtl);
        } else if (i17 == 3) {
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mcu)).setText(com.tencent.mm.R.string.gtm);
        } else {
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mcu)).setText(com.tencent.mm.R.string.gtn);
        }
        f228495a.setView(inflate);
        f228495a.show();
    }
}
