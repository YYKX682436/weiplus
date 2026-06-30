package i2;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i2.c f287846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i2.c cVar) {
        super(0);
        this.f287846d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i2.c cVar = this.f287846d;
        java.util.Locale textLocale = cVar.f287847a.f287856c.getTextLocale();
        kotlin.jvm.internal.o.f(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return new c2.a(textLocale, cVar.f287850d.e());
    }
}
