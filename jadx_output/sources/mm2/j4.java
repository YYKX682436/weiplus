package mm2;

/* loaded from: classes3.dex */
public final class j4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.q f329180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(km2.q qVar) {
        super(1);
        this.f329180d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        km2.q qVar = (km2.q) obj;
        km2.q qVar2 = this.f329180d;
        return java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.D0(qVar2 != null ? qVar2.f309172c : null, qVar.f309172c));
    }
}
