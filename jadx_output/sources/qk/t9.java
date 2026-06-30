package qk;

/* loaded from: classes7.dex */
public final class t9 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f364338d = new byte[0];

    public t9() {
        this.BaseResponse = new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public int op(int i17, java.lang.Object... objs) {
        kotlin.jvm.internal.o.g(objs, "objs");
        if (i17 != 1) {
            return super.op(i17, java.util.Arrays.copyOf(objs, objs.length));
        }
        r45.ie ieVar = this.BaseResponse;
        return (ieVar != null ? 0 + b36.f.i(1, ieVar.computeSize()) : 0) + this.f364338d.length;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.f364338d = bArr;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public byte[] toByteArray() {
        int i17;
        validate();
        byte[] bArr = new byte[computeSize()];
        g36.f fVar = new g36.f(bArr);
        r45.ie ieVar = this.BaseResponse;
        if (ieVar != null) {
            fVar.i(1, ieVar.computeSize());
            this.BaseResponse.writeFields(fVar);
            i17 = b36.f.i(1, this.BaseResponse.computeSize());
        } else {
            i17 = 0;
        }
        byte[] bArr2 = this.f364338d;
        java.lang.System.arraycopy(bArr2, 0, bArr, i17, bArr2.length);
        return bArr;
    }
}
