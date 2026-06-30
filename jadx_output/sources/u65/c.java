package u65;

/* loaded from: classes8.dex */
public abstract class c extends com.tencent.mm.sdk.platformtools.y7 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f425032c;

    public c(int i17) {
        super(i17);
        this.f425032c = new java.lang.Object();
    }

    @Override // com.tencent.mm.sdk.platformtools.y7
    public java.lang.Object a() {
        java.lang.Object a17;
        synchronized (this.f425032c) {
            a17 = super.a();
        }
        return a17;
    }

    @Override // com.tencent.mm.sdk.platformtools.y7
    public boolean b(java.lang.Object obj) {
        boolean b17;
        synchronized (this.f425032c) {
            b17 = super.b(obj);
        }
        return b17;
    }
}
