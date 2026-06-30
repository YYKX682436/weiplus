package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes.dex */
public final class t implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162018c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162020e;

    public t(java.lang.String str, int i17, int i18, int i19, java.lang.String str2) {
        this.f162016a = str;
        this.f162017b = i17;
        this.f162018c = i18;
        this.f162019d = i19;
        this.f162020e = str2;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.c1.k(new jz5.l("page_name_kv", this.f162016a), new jz5.l("ui_version", java.lang.Integer.valueOf(this.f162017b)), new jz5.l("setting_from_source", java.lang.Integer.valueOf(this.f162018c)), new jz5.l("setting_level", java.lang.Integer.valueOf(this.f162019d)), new jz5.l("setting_sessionid", this.f162020e));
    }
}
