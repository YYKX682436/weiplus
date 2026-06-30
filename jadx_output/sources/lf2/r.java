package lf2;

/* loaded from: classes10.dex */
public final class r implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf2.s f318302a;

    public r(lf2.s sVar) {
        this.f318302a = sVar;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        lf2.s sVar = this.f318302a;
        ((om2.e) sVar.H.a(om2.e.class)).f346296o = !z17;
        ((kotlinx.coroutines.flow.h3) ((om2.e) sVar.H.a(om2.e.class)).f346295n).k(java.lang.Boolean.valueOf(z17));
    }
}
