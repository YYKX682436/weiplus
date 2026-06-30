package r20;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f368779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super(0);
        this.f368779d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(i65.a.d(this.f368779d, com.tencent.mm.R.color.abv));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        return paint;
    }
}
