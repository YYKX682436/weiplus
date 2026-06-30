package com.tencent.mm.wallet_core.ui;

/* loaded from: classes.dex */
public class e1 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f214131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214132b;

    public e1(android.content.Context context, java.lang.String str) {
        this.f214131a = context;
        this.f214132b = str;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f214131a;
        if (i17 != 0) {
            java.lang.String str = this.f214132b;
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3 && str != null) {
                        intent.putExtra("rawUrl", context.getString(com.tencent.mm.R.string.f493483ke4, com.tencent.mm.sdk.platformtools.m2.d(), str));
                    }
                } else if (str != null) {
                    intent.putExtra("rawUrl", context.getString(com.tencent.mm.R.string.f493482ke3, com.tencent.mm.sdk.platformtools.m2.d(), str));
                }
            } else if (str != null) {
                intent.putExtra("rawUrl", context.getString(com.tencent.mm.R.string.f493480ke1, com.tencent.mm.sdk.platformtools.m2.d(), str));
            }
        } else {
            intent.putExtra("rawUrl", context.getString(com.tencent.mm.R.string.f493481ke2, com.tencent.mm.sdk.platformtools.m2.d()));
        }
        intent.putExtra("showShare", false);
        intent.putExtra("allow_mix_content_mode", false);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
