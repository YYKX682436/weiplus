package gp2;

/* loaded from: classes10.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.q0 f274273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(gp2.q0 q0Var) {
        super(0);
        this.f274273d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        int i18;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        gp2.q0 q0Var = this.f274273d;
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) ((jz5.n) q0Var.f274306q).getValue();
        staggeredGridLayoutManager.u(iArr);
        staggeredGridLayoutManager.v(iArr2);
        if (q0Var.f274297e && q0Var.f274305p != null && (i17 = iArr[0]) <= (i18 = iArr2[1])) {
            while (true) {
                android.view.View findViewByPosition = ((androidx.recyclerview.widget.StaggeredGridLayoutManager) ((jz5.n) q0Var.f274306q).getValue()).findViewByPosition(i17);
                if (findViewByPosition != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    findViewByPosition.getGlobalVisibleRect(rect);
                    android.view.MotionEvent motionEvent = q0Var.f274305p;
                    kotlin.jvm.internal.o.d(motionEvent);
                    int rawX = (int) motionEvent.getRawX();
                    android.view.MotionEvent motionEvent2 = q0Var.f274305p;
                    kotlin.jvm.internal.o.d(motionEvent2);
                    if (rect.contains(rawX, (int) motionEvent2.getRawY())) {
                        break;
                    }
                }
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        i17 = -1;
        return java.lang.Integer.valueOf(i17);
    }
}
