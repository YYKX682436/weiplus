package oj2;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj2.o f345778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(oj2.o oVar) {
        super(0);
        this.f345778d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView micTagTextView;
        oj2.o oVar = this.f345778d;
        com.tencent.mars.xlog.Log.i(oVar.getTAG(), "showContent bindMicUser:" + oVar.getBindLinkMicUser() + " isAnchor:" + zl2.r4.f473950a.w1() + " bindMicUserIsSelf:" + oVar.G());
        km2.q bindLinkMicUser = oVar.getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            oVar.u(oVar.getFinderLiveVideoLinkBottomBarName());
            android.view.View finderLiveFinderLogo = oVar.getFinderLiveFinderLogo();
            km2.q qVar = oVar.f318875f;
            if (qVar != null && finderLiveFinderLogo != null) {
                ya2.g gVar = ya2.h.f460484a;
                java.lang.String str = qVar.f309172c;
                if (!(str != null ? r26.i0.n(str, "@finder", false) : false) || qVar.f309177h) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(finderLiveFinderLogo, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicBaseWidget", "showFinderLogoIfNeeded", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderLiveFinderLogo.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(finderLiveFinderLogo, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicBaseWidget", "showFinderLogoIfNeeded", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(finderLiveFinderLogo, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicBaseWidget", "showFinderLogoIfNeeded", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderLiveFinderLogo.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(finderLiveFinderLogo, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicBaseWidget", "showFinderLogoIfNeeded", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            oVar.f(bindLinkMicUser.f309183n, bindLinkMicUser.f309191v, false);
            micTagTextView = oVar.getMicTagTextView();
            oVar.s(micTagTextView);
            android.widget.TextView finderLiveMicHeartText = oVar.getFinderLiveMicHeartText();
            if (finderLiveMicHeartText != null) {
                oVar.S(finderLiveMicHeartText);
                if (oVar.A()) {
                    oVar.setTouchDelegate(finderLiveMicHeartText);
                    finderLiveMicHeartText.setOnClickListener(oVar);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
