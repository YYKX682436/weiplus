package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes.dex */
public final class v implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162026e;

    public v(java.lang.String str, int i17, int i18, int i19, java.lang.String str2) {
        this.f162022a = str;
        this.f162023b = i17;
        this.f162024c = i18;
        this.f162025d = i19;
        this.f162026e = str2;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.c1.k(new jz5.l("page_name_kv", this.f162022a), new jz5.l("ui_version", java.lang.Integer.valueOf(this.f162023b)), new jz5.l("setting_from_source", java.lang.Integer.valueOf(this.f162024c)), new jz5.l("setting_level", java.lang.Integer.valueOf(this.f162025d)), new jz5.l("setting_sessionid", this.f162026e));
    }
}
