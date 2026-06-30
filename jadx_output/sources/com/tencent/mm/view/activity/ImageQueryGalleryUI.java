package com.tencent.mm.view.activity;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/view/activity/ImageQueryGalleryUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "compose-image-query_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes4.dex */
public final class ImageQueryGalleryUI extends com.tencent.mm.ui.MMComposeActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487934bx;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{zm5.f0.class, zm5.l.class, zm5.t.class, zm5.g.class});
    }

    @Override // com.tencent.mm.ui.MMComposeActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().setFlags(201327616, 201327616);
        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
        ai3.d.f5107a = true;
        com.tencent.mm.ui.v9.d(this);
        getWindow().setFormat(-3);
        hideTitleView();
        setLightNavigationbarIcon();
    }
}
