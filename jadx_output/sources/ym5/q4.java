package ym5;

/* loaded from: classes10.dex */
public final class q4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f463481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, ym5.s3 s3Var) {
        super(0);
        this.f463480d = refreshLoadMoreLayout;
        this.f463481e = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        int[] iArr = new int[2];
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463480d;
        android.view.View view = refreshLoadMoreLayout.f213435x;
        if (view != null) {
            view.getLocationInWindow(iArr);
            int i18 = iArr[1];
            android.graphics.Rect rect = new android.graphics.Rect();
            i17 = refreshLoadMoreLayout.getGlobalVisibleRect(rect) ? (rect.bottom + refreshLoadMoreLayout.getParentTranslation()) - i18 : (int) (refreshLoadMoreLayout.getTranslationY() - (-refreshLoadMoreLayout.A));
        } else {
            i17 = 0;
        }
        float translationY = refreshLoadMoreLayout.getTranslationY() + i17;
        this.f463481e.f463524i = i17 > 0;
        if (refreshLoadMoreLayout.getDEBUG()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RLMoreLayout", "onPreFinishLoadMoreSmooth " + refreshLoadMoreLayout.getTranslationY() + " rectHeight:" + i17 + " targetY:" + translationY);
        }
        int i19 = refreshLoadMoreLayout.A;
        if (translationY >= (-i19)) {
            translationY = -i19;
        }
        refreshLoadMoreLayout.setTranslationY(translationY);
        refreshLoadMoreLayout.getRecyclerView().scrollBy(0, i17);
        android.view.View view2 = refreshLoadMoreLayout.f213435x;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onPreFinishLoadMoreSmooth$1$innerFunc$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/view/RefreshLoadMoreLayout$onPreFinishLoadMoreSmooth$1$innerFunc$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
