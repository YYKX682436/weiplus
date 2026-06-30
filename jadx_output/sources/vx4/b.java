package vx4;

/* loaded from: classes8.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ak3.c f441314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ak3.c cVar) {
        super(0);
        this.f441314d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f441314d.getIntent();
        if (intent != null) {
            return (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) intent.getParcelableExtra("fts_multi_task_info");
        }
        return null;
    }
}
