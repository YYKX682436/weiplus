package e7;

/* loaded from: classes13.dex */
public class c implements w6.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f249842d;

    public c(byte[] bArr) {
        q7.n.b(bArr);
        this.f249842d = bArr;
    }

    @Override // w6.z0
    public java.lang.Class a() {
        return byte[].class;
    }

    @Override // w6.z0
    public java.lang.Object get() {
        return this.f249842d;
    }

    @Override // w6.z0
    public int getSize() {
        return this.f249842d.length;
    }

    @Override // w6.z0
    public void recycle() {
    }
}
