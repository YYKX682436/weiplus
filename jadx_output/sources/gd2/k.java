package gd2;

/* loaded from: classes3.dex */
public final class k implements g04.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.n f270542d;

    public k(gd2.n nVar) {
        this.f270542d = nVar;
    }

    @Override // g04.h
    public void k5(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        g04.l lVar = (g04.l) obj2;
        if (str == null || lVar == null) {
            com.tencent.mars.xlog.Log.e("FinderCommentImageMenuData", "onEnd, input:" + str + " result:" + lVar);
            return;
        }
        java.util.List list = lVar.f267469a;
        int b17 = com.tencent.mm.plugin.scanner.k1.b(list);
        boolean f17 = com.tencent.mm.plugin.scanner.k1.f(b17);
        boolean Di = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Di(lVar.f267470b, list);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(f17);
        gd2.n nVar = this.f270542d;
        nVar.f270547c.put(str, valueOf);
        nVar.f270548d.put(str, java.lang.Boolean.valueOf(Di));
        com.tencent.mars.xlog.Log.i("FinderCommentImageMenuData", "local translate, img " + str + ", result " + list + ", ratio " + b17 + ", showTransEntrance " + f17 + ", showOCREntrance " + Di);
    }
}
