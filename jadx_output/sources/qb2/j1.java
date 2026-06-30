package qb2;

/* loaded from: classes4.dex */
public final class j1 implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u26.w f361227a;

    public j1(u26.w wVar) {
        this.f361227a = wVar;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.i("Finder.GlobalPushNewXmlConsumer", "loadLinkIcon success :" + z17);
        if (z17) {
            return;
        }
        pm0.v.X(new qb2.i1(this.f361227a));
    }
}
