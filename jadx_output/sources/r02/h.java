package r02;

/* loaded from: classes8.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.r0 f368301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r02.i f368302e;

    public h(r02.i iVar, com.tencent.mm.plugin.downloader_app.model.r0 r0Var) {
        this.f368302e = iVar;
        this.f368301d = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader_app.model.o.b(this.f368302e.f368304d.f368307b, this.f368301d, true);
    }
}
