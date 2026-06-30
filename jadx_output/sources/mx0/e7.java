package mx0;

/* loaded from: classes5.dex */
public final class e7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.v f331964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.v f331965f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, yx0.v vVar, yx0.v vVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331963d = shootComposingPluginLayout;
        this.f331964e = vVar;
        this.f331965f = vVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.e7(this.f331963d, this.f331964e, this.f331965f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.e7 e7Var = (mx0.e7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.constraintlayout.widget.ConstraintLayout rootView;
        boolean z17;
        android.view.ViewGroup sideToolbar;
        android.view.ViewGroup sideToolbar2;
        android.view.ViewGroup sideToolbar3;
        mx0.x musicTipsPlugin;
        mx0.o1 materialImportUIPlugin;
        mx0.l favoritePlugin;
        mx0.g3 recordPlugin;
        mx0.g3 recordPlugin2;
        mx0.g3 recordPlugin3;
        mx0.g3 recordPlugin4;
        mx0.g3 recordPlugin5;
        mx0.g3 recordPlugin6;
        mx0.g3 recordPlugin7;
        mx0.j3 recordTimePlugin;
        mx0.x musicTipsPlugin2;
        mx0.o1 materialImportUIPlugin2;
        mx0.l favoritePlugin2;
        android.view.ViewGroup sideToolbar4;
        android.view.ViewGroup sideToolbar5;
        android.view.ViewGroup sideToolbar6;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f331963d;
        rootView = shootComposingPluginLayout.getRootView();
        yx0.v vVar = this.f331964e;
        switch (vVar.ordinal()) {
            case 0:
            case 2:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 16:
            case 17:
                z17 = true;
                break;
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 13:
            case 14:
            case 15:
                z17 = false;
                break;
            default:
                throw new jz5.j();
        }
        rootView.setEnabled(z17);
        if (kz5.c0.i(yx0.v.f467695f, yx0.v.f467702p, yx0.v.f467700n).contains(vVar)) {
            sideToolbar4 = shootComposingPluginLayout.getSideToolbar();
            sideToolbar4.setEnabled(true);
            sideToolbar5 = shootComposingPluginLayout.getSideToolbar();
            com.tencent.mm.accessibility.base.MapExpandKt.visitChild(sideToolbar5, mx0.c7.f331887d);
            sideToolbar6 = shootComposingPluginLayout.getSideToolbar();
            sideToolbar6.setAlpha(1.0f);
        } else {
            sideToolbar = shootComposingPluginLayout.getSideToolbar();
            sideToolbar.setEnabled(false);
            sideToolbar2 = shootComposingPluginLayout.getSideToolbar();
            com.tencent.mm.accessibility.base.MapExpandKt.visitChild(sideToolbar2, mx0.d7.f331919d);
            sideToolbar3 = shootComposingPluginLayout.getSideToolbar();
            sideToolbar3.setAlpha(0.7f);
        }
        int ordinal = vVar.ordinal();
        if (ordinal == 2 || ordinal == 7) {
            musicTipsPlugin = shootComposingPluginLayout.getMusicTipsPlugin();
            mx0.q2 q2Var = (mx0.q2) musicTipsPlugin;
            q2Var.e().setEnabled(true);
            if (q2Var.f332238i == 0) {
                q2Var.e().animate().cancel();
                q2Var.e().animate().alpha(1.0f).setDuration(300L).start();
            }
            materialImportUIPlugin = shootComposingPluginLayout.getMaterialImportUIPlugin();
            materialImportUIPlugin.b();
            favoritePlugin = shootComposingPluginLayout.getFavoritePlugin();
            favoritePlugin.e(true);
        } else {
            musicTipsPlugin2 = shootComposingPluginLayout.getMusicTipsPlugin();
            ((mx0.q2) musicTipsPlugin2).b();
            materialImportUIPlugin2 = shootComposingPluginLayout.getMaterialImportUIPlugin();
            materialImportUIPlugin2.a();
            favoritePlugin2 = shootComposingPluginLayout.getFavoritePlugin();
            favoritePlugin2.e(false);
        }
        yx0.v vVar2 = yx0.v.f467705s;
        if (this.f331965f == vVar2) {
            recordPlugin5 = shootComposingPluginLayout.getRecordPlugin();
            recordPlugin5.b(false);
            recordPlugin6 = shootComposingPluginLayout.getRecordPlugin();
            recordPlugin6.reset();
            recordPlugin7 = shootComposingPluginLayout.getRecordPlugin();
            recordPlugin7.b(true);
            recordTimePlugin = shootComposingPluginLayout.getRecordTimePlugin();
            recordTimePlugin.b();
        }
        if (vVar == vVar2) {
            recordPlugin4 = shootComposingPluginLayout.getRecordPlugin();
            com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton = recordPlugin4.f331993g;
            recordButton.setContentDescription(i65.a.r(recordButton.getContext(), com.tencent.mm.R.string.mct));
        } else {
            recordPlugin = shootComposingPluginLayout.getRecordPlugin();
            com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton2 = recordPlugin.f331993g;
            recordButton2.setContentDescription(i65.a.r(recordButton2.getContext(), com.tencent.mm.R.string.mcs));
        }
        switch (vVar.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 13:
            case 14:
            case 15:
            case 16:
                recordPlugin2 = shootComposingPluginLayout.getRecordPlugin();
                recordPlugin2.a();
                com.tencent.mm.mj_publisher.finder.shoot_composing.more_template.MoreTemplateFakeView moreTemplateFakeView = shootComposingPluginLayout.Q;
                if (moreTemplateFakeView != null) {
                    moreTemplateFakeView.setEnabled(false);
                    moreTemplateFakeView.setAlpha(0.7f);
                    break;
                }
                break;
            case 2:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 17:
                recordPlugin3 = shootComposingPluginLayout.getRecordPlugin();
                recordPlugin3.f331990d.setEnabled(true);
                com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton3 = recordPlugin3.f331993g;
                recordButton3.setTouchEnable(true);
                recordButton3.setAlpha(1.0f);
                com.tencent.mm.mj_publisher.finder.shoot_composing.more_template.MoreTemplateFakeView moreTemplateFakeView2 = shootComposingPluginLayout.Q;
                if (moreTemplateFakeView2 != null) {
                    moreTemplateFakeView2.setEnabled(true);
                    moreTemplateFakeView2.setAlpha(1.0f);
                    break;
                }
                break;
        }
        return jz5.f0.f302826a;
    }
}
