package pk2;

/* loaded from: classes3.dex */
public final class r6 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356215a;

    public r6(pk2.o9 o9Var) {
        this.f356215a = o9Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        pk2.f8.d(pk2.f8.f355747a, 4, 0, 4, z17 ? 2 : 3, null, 16, null);
        ((kotlinx.coroutines.flow.h3) ((mm2.j2) this.f356215a.c(mm2.j2.class)).f329169q).k(java.lang.Boolean.valueOf(z17));
    }
}
