package yw;

/* loaded from: classes8.dex */
public final class c1 implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f466285d;

    public c1(yz5.l lVar) {
        this.f466285d = lVar;
    }

    @Override // ns.e
    public final void a(boolean z17, boolean z18, java.lang.String respUsername, java.lang.String googleItemID) {
        kotlin.jvm.internal.o.g(respUsername, "respUsername");
        kotlin.jvm.internal.o.g(googleItemID, "googleItemID");
        yz5.l lVar = this.f466285d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z17));
        }
    }
}
