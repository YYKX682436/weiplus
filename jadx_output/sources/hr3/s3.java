package hr3;

/* loaded from: classes8.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f283965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pr3.c f283966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI, yz5.p pVar, pr3.c cVar) {
        super(0);
        this.f283964d = contactMoreInfoUI;
        this.f283965e = pVar;
        this.f283966f = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.z3 z3Var = this.f283964d.f153677f;
        if (z3Var != null) {
            this.f283965e.invoke(this.f283966f, z3Var);
        }
        return jz5.f0.f302826a;
    }
}
