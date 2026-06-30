package com.tencent.mm.plugin.vlog.ui.fake;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/fake/VLogFakePlayActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class VLogFakePlayActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f175909g = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.videocomposition.play.VideoCompositionPlayView f175910d;

    /* renamed from: e, reason: collision with root package name */
    public zv3.f f175911e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.xeffect.effect.EffectManager f175912f = new com.tencent.mm.xeffect.effect.EffectManager();

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489598d41;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        float[] fArr;
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        ai3.d.f5107a = true;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("composition_proto");
        r45.h70 h70Var = new r45.h70();
        if (byteArrayExtra != null) {
            try {
                h70Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        com.tencent.mm.plugin.vlog.model.h1 d17 = com.tencent.mm.plugin.vlog.model.x.d(h70Var, this.f175912f);
        com.tencent.mm.plugin.vlog.model.f0.a(new com.tencent.mm.plugin.vlog.model.n(), h70Var, false, new zo4.b(this), 2, null);
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.vlog.model.x.f(h70Var.f375902i.f376778g, rect);
        d17.t(rect);
        lt3.n nVar = lt3.n.f321260a;
        java.util.LinkedList baseItemData = h70Var.f375904n.f374939e;
        kotlin.jvm.internal.o.f(baseItemData, "baseItemData");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.ArrayList c17 = nVar.c(baseItemData, context);
        java.util.LinkedList values = h70Var.f375904n.f374938d.f388350d;
        kotlin.jvm.internal.o.f(values, "values");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(values, 10));
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf(((java.lang.Integer) it.next()).intValue()));
        }
        float[] P0 = kz5.n0.P0(arrayList);
        r45.vl5 vl5Var = h70Var.f375904n.f374941g;
        if (vl5Var != null) {
            java.util.LinkedList values2 = vl5Var.f388350d;
            kotlin.jvm.internal.o.f(values2, "values");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(values2, 10));
            java.util.Iterator it6 = values2.iterator();
            while (it6.hasNext()) {
                arrayList2.add(java.lang.Float.valueOf(((java.lang.Integer) it6.next()).intValue()));
            }
            fArr = kz5.n0.P0(arrayList2);
        } else {
            fArr = null;
        }
        r45.i70 i70Var = h70Var.f375902i;
        zv3.f fVar = new zv3.f(P0, fArr, c17, i70Var.f376776e, i70Var.f376777f);
        this.f175911e = fVar;
        d17.p(fVar);
        zv3.f fVar2 = this.f175911e;
        if (fVar2 != null) {
            fVar2.e();
        }
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = (com.tencent.mm.videocomposition.play.VideoCompositionPlayView) findViewById(com.tencent.mm.R.id.p4g);
        this.f175910d = videoCompositionPlayView;
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) (videoCompositionPlayView != null ? videoCompositionPlayView.getLayoutParams() : null);
        if (layoutParams != null) {
            layoutParams.B = java.lang.String.valueOf((rect.width() * 1.0f) / rect.height());
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView2 = this.f175910d;
            if (videoCompositionPlayView2 != null) {
                videoCompositionPlayView2.setLayoutParams(layoutParams);
            }
        }
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView3 = this.f175910d;
        if (videoCompositionPlayView3 != null) {
            videoCompositionPlayView3.o(d17.e());
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zv3.f fVar = this.f175911e;
        if (fVar != null) {
            fVar.a();
        }
        this.f175912f.k();
    }
}
