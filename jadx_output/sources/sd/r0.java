package sd;

/* loaded from: classes8.dex */
public class r0 implements z26.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f406648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sd.u0 f406649b;

    public r0(sd.u0 u0Var, boolean[] zArr) {
        this.f406649b = u0Var;
        this.f406648a = zArr;
    }

    @Override // z26.e
    public void a(android.view.MotionEvent motionEvent) {
    }

    @Override // z26.e
    public int b(boolean z17) {
        return 1;
    }

    @Override // z26.e
    public void c(android.view.View view, int i17, int i18) {
    }

    @Override // z26.e
    public void d(int i17, float f17) {
        sd.u0 u0Var = this.f406649b;
        sd.u uVar = (sd.u) u0Var.f406612f;
        int indexOf = uVar.f406653a.f406663d.indexOf(u0Var);
        sd.w wVar = uVar.f406653a;
        sd.k kVar = indexOf >= wVar.f406663d.size() + (-1) ? null : (sd.k) wVar.f406663d.get(indexOf + 1);
        if (kVar == null) {
            return;
        }
        if (java.lang.Float.compare(1.0f, f17) <= 0) {
            boolean[] zArr = this.f406648a;
            if (!zArr[0]) {
                u0Var.getClass();
                android.view.View view = ((sd.u0) kVar).f406654h;
                view.clearAnimation();
                view.setTranslationX(0.0f);
                ((sd.u) u0Var.f406612f).f406653a.f(false);
                zArr[0] = true;
            }
        }
        com.tencent.mars.xlog.Log.i("", "scrollPercent %f", java.lang.Float.valueOf(f17));
    }

    @Override // z26.e
    public void e(int i17) {
        sd.u0 u0Var = this.f406649b;
        if (((sd.u) u0Var.f406612f).f406653a.f406663d.size() <= 1) {
            u0Var.f406656m.setEnableGesture(false);
        }
    }

    @Override // z26.e
    public void f() {
    }

    @Override // z26.e
    public boolean g() {
        return false;
    }
}
