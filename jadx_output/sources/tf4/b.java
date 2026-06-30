package tf4;

/* loaded from: classes12.dex */
public final class b extends xm1.k {

    /* renamed from: k, reason: collision with root package name */
    public final yz5.l f418950k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f418951l;

    public b(yz5.l onStartRecord) {
        kotlin.jvm.internal.o.g(onStartRecord, "onStartRecord");
        this.f418950k = onStartRecord;
    }

    @Override // xm1.h
    public void o(int i17) {
        super.o(i17);
        if (this.f418951l) {
            return;
        }
        this.f418951l = true;
        this.f418950k.invoke(java.lang.Boolean.TRUE);
    }
}
