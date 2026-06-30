package m34;

/* loaded from: classes4.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.ui.VideoPlayView f323379d;

    public x(com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView) {
        this.f323379d = videoPlayView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sight/decode/ui/VideoPlayView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = this.f323379d;
        videoPlayView.f162519s.removeCallbacks(videoPlayView.F);
        videoPlayView.f162519s.postDelayed(videoPlayView.F, 3000L);
        if (videoPlayView.f162513m.isPlaying()) {
            videoPlayView.f(-1);
            m34.d dVar = videoPlayView.f162514n;
            if (dVar != null) {
                dVar.setIsPlay(false);
            }
        } else {
            videoPlayView.h(false);
            videoPlayView.f162513m.b(videoPlayView.f162515o);
            m34.d dVar2 = videoPlayView.f162514n;
            if (dVar2 != null) {
                dVar2.setIsPlay(true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
