package vw3;

/* loaded from: classes.dex */
public final class q5 extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f441084f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f441085g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f441086h;

    /* renamed from: i, reason: collision with root package name */
    public final vw3.n f441087i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.EditText f441088m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f441089n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(android.content.Context dialogContext, java.lang.String str, java.lang.String str2, vw3.n nVar) {
        super(dialogContext, com.tencent.mm.R.style.f494502os);
        kotlin.jvm.internal.o.g(dialogContext, "dialogContext");
        this.f441084f = dialogContext;
        this.f441085g = str;
        this.f441086h = str2;
        this.f441087i = nVar;
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.View inflate = android.view.LayoutInflater.from(this.f441084f).inflate(com.tencent.mm.R.layout.f489415cg5, (android.view.ViewGroup) null, false);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf)).setText(this.f441085g);
        this.f441088m = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.owl);
        this.f441089n = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.khs);
        android.widget.EditText editText = this.f441088m;
        if (editText != null) {
            editText.requestFocus();
        }
        java.lang.String str = this.f441086h;
        if (str != null) {
            android.widget.EditText editText2 = this.f441088m;
            if (editText2 != null) {
                editText2.setText(str);
            }
            android.widget.EditText editText3 = this.f441088m;
            if (editText3 != null) {
                editText3.setSelection(str.length());
            }
        }
        inflate.findViewById(com.tencent.mm.R.id.cz9).setOnTouchListener(new vw3.m5(this));
        setCancelable(true);
        ku5.u0 u0Var = ku5.t0.f312615d;
        vw3.n5 n5Var = new vw3.n5(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(n5Var, 128L, false);
        android.widget.Button button = this.f441089n;
        if (button != null) {
            button.setOnClickListener(new vw3.o5(this));
        }
        setOnDismissListener(new vw3.p5(this));
    }
}
