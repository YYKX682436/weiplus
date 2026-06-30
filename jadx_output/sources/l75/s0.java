package l75;

/* loaded from: classes11.dex */
public abstract class s0 implements l75.l0 {
    private final l75.v0 defaults = new l75.o0(this);
    private final l75.v0 loadedListener = new l75.p0(this);

    public static void access$000(l75.s0 s0Var, l75.q0 q0Var, l75.w0 w0Var) {
        s0Var.getClass();
        q0Var.onNotifyChange(w0Var.f316973a, w0Var);
    }

    public static void access$100(l75.s0 s0Var, l75.r0 r0Var, java.lang.String str) {
        s0Var.getClass();
        r0Var.a();
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        this.defaults.a(q0Var, android.os.Looper.getMainLooper());
    }

    public void addLoadedListener(l75.r0 r0Var) {
        this.loadedListener.a(r0Var, android.os.Looper.getMainLooper());
    }

    public void doNotify() {
        l75.w0 w0Var = new l75.w0("*");
        this.defaults.d(w0Var);
        this.defaults.c();
        extraStepsAfterNotifying(w0Var);
    }

    public void extraStepsAfterNotifying(l75.w0 w0Var) {
    }

    public void lock() {
        this.defaults.f316970a++;
    }

    public int lockCount() {
        return this.defaults.f316970a;
    }

    @Override // l75.l0
    public void remove(l75.q0 q0Var) {
        this.defaults.j(q0Var);
    }

    public void removeLoadedListener(l75.r0 r0Var) {
        this.loadedListener.j(r0Var);
    }

    public void unlock() {
        l75.v0 v0Var = this.defaults;
        int i17 = v0Var.f316970a - 1;
        v0Var.f316970a = i17;
        if (i17 <= 0) {
            v0Var.f316970a = 0;
            v0Var.e();
        }
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var, android.os.Looper looper) {
        this.defaults.a(q0Var, looper);
    }

    public void add(xu5.b bVar, l75.q0 q0Var) {
        this.defaults.b(q0Var, bVar);
    }

    @Override // l75.l0
    public void add(java.lang.String str, l75.q0 q0Var) {
        this.defaults.b(q0Var, xu5.b.a(str));
    }

    @Override // l75.l0
    public void doNotify(java.lang.String str) {
        l75.w0 w0Var = new l75.w0(str);
        this.defaults.d(w0Var);
        this.defaults.c();
        extraStepsAfterNotifying(w0Var);
    }

    public void doNotify(java.lang.String str, int i17, java.lang.Object obj) {
        l75.w0 w0Var = new l75.w0();
        w0Var.f316973a = str;
        w0Var.f316974b = i17;
        w0Var.f316976d = obj;
        w0Var.f316975c = this;
        this.defaults.d(w0Var);
        this.defaults.c();
        extraStepsAfterNotifying(w0Var);
    }
}
