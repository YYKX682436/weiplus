package px2;

/* loaded from: classes2.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout f358919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout) {
        super(0);
        this.f358919d = finderVideoLandscapePreviewLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string;
        com.tencent.mars.xlog.Log.i("HorizontalVideoPreviewLayout", "onMoveInLockArea");
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout = this.f358919d;
        finderVideoLandscapePreviewLayout.f132586y0 = true;
        finderVideoLandscapePreviewLayout.x();
        ow2.h hVar = finderVideoLandscapePreviewLayout.W;
        if (hVar != null) {
            hVar.b(finderVideoLandscapePreviewLayout.f132584x0);
        }
        float f17 = finderVideoLandscapePreviewLayout.f132584x0;
        com.tencent.mars.xlog.Log.i("HorizontalVideoPreviewLayout", "changeLockAreaState lock=true speed=" + f17);
        android.view.View view = finderVideoLandscapePreviewLayout.U;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "changeLockAreaState", "(FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "changeLockAreaState", "(FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = finderVideoLandscapePreviewLayout.V;
        if (textView != null) {
            if (f17 == 1.0f) {
                string = finderVideoLandscapePreviewLayout.getContext().getString(com.tencent.mm.R.string.p5k);
            } else {
                android.content.Context context = finderVideoLandscapePreviewLayout.getContext();
                java.lang.Object[] objArr = new java.lang.Object[1];
                int i17 = (int) f17;
                objArr[0] = f17 == ((float) i17) ? java.lang.String.valueOf(i17) : java.lang.String.valueOf(f17);
                string = context.getString(com.tencent.mm.R.string.p5l, objArr);
            }
            textView.setText(string);
        }
        hc2.f1.x(finderVideoLandscapePreviewLayout);
        return jz5.f0.f302826a;
    }
}
