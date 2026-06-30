package r35;

/* loaded from: classes11.dex */
public class v3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.w3 f369311d;

    public v3(r35.w3 w3Var) {
        this.f369311d = w3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        r35.e4 e4Var = this.f369311d.f369319d;
        if (e4Var.f369088h == null) {
            return false;
        }
        java.lang.String trim = e4Var.f369089i.getText().toString().trim();
        android.content.Context context = e4Var.f369087g;
        e4Var.f369084d = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), e4Var.f369087g.getString(com.tencent.mm.R.string.iin), true, true, new r35.z3(e4Var));
        e4Var.f369094q = trim;
        if (e4Var.f369090m.size() == 1 && com.tencent.mm.storage.z3.m4((java.lang.String) e4Var.f369090m.getFirst())) {
            e4Var.c();
            return false;
        }
        e4Var.b();
        return false;
    }
}
