package gl5;

/* loaded from: classes15.dex */
public class z implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: g, reason: collision with root package name */
    public int f273123g;

    /* renamed from: h, reason: collision with root package name */
    public int f273124h;

    /* renamed from: i, reason: collision with root package name */
    public int f273125i;

    /* renamed from: m, reason: collision with root package name */
    public int f273126m;

    /* renamed from: n, reason: collision with root package name */
    public int f273127n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f273128o;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f273130q;

    /* renamed from: d, reason: collision with root package name */
    public final gl5.d0[] f273120d = new gl5.d0[7];

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f273121e = new boolean[7];

    /* renamed from: f, reason: collision with root package name */
    public boolean f273122f = true;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f273129p = new int[2];

    public z(gl5.e0 e0Var, gl5.k kVar) {
        this.f273130q = e0Var;
    }

    public void a(gl5.d0 d0Var, boolean z17) {
        if (this.f273127n == 0) {
            c();
            this.f273130q.U.getViewTreeObserver().addOnPreDrawListener(this);
        }
        int i17 = -1;
        int i18 = 0;
        while (true) {
            gl5.d0[] d0VarArr = this.f273120d;
            if (i18 >= 7) {
                d0VarArr[i17] = d0Var;
                this.f273121e[i17] = z17;
                this.f273127n++;
                return;
            } else {
                gl5.d0 d0Var2 = d0VarArr[i18];
                if (d0Var2 == d0Var) {
                    return;
                }
                if (i17 < 0 && d0Var2 == null) {
                    i17 = i18;
                }
                i18++;
            }
        }
    }

    public void b(gl5.d0 d0Var) {
        int i17 = 0;
        while (true) {
            if (i17 >= 7) {
                break;
            }
            gl5.d0[] d0VarArr = this.f273120d;
            if (d0VarArr[i17] == d0Var) {
                d0VarArr[i17] = null;
                this.f273127n--;
                break;
            }
            i17++;
        }
        if (this.f273127n == 0) {
            this.f273130q.U.getViewTreeObserver().removeOnPreDrawListener(this);
        }
    }

    public final void c() {
        gl5.e0 e0Var = this.f273130q;
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
        int[] iArr = this.f273129p;
        customTextView.getLocationInWindow(iArr);
        int i17 = iArr[0];
        this.f273122f = (i17 == this.f273123g && iArr[1] == this.f273124h) ? false : true;
        this.f273123g = i17;
        this.f273124h = iArr[1];
        e0Var.U.getLocationOnScreen(iArr);
        this.f273125i = iArr[0];
        this.f273126m = iArr[1];
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        gl5.d0 d0Var;
        c();
        for (int i17 = 0; i17 < 7; i17++) {
            boolean z17 = this.f273122f;
            if ((z17 || this.f273128o || this.f273121e[i17]) && (d0Var = this.f273120d[i17]) != null) {
                d0Var.a(this.f273123g, this.f273124h, z17, this.f273128o);
            }
        }
        this.f273128o = false;
        return true;
    }
}
