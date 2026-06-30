package yk3;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yk3.i f462810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f462811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.fr4 f462812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f462813g;

    public c(yk3.i iVar, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, r45.fr4 fr4Var, android.view.View view) {
        this.f462810d = iVar;
        this.f462811e = multiTaskInfo;
        this.f462812f = fr4Var;
        this.f462813g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yk3.i iVar = this.f462810d;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f462811e;
        pk3.h c17 = iVar.c(multiTaskInfo);
        if (c17 != null) {
            androidx.appcompat.app.AppCompatActivity activity = iVar.f462802d;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).U6(multiTaskInfo);
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            r45.fr4 fr4Var = this.f462812f;
            fr4Var.set(8, valueOf);
            androidx.appcompat.app.AppCompatActivity activity2 = iVar.f462802d;
            kotlin.jvm.internal.o.g(activity2, "activity");
            c17.P6(this.f462813g, multiTaskInfo, fr4Var, ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).V6());
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "onAnimationCancel,onGridItemClick, id:%s", multiTaskInfo.field_id);
        }
    }
}
