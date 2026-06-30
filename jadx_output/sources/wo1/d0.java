package wo1;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f447915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f447917f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(wo1.a1 a1Var, qo1.f0 f0Var, po1.d dVar) {
        super(0);
        this.f447915d = a1Var;
        this.f447916e = f0Var;
        this.f447917f = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.net.wifi.WifiInfo wifiInfo;
        java.lang.String ssid;
        android.content.Context context = this.f447915d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        qo1.f0 task = this.f447916e;
        kotlin.jvm.internal.o.g(task, "task");
        po1.d device = this.f447917f;
        kotlin.jvm.internal.o.g(device, "device");
        boolean z17 = task instanceof qo1.c1;
        com.tencent.mars.xlog.Log.i("BackupUIUtils", "show connection switch bottom dialog, pkgId=" + task.f365483i + " isRestore=" + z17);
        java.lang.String str = z17 ? com.tencent.mm.plugin.backup.roambackup.w1.f92924b : com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488711dq2, (android.view.ViewGroup) null);
        if (b3.l.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            com.tencent.mars.xlog.Log.i("RoamBackup.NetworkUtils", "Permission of ACCESS_FINE_LOCATION not granted.");
        } else {
            java.lang.Object systemService = context.getApplicationContext().getSystemService("wifi");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) systemService;
            if (wifiManager.isWifiEnabled() && (wifiInfo = (android.net.wifi.WifiInfo) yj0.a.j(wifiManager, "com/tencent/mm/plugin/backup/roambackup/helper/NetworkUtils", "getCurrentSsid", "(Landroid/content/Context;)Ljava/lang/String;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;")) != null) {
                ssid = wifiInfo.getSSID();
                kotlin.jvm.internal.o.f(ssid, "getSSID(...)");
                com.tencent.mars.xlog.Log.i("RoamBackup.NetworkUtils", "getCurrentSsid: ".concat(ssid));
                if (r26.i0.y(ssid, "\"", false) && r26.i0.n(ssid, "\"", false)) {
                    ssid = ssid.substring(1, ssid.length() - 1);
                    kotlin.jvm.internal.o.f(ssid, "substring(...)");
                }
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487735sa2)).setText(context.getString(com.tencent.mm.R.string.mfm, ssid));
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rrz)).setText(com.tencent.mm.R.string.mfj);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.s8u)).setText(context.getString(com.tencent.mm.R.string.mfk, str));
                ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ril)).setOnClickListener(new uo1.p(y1Var));
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.s7n)).setOnClickListener(new uo1.v(y1Var, device, task));
                y1Var.k(inflate);
                y1Var.s();
                return jz5.f0.f302826a;
            }
        }
        ssid = "<unknown ssid>";
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487735sa2)).setText(context.getString(com.tencent.mm.R.string.mfm, ssid));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rrz)).setText(com.tencent.mm.R.string.mfj);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.s8u)).setText(context.getString(com.tencent.mm.R.string.mfk, str));
        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ril)).setOnClickListener(new uo1.p(y1Var));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.s7n)).setOnClickListener(new uo1.v(y1Var, device, task));
        y1Var.k(inflate);
        y1Var.s();
        return jz5.f0.f302826a;
    }
}
