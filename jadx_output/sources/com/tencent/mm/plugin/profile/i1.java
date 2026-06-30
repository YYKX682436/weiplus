package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class i1 implements com.tencent.mm.ui.base.preference.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153492c;

    public i1(com.tencent.mm.plugin.profile.e0 e0Var, java.lang.String str, java.lang.String str2) {
        this.f153492c = e0Var;
        this.f153490a = str;
        this.f153491b = str2;
    }

    @Override // com.tencent.mm.ui.base.preference.r0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("geta8key_scene", 58);
        java.lang.String str = this.f153490a;
        intent.putExtra("geta8key_username", str);
        intent.putExtra("msgUsername", str);
        intent.putExtra("rawUrl", this.f153491b);
        j45.l.j(this.f153492c.f153420d, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}
