package or2;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f347668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ or2.s f347669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i17, or2.s sVar) {
        super(2);
        this.f347668d = i17;
        this.f347669e = sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        androidx.recyclerview.widget.h3 h3Var = (androidx.recyclerview.widget.h3) obj2;
        if (longValue >= this.f347668d) {
            if (((h3Var == null || h3Var.f12065g) ? false : true) && android.os.Looper.getMainLooper().isCurrentThread()) {
                or2.s sVar = this.f347669e;
                sVar.f347677m += longValue;
                sVar.f347678n++;
            }
        }
        return jz5.f0.f302826a;
    }
}
