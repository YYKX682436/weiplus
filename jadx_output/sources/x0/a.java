package x0;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f450860d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.List list) {
        super(1);
        this.f450860d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object state) {
        kotlin.jvm.internal.o.g(state, "state");
        java.util.List list = this.f450860d;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((yz5.l) list.get(i17)).invoke(state);
        }
        return jz5.f0.f302826a;
    }
}
