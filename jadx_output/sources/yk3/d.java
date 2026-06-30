package yk3;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yk3.i f462814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f462815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.fr4 f462816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f462817g;

    public d(yk3.i iVar, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, r45.fr4 fr4Var, android.view.View view) {
        this.f462814d = iVar;
        this.f462815e = multiTaskInfo;
        this.f462816f = fr4Var;
        this.f462817g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yk3.i iVar = this.f462814d;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f462815e;
        pk3.h c17 = iVar.c(multiTaskInfo);
        if (c17 != null) {
            androidx.appcompat.app.AppCompatActivity activity = iVar.f462802d;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).U6(multiTaskInfo);
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            r45.fr4 fr4Var = this.f462816f;
            fr4Var.set(8, valueOf);
            androidx.appcompat.app.AppCompatActivity activity2 = iVar.f462802d;
            kotlin.jvm.internal.o.g(activity2, "activity");
            c17.P6(this.f462817g, multiTaskInfo, fr4Var, ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).V6());
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "onAnimationEnd, onGridItemClick, id:%s", multiTaskInfo.field_id);
        }
    }
}
