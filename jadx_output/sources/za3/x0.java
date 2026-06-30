package za3;

/* loaded from: classes15.dex */
public class x0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.b1 f471050d;

    public x0(za3.b1 b1Var) {
        this.f471050d = b1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        za3.a1 a1Var = this.f471050d.f470893b;
        if (a1Var != null) {
            com.tencent.mm.plugin.location.ui.impl.p0 p0Var = (com.tencent.mm.plugin.location.ui.impl.p0) a1Var;
            p0Var.X.e(false);
            va3.v0 v0Var = p0Var.Y;
            v0Var.h();
            v0Var.b(0);
            p0Var.f144864p0.c();
            p0Var.f144728d.finish();
        }
    }
}
