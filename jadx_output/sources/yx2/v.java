package yx2;

/* loaded from: classes15.dex */
public final class v implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final v94.g f467879a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f467880b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f467881c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f467882d;

    public v(com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview ui6, v94.g coverInfo, boolean z17) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(coverInfo, "coverInfo");
        this.f467879a = coverInfo;
        this.f467880b = z17;
        this.f467881c = "Finder.SnsFinderVideoBackPreviewGetFinderObjectCallback";
        this.f467882d = new java.lang.ref.WeakReference(ui6);
    }

    @Override // zy2.a6
    public void a(java.lang.Object obj, int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview = (com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview) this.f467882d.get();
        if (snsFinderVideoBackPreview == null) {
            com.tencent.mars.xlog.Log.i(this.f467881c, "ui null!");
            return;
        }
        str = snsFinderVideoBackPreview.TAG;
        com.tencent.mars.xlog.Log.i(str, "updateFinderObject errType" + i17 + " errCode:" + i18);
        boolean z17 = obj instanceof com.tencent.mm.protocal.protobuf.FinderObject;
        v94.g gVar = this.f467879a;
        if (!z17) {
            if (!(((ee0.h4) ((fe0.d4) i95.n0.c(fe0.d4.class))).wi() && i17 == 4) && ((ee0.h4) ((fe0.d4) i95.n0.c(fe0.d4.class))).wi()) {
                return;
            }
            str2 = snsFinderVideoBackPreview.TAG;
            com.tencent.mars.xlog.Log.i(str2, "updateFinderObject to block");
            fe0.g4 Ni = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ni();
            java.lang.String userName = ((com.tencent.mm.plugin.sns.storage.x1) gVar).getUserName();
            kotlin.jvm.internal.o.f(userName, "getUserName(...)");
            ((com.tencent.mm.plugin.sns.storage.a2) Ni).y0(userName);
            return;
        }
        fe0.g4 Ni2 = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ni();
        java.lang.String userName2 = ((com.tencent.mm.plugin.sns.storage.x1) gVar).getUserName();
        kotlin.jvm.internal.o.f(userName2, "getUserName(...)");
        java.lang.Long u07 = ((com.tencent.mm.plugin.sns.storage.x1) gVar).u0();
        kotlin.jvm.internal.o.f(u07, "getSnsObjId(...)");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        ((com.tencent.mm.plugin.sns.storage.a2) Ni2).b1(userName2, u07.longValue(), finderObject);
        if (this.f467880b) {
            android.content.Context context = snsFinderVideoBackPreview.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            snsFinderVideoBackPreview.loadDetailAndPlayVideo(context, finderObject);
        }
    }
}
