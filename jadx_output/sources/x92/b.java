package x92;

/* loaded from: classes2.dex */
public final class b implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f452670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x92.e f452671e;

    public b(android.view.View view, x92.e eVar) {
        this.f452670d = view;
        this.f452671e = eVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.widget.FrameLayout frameLayout;
        this.f452670d.getViewTreeObserver().removeOnPreDrawListener(this);
        x92.e eVar = this.f452671e;
        float dimension = eVar.getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479623ay);
        int h17 = com.tencent.mm.ui.bl.h(eVar.getActivity());
        if (!eVar.f452688x && !eVar.f452689y) {
            int b17 = a06.d.b(dimension + h17);
            android.view.View view = eVar.f452676i;
            if (view != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = b17;
                view.setLayoutParams(layoutParams);
                view.setPadding(0, h17, 0, 0);
            }
            android.widget.FrameLayout frameLayout2 = eVar.f452674g;
            if (frameLayout2 != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                layoutParams2.height = b17;
                frameLayout2.setLayoutParams(layoutParams2);
                android.widget.FrameLayout frameLayout3 = eVar.f452720e;
                if (frameLayout3 != null) {
                    frameLayout3.setMinimumHeight(b17);
                }
            }
        }
        if (!eVar.f452689y || (frameLayout = eVar.f452674g) == null) {
            return true;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        layoutParams3.height = 0;
        frameLayout.setLayoutParams(layoutParams3);
        android.widget.FrameLayout frameLayout4 = eVar.f452720e;
        if (frameLayout4 == null) {
            return true;
        }
        frameLayout4.setMinimumHeight(0);
        return true;
    }
}
