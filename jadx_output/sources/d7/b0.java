package d7;

/* loaded from: classes13.dex */
public class b0 implements t6.p {

    /* renamed from: b, reason: collision with root package name */
    public final t6.p f226787b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f226788c;

    public b0(t6.p pVar, boolean z17) {
        this.f226787b = pVar;
        this.f226788c = z17;
    }

    @Override // t6.p
    public w6.z0 a(android.content.Context context, w6.z0 z0Var, int i17, int i18) {
        x6.d dVar = com.bumptech.glide.c.b(context).f43922d;
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) z0Var.get();
        w6.z0 a17 = d7.a0.a(dVar, drawable, i17, i18);
        if (a17 != null) {
            w6.z0 a18 = this.f226787b.a(context, a17, i17, i18);
            if (!a18.equals(a17)) {
                return new d7.g0(context.getResources(), a18);
            }
            a18.recycle();
            return z0Var;
        }
        if (!this.f226788c) {
            return z0Var;
        }
        throw new java.lang.IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        this.f226787b.b(messageDigest);
    }

    @Override // t6.h
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof d7.b0) {
            return this.f226787b.equals(((d7.b0) obj).f226787b);
        }
        return false;
    }

    @Override // t6.h
    public int hashCode() {
        return this.f226787b.hashCode();
    }
}
