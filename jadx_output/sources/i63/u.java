package i63;

/* loaded from: classes7.dex */
public class u extends dl3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i63.b0 f289036a;

    public u(i63.b0 b0Var) {
        this.f289036a = b0Var;
    }

    @Override // dl3.b
    public void a(dl3.a aVar, int i17, int i18, int i19, byte[] bArr) {
        if (this.f289036a.f288973f == null) {
            return;
        }
        synchronized (this) {
            i63.b0 b0Var = this.f289036a;
            if (!b0Var.f288983s && !b0Var.f288984t) {
                this.f289036a.f288973f.post(new i63.r(this, aVar, i17, i18, i19, (byte[]) bArr.clone(), java.lang.System.currentTimeMillis()));
            }
        }
    }

    @Override // dl3.b
    public void b(dl3.a aVar, int i17, int i18, int i19, float[] fArr) {
        if (this.f289036a.f288973f == null) {
            return;
        }
        synchronized (this) {
            i63.b0 b0Var = this.f289036a;
            if (!b0Var.f288983s && !b0Var.f288984t) {
                this.f289036a.f288973f.post(new i63.s(this, aVar, i17, i18, i19, (float[]) fArr.clone()));
            }
        }
    }

    @Override // dl3.b
    public void c(dl3.a aVar) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f289036a.f288973f;
        if (n3Var == null) {
            return;
        }
        n3Var.post(new i63.q(this, aVar));
    }

    @Override // dl3.b
    public void d(dl3.a aVar) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f289036a.f288973f;
        if (n3Var == null) {
            return;
        }
        n3Var.post(new i63.t(this, aVar));
    }
}
