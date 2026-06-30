package p61;

/* loaded from: classes14.dex */
public class b5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.f5 f352223d;

    public b5(p61.f5 f5Var) {
        this.f352223d = f5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        p61.f5 f5Var = this.f352223d;
        com.tencent.mm.modelsimple.l1 l1Var = new com.tencent.mm.modelsimple.l1(5, f5Var.f352255h, f5Var.f352254g.getSecImgSid(), f5Var.f352254g.getSecImgCode(), f5Var.f352254g.getSecImgEncryptKey(), true, 1);
        gm0.j1.d().a(384, f5Var);
        gm0.j1.d().g(l1Var);
        android.content.Context context = f5Var.f352251d;
        f5Var.f352253f = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.gic), true, true, new p61.a5(this, l1Var));
    }
}
