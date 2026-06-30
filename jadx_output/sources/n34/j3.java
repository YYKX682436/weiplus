package n34;

/* loaded from: classes4.dex */
public final class j3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f334643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f334644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f334646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.ui.widget.dialog.u3 u3Var, int i17, android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334643d = u3Var;
        this.f334644e = i17;
        this.f334645f = context;
        this.f334646g = snsInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        n34.j3 j3Var = new n34.j3(this.f334643d, this.f334644e, this.f334645f, this.f334646g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        return j3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        java.lang.Object invokeSuspend = ((n34.j3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f334643d.dismiss();
        if (this.f334644e == 1) {
            android.content.Context context = this.f334645f;
            db5.t7.e(context, context.getString(com.tencent.mm.R.string.jf7), com.tencent.mm.R.raw.sns_icons_filled_top);
            ta4.g1.f416747a.a(1, 2, this.f334646g);
        } else {
            this.f334645f.getString(com.tencent.mm.R.string.jey);
            android.content.Context context2 = this.f334645f;
            db5.t7.e(context2, context2.getString(com.tencent.mm.R.string.jey), com.tencent.mm.R.raw.sns_icons_filled_top_off);
            ta4.g1.f416747a.a(2, 2, this.f334646g);
        }
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        long j17 = this.f334646g.field_snsId;
        o75.b bVar = o75.b.f343581b;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(gVar.i7(j17, o75.b.f343583d));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        return valueOf;
    }
}
