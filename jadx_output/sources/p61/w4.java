package p61;

/* loaded from: classes14.dex */
public class w4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f352405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p61.f5 f352406e;

    public w4(p61.f5 f5Var, android.widget.EditText editText) {
        this.f352406e = f5Var;
        this.f352405d = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        p61.f5 f5Var = this.f352406e;
        f5Var.getClass();
        java.lang.String trim = this.f352405d.getText().toString().trim();
        gm0.j1.d().a(384, f5Var);
        f5Var.f352255h = trim;
        android.content.Context context = f5Var.f352251d;
        f5Var.f352253f = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.iin), true, true, new p61.y4(f5Var));
        gm0.j1.d().g(new com.tencent.mm.modelsimple.l1(5, f5Var.f352255h, "", "", "", false, 1));
    }
}
