package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes.dex */
public final class x implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162029b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162030c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162032e;

    public x(java.lang.String str, int i17, int i18, int i19, java.lang.String str2) {
        this.f162028a = str;
        this.f162029b = i17;
        this.f162030c = i18;
        this.f162031d = i19;
        this.f162032e = str2;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.c1.k(new jz5.l("page_name_kv", this.f162028a), new jz5.l("ui_version", java.lang.Integer.valueOf(this.f162029b)), new jz5.l("setting_from_source", java.lang.Integer.valueOf(this.f162030c)), new jz5.l("setting_level", java.lang.Integer.valueOf(this.f162031d)), new jz5.l("setting_sessionid", this.f162032e));
    }
}
