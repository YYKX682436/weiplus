package j02;

/* loaded from: classes8.dex */
public final class a0 implements vz.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f296976a;

    public a0(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI) {
        this.f296976a = gameCloudAppDownloadUI;
    }

    @Override // vz.i1
    public final void Z(int i17, long j17) {
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f296976a;
        if (gameCloudAppDownloadUI.f97223f == j17) {
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            switch (i17) {
                case 1:
                    gameCloudAppDownloadUI.W6().f16812k.setVisibility(0);
                    gameCloudAppDownloadUI.W6().f16803b.setText(gameCloudAppDownloadUI.getString(com.tencent.mm.R.string.m9y, java.lang.Integer.valueOf((int) ((((float) c17.field_downloadedSize) / ((float) c17.field_totalSize)) * 100))));
                    gameCloudAppDownloadUI.W6().f16803b.setOnClickListener(new j02.q(gameCloudAppDownloadUI, j17));
                    return;
                case 2:
                    gameCloudAppDownloadUI.W6().f16803b.setText(gameCloudAppDownloadUI.getString(com.tencent.mm.R.string.f492205lp4));
                    gameCloudAppDownloadUI.W6().f16803b.setOnClickListener(new j02.w(gameCloudAppDownloadUI, j17));
                    return;
                case 3:
                    gameCloudAppDownloadUI.W6().f16812k.setVisibility(8);
                    gameCloudAppDownloadUI.W6().f16803b.setText(gameCloudAppDownloadUI.getString(com.tencent.mm.R.string.flg));
                    gameCloudAppDownloadUI.W6().f16803b.setOnClickListener(new j02.x(j17, gameCloudAppDownloadUI));
                    return;
                case 4:
                    android.widget.Button button = gameCloudAppDownloadUI.W6().f16803b;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(gameCloudAppDownloadUI.getString(com.tencent.mm.R.string.flz));
                    java.lang.String format = java.lang.String.format("(%.1fMB)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) c17.field_totalSize) / 1048576)}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    sb6.append(format);
                    button.setText(sb6.toString());
                    gameCloudAppDownloadUI.W6().f16803b.setOnClickListener(new j02.t(gameCloudAppDownloadUI));
                    return;
                case 5:
                    gameCloudAppDownloadUI.W6().f16803b.setText(gameCloudAppDownloadUI.getString(com.tencent.mm.R.string.ceh));
                    gameCloudAppDownloadUI.W6().f16803b.setOnClickListener(new j02.u(gameCloudAppDownloadUI));
                    return;
                case 6:
                    gameCloudAppDownloadUI.W6().f16803b.setText(gameCloudAppDownloadUI.getString(com.tencent.mm.R.string.m9y, java.lang.Integer.valueOf((int) ((((float) c17.field_downloadedSize) / ((float) c17.field_totalSize)) * 100))));
                    gameCloudAppDownloadUI.W6().f16803b.setOnClickListener(new j02.s(gameCloudAppDownloadUI, j17));
                    return;
                case 7:
                default:
                    return;
                case 8:
                    gameCloudAppDownloadUI.W6().f16812k.setVisibility(8);
                    gameCloudAppDownloadUI.W6().f16803b.setText(gameCloudAppDownloadUI.getString(com.tencent.mm.R.string.m7e));
                    return;
                case 9:
                    gameCloudAppDownloadUI.W6().f16812k.setVisibility(8);
                    gameCloudAppDownloadUI.W6().f16803b.setText(gameCloudAppDownloadUI.getString(com.tencent.mm.R.string.flh));
                    gameCloudAppDownloadUI.W6().f16803b.setOnClickListener(new j02.z(gameCloudAppDownloadUI, c17));
                    return;
            }
        }
    }
}
