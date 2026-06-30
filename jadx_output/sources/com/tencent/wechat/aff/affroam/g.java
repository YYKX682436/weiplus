package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.g f215828p = new com.tencent.wechat.aff.affroam.g();

    /* renamed from: d, reason: collision with root package name */
    public long f215829d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f215830e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f215831f = "";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.u f215832g = new com.tencent.wechat.aff.affroam.u();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f215833h = "";

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.i f215834i = new com.tencent.wechat.aff.affroam.i();

    /* renamed from: m, reason: collision with root package name */
    public int f215835m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f215836n = "";

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.h f215837o = new com.tencent.wechat.aff.affroam.h();

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.affroam.g parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.g) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.g)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.g gVar = (com.tencent.wechat.aff.affroam.g) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f215829d), java.lang.Long.valueOf(gVar.f215829d)) && n51.f.a(java.lang.Integer.valueOf(this.f215830e), java.lang.Integer.valueOf(gVar.f215830e)) && n51.f.a(this.f215831f, gVar.f215831f) && n51.f.a(this.f215832g, gVar.f215832g) && n51.f.a(this.f215833h, gVar.f215833h) && n51.f.a(this.f215834i, gVar.f215834i) && n51.f.a(java.lang.Integer.valueOf(this.f215835m), java.lang.Integer.valueOf(gVar.f215835m)) && n51.f.a(this.f215836n, gVar.f215836n) && n51.f.a(this.f215837o, gVar.f215837o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.g();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f215829d);
            fVar.e(2, this.f215830e);
            java.lang.String str = this.f215831f;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.wechat.aff.affroam.u uVar = this.f215832g;
            if (uVar != null) {
                fVar.i(4, uVar.computeSize());
                this.f215832g.writeFields(fVar);
            }
            java.lang.String str2 = this.f215833h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            com.tencent.wechat.aff.affroam.i iVar = this.f215834i;
            if (iVar != null) {
                fVar.i(6, iVar.computeSize());
                this.f215834i.writeFields(fVar);
            }
            fVar.e(7, this.f215835m);
            java.lang.String str3 = this.f215836n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            com.tencent.wechat.aff.affroam.h hVar = this.f215837o;
            if (hVar != null) {
                fVar.i(10, hVar.computeSize());
                this.f215837o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f215829d) + 0 + b36.f.e(2, this.f215830e);
            java.lang.String str4 = this.f215831f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            com.tencent.wechat.aff.affroam.u uVar2 = this.f215832g;
            if (uVar2 != null) {
                h17 += b36.f.i(4, uVar2.computeSize());
            }
            java.lang.String str5 = this.f215833h;
            if (str5 != null) {
                h17 += b36.f.j(5, str5);
            }
            com.tencent.wechat.aff.affroam.i iVar2 = this.f215834i;
            if (iVar2 != null) {
                h17 += b36.f.i(6, iVar2.computeSize());
            }
            int e17 = h17 + b36.f.e(7, this.f215835m);
            java.lang.String str6 = this.f215836n;
            if (str6 != null) {
                e17 += b36.f.j(8, str6);
            }
            com.tencent.wechat.aff.affroam.h hVar2 = this.f215837o;
            return hVar2 != null ? e17 + b36.f.i(10, hVar2.computeSize()) : e17;
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
        switch (intValue) {
            case 1:
                this.f215829d = aVar2.i(intValue);
                return 0;
            case 2:
                this.f215830e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f215831f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.affroam.u uVar3 = new com.tencent.wechat.aff.affroam.u();
                    if (bArr != null && bArr.length > 0) {
                        uVar3.parseFrom(bArr);
                    }
                    this.f215832g = uVar3;
                }
                return 0;
            case 5:
                this.f215833h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.aff.affroam.i iVar3 = new com.tencent.wechat.aff.affroam.i();
                    if (bArr2 != null && bArr2.length > 0) {
                        iVar3.parseFrom(bArr2);
                    }
                    this.f215834i = iVar3;
                }
                return 0;
            case 7:
                this.f215835m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f215836n = aVar2.k(intValue);
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.wechat.aff.affroam.h hVar3 = new com.tencent.wechat.aff.affroam.h();
                    if (bArr3 != null && bArr3.length > 0) {
                        hVar3.parseFrom(bArr3);
                    }
                    this.f215837o = hVar3;
                }
                return 0;
        }
    }
}
