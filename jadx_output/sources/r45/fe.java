package r45;

/* loaded from: classes7.dex */
public class fe extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f374249d;

    public fe(byte[] bArr) {
        this.f374249d = bArr;
    }

    @Override // com.tencent.mm.protobuf.f
    public int op(int i17, java.lang.Object... objArr) {
        return -1;
    }

    @Override // com.tencent.mm.protobuf.f
    public byte[] toByteArray() {
        validate();
        int computeSize = this.BaseRequest.computeSize();
        int i17 = b36.f.i(1, computeSize);
        byte[] bArr = new byte[i17];
        g36.f fVar = new g36.f(bArr);
        fVar.i(1, computeSize);
        this.BaseRequest.writeFields(fVar);
        byte[] bArr2 = this.f374249d;
        byte[] bArr3 = new byte[bArr2.length + i17];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, i17);
        java.lang.System.arraycopy(bArr2, 0, bArr3, i17, bArr2.length);
        return bArr3;
    }
}
