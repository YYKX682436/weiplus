package g81;

@j95.b
/* loaded from: classes4.dex */
public class e extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public volatile com.tencent.mm.storage.i f269525d;

    public static g81.e Ai() {
        return (g81.e) i95.n0.c(g81.e.class);
    }

    public com.tencent.mm.storage.i wi() {
        gm0.j1.b().c();
        if (this.f269525d == null) {
            synchronized (this) {
                if (this.f269525d == null) {
                    this.f269525d = new com.tencent.mm.storage.i(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f269525d;
    }
}
