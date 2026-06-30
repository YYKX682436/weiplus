package vx4;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx4.c f441313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vx4.c cVar) {
        super(0);
        this.f441313d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] bArr;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((jz5.n) this.f441313d.f441316y).getValue();
        if (multiTaskInfo == null || (bArr = multiTaskInfo.field_data) == null) {
            return null;
        }
        r45.ax5 ax5Var = new r45.ax5();
        try {
            ax5Var.parseFrom(bArr);
            return ax5Var;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SearchMultiTaskHelperForUI", "taskData parse failed");
            return ax5Var;
        }
    }
}
