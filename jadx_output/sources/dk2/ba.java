package dk2;

/* loaded from: classes.dex */
public final class ba extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233247e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233246d = str;
        this.f233247e = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.ba(this.f233246d, this.f233247e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.ba) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.vfs.z2 m17;
        java.lang.String str = this.f233246d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = false;
        try {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveKTVReplayDownloadManager", e17, "saveVideoToAlbum error", new java.lang.Object[0]);
        }
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayDownloadManager", "saveVideoToAlbum: file not exists: " + str);
            return java.lang.Boolean.FALSE;
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context context = this.f233247e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((yb0.g) b0Var).Bi((androidx.appcompat.app.AppCompatActivity) context, str, new dk2.aa(c0Var, countDownLatch));
        countDownLatch.await();
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", "saveVideoToAlbum: result=" + c0Var.f310112d + ", filePath=" + str);
        z17 = c0Var.f310112d;
        return java.lang.Boolean.valueOf(z17);
    }
}
