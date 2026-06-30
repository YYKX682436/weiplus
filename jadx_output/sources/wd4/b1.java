package wd4;

/* loaded from: classes9.dex */
public final class b1 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f444868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f444869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444870c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f444871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f444872e;

    public b1(wd4.l1 l1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str, boolean z17, r45.jj4 jj4Var) {
        this.f444868a = l1Var;
        this.f444869b = snsInfo;
        this.f444870c = str;
        this.f444871d = z17;
        this.f444872e = jj4Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1$2");
        this.f444868a.h(z17, str, this.f444869b, this.f444870c, this.f444871d, this.f444872e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1$2");
    }
}
