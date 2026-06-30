package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class u1 implements b45.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f170553a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f170554b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f170555c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f170556d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.e86 f170557e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f170558f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f170559g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f170560h;

    /* renamed from: i, reason: collision with root package name */
    public final int f170561i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f170562j;

    public u1(java.lang.String str, java.lang.String str2, r45.e86 e86Var, java.lang.String str3, java.lang.String str4, android.view.View view, int i17, java.lang.String str5, java.lang.String str6) {
        this.f170553a = "";
        this.f170554b = "";
        this.f170555c = "";
        this.f170556d = "";
        this.f170561i = -1;
        this.f170553a = str;
        this.f170554b = str2;
        this.f170557e = e86Var;
        this.f170556d = str3;
        this.f170555c = str4;
        this.f170559g = view;
        this.f170560h = str5;
        this.f170561i = i17;
        this.f170562j = str6;
    }

    @Override // b45.a
    public java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMsgId", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        java.lang.String format = java.lang.String.format("%s_%s", this.f170562j, java.lang.Integer.valueOf(this.f170557e.f373132m));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMsgId", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        return format;
    }

    @Override // b45.a
    public int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getA8KeySnsItemScene", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getA8KeySnsItemScene", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        return 3;
    }

    public boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTranslated", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.e86 e86Var = this.f170557e;
        int i17 = e86Var.f373132m;
        sb6.append(i17 != 0 ? i17 : e86Var.f373137r);
        sb6.append("");
        java.lang.String e17 = com.tencent.mm.plugin.sns.model.s6.e(this.f170554b, sb6.toString());
        int i18 = this.f170561i;
        int i19 = i18 != 1 ? i18 == 2 ? 4 : -1 : 2;
        com.tencent.mm.plugin.sns.model.r6 f17 = com.tencent.mm.plugin.sns.model.s6.f(e17);
        if (f17 == null || !f17.f164647d || f17.f164648e || (f17.f164649f & i19) == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslated", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslated", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        return true;
    }

    @Override // b45.a
    public java.lang.String getUserName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        r45.e86 e86Var = this.f170557e;
        if (e86Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
            return null;
        }
        java.lang.String str = e86Var.f373126d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        return str;
    }
}
