package wd4;

/* loaded from: classes9.dex */
public final class a1 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f444858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f444859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444860c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f444861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f444862e;

    public a1(wd4.l1 l1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str, boolean z17, r45.jj4 jj4Var) {
        this.f444858a = l1Var;
        this.f444859b = snsInfo;
        this.f444860c = str;
        this.f444861d = z17;
        this.f444862e = jj4Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1$1");
        this.f444858a.h(z17, str, this.f444859b, this.f444860c, this.f444861d, this.f444862e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1$1");
    }
}
