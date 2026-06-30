package ws2;

/* loaded from: classes3.dex */
public final class m1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public ws2.s0 f449099d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback f449100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ayc;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        ws2.u0 u0Var = ws2.k1.f449066r;
        ct2.j jVar = (ct2.j) u0Var.a().e(ct2.j.class);
        if (!(jVar != null && jVar.f222280x)) {
            ct2.j jVar2 = (ct2.j) u0Var.a().e(ct2.j.class);
            if (jVar2 != null) {
                jVar2.Y6(true);
            }
            return super.onBackPressed();
        }
        mm2.c1 c1Var = (mm2.c1) u0Var.a().e(mm2.c1.class);
        if (c1Var != null) {
            c1Var.O1 = false;
        }
        u0Var.c();
        getActivity().finish();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback = this.f449100e;
        if (finderLiveReplayViewCallback == null || (finderLiveReplayPluginLayout = finderLiveReplayViewCallback.f124885n.f449149a) == null) {
            return;
        }
        finderLiveReplayPluginLayout.onConfigurationChanged(newConfig);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0327  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.m1.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ws2.s0 s0Var = this.f449099d;
        if (s0Var != null) {
            s0Var.onDetach();
        }
    }
}
