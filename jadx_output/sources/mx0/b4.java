package mx0;

/* loaded from: classes5.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f331846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331847e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331847e = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.b4(this.f331847e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.b4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long showShootGuideDelay;
        mx0.g3 recordPlugin;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f331846d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f331847e.D1.dismiss();
            showShootGuideDelay = this.f331847e.getShowShootGuideDelay();
            this.f331846d = 1;
            if (kotlinx.coroutines.k1.b(showShootGuideDelay, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        recordPlugin = this.f331847e.getRecordPlugin();
        com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton = recordPlugin.f331993g;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f331847e;
        xx0.n nVar = shootComposingPluginLayout.K1;
        boolean z17 = nVar != null && nVar.f457924j;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            return f0Var;
        }
        if (shootComposingPluginLayout.f69557v.M() == null) {
            if (shootComposingPluginLayout.D1.isShowing()) {
                shootComposingPluginLayout.D1.dismiss();
            }
            return f0Var;
        }
        if (recordButton.getVisibility() == 0) {
            android.content.Context context = shootComposingPluginLayout.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || activity.isFinishing()) {
                return f0Var;
            }
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.k6(m7Var, null), 3, null);
            qx0.e eVar = shootComposingPluginLayout.D1;
            eVar.getClass();
            eVar.getContentView().measure(0, 0);
            int measuredWidth = eVar.getContentView().getMeasuredWidth();
            int measuredHeight = eVar.getContentView().getMeasuredHeight();
            int height = recordButton.getHeight();
            int[] iArr = new int[2];
            recordButton.getLocationInWindow(iArr);
            int i18 = (iArr[1] - 0) - measuredHeight;
            int i19 = eVar.f367274d ? (iArr[0] + (height / 2)) - (measuredWidth / 2) : iArr[0];
            eVar.setAnimationStyle(com.tencent.mm.R.style.f494610rl);
            eVar.showAtLocation(recordButton, 0, i19, i18);
            shootComposingPluginLayout.G1++;
        }
        return f0Var;
    }
}
