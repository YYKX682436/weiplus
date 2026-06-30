package up2;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory f429797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory newEntranceItemConvertFactory) {
        super(3);
        this.f429797d = newEntranceItemConvertFactory;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        sp2.k kVar;
        dk2.ic option = (dk2.ic) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        vp2.h0 item = (vp2.h0) obj3;
        kotlin.jvm.internal.o.g(option, "option");
        kotlin.jvm.internal.o.g(item, "item");
        kVar = this.f429797d.outsideOperator;
        kVar.n(option, intValue, item);
        return jz5.f0.f302826a;
    }
}
