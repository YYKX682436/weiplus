package lf3;

@j95.b
/* loaded from: classes10.dex */
public class q extends i95.w implements nf3.e {

    /* renamed from: d, reason: collision with root package name */
    public volatile com.tencent.mm.storage.w8 f318331d;

    public com.tencent.mm.storage.w8 wi() {
        gm0.j1.b().c();
        if (this.f318331d == null) {
            synchronized (this) {
                if (this.f318331d == null) {
                    this.f318331d = new com.tencent.mm.storage.w8(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f318331d;
    }
}
