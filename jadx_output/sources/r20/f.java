package r20;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f368775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context) {
        super(0);
        this.f368775d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(i65.a.d(this.f368775d, com.tencent.mm.R.color.abv));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        return paint;
    }
}
