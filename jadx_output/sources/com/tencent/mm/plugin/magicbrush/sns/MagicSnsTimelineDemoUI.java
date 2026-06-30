package com.tencent.mm.plugin.magicbrush.sns;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/sns/MagicSnsTimelineDemoUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "", "visible", "", "visibleScene", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MagicSnsTimelineDemoUI extends com.tencent.mm.ui.MMComposeActivity {

    /* renamed from: f, reason: collision with root package name */
    public int f148137f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f148135d = kz5.c0.i("新年快乐", "万事胜意", "新春快乐", "过年好", "身体健康", "恭喜发财", "新年新气象");

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f148136e = kz5.c0.i("[呲牙]", "[爱心]", "[旺柴]", "[猪头]", "[發]", "[福]");

    /* renamed from: g, reason: collision with root package name */
    public final c06.e f148138g = c06.f.a(java.lang.System.currentTimeMillis());

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f148139h = jz5.h.b(new te3.o(this));

    /* renamed from: i, reason: collision with root package name */
    public final te3.q f148140i = new te3.q(this);

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f148141m = jz5.h.b(new te3.p(this));

    /* renamed from: n, reason: collision with root package name */
    public final te3.r f148142n = new te3.r(this);

    public static final void T6(com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI magicSnsTimelineDemoUI, aq0.f delegate) {
        magicSnsTimelineDemoUI.getClass();
        android.util.DisplayMetrics displayMetrics = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics();
        aq0.g gVar = (aq0.g) i95.n0.c(aq0.g.class);
        aq0.i iVar = aq0.i.f13026e;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, displayMetrics.widthPixels * 1.0f, displayMetrics.heightPixels * 1.0f);
        v12.i iVar2 = (v12.i) gVar;
        iVar2.getClass();
        kotlin.jvm.internal.o.g(delegate, "delegate");
        int i17 = iVar2.f432512i + 1;
        iVar2.f432512i = i17;
        com.tencent.mars.xlog.Log.i("MagicSnsTimeline", "enterScene " + iVar + ", rect = " + rectF + ", cnt: " + i17);
        v12.f fVar = iVar2.f432507d;
        if (fVar == null) {
            fVar = new v12.f();
            fVar.f432503e = iVar2;
            com.tencent.mars.xlog.Log.i("MagicSnsTimeline", "create new sns timeline biz done");
        }
        iVar2.f432507d = fVar;
        iVar2.f432510g = delegate;
        if (iVar != iVar2.f432509f) {
            fVar.C0(new zp0.a());
        }
        x12.a aVar = new x12.a(iVar, rectF);
        v12.f fVar2 = iVar2.f432507d;
        if (fVar2 != null) {
            fVar2.C0(aVar);
        }
        delegate.a(new v12.g(i17, iVar2));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View getLayoutView() {
        com.tencent.mm.mm_compose.MMComposeView mMComposeView = new com.tencent.mm.mm_compose.MMComposeView(this, null, 2, null);
        mMComposeView.setContent(u0.j.c(193544540, true, new te3.n(this)));
        return mMComposeView;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v12.i iVar = (v12.i) ((aq0.g) i95.n0.c(aq0.g.class));
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MagicSnsTimeline", "destroy biz");
        iVar.f432512i++;
        v12.f fVar = iVar.f432507d;
        if (fVar != null) {
            fVar.f432503e = null;
            ((rc3.w0) fVar.f432502d).destroy();
            iVar.f432507d = null;
        }
        android.view.View view = iVar.f432508e;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            android.widget.FrameLayout frameLayout = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
            if (frameLayout != null) {
                frameLayout.removeView(view);
            }
            iVar.f432508e = null;
        }
        iVar.f432509f = aq0.i.f13025d;
        iVar.f432510g = null;
        iVar.f432511h = null;
    }
}
