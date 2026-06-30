package in2;

/* loaded from: classes10.dex */
public final class a0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f292790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f292791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in2.t f292792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f292793g;

    public a0(int i17, in2.f0 f0Var, in2.t tVar, android.widget.EditText editText) {
        this.f292790d = i17;
        this.f292791e = f0Var;
        this.f292792f = tVar;
        this.f292793g = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        boolean hasFocus = view.hasFocus();
        android.widget.EditText editText = this.f292793g;
        int i17 = this.f292790d;
        in2.t tVar = this.f292792f;
        in2.f0 f0Var = this.f292791e;
        if (!hasFocus) {
            dk2.yg ygVar = (dk2.yg) f0Var.f292826h.get(i17);
            java.lang.String obj = r26.n0.u0(editText.getText().toString()).toString();
            ygVar.getClass();
            kotlin.jvm.internal.o.g(obj, "<set-?>");
            ygVar.f234393a = obj;
            tVar.f292900f.setVisibility(8);
            return;
        }
        if (i17 != f0Var.f292832q) {
            android.content.Context context = tVar.f292902h.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (!f0Var.x(context) && f0Var.f292832q >= 0 && f0Var.f292835t) {
                f0Var.f292835t = false;
                view.post(new in2.x(editText, f0Var));
                return;
            }
        }
        tVar.f292900f.setVisibility(0);
        tVar.itemView.post(new in2.z(i17, f0Var, tVar));
    }
}
