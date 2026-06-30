package th5;

/* loaded from: classes10.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.j f419375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(java.lang.String str, dn.j jVar) {
        super(1);
        this.f419374d = str;
        this.f419375e = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = this.f419374d;
        if (str.length() == 0) {
            str = "-";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoUrlDownloader", "downloadToPath invokeOnCancellation scene=".concat(str));
        dn.j jVar = this.f419375e;
        dn.k kVar = jVar.f241787f;
        dn.d dVar = kVar instanceof dn.d ? (dn.d) kVar : null;
        if (dVar != null) {
            dVar.f241763d = null;
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(jVar.field_mediaId);
        return jz5.f0.f302826a;
    }
}
