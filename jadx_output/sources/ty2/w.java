package ty2;

/* loaded from: classes9.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty2.y f423119d;

    public w(ty2.y yVar) {
        this.f423119d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ty2.y yVar = this.f423119d;
        ty2.v vVar = yVar.f423125i;
        int measuredWidth = yVar.getMeasuredWidth();
        bw5.q5 q5Var = vVar.f423118b;
        vVar.getClass();
        yVar.setViewStatus(new ty2.v(measuredWidth, q5Var));
    }
}
