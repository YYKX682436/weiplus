package df2;

/* loaded from: classes10.dex */
public final class hs implements ym5.m3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230350d;

    public hs(df2.lt ltVar) {
        this.f230350d = ltVar;
    }

    @Override // ym5.m3
    public void a(int i17, boolean z17, boolean z18) {
        com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager;
        java.lang.String url;
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2;
        df2.lt ltVar = this.f230350d;
        int i18 = ltVar.f230712t;
        java.util.ArrayList arrayList = ltVar.f230717y;
        if (i18 != -1) {
            ltVar.f230712t = i17;
            java.lang.String str2 = df2.lt.W;
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "hand change index: " + ltVar.f230712t);
            if (arrayList.size() > 0) {
                ltVar.f230710r = (in5.c) arrayList.get(ltVar.f230712t % arrayList.size());
            }
        }
        in5.c cVar = ltVar.f230710r;
        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
        java.lang.String str3 = df2.lt.W;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pagechange title :");
        sb6.append((hVar == null || (finderJumpInfo2 = hVar.f233541d) == null) ? null : finderJumpInfo2.getWording());
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", sb6.toString());
        r45.bm1 bm1Var = hVar != null ? hVar.f233545h : null;
        boolean z19 = false;
        int ext_type = (hVar == null || (finderJumpInfo = hVar.f233541d) == null) ? 0 : finderJumpInfo.getExt_type();
        java.lang.String str4 = "";
        if (hVar != null) {
            ltVar.h7(hVar);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (bm1Var == null || (str = bm1Var.getString(0)) == null) {
                str = "";
            }
            objArr[0] = str;
            objArr[1] = 2;
            objArr[2] = java.lang.Integer.valueOf(ltVar.l7(hVar));
            g0Var.d(27755, objArr);
            java.util.LinkedList<dk2.h> linkedList = ltVar.C;
            if (ext_type == 1) {
                te2.u3 u3Var = te2.u3.f418468a;
                r45.bm1 bm1Var2 = hVar.f233545h;
                u3Var.a(1, bm1Var2 != null ? bm1Var2.getString(0) : null);
                com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "gift add 2 del, index = " + arrayList.indexOf(hVar));
                linkedList.add(hVar);
            } else {
                for (dk2.h hVar2 : linkedList) {
                    int indexOf = arrayList.indexOf(hVar2);
                    if (indexOf >= 0 && indexOf < arrayList.size()) {
                        java.lang.String str5 = df2.lt.W;
                        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "gift 2 del, index = " + indexOf);
                        arrayList.remove(hVar2);
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = ltVar.f230707o;
                        if (wxRecyclerAdapter != null) {
                            wxRecyclerAdapter.notifyItemRemoved(indexOf);
                        }
                    }
                }
                linkedList.clear();
            }
            if (ltVar.N) {
                ltVar.x7();
                ltVar.N = false;
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = ltVar.f230707o;
            if (wxRecyclerAdapter2 != null) {
                int i19 = ltVar.f230712t;
                java.lang.String str6 = df2.lt.W;
                wxRecyclerAdapter2.notifyItemChanged(i19, "bannerselected");
            }
        }
        if (hVar == null || bm1Var == null) {
            return;
        }
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = bm1Var.getInteger(1);
        int integer = bm1Var.getInteger(15);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = hVar.f233541d;
        if (finderJumpInfo3.getHtml5_info() != null) {
            com.tencent.mm.protocal.protobuf.Html5Info html5_info = finderJumpInfo3.getHtml5_info();
            if (html5_info != null && html5_info.getStyle() == 1) {
                com.tencent.mm.protocal.protobuf.Html5Info html5_info2 = finderJumpInfo3.getHtml5_info();
                if (html5_info2 != null && (url = html5_info2.getUrl()) != null) {
                    str4 = url;
                }
                ae2.in inVar = ae2.in.f3688a;
                jz5.g gVar = ae2.in.f3906w0;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() != 2) {
                    if (integer == 1) {
                        if (str4.length() == 0) {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[preloadAdH5] fail, stack:");
                            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            sb7.append(new com.tencent.mm.sdk.platformtools.z3());
                            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", sb7.toString());
                        } else {
                            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "[preloadAdH5] url:".concat(str4));
                            zq1.i0 i0Var = new zq1.i0();
                            i0Var.f474983a = str4;
                            i0Var.f474985c = 214;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(i0Var);
                            ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList2);
                        }
                    }
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == 0 && (recyclerHorizontalViewPager = ltVar.f230706n) != null) {
                        recyclerHorizontalViewPager.postDelayed(new df2.gs(f0Var, str4, hVar, ltVar, bm1Var), bm1Var.getInteger(16));
                    }
                }
            }
        }
        if (finderJumpInfo3.getJumpinfo_type() == 3) {
            com.tencent.mm.protocal.protobuf.NativeInfo native_info = finderJumpInfo3.getNative_info();
            if (native_info != null && native_info.getNative_type() == 17) {
                z19 = true;
            }
            if (z19) {
                ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).Ai(0L, "", "", false, true);
            }
        }
    }
}
