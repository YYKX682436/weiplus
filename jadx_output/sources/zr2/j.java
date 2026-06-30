package zr2;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr2.k f475192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f475193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f475195g;

    public j(zr2.k kVar, java.util.LinkedList linkedList, int i17, int i18) {
        this.f475192d = kVar;
        this.f475193e = linkedList;
        this.f475194f = i17;
        this.f475195g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zr2.k.a(this.f475192d, this.f475193e, this.f475194f, this.f475195g);
    }
}
