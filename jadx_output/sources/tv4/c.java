package tv4;

/* loaded from: classes.dex */
public abstract class c {
    public static final void a(android.view.View view, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.leftMargin = com.tencent.mm.ui.zk.e(view.getContext(), i17);
        view.setLayoutParams(marginLayoutParams);
    }
}
