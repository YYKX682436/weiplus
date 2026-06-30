package rn2;

/* loaded from: classes3.dex */
public final class a1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f397641a;

    public a1(rn2.c1 c1Var) {
        this.f397641a = c1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        boolean b17 = ((com.tencent.mm.modelbase.f) obj).b();
        rn2.c1 c1Var = this.f397641a;
        if (b17) {
            rn2.g gVar = c1Var.f397667g;
            if (gVar != null) {
                ((rn2.t2) gVar).destroy();
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = c1Var.f397664d;
            appCompatActivity.setResult(-1, appCompatActivity.getIntent());
            appCompatActivity.finish();
        } else {
            db5.t7.g(c1Var.f397664d, "保存抽奖失败");
        }
        return jz5.f0.f302826a;
    }
}
