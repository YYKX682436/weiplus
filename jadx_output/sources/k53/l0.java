package k53;

/* loaded from: classes8.dex */
public class l0 implements k53.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k53.u0 f304370b;

    public l0(k53.u0 u0Var, int i17) {
        this.f304370b = u0Var;
        this.f304369a = i17;
    }

    @Override // k53.s0
    public void a(k53.t0 t0Var) {
        k53.u0 u0Var = this.f304370b;
        u0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_title", t0Var.f304388a);
        intent.putExtra("Ksnsupload_imgurl", t0Var.f304390c);
        intent.putExtra("Ksnsupload_link", t0Var.f304391d);
        java.lang.String str = t0Var.f304389b;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.content.Context context = u0Var.f304395a;
        if (K0) {
            str = context.getString(com.tencent.mm.R.string.fpd);
        }
        intent.putExtra("KContentObjDesc", str);
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("Ksnsupload_type", 1);
        intent.putExtra("need_result", true);
        intent.putExtra("src_username", context.getString(com.tencent.mm.R.string.fpd));
        intent.putExtra("src_displayname", context.getString(com.tencent.mm.R.string.fpd));
        j45.l.n(context, "sns", ".ui.SnsUploadUI", intent, this.f304369a);
    }
}
