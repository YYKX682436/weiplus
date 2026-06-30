package yc2;

/* loaded from: classes2.dex */
public final class d extends xc2.o {
    @Override // xc2.j
    public void l() {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.Html5Info html5_info;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPreload jumpInfoEx is null=");
        sb6.append(this.f453162b == null);
        com.tencent.mars.xlog.Log.i("Finder.DramaEventHandler", sb6.toString());
        xc2.p0 p0Var = this.f453162b;
        if (p0Var != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = p0Var.f453234a;
            if (finderJumpInfo != null && finderJumpInfo.getJumpinfo_type() == 2) {
                if (finderJumpInfo == null || (html5_info = finderJumpInfo.getHtml5_info()) == null || (str = html5_info.getUrl()) == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    com.tencent.mars.xlog.Log.e("Finder.DramaEventHandler", "doPreload url is null");
                    return;
                }
                com.tencent.mars.xlog.Log.i("Finder.DramaEventHandler", "[preloadH5] url:".concat(str));
                zq1.i0 i0Var = new zq1.i0();
                i0Var.f474983a = str;
                i0Var.f474985c = 214;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(i0Var);
                ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList);
            }
        }
    }

    @Override // xc2.o, xc2.j
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        java.lang.String str = wo.w0.k() + '_' + java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str);
        infoEx.f453243e0 = linkedHashMap;
        super.r(holder, jumpView, infoEx);
    }
}
