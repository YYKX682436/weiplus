package qm3;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm3.i f364773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm3.a f364774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp4.a f364775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qm3.i iVar, qm3.a aVar, kp4.a aVar2) {
        super(2);
        this.f364773d = iVar;
        this.f364774e = aVar;
        this.f364775f = aVar2;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qm3.i iVar = this.f364773d;
        kotlinx.coroutines.l.d(iVar.f364786c, null, null, new qm3.d(this.f364774e, ((java.lang.Number) obj).longValue(), this.f364775f, (android.graphics.Bitmap) obj2, iVar, null), 3, null);
        return jz5.f0.f302826a;
    }
}
