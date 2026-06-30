package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCLong;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
public final class i implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        long j17 = 0;
        if (iPCString != null) {
            java.lang.String str = iPCString.f68406d;
            if (!(str == null || str.length() == 0)) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                java.lang.String str2 = iPCString.f68406d;
                if (str2 == null) {
                    str2 = "";
                }
                c61.l7 l7Var = (c61.l7) b6Var;
                l7Var.getClass();
                com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderObjectFromMp");
                r45.n23 n23Var = null;
                try {
                    r45.an2 an2Var = new r45.an2();
                    an2Var.parseFrom(android.util.Base64.decode(str2, 0));
                    java.lang.String string = an2Var.getString(1);
                    java.lang.String string2 = an2Var.getString(0);
                    com.tencent.mm.protocal.protobuf.FinderObject Yk = l7Var.Yk(0L, string, 184, string2 == null ? "" : string2);
                    r45.n23 n23Var2 = new r45.n23();
                    n23Var2.set(0, Yk);
                    if (Yk != null) {
                        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        ((com.tencent.mm.plugin.finder.report.o3) c17).rk(Yk, 184, null);
                    }
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).oj(n23Var2);
                    n23Var = n23Var2;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.w("Finder.FinderCommonFeatureService", "tryGetFinderObjectFromMp e:" + th6);
                }
                if (rVar != null) {
                    if (n23Var != null && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) n23Var.getCustom(0)) != null) {
                        j17 = finderObject.getId();
                    }
                    rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(j17));
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderPlayInfo data invalid");
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(0L));
        }
    }
}
