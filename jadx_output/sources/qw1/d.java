package qw1;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final is0.c f367080a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f367081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qw1.j f367082c;

    public d(qw1.j jVar, is0.c textureObj) {
        kotlin.jvm.internal.o.g(textureObj, "textureObj");
        this.f367082c = jVar;
        this.f367080a = textureObj;
        this.f367081b = true;
    }

    public final void a() {
        this.f367081b = false;
        qw1.j jVar = this.f367082c;
        jVar.f367109e.add(this.f367080a);
    }
}
