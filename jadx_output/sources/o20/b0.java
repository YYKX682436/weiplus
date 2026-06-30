package o20;

/* loaded from: classes9.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f342369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.AttributeSet f342370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f342371f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(0);
        this.f342369d = context;
        this.f342370e = attributeSet;
        this.f342371f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new android.widget.ImageView(this.f342369d, this.f342370e, this.f342371f);
    }
}
