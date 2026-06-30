package hj5;

/* loaded from: classes.dex */
public final class e extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f281668d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f281669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f281668d = jz5.h.b(new hj5.d(this));
        this.f281669e = jz5.h.b(new hj5.c(this));
    }

    public final void T6(wi5.n0 state) {
        java.lang.StringBuilder sb6;
        int size;
        kotlin.jvm.internal.o.g(state, "state");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateMenu: ");
        java.util.LinkedList linkedList = state.f446319o;
        sb7.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectLabelTopMenuUIC", sb7.toString());
        int size2 = linkedList.size();
        com.tencent.mm.ui.fb fbVar = com.tencent.mm.ui.fb.GREEN;
        if (size2 > 0) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(getString(com.tencent.mm.R.string.f490459vn));
            if (state.f446316i > 0) {
                sb6 = new java.lang.StringBuilder("(");
                sb6.append(linkedList.size());
                sb6.append('/');
                size = state.f446316i;
            } else {
                sb6 = new java.lang.StringBuilder("(");
                size = linkedList.size();
            }
            sb6.append(size);
            sb6.append(')');
            sb8.append(sb6.toString());
            mMActivity.updateOptionMenuText(1, sb8.toString());
            mMActivity.updateOptionMenuStyle(1, fbVar);
        } else {
            mMActivity.updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490459vn));
            mMActivity.updateOptionMenuStyle(1, fbVar);
        }
        if (linkedList.size() > state.f446317m) {
            mMActivity.enableOptionMenu(1, true);
        } else {
            mMActivity.enableOptionMenu(1, false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new hj5.b(this));
    }
}
