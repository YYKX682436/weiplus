package ht2;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f284923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f284924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.graphics.drawable.BitmapDrawable bitmapDrawable, yz5.a aVar) {
        super(0);
        this.f284923d = bitmapDrawable;
        this.f284924e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f284923d.invalidateSelf();
        yz5.a aVar = this.f284924e;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
