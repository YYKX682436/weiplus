package hr3;

/* loaded from: classes8.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f283538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI, com.tencent.mm.storage.z3 z3Var) {
        super(2);
        this.f283537d = contactMoreInfoUI;
        this.f283538e = z3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g((java.util.List) obj, "<anonymous parameter 0>");
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.V6(this.f283537d, this.f283538e, 42);
        return jz5.f0.f302826a;
    }
}
