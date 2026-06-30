package uo1;

/* loaded from: classes.dex */
public final class a implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f429542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f429543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f429544c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f429545d;

    public a(int i17, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.g0 g0Var, yz5.l lVar) {
        this.f429542a = i17;
        this.f429543b = f0Var;
        this.f429544c = g0Var;
        this.f429545d = lVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OnDismiss, originOption=");
        sb6.append(this.f429542a);
        sb6.append(" option=");
        kotlin.jvm.internal.f0 f0Var = this.f429543b;
        sb6.append(f0Var.f310116d);
        sb6.append(", restartTime=");
        sb6.append(this.f429544c.f310121d);
        com.tencent.mars.xlog.Log.i("BackupUIUtils", sb6.toString());
        this.f429545d.invoke(java.lang.Integer.valueOf(f0Var.f310116d));
    }
}
