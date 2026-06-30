package kp1;

/* loaded from: classes11.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 f310922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2) {
        super(0);
        this.f310922d = audioPanelTaskBarViewRecommendV2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList;
        bw5.mc0 mc0Var;
        java.util.LinkedList linkedList2;
        bw5.g60 g60Var;
        java.util.LinkedList linkedList3;
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2 = this.f310922d;
        bw5.xb0 xb0Var = audioPanelTaskBarViewRecommendV2.f93014x;
        java.lang.String title = xb0Var != null ? xb0Var.getTitle() : null;
        android.widget.TextView textView = audioPanelTaskBarViewRecommendV2.f93009s;
        if (textView == null) {
            kotlin.jvm.internal.o.o("recommendTitle");
            throw null;
        }
        boolean z17 = true;
        if (title == null || title.length() == 0) {
            title = textView.getResources().getString(com.tencent.mm.R.string.hjd);
        }
        textView.setText(title);
        bw5.xb0 xb0Var2 = audioPanelTaskBarViewRecommendV2.f93014x;
        java.lang.String str = xb0Var2 != null ? xb0Var2.f35053p[4] ? xb0Var2.f35047g : "" : null;
        android.widget.TextView textView2 = audioPanelTaskBarViewRecommendV2.f93010t;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("recommendDesc");
            throw null;
        }
        if (str == null || str.length() == 0) {
            str = textView2.getResources().getString(com.tencent.mm.R.string.hjc);
        }
        textView2.setText(str);
        qk.w8 w8Var = (qk.w8) i95.n0.c(qk.w8.class);
        bw5.xb0 xb0Var3 = audioPanelTaskBarViewRecommendV2.f93014x;
        ((ef0.m3) w8Var).getClass();
        java.lang.String str2 = (xb0Var3 == null || (linkedList2 = xb0Var3.f35049i) == null || (g60Var = (bw5.g60) kz5.n0.Z(linkedList2)) == null || (linkedList3 = g60Var.f27701e) == null) ? null : (java.lang.String) kz5.n0.Z(linkedList3);
        if (str2 == null || str2.length() == 0) {
            android.widget.ImageView imageView = audioPanelTaskBarViewRecommendV2.f93007q;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("recommendCover");
                throw null;
            }
            imageView.setImageResource(com.tencent.mm.R.raw.audio_panel_default_cover);
            audioPanelTaskBarViewRecommendV2.q();
        } else {
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            android.widget.ImageView imageView2 = audioPanelTaskBarViewRecommendV2.f93007q;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("recommendCover");
                throw null;
            }
            ((dl4.m0) tVar).aj(str2, imageView2, 0, new kp1.k0(audioPanelTaskBarViewRecommendV2));
        }
        qk.w8 w8Var2 = (qk.w8) i95.n0.c(qk.w8.class);
        bw5.xb0 xb0Var4 = audioPanelTaskBarViewRecommendV2.f93014x;
        ((ef0.m3) w8Var2).getClass();
        java.lang.String b17 = (xb0Var4 == null || (linkedList = xb0Var4.f35048h) == null || (mc0Var = (bw5.mc0) kz5.n0.Z(linkedList)) == null) ? null : mc0Var.b();
        if (b17 != null && b17.length() != 0) {
            z17 = false;
        }
        if (z17) {
            android.widget.ImageView imageView3 = audioPanelTaskBarViewRecommendV2.f93008r;
            if (imageView3 == null) {
                kotlin.jvm.internal.o.o("recommendUserAvatar");
                throw null;
            }
            imageView3.setVisibility(8);
        } else {
            android.widget.ImageView imageView4 = audioPanelTaskBarViewRecommendV2.f93008r;
            if (imageView4 == null) {
                kotlin.jvm.internal.o.o("recommendUserAvatar");
                throw null;
            }
            imageView4.setVisibility(0);
            ff0.t tVar2 = (ff0.t) i95.n0.c(ff0.t.class);
            android.widget.ImageView imageView5 = audioPanelTaskBarViewRecommendV2.f93008r;
            if (imageView5 == null) {
                kotlin.jvm.internal.o.o("recommendUserAvatar");
                throw null;
            }
            ((dl4.m0) tVar2).aj(b17, imageView5, 0, new kp1.l0(audioPanelTaskBarViewRecommendV2));
        }
        return jz5.f0.f302826a;
    }
}
