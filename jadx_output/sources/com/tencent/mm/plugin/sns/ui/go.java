package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class go implements b45.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f168445a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f168446b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f168447c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f168448d;

    /* renamed from: e, reason: collision with root package name */
    public final int f168449e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f168450f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f168451g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f168452h;

    public go(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, int i17) {
        this.f168447c = false;
        this.f168448d = false;
        this.f168445a = str;
        this.f168447c = z17;
        this.f168448d = z18;
        this.f168449e = i17;
        this.f168446b = str2;
    }

    @Override // b45.a
    public java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMsgId", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMsgId", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        return null;
    }

    @Override // b45.a
    public int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getA8KeySnsItemScene", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getA8KeySnsItemScene", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        return 1;
    }

    public boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTranslatedPost", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        int i17 = this.f168449e;
        int i18 = i17 != 1 ? i17 == 2 ? 4 : -1 : 2;
        com.tencent.mm.plugin.sns.model.r6 f17 = com.tencent.mm.plugin.sns.model.s6.f(this.f168445a);
        if (f17 == null || !f17.f164647d || f17.f164648e || (i18 & f17.f164649f) == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslatedPost", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslatedPost", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        return true;
    }

    @Override // b45.a
    public java.lang.String getUserName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        java.lang.String str = this.f168450f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        return str;
    }
}
