package zd1;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f471526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.util.ArrayList arrayList) {
        super(1);
        this.f471526d = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (!(str == null || str.length() == 0)) {
            this.f471526d.add(str);
        }
        return jz5.f0.f302826a;
    }
}
