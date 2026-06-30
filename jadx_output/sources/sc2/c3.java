package sc2;

/* loaded from: classes2.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f405804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405806f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405807g;

    public c3(ad2.h hVar, in5.s0 s0Var, android.view.View view, java.lang.String str) {
        this.f405804d = hVar;
        this.f405805e = s0Var;
        this.f405806f = view;
        this.f405807g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((sc2.m3) this.f405804d).M(this.f405805e, this.f405806f, true, this.f405807g);
    }
}
