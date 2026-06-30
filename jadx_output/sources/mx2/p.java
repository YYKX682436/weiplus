package mx2;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final mx2.p f332511a = new mx2.p();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f332512b = kz5.c0.i(java.lang.Integer.valueOf(com.tencent.mm.R.id.eds), java.lang.Integer.valueOf(com.tencent.mm.R.id.tde));

    /* renamed from: c, reason: collision with root package name */
    public static final int f332513c = com.tencent.mm.R.dimen.f479688cn;

    /* renamed from: d, reason: collision with root package name */
    public static final int f332514d = com.tencent.mm.R.dimen.f479688cn;

    public final void a(mx2.o oVar, mx2.n nVar) {
        int i17;
        android.view.View hostView = oVar.getHostView();
        if (hostView.getHeight() <= 0) {
            return;
        }
        int[] iArr = new int[2];
        hostView.getLocationInWindow(iArr);
        int height = (iArr[1] - nVar.f332507a) + hostView.getHeight();
        int i18 = nVar.f332508b;
        if (height <= i18) {
            i17 = nVar.f332509c;
        } else {
            i17 = nVar.f332510d + (height - i18);
        }
        oVar.setFlagBottomMargin(i17);
    }

    public final mx2.n b(in5.s0 s0Var) {
        android.view.View p17;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f484486ee3);
        if (viewGroup == null || (p17 = s0Var.p(com.tencent.mm.R.id.gbz)) == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 >= childCount) {
                break;
            }
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt.getVisibility() == 0) {
                if (childAt.getAlpha() == 0.0f) {
                    continue;
                } else if (!f332512b.contains(java.lang.Integer.valueOf(childAt.getId()))) {
                    p17 = childAt;
                    break;
                }
            }
            i17++;
        }
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        int[] iArr = new int[2];
        itemView.getLocationInWindow(iArr);
        int i18 = iArr[1];
        android.content.res.Resources resources = s0Var.itemView.getResources();
        int[] iArr2 = new int[2];
        p17.getLocationInWindow(iArr2);
        return new mx2.n(i18, iArr2[1] - i18, resources.getDimensionPixelSize(f332514d), resources.getDimensionPixelSize(f332513c));
    }
}
