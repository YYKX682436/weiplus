package rp4;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp4.g f398620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f398621e;

    public e(rp4.g gVar, android.widget.TextView textView) {
        this.f398620d = gVar;
        this.f398621e = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        ct0.b bVar = this.f398620d.f398654i;
        h0Var.f310123d = ai3.d.i(bVar != null ? bVar.f222204a : null);
        h0Var.f310123d = ((java.lang.String) h0Var.f310123d) + "\n针对拍摄视频：\n";
        h0Var.f310123d = ((java.lang.String) h0Var.f310123d) + "是否使用CPU预览裁剪方式：" + dw3.f.f244203a + '\n';
        h0Var.f310123d = ((java.lang.String) h0Var.f310123d) + "是否使用两路流录制：" + dw3.f.f244204b + '\n';
        java.lang.String str = ((java.lang.String) h0Var.f310123d) + "预览页视频个数：" + dw3.f.f244205c + '\n';
        h0Var.f310123d = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.x2.n() || gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) == 1) {
            com.tencent.mm.sdk.platformtools.u3.h(new rp4.d(h0Var, this.f398621e));
        }
    }
}
