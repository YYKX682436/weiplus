package xt2;

/* loaded from: classes.dex */
public final class j6 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f456832d;

    public j6(v65.n nVar) {
        this.f456832d = nVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        v65.n nVar = this.f456832d;
        byte[] byteArray = bundle != null ? bundle.getByteArray("FinderProductAutoScrollRespKey") : null;
        try {
            r45.s42 s42Var = new r45.s42();
            if (byteArray != null) {
                try {
                    s42Var.parseFrom(byteArray);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
                nVar.a(s42Var);
            }
            s42Var = null;
            nVar.a(s42Var);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderProductAutoScrollWidget", e18, "create widget failed", new java.lang.Object[0]);
            nVar.a(null);
        }
    }
}
