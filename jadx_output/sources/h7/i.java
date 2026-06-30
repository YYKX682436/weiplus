package h7;

/* loaded from: classes13.dex */
public class i implements t6.p {

    /* renamed from: b, reason: collision with root package name */
    public final t6.p f279343b;

    public i(t6.p pVar) {
        q7.n.b(pVar);
        this.f279343b = pVar;
    }

    @Override // t6.p
    public w6.z0 a(android.content.Context context, w6.z0 z0Var, int i17, int i18) {
        h7.f fVar = (h7.f) z0Var.get();
        w6.z0 eVar = new d7.e(fVar.f279333d.f279332a.f279360l, com.bumptech.glide.c.b(context).f43922d);
        t6.p pVar = this.f279343b;
        w6.z0 a17 = pVar.a(context, eVar, i17, i18);
        if (!eVar.equals(a17)) {
            eVar.recycle();
        }
        fVar.f279333d.f279332a.c(pVar, (android.graphics.Bitmap) a17.get());
        return z0Var;
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        this.f279343b.b(messageDigest);
    }

    @Override // t6.h
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof h7.i) {
            return this.f279343b.equals(((h7.i) obj).f279343b);
        }
        return false;
    }

    @Override // t6.h
    public int hashCode() {
        return this.f279343b.hashCode();
    }
}
