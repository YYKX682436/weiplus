package lu2;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f321380b;

    /* renamed from: c, reason: collision with root package name */
    public static android.view.WindowManager f321381c;

    /* renamed from: d, reason: collision with root package name */
    public static android.view.View f321382d;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.ArrayList f321384f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.ArrayList f321385g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.ArrayList f321386h;

    /* renamed from: a, reason: collision with root package name */
    public static final lu2.m f321379a = new lu2.m();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f321383e = kz5.c1.k(new jz5.l("朋友", "TLRecommendTab"), new jz5.l("发现tab", "Discovery"));

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.c0.i("视频号", "直播", "听一听", "看一看", "长视频", "图文(下线)", "搜一搜", "游戏"));
        f321384f = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add("DSL红点");
            arrayList3.add("s级红点");
            arrayList3.add("clear_type=0");
            arrayList3.add("文字红点");
            arrayList3.add("文字头像红点");
            arrayList3.add("普通红点");
            arrayList2.add(arrayList3);
        }
        f321385g = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int size2 = f321384f.size();
        for (int i18 = 0; i18 < size2; i18++) {
            int size3 = ((java.util.List) f321385g.get(i18)).size();
            for (int i19 = 0; i19 < size3; i19++) {
                java.lang.String str = (java.lang.String) f321384f.get(i18);
                int hashCode = str.hashCode();
                if (hashCode != 969785) {
                    if (hashCode == 35126732 && str.equals("视频号")) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add("无");
                        arrayList5.add("朋友");
                        arrayList5.add("发现tab");
                        arrayList4.add(arrayList5);
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add("");
                    arrayList4.add(arrayList6);
                } else {
                    if (str.equals("直播")) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add("无");
                        arrayList7.add("发现tab");
                        arrayList4.add(arrayList7);
                    }
                    java.util.ArrayList arrayList62 = new java.util.ArrayList();
                    arrayList62.add("");
                    arrayList4.add(arrayList62);
                }
            }
        }
        f321386h = arrayList4;
    }

    public static final void a(lu2.m mVar, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Object obj, java.lang.Object obj2) {
        int i19;
        java.util.LinkedList linkedList;
        java.lang.String str3;
        mVar.getClass();
        boolean b17 = kotlin.jvm.internal.o.b(obj, "s级红点");
        boolean b18 = kotlin.jvm.internal.o.b(obj, "clear_type=0");
        java.util.ArrayList d17 = kz5.c0.d(str);
        if (obj2 != null && (str3 = (java.lang.String) f321383e.get(obj2)) != null) {
            d17.add(str3);
        }
        r45.vs2 vs2Var = new r45.vs2();
        vs2Var.f388496q = g92.b.f269769e.T0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tipsId_");
        sb6.append(str);
        char c17 = '_';
        sb6.append('_');
        sb6.append(i18);
        sb6.append('_');
        sb6.append(java.lang.System.nanoTime());
        vs2Var.f388490h = sb6.toString();
        vs2Var.f388503x = "tipsUuid_" + str + '_' + i18 + '_' + java.lang.System.nanoTime();
        vs2Var.f388491i = 1800;
        vs2Var.f388487e = i17;
        vs2Var.f388505z = i18;
        int size = d17.size();
        int i27 = 0;
        int i28 = 0;
        while (i28 < size) {
            java.util.LinkedList linkedList2 = vs2Var.f388489g;
            r45.f03 f03Var = new r45.f03();
            f03Var.f373892i = (java.lang.String) d17.get(i28);
            f03Var.f373894n = 1;
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo();
            finderTipsShowEntranceExtInfo.set(i27, -4688240171222493109L);
            f03Var.f373895o = hc2.b.a(finderTipsShowEntranceExtInfo);
            f03Var.f373891h = !b18 ? 1 : 0;
            f03Var.f373899s = b17 ? 1 : 0;
            f03Var.f373889f = str2 + c17 + obj;
            if (kotlin.jvm.internal.o.b(obj, "文字红点")) {
                i19 = 3;
            } else if (kotlin.jvm.internal.o.b(obj, "文字头像红点")) {
                f03Var.f373890g = null;
                i19 = 16;
            } else {
                i19 = kotlin.jvm.internal.o.b(obj, "普通红点") ? 1 : 999;
            }
            f03Var.f373887d = i19;
            if (i19 == 999) {
                r45.ya0 ya0Var = new r45.ya0();
                f03Var.B = ya0Var;
                r45.fz2 fz2Var = new r45.fz2();
                ya0Var.f390918d = fz2Var;
                java.util.LinkedList linkedList3 = fz2Var.f374741d;
                if (linkedList3 == null) {
                    linkedList3 = new java.util.LinkedList();
                }
                fz2Var.f374741d = linkedList3;
                r45.cp5 cp5Var = new r45.cp5();
                cp5Var.f371768d = 1;
                r45.ap5 ap5Var = new r45.ap5();
                cp5Var.f371769e = ap5Var;
                ap5Var.f370176d = new r45.x80();
                r45.ap5 ap5Var2 = cp5Var.f371769e;
                r45.x80 x80Var = ap5Var2 != null ? ap5Var2.f370176d : null;
                if (x80Var != null) {
                    x80Var.f389853d = str2 + "_test_ori_" + obj;
                }
                r45.ap5 ap5Var3 = cp5Var.f371769e;
                r45.x80 x80Var2 = ap5Var3 != null ? ap5Var3.f370176d : null;
                if (x80Var2 != null) {
                    r45.wm5 wm5Var = new r45.wm5();
                    wm5Var.f389290d = 1;
                    x80Var2.f389855f = wm5Var;
                }
                r45.ap5 ap5Var4 = cp5Var.f371769e;
                if (ap5Var4 != null) {
                    ap5Var4.f370177e = new r45.x80();
                }
                r45.ap5 ap5Var5 = cp5Var.f371769e;
                r45.x80 x80Var3 = ap5Var5 != null ? ap5Var5.f370177e : null;
                if (x80Var3 != null) {
                    x80Var3.f389853d = str2 + "_test_thu_" + obj;
                }
                r45.ap5 ap5Var6 = cp5Var.f371769e;
                r45.x80 x80Var4 = ap5Var6 != null ? ap5Var6.f370177e : null;
                if (x80Var4 != null) {
                    r45.wm5 wm5Var2 = new r45.wm5();
                    wm5Var2.f389290d = 1;
                    x80Var4.f389855f = wm5Var2;
                }
                r45.yo5 yo5Var = new r45.yo5();
                cp5Var.f371770f = yo5Var;
                yo5Var.f391261d = new r45.t60();
                r45.yo5 yo5Var2 = cp5Var.f371770f;
                r45.t60 t60Var = yo5Var2 != null ? yo5Var2.f391261d : null;
                i27 = 0;
                if (t60Var != null) {
                    t60Var.f386168f = 0;
                }
                r45.fz2 fz2Var2 = ya0Var.f390918d;
                if (fz2Var2 != null && (linkedList = fz2Var2.f374741d) != null) {
                    linkedList.add(cp5Var);
                }
            }
            linkedList2.add(f03Var);
            i28++;
            c17 = '_';
        }
        zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var, "RedDotMock", null, false, null, 28, null);
    }
}
