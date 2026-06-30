package ho1;

/* loaded from: classes5.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f282625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f282626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f282627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f282628g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f282629h;

    public b0(android.net.Uri uri, po1.d dVar, po1.d dVar2, com.tencent.mm.ui.widget.dialog.u3 u3Var, yz5.l lVar) {
        this.f282625d = uri;
        this.f282626e = dVar;
        this.f282627f = dVar2;
        this.f282628g = u3Var;
        this.f282629h = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fo1.n g17 = to1.g.f420911a.g(this.f282625d, this.f282626e, this.f282627f.f357299e);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "[saveOldPath] error code of save is " + g17);
        pm0.v.X(new ho1.a0(this.f282628g, g17, this.f282629h));
    }
}
