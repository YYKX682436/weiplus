package mw2;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f331715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f331716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f331717f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.q qVar, int i17, int i18) {
        super(1);
        this.f331715d = qVar;
        this.f331716e = i17;
        this.f331717f = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f331716e);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f331717f);
        this.f331715d.invoke((android.graphics.Bitmap) obj, valueOf, valueOf2);
        return jz5.f0.f302826a;
    }
}
