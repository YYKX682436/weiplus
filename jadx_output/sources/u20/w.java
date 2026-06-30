package u20;

/* loaded from: classes9.dex */
public final class w implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u20.y f423949a;

    public w(u20.y yVar) {
        this.f423949a = yVar;
    }

    @Override // n13.x
    public final void a(boolean z17, java.lang.String str, android.os.Bundle extInfo) {
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        u20.y yVar = this.f423949a;
        if (z17) {
            kotlinx.coroutines.l.d(yVar.f423859c, null, null, new u20.u(yVar, str, null), 3, null);
        } else {
            yVar.a();
        }
    }
}
