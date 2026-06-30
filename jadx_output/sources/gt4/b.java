package gt4;

/* loaded from: classes8.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.a1 f275397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f275398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f275399f;

    public b(db5.a1 a1Var, android.widget.EditText editText, android.content.Context context) {
        this.f275397d = a1Var;
        this.f275398e = editText;
        this.f275399f = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        db5.a1 a1Var = this.f275397d;
        if (a1Var != null ? a1Var.onFinish(this.f275398e.getText().toString().trim()) : true) {
            dialogInterface.dismiss();
            if (this.f275399f instanceof com.tencent.mm.ui.MMActivity) {
                com.tencent.mm.sdk.platformtools.u3.h(new gt4.a(this));
            }
        }
    }
}
