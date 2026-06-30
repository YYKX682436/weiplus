package dz4;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f245375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f245376f;

    public q(dz4.j0 j0Var, long j17, java.util.List list) {
        this.f245374d = j0Var;
        this.f245375e = j17;
        this.f245376f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<dz4.m> list = this.f245376f;
        dz4.j0 j0Var = this.f245374d;
        j0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            for (dz4.m mVar : list) {
                int i17 = mVar.f245345a;
                if (i17 != 1) {
                    android.net.Uri uri = mVar.f245347c;
                    if (i17 == 2) {
                        java.lang.String valueOf = java.lang.String.valueOf(uri);
                        com.tencent.wechat.aff.favorites.j c17 = j0Var.c(valueOf);
                        if (c17 != null) {
                            com.tencent.wechat.aff.favorites.v vVar = new com.tencent.wechat.aff.favorites.v();
                            vVar.f216873d = 2;
                            boolean[] zArr = vVar.f216878i;
                            zArr[1] = true;
                            vVar.f216877h = c17;
                            zArr[5] = true;
                            arrayList.add(vVar);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "processClipBoardItems: image buildImageMediaInfoResp failed, imgPath=" + valueOf);
                        }
                    } else if (i17 == 3) {
                        java.lang.String valueOf2 = java.lang.String.valueOf(uri);
                        com.tencent.wechat.aff.favorites.j d17 = j0Var.d(valueOf2);
                        if (d17 != null) {
                            com.tencent.wechat.aff.favorites.v vVar2 = new com.tencent.wechat.aff.favorites.v();
                            vVar2.f216873d = 3;
                            boolean[] zArr2 = vVar2.f216878i;
                            zArr2[1] = true;
                            vVar2.f216877h = d17;
                            zArr2[5] = true;
                            arrayList.add(vVar2);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "processClipBoardItems: video buildVideoMediaInfoResp failed, importPath=" + valueOf2);
                        }
                    } else if (i17 == 4) {
                        kotlin.jvm.internal.o.d(uri);
                        com.tencent.wechat.aff.favorites.c b17 = j0Var.b(uri, mVar.f245348d);
                        if (b17 != null) {
                            com.tencent.wechat.aff.favorites.v vVar3 = new com.tencent.wechat.aff.favorites.v();
                            vVar3.f216873d = 4;
                            boolean[] zArr3 = vVar3.f216878i;
                            zArr3[1] = true;
                            vVar3.f216876g = b17;
                            zArr3[4] = true;
                            arrayList.add(vVar3);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "processClipBoardItems: file buildFileInfoResp failed, uri=" + uri);
                        }
                    }
                } else {
                    com.tencent.wechat.aff.favorites.v vVar4 = new com.tencent.wechat.aff.favorites.v();
                    vVar4.f216873d = 1;
                    boolean[] zArr4 = vVar4.f216878i;
                    zArr4[1] = true;
                    vVar4.f216874e = mVar.f245346b;
                    zArr4[2] = true;
                    arrayList.add(vVar4);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "processClipBoardItems: error " + e17);
        }
        com.tencent.wechat.aff.wenote.i iVar = j0Var.f245310b;
        if (iVar != null) {
            iVar.q0(this.f245375e, arrayList);
        }
    }
}
