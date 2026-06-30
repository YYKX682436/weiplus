package xn4;

/* loaded from: classes11.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f455602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI f455603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI dialogDownloadUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455603e = dialogDownloadUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xn4.c(this.f455603e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xn4.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f455602d;
        com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI dialogDownloadUI = this.f455603e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xn4.c0 c0Var = xn4.c0.f455604a;
            java.lang.String cdnUrl = dialogDownloadUI.V6().f380677p;
            kotlin.jvm.internal.o.f(cdnUrl, "cdnUrl");
            java.lang.String g17 = c0Var.g(cdnUrl);
            this.f455602d = 1;
            obj = ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ni(g17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.DialogDownloadUI", "isCdnDownloading: " + booleanValue);
        int i18 = com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI.f175508g;
        dialogDownloadUI.getClass();
        if (booleanValue) {
            xn4.c0 c0Var2 = xn4.c0.f455604a;
            java.lang.String cdnUrl2 = dialogDownloadUI.V6().f380677p;
            kotlin.jvm.internal.o.f(cdnUrl2, "cdnUrl");
            if (c0Var2.e(cdnUrl2) != 1) {
                java.lang.String cdnUrl3 = dialogDownloadUI.V6().f380677p;
                kotlin.jvm.internal.o.f(cdnUrl3, "cdnUrl");
                c0Var2.i(cdnUrl3, 1);
            }
        }
        if (!booleanValue) {
            xn4.c0 c0Var3 = xn4.c0.f455604a;
            java.lang.String cdnUrl4 = dialogDownloadUI.V6().f380677p;
            kotlin.jvm.internal.o.f(cdnUrl4, "cdnUrl");
            if (c0Var3.e(cdnUrl4) == 1) {
                java.lang.String cdnUrl5 = dialogDownloadUI.V6().f380677p;
                kotlin.jvm.internal.o.f(cdnUrl5, "cdnUrl");
                c0Var3.i(cdnUrl5, 0);
            }
        }
        if (!booleanValue) {
            xn4.c0 c0Var4 = xn4.c0.f455604a;
            java.lang.String cdnUrl6 = dialogDownloadUI.V6().f380677p;
            kotlin.jvm.internal.o.f(cdnUrl6, "cdnUrl");
            if (dialogDownloadUI.U6(c0Var4.f(cdnUrl6))) {
                java.lang.String cdnUrl7 = dialogDownloadUI.V6().f380677p;
                kotlin.jvm.internal.o.f(cdnUrl7, "cdnUrl");
                c0Var4.i(cdnUrl7, 2);
            }
        }
        if (!booleanValue) {
            xn4.c0 c0Var5 = xn4.c0.f455604a;
            java.lang.String cdnUrl8 = dialogDownloadUI.V6().f380677p;
            kotlin.jvm.internal.o.f(cdnUrl8, "cdnUrl");
            if (!dialogDownloadUI.U6(c0Var5.f(cdnUrl8))) {
                java.lang.String cdnUrl9 = dialogDownloadUI.V6().f380677p;
                kotlin.jvm.internal.o.f(cdnUrl9, "cdnUrl");
                c0Var5.i(cdnUrl9, 0);
            }
        }
        dialogDownloadUI.Z6();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            xn4.c0 c0Var6 = xn4.c0.f455604a;
            java.lang.String cdnUrl10 = dialogDownloadUI.V6().f380677p;
            kotlin.jvm.internal.o.f(cdnUrl10, "cdnUrl");
            if (c0Var6.e(cdnUrl10) == 2) {
                java.lang.String cdnUrl11 = dialogDownloadUI.V6().f380677p;
                kotlin.jvm.internal.o.f(cdnUrl11, "cdnUrl");
                if (dialogDownloadUI.U6(c0Var6.f(cdnUrl11))) {
                    dialogDownloadUI.Y6(dialogDownloadUI.V6());
                    com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.DialogDownloadUI", "startDownload but has been success");
                    return f0Var;
                }
            }
        }
        if (booleanValue) {
            dialogDownloadUI.b7();
        }
        return f0Var;
    }
}
