package r02;

/* loaded from: classes8.dex */
public class b0 implements m02.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r02.d0 f368288a;

    public b0(r02.d0 d0Var) {
        this.f368288a = d0Var;
    }

    @Override // m02.b
    public void a(m02.a aVar, long j17) {
        if (aVar == m02.a.WAIT_FOR_WIFI) {
            com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = this.f368288a.f368294d;
            int i17 = com.tencent.mm.plugin.downloader_app.ui.TaskItemView.H;
            taskItemView.c();
        }
    }
}
