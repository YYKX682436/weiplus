package fq4;

/* loaded from: classes15.dex */
public class b0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fq4.c0 f265572a;

    public b0(fq4.c0 c0Var, fq4.d0 d0Var) {
        this.f265572a = c0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        fq4.d0 d0Var = this.f265572a.f265576e;
        if (d0Var.f265583d <= 0) {
            return;
        }
        d0Var.f265583d = 2;
    }
}
