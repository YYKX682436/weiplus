package we5;

/* loaded from: classes9.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445338f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.storage.f9 f9Var, yb5.d dVar, java.lang.String str) {
        super(1);
        this.f445336d = f9Var;
        this.f445337e = dVar;
        this.f445338f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        yd5.h.f461099a.a(it.f203379b, this.f445336d, this.f445337e.D(), this.f445338f);
        return jz5.f0.f302826a;
    }
}
