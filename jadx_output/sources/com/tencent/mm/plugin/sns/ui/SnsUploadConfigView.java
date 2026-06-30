package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsUploadConfigView extends android.widget.LinearLayout implements com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f167506q = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f167507d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f167508e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f167509f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f167510g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f167511h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f167512i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f167513m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f167514n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Context f167515o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.ed4 f167516p;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01c3, code lost:
    
        if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SNS_OPEN_UPLOAD_WEISHI_BOOLEAN_SYNC, false) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SnsUploadConfigView(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsUploadConfigView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSyncQQZone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (this.f167512i) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHasQQ", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            gm0.j1.i();
            int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(9, null));
            if (q17 == 0) {
                db5.e1.n(getContext(), com.tencent.mm.R.string.j1a, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.sns.ui.cu(this), new com.tencent.mm.plugin.sns.ui.du(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHasQQ", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
                z17 = false;
            } else {
                z17 = q17 != 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHasQQ", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            }
            if (!z17) {
                this.f167512i = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSyncQQZone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
                return;
            }
            this.f167507d.setImageDrawable(com.tencent.mm.ui.uk.e(this.f167515o, com.tencent.mm.R.raw.album_qzone_icon_normal, android.graphics.Color.parseColor("#FFC300")));
        } else {
            android.widget.ImageView imageView = this.f167507d;
            android.content.Context context = this.f167515o;
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.album_qzone_icon_normal, context.getResources().getColor(com.tencent.mm.R.color.f478694eb)));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSyncQQZone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSyncWeishi", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (this.f167508e == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSyncWeishi", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            return;
        }
        if (this.f167514n) {
            gm0.j1.i();
            if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SNS_OPEN_UPLOAD_WEISHI_BOOLEAN_SYNC, false)) {
                this.f167508e.setVisibility(0);
                if (this.f167513m) {
                    this.f167508e.setImageDrawable(com.tencent.mm.ui.uk.e(this.f167515o, com.tencent.mm.R.raw.album_wesee_icon_normal, android.graphics.Color.parseColor("#FF0F80")));
                } else {
                    android.widget.ImageView imageView = this.f167508e;
                    android.content.Context context = this.f167515o;
                    imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.album_wesee_icon_normal, context.getResources().getColor(com.tencent.mm.R.color.f478694eb)));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSyncWeishi", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
                return;
            }
        }
        this.f167513m = false;
        this.f167508e.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSyncWeishi", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    public int getPrivated() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPrivated", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        boolean z17 = this.f167511h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPrivated", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        return z17 ? 1 : 0;
    }

    public int getSyncFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSyncFlag", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        int i17 = this.f167512i ? 4 : 0;
        if (this.f167513m) {
            i17 |= 16;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSyncFlag", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        return i17;
    }

    public l56.i getTwitterAccessToken() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTwitterAccessToken", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTwitterAccessToken", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        return null;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (i17 != 0 || i18 != 0 || m1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        } else {
            b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
    }

    public void setPrivated(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPrivated", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        this.f167511h = z17;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("offAllSync", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            this.f167512i = false;
            this.f167513m = false;
            android.widget.ImageView imageView = this.f167507d;
            android.content.Context context = this.f167515o;
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.album_qzone_icon_normal, context.getResources().getColor(com.tencent.mm.R.color.f478694eb)));
            android.widget.ImageView imageView2 = this.f167508e;
            android.content.Context context2 = this.f167515o;
            imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(context2, com.tencent.mm.R.raw.album_wesee_icon_normal, context2.getResources().getColor(com.tencent.mm.R.color.f478694eb)));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("offAllSync", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrivated", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }
}
