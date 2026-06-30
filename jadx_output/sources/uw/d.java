package uw;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final uw.d f431484a = new uw.d();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.v3 f431485b;

    static {
        jz5.h.b(uw.c.f431483d);
        com.tencent.mm.sdk.platformtools.o4 h17 = com.tencent.mm.pluginsdk.model.b0.f189197a.h();
        kotlin.jvm.internal.o.f(h17, "<get-mmkv>(...)");
        f431485b = new com.tencent.mm.sdk.platformtools.v3(h17, 15552000L);
    }

    public static void a(uw.d dVar, android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.util.List list, r45.nw1 nw1Var, java.lang.String str3, byte[] bArr, yz5.l lVar, int i18, java.lang.Object obj) {
        java.util.List<r45.lk> list2 = (i18 & 16) != 0 ? null : list;
        r45.nw1 nw1Var2 = (i18 & 32) != 0 ? null : nw1Var;
        java.lang.String str4 = (i18 & 64) != 0 ? null : str3;
        byte[] bArr2 = (i18 & 128) != 0 ? null : bArr;
        dVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (str == null || str2 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFinderLiveUtil", "enterFinderLive, bizUserName=" + str + ", exportId=" + str2 + ", scene=" + i17 + ", sessionBuffer=" + str4);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (!(list2 == null || list2.isEmpty())) {
            for (r45.lk lkVar : list2) {
                linkedList.add(lkVar.f379534e);
                linkedList2.add(lkVar.f379533d);
            }
        }
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).sj(context, str2, str, java.lang.Integer.valueOf(i17), linkedList, linkedList2, nw1Var2, str4, bArr2);
    }
}
