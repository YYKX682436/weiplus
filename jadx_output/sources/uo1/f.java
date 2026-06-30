package uo1;

/* loaded from: classes5.dex */
public final class f implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f429557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f429558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f429559c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f429560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f429561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f429562f;

    public f(boolean z17, com.tencent.mm.ui.widget.dialog.y1 y1Var, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.g0 g0Var, long j17, yz5.a aVar) {
        this.f429557a = z17;
        this.f429558b = y1Var;
        this.f429559c = f0Var;
        this.f429560d = g0Var;
        this.f429561e = j17;
        this.f429562f = aVar;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        if (z17 && this.f429557a) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f429558b;
            y1Var.h(new uo1.e(y1Var, this.f429559c, this.f429560d, this.f429561e, this.f429562f));
            return;
        }
        kotlin.jvm.internal.f0 f0Var = this.f429559c;
        f0Var.f310116d = z17 ? f0Var.f310116d | 1 : f0Var.f310116d & (-2);
        kotlin.jvm.internal.g0 g0Var = this.f429560d;
        if (g0Var.f310121d > 0) {
            com.tencent.mars.xlog.Log.i("BackupUIUtils", "[222] clear pause time. restartTime=" + g0Var.f310121d);
            eo1.a aVar = eo1.a.f255545a;
            long j17 = this.f429561e;
            aVar.b(j17, 0L);
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.q(j17);
            g0Var.f310121d = 0L;
        }
        this.f429562f.invoke();
    }
}
