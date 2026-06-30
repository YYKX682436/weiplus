package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/j;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes10.dex */
public final class j implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString != null) {
            java.lang.String str = iPCString.f68406d;
            if (!(str == null || str.length() == 0)) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                java.lang.String str2 = iPCString.f68406d;
                if (str2 == null) {
                    str2 = "";
                }
                long Z = pm0.v.Z(str2);
                c61.l7 l7Var = (c61.l7) b6Var;
                l7Var.getClass();
                com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderVideoInfoForMp objectId:" + Z);
                com.tencent.mm.protocal.protobuf.FinderObject Yk = l7Var.Yk(Z, "", 184, "");
                r45.n23 n23Var = new r45.n23();
                n23Var.set(0, Yk);
                if (Yk != null && (objectDesc = Yk.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
                    r45.mb4 i17 = bu2.z.i(finderMedia);
                    mn2.g4 c17 = ds2.h.f242866a.c(Yk.getId(), i17, false);
                    n23Var.set(1, c17.n());
                    n23Var.set(2, c17.getUrl());
                    n23Var.set(3, c17.getPath());
                    n23Var.set(4, java.lang.Integer.valueOf(((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Ai(1, c17.getPath())));
                    n23Var.set(5, c17.g());
                    n23Var.set(6, c17.i());
                    n23Var.set(7, c17.h());
                    n23Var.set(8, java.lang.Boolean.valueOf(i17.getInteger(39) == 1));
                    n23Var.set(9, 184);
                    n23Var.set(13, java.lang.Integer.valueOf(c17.f330006i));
                    n23Var.set(10, "tryGetFinderObjectFromMp");
                    if (!android.text.TextUtils.isEmpty(n23Var.getString(1))) {
                        cu2.x xVar = cu2.x.f222449a;
                        java.lang.String string = n23Var.getString(1);
                        kotlin.jvm.internal.o.d(string);
                        so2.i3 c18 = cu2.x.c(xVar, string, false, false, false, 14, null);
                        n23Var.set(1, c18.field_mediaId);
                        if (com.tencent.mm.vfs.w6.j(c18.u0())) {
                            n23Var.set(11, java.lang.Long.valueOf(c18.field_cacheSize));
                            n23Var.set(12, java.lang.Long.valueOf(c18.field_totalSize));
                            n23Var.set(13, java.lang.Integer.valueOf(c18.field_dynamicRangeType));
                            n23Var.set(14, java.lang.Integer.valueOf(c18.field_state));
                            n23Var.set(21, java.lang.Boolean.valueOf(c18.field_moovReady));
                        }
                    }
                }
                if (rVar != null) {
                    com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper();
                    webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper.f186983d = n23Var;
                    rVar.a(webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper);
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderVideoInfo data invalid");
        if (rVar != null) {
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper2 = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper();
            webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper2.f186983d = null;
            rVar.a(webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper2);
        }
    }
}
