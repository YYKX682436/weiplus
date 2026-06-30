package j02;

/* loaded from: classes8.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f296978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f296979e;

    public b0(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI, kotlin.jvm.internal.h0 h0Var) {
        this.f296978d = gameCloudAppDownloadUI;
        this.f296979e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.l lVar;
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper cloudGameAppInfoWrapper = (com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper) this.f296979e.f310123d;
        int i17 = com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI.f97220m;
        com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI = this.f296978d;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(gameCloudAppDownloadUI.getContext(), 0, 0, false, false);
        z2Var.l(new j02.d0(gameCloudAppDownloadUI, cloudGameAppInfoWrapper));
        b02.a W6 = gameCloudAppDownloadUI.W6();
        kotlin.jvm.internal.o.f(W6, "<get-binding>(...)");
        W6.f16814m.setText(cloudGameAppInfoWrapper.f96934h.f96915d);
        com.tencent.mm.plugin.downloader.model.CloudGameAppInfo cloudGameAppInfo = cloudGameAppInfoWrapper.f96934h;
        java.lang.String str = cloudGameAppInfo.f96916e;
        if (str == null) {
            str = "";
        }
        vo0.a aVar = vo0.e.f438468b;
        com.tencent.mm.ui.widget.MMRoundCornerImageView ivCloudAppIcon = W6.f16811j;
        kotlin.jvm.internal.o.f(ivCloudAppIcon, "ivCloudAppIcon");
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        aVar.c(str, ivCloudAppIcon, fVar.a());
        int i18 = cloudGameAppInfoWrapper.f96933g;
        android.widget.TextView textView = W6.f16817p;
        if (i18 == 2) {
            textView.setText(gameCloudAppDownloadUI.getText(com.tencent.mm.R.string.m_1));
        } else {
            textView.setText(gameCloudAppDownloadUI.getText(com.tencent.mm.R.string.m_2));
        }
        java.lang.CharSequence text = gameCloudAppDownloadUI.getText(com.tencent.mm.R.string.m9x);
        android.widget.Button button = W6.f16804c;
        button.setText(text);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = com.tencent.mm.ui.zk.a(gameCloudAppDownloadUI.getContext(), 40);
        textView.setLayoutParams(marginLayoutParams);
        button.setOnClickListener(new j02.g(gameCloudAppDownloadUI, cloudGameAppInfoWrapper, z2Var));
        j02.h hVar = new j02.h(gameCloudAppDownloadUI, cloudGameAppInfoWrapper, z2Var);
        android.widget.ImageView imageView = W6.f16810i;
        imageView.setOnClickListener(hVar);
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            com.tencent.mm.ui.uk.f(drawable, com.tencent.mm.ui.bk.C() ? b3.l.getColor(gameCloudAppDownloadUI, com.tencent.mm.R.color.aaz) : b3.l.getColor(gameCloudAppDownloadUI, com.tencent.mm.R.color.f478716f7));
            imageView.setImageDrawable(drawable);
        }
        j02.i iVar = new j02.i(W6);
        android.widget.Button button2 = W6.f16803b;
        button2.post(iVar);
        java.lang.String str2 = cloudGameAppInfoWrapper.f96930d;
        boolean z17 = !(str2 == null || str2.length() == 0);
        android.widget.TextView textView2 = W6.f16815n;
        android.widget.LinearLayout linearLayout = W6.f16806e;
        android.widget.TextView textView3 = W6.f16816o;
        if (z17) {
            imageView.setVisibility(8);
            textView3.setText(gameCloudAppDownloadUI.getText(com.tencent.mm.R.string.m9z));
            textView3.setTextSize(15.0f);
            textView3.setTextColor(gameCloudAppDownloadUI.getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
            textView2.setVisibility(8);
            W6.f16808g.setVisibility(8);
            button2.setVisibility(8);
            button.setVisibility(8);
            linearLayout.setVisibility(0);
            W6.f16807f.setOnClickListener(new j02.j(gameCloudAppDownloadUI, cloudGameAppInfoWrapper, z2Var));
            W6.f16805d.setOnClickListener(new j02.k(gameCloudAppDownloadUI, cloudGameAppInfoWrapper, z2Var));
        } else {
            linearLayout.setVisibility(8);
            textView3.setText(java.lang.String.valueOf(cloudGameAppInfo.f96919h));
            textView2.setText(java.lang.String.valueOf(cloudGameAppInfo.f96921m));
            W6.f16819r.setOnClickListener(new j02.l(gameCloudAppDownloadUI, cloudGameAppInfoWrapper));
            W6.f16818q.setOnClickListener(new j02.m(gameCloudAppDownloadUI, cloudGameAppInfoWrapper));
            W6.f16813l.setOnClickListener(new j02.n(gameCloudAppDownloadUI, cloudGameAppInfoWrapper));
            java.lang.String str3 = cloudGameAppInfo.f96917f;
            if (str3 == null || str3.length() == 0) {
                lVar = new jz5.l(java.lang.Boolean.FALSE, null);
            } else {
                h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(str3);
                if (d17 == null) {
                    lVar = new jz5.l(java.lang.Boolean.FALSE, null);
                } else {
                    lVar = com.tencent.mm.vfs.w6.j(d17.field_filePath) ? new jz5.l(java.lang.Boolean.TRUE, d17) : new jz5.l(java.lang.Boolean.FALSE, d17);
                }
            }
            boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
            h02.a aVar2 = (h02.a) lVar.f302834e;
            W6.f16809h.setOnClickListener(new j02.o(W6));
            if (booleanValue) {
                button2.setText(gameCloudAppDownloadUI.getString(com.tencent.mm.R.string.flg));
            } else {
                if (aVar2 != null) {
                    int i19 = aVar2.field_status;
                    if (1 <= i19 && i19 < 4) {
                        long j17 = aVar2.field_downloadId;
                        gameCloudAppDownloadUI.f97223f = j17;
                        ((j02.a0) gameCloudAppDownloadUI.f97226i).Z(i19, j17);
                    }
                }
                float f17 = ((float) cloudGameAppInfo.f96925q) / 1048576;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(gameCloudAppDownloadUI.getString(com.tencent.mm.R.string.flz));
                java.lang.String format = java.lang.String.format("(%.1fMB)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f17)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                sb6.append(format);
                button2.setText(sb6.toString());
            }
            button2.setOnClickListener(new j02.f(booleanValue, aVar2, cloudGameAppInfoWrapper, gameCloudAppDownloadUI));
        }
        z2Var.k(gameCloudAppDownloadUI.W6().f16802a, 0, 0);
        z2Var.C();
        k02.s.f303102a.c(1L, cloudGameAppInfoWrapper.f96931e, cloudGameAppInfo.f96917f, cloudGameAppInfoWrapper.f96932f);
    }
}
