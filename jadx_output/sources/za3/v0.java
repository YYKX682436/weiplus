package za3;

/* loaded from: classes15.dex */
public class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.b1 f471042d;

    public v0(za3.b1 b1Var) {
        this.f471042d = b1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        za3.a1 a1Var = this.f471042d.f470893b;
        if (a1Var != null) {
            com.tencent.mm.plugin.location.ui.impl.p0 p0Var = (com.tencent.mm.plugin.location.ui.impl.p0) a1Var;
            p0Var.Y.f434368z = p0Var.f144733i.f144804f.getZoom();
            p0Var.f144728d.finish();
        }
    }
}
