package nj3;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final is0.c f337894a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f337895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nj3.j f337896c;

    public d(nj3.j jVar, is0.c textureObj) {
        kotlin.jvm.internal.o.g(textureObj, "textureObj");
        this.f337896c = jVar;
        this.f337894a = textureObj;
        this.f337895b = true;
    }

    public final void a() {
        this.f337895b = false;
        nj3.j jVar = this.f337896c;
        jVar.f337925e.add(this.f337894a);
    }
}
