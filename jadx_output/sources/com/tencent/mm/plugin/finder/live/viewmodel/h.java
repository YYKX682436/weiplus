package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class h extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f117119d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117120e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117121f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117119d = "Finder.FinderGameLiveAuthPostLiveUIC";
        this.f117120e = "";
        this.f117121f = "";
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_POST_LIVE_APPID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f117120e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_POST_LIVE_JSON");
        this.f117121f = stringExtra2 != null ? stringExtra2 : "";
        com.tencent.mars.xlog.Log.i(this.f117119d, "appid:" + this.f117120e + ", json:" + this.f117121f);
    }
}
