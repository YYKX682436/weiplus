package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class z5 implements ff0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.b6 f171664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f171666c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l56.i f171667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ed4 f171668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f171669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f171670g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f171671h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f171672i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f171673j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PInt f171674k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f171675l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f171676m;

    public z5(com.tencent.mm.plugin.sns.ui.b6 b6Var, java.lang.String str, java.util.LinkedList linkedList, l56.i iVar, r45.ed4 ed4Var, boolean z17, java.util.List list, int i17, int i18, int i19, com.tencent.mm.pointers.PInt pInt, int i27, java.util.List list2) {
        this.f171664a = b6Var;
        this.f171665b = str;
        this.f171666c = linkedList;
        this.f171667d = iVar;
        this.f171668e = ed4Var;
        this.f171669f = z17;
        this.f171670g = list;
        this.f171671h = i17;
        this.f171672i = i18;
        this.f171673j = i19;
        this.f171674k = pInt;
        this.f171675l = i27;
        this.f171676m = list2;
    }

    @Override // ff0.u
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetThumbResult", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget$commit$1");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.b6.o(this.f171664a, str);
        }
        com.tencent.mm.plugin.sns.ui.b6 b6Var = this.f171664a;
        java.lang.String str2 = this.f171665b;
        java.util.LinkedList linkedList = this.f171666c;
        l56.i iVar = this.f171667d;
        r45.ed4 ed4Var = this.f171668e;
        boolean z18 = this.f171669f;
        java.util.List list = this.f171670g;
        int i17 = this.f171671h;
        int i18 = this.f171672i;
        int i19 = this.f171673j;
        com.tencent.mm.pointers.PInt pInt = this.f171674k;
        int i27 = this.f171675l;
        java.util.List list2 = this.f171676m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doCommit", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        b6Var.p(str2, linkedList, iVar, ed4Var, z18, list, i17, i18, i19, pInt, i27, list2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doCommit", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetThumbResult", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget$commit$1");
    }
}
