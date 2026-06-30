package io;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.n f293415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(io.n nVar) {
        super(0);
        this.f293415d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        android.content.Context context = this.f293415d.f293417d;
        paint.setColor(context != null ? context.getColor(com.tencent.mm.R.color.f478538kj) : android.graphics.Color.parseColor("#1a000000"));
        return paint;
    }
}
