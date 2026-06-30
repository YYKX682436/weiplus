package oh4;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh4.j f345471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, oh4.j jVar, java.lang.String str2) {
        super(0);
        this.f345470d = str;
        this.f345471e = jVar;
        this.f345472f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View tingRedDotArea;
        android.widget.TextView noticeTitleTextView;
        android.view.View tingRedDotArea2;
        android.view.View tingRedDotArea3;
        android.view.View tingRedDotArea4;
        android.view.View tingRedDotArea5;
        java.lang.String str = this.f345470d;
        if (!(str == null || r26.n0.N(str))) {
            oh4.j jVar = this.f345471e;
            tingRedDotArea = jVar.getTingRedDotArea();
            if (tingRedDotArea != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(tingRedDotArea, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/music/TaskBarSectionAudioPanelView$updateRedDotArea$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                tingRedDotArea.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(tingRedDotArea, "com/tencent/mm/plugin/taskbar/ui/section/music/TaskBarSectionAudioPanelView$updateRedDotArea$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            noticeTitleTextView = jVar.getNoticeTitleTextView();
            if (noticeTitleTextView != null) {
                noticeTitleTextView.setText(str);
            }
            tingRedDotArea2 = jVar.getTingRedDotArea();
            tingRedDotArea2.setOnClickListener(new oh4.h(jVar));
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            tingRedDotArea3 = jVar.getTingRedDotArea();
            cy1.a aVar = (cy1.a) rVar;
            aVar.pk(tingRedDotArea3, "tyt_mid_cont_pul_rd");
            tingRedDotArea4 = jVar.getTingRedDotArea();
            aVar.fk(tingRedDotArea4, "sessionuffer", this.f345472f);
            tingRedDotArea5 = jVar.getTingRedDotArea();
            aVar.Tj(tingRedDotArea5, 40, 5, true);
        }
        return jz5.f0.f302826a;
    }
}
