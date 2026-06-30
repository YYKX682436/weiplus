package cw2;

/* loaded from: classes8.dex */
public final class cb extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f223623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.db f223624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(yz5.p pVar, cw2.db dbVar) {
        super(2);
        this.f223623d = pVar;
        this.f223624e = dbVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Long valueOf = java.lang.Long.valueOf(((java.lang.Number) obj).longValue() - this.f223624e.f223655a);
        this.f223623d.invoke(valueOf, (android.graphics.Bitmap) obj2);
        return jz5.f0.f302826a;
    }
}
