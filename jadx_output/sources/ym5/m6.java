package ym5;

/* loaded from: classes10.dex */
public final class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.n6 f463438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f463439e;

    public m6(ym5.n6 n6Var, int i17) {
        this.f463438d = n6Var;
        this.f463439e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        ym5.n6 n6Var = this.f463438d;
        n6Var.getWindowVisibleDisplayFrame(rect);
        n6Var.findViewById(com.tencent.mm.R.id.auj).setPadding(0, 0, 0, this.f463439e);
    }
}
