package yx2;

/* loaded from: classes15.dex */
public final class t implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView f467875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v94.h f467876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f467877c;

    public t(com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView snsFinderImageBackView, v94.h hVar, boolean z17) {
        this.f467875a = snsFinderImageBackView;
        this.f467876b = hVar;
        this.f467877c = z17;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView snsFinderImageBackView = this.f467875a;
        str = snsFinderImageBackView.TAG;
        com.tencent.mars.xlog.Log.i(str, "updateFinderObject errType" + i17 + " errCode:" + i18);
        boolean z17 = obj instanceof com.tencent.mm.protocal.protobuf.FinderObject;
        v94.h hVar = this.f467876b;
        if (!z17) {
            if (!(((ee0.h4) ((fe0.d4) i95.n0.c(fe0.d4.class))).wi() && i17 == 4) && ((ee0.h4) ((fe0.d4) i95.n0.c(fe0.d4.class))).wi()) {
                return;
            }
            str2 = snsFinderImageBackView.TAG;
            com.tencent.mars.xlog.Log.i(str2, "updateFinderObject to block");
            fe0.g4 Ni = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ni();
            java.lang.String userName = ((com.tencent.mm.plugin.sns.storage.x1) hVar).getUserName();
            kotlin.jvm.internal.o.f(userName, "getUserName(...)");
            ((com.tencent.mm.plugin.sns.storage.a2) Ni).y0(userName);
            return;
        }
        fe0.g4 Ni2 = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ni();
        java.lang.String userName2 = ((com.tencent.mm.plugin.sns.storage.x1) hVar).getUserName();
        kotlin.jvm.internal.o.f(userName2, "getUserName(...)");
        java.lang.Long u07 = ((com.tencent.mm.plugin.sns.storage.x1) hVar).u0();
        kotlin.jvm.internal.o.f(u07, "getSnsObjId(...)");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        ((com.tencent.mm.plugin.sns.storage.a2) Ni2).b1(userName2, u07.longValue(), finderObject);
        if (this.f467877c) {
            snsFinderImageBackView.initDetailAndPlay(finderObject);
        }
    }
}
