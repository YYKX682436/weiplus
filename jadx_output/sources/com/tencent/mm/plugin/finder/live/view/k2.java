package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public abstract class k2 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f116431d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f116432e;

    /* renamed from: f, reason: collision with root package name */
    public int f116433f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f116434g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(gk2.e liveData, android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(context, "context");
        this.f116431d = liveData;
    }

    public abstract void a(int i17);

    public void b() {
    }

    public void c(int i17) {
    }

    public void d(int i17) {
    }

    public abstract void e();

    public abstract void f();

    public abstract void g(boolean z17, int i17);

    public final int getInitIndex() {
        return this.f116433f;
    }

    public final gk2.e getLiveData() {
        return this.f116431d;
    }

    public abstract void h(long j17);

    public void i(gk2.e eVar) {
    }

    public abstract void j();

    public abstract void k(boolean z17, km2.q qVar);

    public abstract void l(gk2.e eVar);

    public void m(java.lang.String str, byte[] bArr) {
    }

    public final void setCurrentSelect(boolean z17) {
        this.f116432e = z17;
    }

    public final void setInitIndex(int i17) {
        this.f116433f = i17;
    }

    public final void setPanelOpen(boolean z17) {
        this.f116434g = z17;
    }
}
