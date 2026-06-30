package g40;

/* loaded from: classes12.dex */
public final class i implements com.tencent.mm.modelcdntran.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g40.l f268690d;

    public i(g40.l lVar) {
        this.f268690d = lVar;
    }

    @Override // com.tencent.mm.modelcdntran.c1
    public void a(int i17, com.tencent.mm.modelcdntran.d1 info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String str = info.f70908d;
        g40.l lVar = this.f268690d;
        jz5.f0 f0Var = null;
        if (r26.i0.q(str, lVar.f268699g, false, 2, null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileRecordMsgDownloadHelper", "CdnMediaListener status: " + i17 + ", mediaId: " + lVar.f268699g);
            if (i17 == 1) {
                lVar.f268697e = false;
                java.util.ArrayList arrayList = lVar.f268696d;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
                    if (aVar != null) {
                        aVar.c();
                    }
                }
                kz5.h0.B(arrayList, g40.k.f268692d);
                lVar.f();
                com.tencent.mm.storage.f9 f9Var = lVar.f268701i;
                if (f9Var != null) {
                    java.lang.String str2 = lVar.f268700h;
                    if (str2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FileRecordMsgDownloadHelper", "reportDownloadSucceed " + f9Var.getMsgId() + ", " + f9Var.Q0() + ", " + f9Var.I0() + ", fileExt is empty");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FileRecordMsgDownloadHelper", "reportDownloadSucceed " + f9Var.getMsgId() + ", " + f9Var.Q0() + ", " + f9Var.I0() + ", downloadFromScene: " + lVar.f268693a.f278725d);
                        ((com.tencent.mm.pluginsdk.model.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).Ai(f9Var, str2, lVar.f268693a.f278725d, lVar.f268694b);
                    }
                }
            } else if (i17 == 2) {
                lVar.d(3, -1, "record file failed", false);
            } else if (i17 == 3) {
                lVar.d(3, -1, "record file expired", true);
            } else if (i17 == 4) {
                lVar.e(info.f70909e, info.f70910f);
            } else if (i17 != 5) {
                lVar.e(info.f70909e, info.f70910f);
            } else {
                lVar.c();
            }
            java.lang.String str3 = lVar.f268699g;
            if (str3 != null) {
                d40.q qVar = (d40.q) i95.n0.c(d40.q.class);
                f40.k kVar = new f40.k(i17, info.f70909e, info.f70910f);
                qVar.getClass();
                f40.m.f259438g.a().f259439f.compute(str3, new f40.l(kVar));
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileRecordMsgDownloadHelper", "mediaId is null");
            }
        }
    }
}
