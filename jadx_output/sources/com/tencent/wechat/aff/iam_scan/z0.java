package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes8.dex */
public class z0 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f217203e;

    /* renamed from: f, reason: collision with root package name */
    public int f217204f;

    /* renamed from: g, reason: collision with root package name */
    public long f217205g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f217202d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f217206h = new boolean[5];

    static {
        new com.tencent.wechat.aff.iam_scan.z0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.iam_scan.z0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.z0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.z0)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.z0 z0Var = (com.tencent.wechat.aff.iam_scan.z0) fVar;
        return n51.f.a(this.f217202d, z0Var.f217202d) && n51.f.a(java.lang.Integer.valueOf(this.f217203e), java.lang.Integer.valueOf(z0Var.f217203e)) && n51.f.a(java.lang.Integer.valueOf(this.f217204f), java.lang.Integer.valueOf(z0Var.f217204f)) && n51.f.a(java.lang.Long.valueOf(this.f217205g), java.lang.Long.valueOf(z0Var.f217205g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.z0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f217202d;
        boolean[] zArr = this.f217206h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f217203e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f217204f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f217205g);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f217203e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f217204f);
            }
            return zArr[4] ? g17 + b36.f.h(4, this.f217205g) : g17;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f217203e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f217204f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f217205g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.iam_scan.y0 y0Var = new com.tencent.wechat.aff.iam_scan.y0();
            if (bArr != null && bArr.length > 0) {
                y0Var.parseFrom(bArr);
            }
            linkedList.add(y0Var);
        }
        zArr[1] = true;
        return 0;
    }
}
