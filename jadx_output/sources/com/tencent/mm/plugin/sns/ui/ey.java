package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ey implements ff0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l56.i f168272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168273c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f168274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ed4 f168275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f168276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f168277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f168278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f168279i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PInt f168280j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f168281k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f168282l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.fy f168283m;

    public ey(com.tencent.mm.plugin.sns.ui.fy fyVar, int i17, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i18, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, int i19, int i27) {
        this.f168283m = fyVar;
        this.f168271a = i17;
        this.f168272b = iVar;
        this.f168273c = str;
        this.f168274d = list;
        this.f168275e = ed4Var;
        this.f168276f = linkedList;
        this.f168277g = i18;
        this.f168278h = z17;
        this.f168279i = list2;
        this.f168280j = pInt;
        this.f168281k = i19;
        this.f168282l = i27;
    }

    @Override // ff0.u
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetThumbResult", "com.tencent.mm.plugin.sns.ui.TingMusicWidget$3");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.fy.o(this.f168283m, str);
        }
        com.tencent.mm.plugin.sns.ui.fy fyVar = this.f168283m;
        int i17 = this.f168271a;
        l56.i iVar = this.f168272b;
        java.lang.String str2 = this.f168273c;
        java.util.List list = this.f168274d;
        r45.ed4 ed4Var = this.f168275e;
        java.util.LinkedList linkedList = this.f168276f;
        int i18 = this.f168277g;
        boolean z18 = this.f168278h;
        java.util.List list2 = this.f168279i;
        com.tencent.mm.pointers.PInt pInt = this.f168280j;
        int i19 = this.f168281k;
        int i27 = this.f168282l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        fyVar.p(i17, iVar, str2, list, ed4Var, linkedList, i18, z18, list2, pInt, i19, i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetThumbResult", "com.tencent.mm.plugin.sns.ui.TingMusicWidget$3");
    }
}
