package n91;

/* loaded from: classes4.dex */
public final class a0 implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f335852d;

    public a0(android.content.Context context) {
        this.f335852d = context;
    }

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        android.graphics.Bitmap t07 = com.tencent.mm.sdk.platformtools.x.t0(bitmap, false, i65.a.b(this.f335852d, 3) * 1.0f, false, null);
        kotlin.jvm.internal.o.f(t07, "getRoundedCornerBitmap(...)");
        return t07;
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "appbrand_custom_game_loading_age";
    }
}
