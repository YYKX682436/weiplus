package mx0;

/* loaded from: classes5.dex */
public final class o8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx0.k f332197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332198f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(java.lang.String str, rx0.k kVar, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332196d = str;
        this.f332197e = kVar;
        this.f332198f = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.o8(this.f332196d, this.f332197e, this.f332198f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.o8 o8Var = (mx0.o8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        int i17;
        java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String h17 = ai3.d.h("mp4");
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((yb0.g) b0Var).getClass();
        boolean z17 = com.tencent.mm.platformtools.ExportFileUtil.g(context, this.f332196d, h17, null) != null;
        pp0.h0 h0Var = (pp0.h0) i95.n0.c(pp0.h0.class);
        com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo = this.f332197e.f400936c;
        if (mJRecordingFinishInfo == null || (list2 = mJRecordingFinishInfo.f47823g) == null) {
            list = kz5.p0.f313996d;
        } else {
            list = new java.util.ArrayList();
            for (com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo : list2) {
                kotlin.jvm.internal.o.d(mJAssetInfo);
                com.tencent.mm.maas_api.MJMediaItem a17 = pp0.j0.a(mJAssetInfo);
                if (a17 != null) {
                    list.add(a17);
                }
            }
        }
        ((yy0.m0) h0Var).wi(list);
        if (z17) {
            q75.c.f(h17, com.tencent.mm.sdk.platformtools.x2.f193071a);
            i17 = com.tencent.mm.R.string.oir;
        } else {
            i17 = com.tencent.mm.R.string.oiq;
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332198f;
        db5.t7.i(shootComposingPluginLayout.getContext(), shootComposingPluginLayout.getContext().getString(i17), 0);
        return jz5.f0.f302826a;
    }
}
