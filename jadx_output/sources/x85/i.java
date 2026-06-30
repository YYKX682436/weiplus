package x85;

/* loaded from: classes10.dex */
public final class i extends x85.d implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public x85.c f452597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(im5.b bVar, java.lang.String lensId, x85.c cVar) {
        super(bVar, lensId, cVar);
        kotlin.jvm.internal.o.g(lensId, "lensId");
        this.f452597d = cVar;
        if (bVar != null) {
            bVar.keep(this);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, lensId);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle, x85.p.class, new x85.h(lensId, this));
    }

    @Override // im5.a
    public void dead() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetLensInfoTask", "dead: ");
        this.f452597d = null;
    }
}
