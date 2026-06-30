package mx0;

/* loaded from: classes5.dex */
public final class i7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f332047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f332048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332047d = mJTime;
        this.f332048e = mJTime2;
        this.f332049f = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.i7(this.f332047d, this.f332048e, this.f332049f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.i7 i7Var = (mx0.i7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mx0.g3 recordPlugin;
        mx0.g3 recordPlugin2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.maas.model.time.MJTime mJTime = this.f332047d;
        if (mJTime.isNumeric()) {
            com.tencent.maas.model.time.MJTime mJTime2 = this.f332048e;
            boolean isNumeric = mJTime2.isNumeric();
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332049f;
            if (isNumeric) {
                double seconds = (mJTime.toSeconds() / mJTime2.toSeconds()) * 100;
                recordPlugin2 = shootComposingPluginLayout.getRecordPlugin();
                float f17 = (float) seconds;
                com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularProgressBar recordButtonCircularProgressBar = recordPlugin2.f331993g.f69504g;
                if (recordButtonCircularProgressBar != null) {
                    recordButtonCircularProgressBar.f69534m = f17;
                    recordButtonCircularProgressBar.invalidate();
                }
            } else {
                recordPlugin = shootComposingPluginLayout.getRecordPlugin();
                float milliseconds = (((float) (((long) mJTime.toMilliseconds()) % 2000)) / 2000) * 100;
                com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularProgressBar recordButtonCircularProgressBar2 = recordPlugin.f331993g.f69504g;
                if (recordButtonCircularProgressBar2 != null) {
                    recordButtonCircularProgressBar2.f69534m = milliseconds;
                    recordButtonCircularProgressBar2.invalidate();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
