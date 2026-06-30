package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes7.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wechat.aff.ilink_stream.f f217266i = new com.tencent.wechat.aff.ilink_stream.f();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217267d;

    /* renamed from: f, reason: collision with root package name */
    public int f217269f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217270g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f217268e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f217271h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.ilink_stream.f)) {
            return false;
        }
        com.tencent.wechat.aff.ilink_stream.f fVar2 = (com.tencent.wechat.aff.ilink_stream.f) fVar;
        return n51.f.a(this.f217267d, fVar2.f217267d) && n51.f.a(this.f217268e, fVar2.f217268e) && n51.f.a(java.lang.Integer.valueOf(this.f217269f), java.lang.Integer.valueOf(fVar2.f217269f)) && n51.f.a(this.f217270g, fVar2.f217270g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.ilink_stream.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f217268e;
        boolean[] zArr = this.f217271h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217267d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f217269f);
            }
            java.lang.String str2 = this.f217270g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f217267d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f217269f);
            }
            java.lang.String str4 = this.f217270g;
            return (str4 == null || !zArr[4]) ? g17 : g17 + b36.f.j(4, str4);
        }
        if (i17 == 2) {
            linkedList.clear();
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
            this.f217267d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f217269f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f217270g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.ilink_stream.u uVar = new com.tencent.wechat.aff.ilink_stream.u();
            if (bArr != null && bArr.length > 0) {
                uVar.parseFrom(bArr);
            }
            linkedList.add(uVar);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.ilink_stream.f) super.parseFrom(bArr);
    }
}
