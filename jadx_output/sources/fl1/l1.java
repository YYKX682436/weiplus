package fl1;

/* loaded from: classes7.dex */
public final class l1 implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.m1 f263802d;

    public l1(fl1.m1 m1Var) {
        this.f263802d = m1Var;
    }

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        android.graphics.Bitmap t07 = com.tencent.mm.sdk.platformtools.x.t0(bitmap, false, i65.a.b(this.f263802d.f263842d.getContext(), 4) * 1.0f, false, null);
        kotlin.jvm.internal.o.f(t07, "getRoundedCornerBitmap(...)");
        return t07;
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "appbrand_user_avatar";
    }
}
