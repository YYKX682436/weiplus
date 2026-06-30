package ik1;

/* loaded from: classes7.dex */
public abstract class a0 {
    public static java.lang.Object a(com.tencent.mm.ui.widget.MMWebView mMWebView, int i17, int i18, kotlin.coroutines.Continuation continuation, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 0;
        }
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        ik1.z zVar = new ik1.z(rVar, mMWebView);
        mMWebView.D0(new ik1.y(rVar, mMWebView, zVar));
        mMWebView.getView().scrollBy(i17, i18);
        com.tencent.mm.sdk.platformtools.u3.i(zVar, 200L);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public static void b(com.tencent.mm.ui.widget.MMWebView mMWebView, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = mMWebView.getScrollX();
        }
        if ((i19 & 2) != 0) {
            i18 = mMWebView.getScrollY();
        }
        kotlin.jvm.internal.o.g(mMWebView, "<this>");
        mMWebView.getView().scrollTo(i17, i18);
    }
}
