package m11;

/* loaded from: classes12.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f322726a = new java.util.ArrayList(3);

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f322727b = com.tencent.mm.sdk.platformtools.o4.M("db_max_id_record");

    static {
        d("", "ImgInfo2", m11.l0.f322732s, 1L, 1000000000L);
        d("@findermsg", "finder_img_info_table", m11.l0.u1("finder_img_info_table"), 1000000001L, 1001000001L);
        d("@gamelifesess", "gamelife_img_info_table", m11.l0.u1("gamelife_img_info_table"), 1001000002L, 1002000002L);
        d("@bizfansmsg", "bizfans_img_info_table", m11.l0.u1("bizfans_img_info_table"), 1002000003L, 1003000003L);
        d("@zhugemsg", "w1w_img_info_table", m11.l0.u1("w1w_img_info_table"), 1003000004L, 1004000004L);
        d("@picfansmsg", "biz_photo_fans_img_info_table", m11.l0.u1("biz_photo_fans_img_info_table"), 1004000005L, 1005000005L);
    }

    public static java.lang.String a(long j17) {
        java.util.ArrayList arrayList = f322726a;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11.j0 j0Var = (m11.j0) it.next();
            long[] jArr = j0Var.f322722d;
            if (jArr[0] <= j17 && j17 <= jArr[1]) {
                return j0Var.f322719a;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgInfoStorage", "[getTableById] table=%s id=%s", ((m11.j0) arrayList.get(0)).f322719a, java.lang.Long.valueOf(j17));
        return ((m11.j0) arrayList.get(0)).f322719a;
    }

    public static java.lang.String b(java.lang.String str) {
        java.util.ArrayList arrayList = f322726a;
        if (str == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.ImgInfoStorage", "[getTableByTalker] talker is null %s", new com.tencent.mm.sdk.platformtools.z3());
            return ((m11.j0) arrayList.get(0)).f322719a;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11.j0 j0Var = (m11.j0) it.next();
            if (!j0Var.f322720b.isEmpty() && str.toLowerCase().endsWith(j0Var.f322720b)) {
                return j0Var.f322719a;
            }
        }
        if (!z65.c.f470458d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgInfoStorage", "[getTableByTalker] table=%s talker=%s", ((m11.j0) arrayList.get(0)).f322719a, str);
        }
        return ((m11.j0) arrayList.get(0)).f322719a;
    }

    public static m11.j0 c(java.lang.String str) {
        java.util.ArrayList arrayList = f322726a;
        if (str == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.ImgInfoStorage", "[getIdCreator] talker is null %s", new com.tencent.mm.sdk.platformtools.z3());
            return (m11.j0) arrayList.get(0);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11.j0 j0Var = (m11.j0) it.next();
            if (!j0Var.f322720b.isEmpty() && str.toLowerCase().endsWith(j0Var.f322720b)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImgInfoStorage", "[getIdCreator] table=%s talker=%s", j0Var.f322719a, str);
                return j0Var;
            }
        }
        if (!z65.c.f470458d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgInfoStorage", "[getIdCreator] table=%s talker=%s", ((m11.j0) arrayList.get(0)).f322719a, str);
        }
        return (m11.j0) arrayList.get(0);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.String[] strArr, long j17, long j18) {
        f322726a.add(new m11.j0(str.toLowerCase(), str2, strArr, j17, j18));
    }
}
