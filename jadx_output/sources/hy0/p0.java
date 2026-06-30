package hy0;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f285921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(android.content.Context context) {
        super(0);
        this.f285921d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.Drawable drawable = j65.q.a(this.f285921d).getDrawable(com.tencent.mm.R.drawable.cng, null);
        drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_IN));
        return drawable;
    }
}
