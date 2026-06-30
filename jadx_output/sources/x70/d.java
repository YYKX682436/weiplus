package x70;

/* loaded from: classes12.dex */
public final class d implements l70.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m11.b0 f452408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f452409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452410c;

    public d(m11.b0 b0Var, kotlin.jvm.internal.h0 h0Var, java.lang.String str) {
        this.f452408a = b0Var;
        this.f452409b = h0Var;
        this.f452410c = str;
    }

    @Override // l70.a
    public void a(l70.b event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (event.f316795b == l70.c.f316798e) {
            l70.e eVar = event.f316796c;
            if ((eVar != null ? eVar.f316818a : null) == l70.f.f316820d) {
                int k17 = (int) com.tencent.mm.vfs.w6.k((java.lang.String) this.f452409b.f310123d);
                m11.b0 b0Var = this.f452408a;
                b0Var.F(k17);
                b0Var.z(b0Var.f322636d);
                b0Var.m(this.f452410c);
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.b1.Di().F4(java.lang.Long.valueOf(b0Var.f322633a), b0Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgSyncDownloadFSC", "update mid imgInfo: " + b0Var.f322647o + ", " + b0Var.f322645m + ' ' + b0Var.f322633a + ' ' + b0Var.f322635c + ' ' + b0Var.f322636d + ' ' + b0Var.f322637e);
            }
        }
    }
}
