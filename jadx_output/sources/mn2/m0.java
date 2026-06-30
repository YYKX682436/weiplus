package mn2;

/* loaded from: classes10.dex */
public final class m0 implements ek4.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mn2.q0 f330049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c50.z0 f330050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f330051c;

    public m0(mn2.q0 q0Var, c50.z0 z0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f330049a = q0Var;
        this.f330050b = z0Var;
        this.f330051c = finderItem;
    }

    @Override // ek4.w
    public void b(int i17, dn.o oVar) {
        mn2.q0 q0Var = this.f330049a;
        com.tencent.mars.xlog.Log.i(q0Var.f330092a, "startPreloadDownloadTask ret=" + i17 + ' ' + oVar);
        if (i17 != 0) {
            java.lang.String str = oVar != null ? oVar.field_mediaId : null;
            if (str == null) {
                str = "";
            }
            mn2.q0.b(this.f330050b, this.f330051c, q0Var, str, -22);
        }
    }
}
