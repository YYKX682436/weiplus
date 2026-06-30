package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public class w implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f160012a;

    public w(com.tencent.mm.plugin.scanner.x xVar, km5.b bVar) {
        this.f160012a = bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        java.util.LinkedList linkedList;
        km5.b bVar = this.f160012a;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FetchQRCodeInfoService", "fetchQRCodeInfo errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            bVar.c(null);
            return;
        }
        r45.zf zfVar = (r45.zf) oVar.f70711b.f70700a;
        if (zfVar == null || (linkedList = zfVar.f391967e) == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FetchQRCodeInfoService", "resp error");
            bVar.c(null);
        } else {
            r45.aq3 aq3Var = (r45.aq3) linkedList.getFirst();
            com.tencent.mars.xlog.Log.i("MicroMsg.FetchQRCodeInfoService", "fetchQRCodeInfo success, ret:%s name:%s url:%s urlType:%s", java.lang.Integer.valueOf(aq3Var.f370198d), aq3Var.f370203i, aq3Var.f370199e, java.lang.Integer.valueOf(aq3Var.f370201g));
            bVar.c(aq3Var);
        }
    }
}
