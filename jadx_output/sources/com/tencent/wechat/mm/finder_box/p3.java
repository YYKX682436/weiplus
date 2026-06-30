package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class p3 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219738e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219739f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219740g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f219741h;

    /* renamed from: i, reason: collision with root package name */
    public int f219742i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f219737d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f219743m = new boolean[7];

    static {
        new com.tencent.wechat.mm.finder_box.p3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.p3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.p3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.p3)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.p3 p3Var = (com.tencent.wechat.mm.finder_box.p3) fVar;
        return n51.f.a(this.f219737d, p3Var.f219737d) && n51.f.a(this.f219738e, p3Var.f219738e) && n51.f.a(this.f219739f, p3Var.f219739f) && n51.f.a(this.f219740g, p3Var.f219740g) && n51.f.a(java.lang.Boolean.valueOf(this.f219741h), java.lang.Boolean.valueOf(p3Var.f219741h)) && n51.f.a(java.lang.Integer.valueOf(this.f219742i), java.lang.Integer.valueOf(p3Var.f219742i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.p3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219737d;
        boolean[] zArr = this.f219743m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f219738e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f219739f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f219740g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.a(5, this.f219741h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f219742i);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str4 = this.f219738e;
            if (str4 != null && zArr[2]) {
                g17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f219739f;
            if (str5 != null && zArr[3]) {
                g17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f219740g;
            if (str6 != null && zArr[4]) {
                g17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                g17 += b36.f.a(5, this.f219741h);
            }
            return zArr[6] ? g17 + b36.f.e(6, this.f219742i) : g17;
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.mm.finder_box.n3 n3Var = new com.tencent.wechat.mm.finder_box.n3();
                    if (bArr != null && bArr.length > 0) {
                        n3Var.parseFrom(bArr);
                    }
                    linkedList.add(n3Var);
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f219738e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219739f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219740g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219741h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219742i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
