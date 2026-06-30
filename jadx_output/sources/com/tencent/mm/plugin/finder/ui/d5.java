package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class d5 {

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f129050g = jz5.h.b(com.tencent.mm.plugin.finder.ui.z4.f130078d);

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f129051a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.base.preference.r f129052b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f129053c;

    /* renamed from: d, reason: collision with root package name */
    public az2.f f129054d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.a5 f129055e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.c5 f129056f;

    public d5(android.app.Activity context, com.tencent.mm.ui.base.preference.r preferenceScreen) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(preferenceScreen, "preferenceScreen");
        this.f129051a = context;
        this.f129052b = preferenceScreen;
        this.f129053c = "";
        this.f129055e = new com.tencent.mm.plugin.finder.ui.a5(this);
        this.f129056f = new com.tencent.mm.plugin.finder.ui.c5(this);
    }

    public final void a(java.lang.String str) {
        com.tencent.mm.ui.base.preference.r rVar = this.f129052b;
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) rVar).h(str);
        if (h17 != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).v(h17);
        }
    }
}
