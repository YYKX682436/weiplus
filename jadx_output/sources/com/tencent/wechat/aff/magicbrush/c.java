package com.tencent.wechat.aff.magicbrush;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217374d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217375e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217376f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217377g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f217378h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f217379i = new boolean[6];

    static {
        new com.tencent.wechat.aff.magicbrush.c();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.magicbrush.c parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.magicbrush.c) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.magicbrush.c)) {
            return false;
        }
        com.tencent.wechat.aff.magicbrush.c cVar = (com.tencent.wechat.aff.magicbrush.c) fVar;
        return n51.f.a(this.f217374d, cVar.f217374d) && n51.f.a(this.f217375e, cVar.f217375e) && n51.f.a(this.f217376f, cVar.f217376f) && n51.f.a(this.f217377g, cVar.f217377g) && n51.f.a(this.f217378h, cVar.f217378h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.magicbrush.c();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f217379i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217374d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f217375e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f217376f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f217377g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f217378h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f217374d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f217375e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f217376f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f217377g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f217378h;
            return (str10 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str10);
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
            this.f217374d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217375e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f217376f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f217377g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f217378h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
