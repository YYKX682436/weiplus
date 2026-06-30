package dz3;

/* loaded from: classes15.dex */
public class b implements com.tencent.mm.plugin.scanner.model.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.iam_scan.y f245104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tz3.d f245105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz3.i f245106f;

    public b(dz3.i iVar, com.tencent.wechat.aff.iam_scan.y yVar, tz3.d dVar) {
        this.f245106f = iVar;
        this.f245104d = yVar;
        this.f245105e = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f245106f.o(this.f245104d, this.f245105e);
    }
}
