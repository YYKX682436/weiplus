package w71;

/* loaded from: classes7.dex */
public final class o1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f443430d;

    /* renamed from: e, reason: collision with root package name */
    public final int f443431e;

    public o1(byte[] rawData, int i17, int i18) {
        kotlin.jvm.internal.o.g(rawData, "rawData");
        this.f443430d = rawData;
        this.f443431e = i18;
    }

    @Override // com.tencent.mm.protobuf.f
    public int op(int i17, java.lang.Object... objs) {
        kotlin.jvm.internal.o.g(objs, "objs");
        if (i17 != 1) {
            return super.op(i17, java.util.Arrays.copyOf(objs, objs.length));
        }
        r45.he heVar = this.BaseRequest;
        return (heVar != null ? 0 + b36.f.i(1, heVar.computeSize()) : 0) + this.f443430d.length;
    }

    @Override // com.tencent.mm.protobuf.f
    public byte[] toByteArray() {
        int i17;
        validate();
        byte[] bArr = new byte[computeSize()];
        g36.f fVar = new g36.f(bArr);
        r45.he heVar = this.BaseRequest;
        if (heVar != null) {
            int computeSize = heVar.computeSize();
            int i18 = this.f443431e;
            fVar.i(i18, computeSize);
            this.BaseRequest.writeFields(fVar);
            i17 = b36.f.i(i18, this.BaseRequest.computeSize());
        } else {
            i17 = 0;
        }
        byte[] bArr2 = this.f443430d;
        java.lang.System.arraycopy(bArr2, 0, bArr, i17, bArr2.length);
        return bArr;
    }
}
