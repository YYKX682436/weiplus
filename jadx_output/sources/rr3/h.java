package rr3;

/* loaded from: classes3.dex */
public final class h implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rr3.k f399190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399191b;

    public h(rr3.k kVar, java.lang.String str) {
        this.f399190a = kVar;
        this.f399191b = str;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        rr3.k kVar = this.f399190a;
        if (!z17) {
            ((android.widget.TextView) ((jz5.n) kVar.f399195e).getValue()).setText(this.f399191b);
        } else {
            ((android.widget.TextView) ((jz5.n) kVar.f399195e).getValue()).setText(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).P0());
        }
    }
}
