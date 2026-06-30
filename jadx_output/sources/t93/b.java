package t93;

/* loaded from: classes.dex */
public class b implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f416569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t93.c f416571f;

    public b(t93.c cVar, java.util.Map map, java.lang.String str) {
        this.f416571f = cVar;
        this.f416569d = map;
        this.f416570e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [t93.b] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.lite.api.p] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        t93.c cVar;
        r45.dl2 dl2Var;
        int i17;
        ?? r17 = this;
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.Integer num2 = (java.lang.Integer) obj2;
        r45.ov0 ov0Var = (r45.ov0) obj4;
        t93.c cVar2 = r17.f416571f;
        try {
            ov0Var.getList(1).size();
            try {
                if (num.intValue() == 0 && num2.intValue() == 0 && !ov0Var.getList(1).isEmpty()) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    r45.dl2 dl2Var2 = (r45.dl2) ov0Var.getList(1).get(0);
                    boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(((r45.wz1) ((r45.nw1) dl2Var2.getCustom(1)).getCustom(30)).getList(6));
                    java.lang.String str = r17.f416570e;
                    java.util.Map map = r17.f416569d;
                    if (L0 && ((r45.yz1) ((r45.wz1) ((r45.nw1) dl2Var2.getCustom(1)).getCustom(30)).getCustom(7)) == null) {
                        map.put("ret", 0);
                        map.put("err_msg", "live mic info is empty");
                        map.put("requestId", str);
                    } else if (com.tencent.mm.sdk.platformtools.t8.L0(((r45.wz1) ((r45.nw1) dl2Var2.getCustom(1)).getCustom(30)).getList(6))) {
                        cl0.d dVar = new cl0.d();
                        dVar.e("headurl", ((com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) ((r45.yz1) ((r45.wz1) ((r45.nw1) dl2Var2.getCustom(1)).getCustom(30)).getCustom(7)).getCustom(3)).getCustom(0)).getHeadUrl());
                        dVar.e("nickname", ((com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) ((r45.yz1) ((r45.wz1) ((r45.nw1) dl2Var2.getCustom(1)).getCustom(30)).getCustom(7)).getCustom(3)).getCustom(0)).getNickname());
                        dVar.e("mictype", 2);
                        jSONArray.put(dVar);
                        map.put("micInfos", jSONArray);
                        map.put("ret", 0);
                        map.put("err_msg", "");
                        map.put("requestId", str);
                    } else {
                        int i18 = 0;
                        int i19 = 1;
                        while (i18 < ((r45.wz1) ((r45.nw1) dl2Var2.getCustom(i19)).getCustom(30)).getList(6).size()) {
                            try {
                                r45.uz1 uz1Var = (r45.uz1) ((r45.wz1) ((r45.nw1) dl2Var2.getCustom(1)).getCustom(30)).getList(6).get(i18);
                                if (uz1Var == null || ((r45.xn1) uz1Var.getCustom(0)) == null) {
                                    dl2Var = dl2Var2;
                                } else {
                                    dl2Var = dl2Var2;
                                    if (((com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) uz1Var.getCustom(0)).getCustom(0)) != null) {
                                        cl0.d dVar2 = new cl0.d();
                                        cVar = cVar2;
                                        try {
                                            dVar2.e("headurl", ((com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) uz1Var.getCustom(0)).getCustom(0)).getHeadUrl());
                                            dVar2.e("nickname", ((com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) uz1Var.getCustom(0)).getCustom(0)).getNickname());
                                            i17 = 1;
                                            dVar2.e("mictype", java.lang.Integer.valueOf(uz1Var.getInteger(1)));
                                            jSONArray.put(dVar2);
                                            i18++;
                                            i19 = i17;
                                            cVar2 = cVar;
                                            dl2Var2 = dl2Var;
                                        } catch (java.lang.Exception e17) {
                                            e = e17;
                                            r17 = cVar;
                                            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiGetFinderLivePreviewMicCover", e, "getFinderLivePreviewMicCover fail", new java.lang.Object[0]);
                                            r17.f143443f.a("Invalid input parameters");
                                            return null;
                                        }
                                    }
                                }
                                cVar = cVar2;
                                i17 = 1;
                                i18++;
                                i19 = i17;
                                cVar2 = cVar;
                                dl2Var2 = dl2Var;
                            } catch (java.lang.Exception e18) {
                                e = e18;
                                cVar = cVar2;
                                r17 = cVar;
                                com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiGetFinderLivePreviewMicCover", e, "getFinderLivePreviewMicCover fail", new java.lang.Object[0]);
                                r17.f143443f.a("Invalid input parameters");
                                return null;
                            }
                        }
                        cVar = cVar2;
                        map.put("micInfos", jSONArray);
                        map.put("ret", 0);
                        map.put("err_msg", "");
                        map.put("requestId", str);
                        t93.c cVar3 = cVar;
                        cVar3.f143443f.b(map);
                        r17 = cVar3;
                    }
                    cVar = cVar2;
                    t93.c cVar32 = cVar;
                    cVar32.f143443f.b(map);
                    r17 = cVar32;
                } else {
                    t93.c cVar4 = cVar2;
                    cVar4.f143443f.a("Invalid input parameters Or live mic info is empty!");
                    r17 = cVar4;
                }
                return null;
            } catch (java.lang.Exception e19) {
                e = e19;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            r17 = cVar2;
        }
    }
}
