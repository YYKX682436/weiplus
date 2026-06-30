package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.aff.ilink_stream.a f217213h = new com.tencent.wechat.aff.ilink_stream.a();

    /* renamed from: d, reason: collision with root package name */
    public int f217214d;

    /* renamed from: e, reason: collision with root package name */
    public int f217215e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217216f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f217217g = new boolean[4];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.ilink_stream.a)) {
            return false;
        }
        com.tencent.wechat.aff.ilink_stream.a aVar = (com.tencent.wechat.aff.ilink_stream.a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f217214d), java.lang.Integer.valueOf(aVar.f217214d)) && n51.f.a(java.lang.Integer.valueOf(this.f217215e), java.lang.Integer.valueOf(aVar.f217215e)) && n51.f.a(this.f217216f, aVar.f217216f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.ilink_stream.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217217g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f217214d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f217215e);
            }
            java.lang.String str = this.f217216f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f217214d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f217215e);
            }
            java.lang.String str2 = this.f217216f;
            return (str2 == null || !zArr[3]) ? e17 : e17 + b36.f.j(3, str2);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f217214d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217215e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f217216f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.ilink_stream.a) super.parseFrom(bArr);
    }
}
