package er4;

/* loaded from: classes14.dex */
public class m extends com.tencent.mm.protobuf.f {

    /* renamed from: o, reason: collision with root package name */
    public static final er4.m f256121o = new er4.m();

    /* renamed from: d, reason: collision with root package name */
    public long f256122d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f256123e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f256124f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f256125g;

    /* renamed from: h, reason: collision with root package name */
    public er4.o f256126h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f256127i;

    /* renamed from: m, reason: collision with root package name */
    public er4.n f256128m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f256129n = new boolean[8];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof er4.m)) {
            return false;
        }
        er4.m mVar = (er4.m) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f256122d), java.lang.Long.valueOf(mVar.f256122d)) && n51.f.a(this.f256123e, mVar.f256123e) && n51.f.a(this.f256124f, mVar.f256124f) && n51.f.a(this.f256125g, mVar.f256125g) && n51.f.a(this.f256126h, mVar.f256126h) && n51.f.a(java.lang.Boolean.valueOf(this.f256127i), java.lang.Boolean.valueOf(mVar.f256127i)) && n51.f.a(this.f256128m, mVar.f256128m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new er4.m();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f256129n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f256122d);
            }
            java.lang.String str = this.f256123e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f256124f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f256125g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            er4.o oVar = this.f256126h;
            if (oVar != null && zArr[5]) {
                fVar.e(5, oVar.f256146d);
            }
            if (zArr[6]) {
                fVar.a(6, this.f256127i);
            }
            er4.n nVar = this.f256128m;
            if (nVar != null && zArr[7]) {
                fVar.e(7, nVar.f256135d);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f256122d) : 0;
            java.lang.String str4 = this.f256123e;
            if (str4 != null && zArr[2]) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f256124f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f256125g;
            if (str6 != null && zArr[4]) {
                h17 += b36.f.j(4, str6);
            }
            er4.o oVar2 = this.f256126h;
            if (oVar2 != null && zArr[5]) {
                h17 += b36.f.e(5, oVar2.f256146d);
            }
            if (zArr[6]) {
                h17 += b36.f.a(6, this.f256127i);
            }
            er4.n nVar2 = this.f256128m;
            return (nVar2 == null || !zArr[7]) ? h17 : h17 + b36.f.e(7, nVar2.f256135d);
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
        er4.o oVar3 = null;
        er4.n nVar3 = null;
        switch (intValue) {
            case 1:
                this.f256122d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f256123e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f256124f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f256125g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                switch (aVar2.g(intValue)) {
                    case 0:
                        oVar3 = er4.o.VoIPMP_MEMBER_STATUS_UNKOWN;
                        break;
                    case 1:
                        oVar3 = er4.o.VoIPMP_MEMBER_STATUS_JOINED;
                        break;
                    case 2:
                        oVar3 = er4.o.VoIPMP_MEMBER_STATUS_CALLEE;
                        break;
                    case 3:
                        oVar3 = er4.o.VoIPMP_MEMBER_STATUS_ACKED;
                        break;
                    case 4:
                        oVar3 = er4.o.VoIPMP_MEMBER_STATUS_EXIT;
                        break;
                    case 5:
                        oVar3 = er4.o.VoIPMP_MEMBER_STATUS_CANCEL;
                        break;
                    case 6:
                        oVar3 = er4.o.VoIPMP_MEMBER_STATUS_BUSY;
                        break;
                    case 7:
                        oVar3 = er4.o.VoIPMP_MEMBER_STATUS_REJECT;
                        break;
                    case 8:
                        oVar3 = er4.o.VoIPMP_MEMBER_STATUS_NO_RESP;
                        break;
                }
                this.f256126h = oVar3;
                zArr[5] = true;
                return 0;
            case 6:
                this.f256127i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                int g17 = aVar2.g(intValue);
                if (g17 == 0) {
                    nVar3 = er4.n.VoIPMP_MEMBER_SCREEN_STATUS_NONE;
                } else if (g17 == 1) {
                    nVar3 = er4.n.VoIPMP_MEMBER_SCREEN_STATUS_START;
                } else if (g17 == 2) {
                    nVar3 = er4.n.VoIPMP_MEMBER_SCREEN_STATUS_PAUSE;
                } else if (g17 == 3) {
                    nVar3 = er4.n.VoIPMP_MEMBER_SCREEN_STATUS_UNKOWN;
                }
                this.f256128m = nVar3;
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (er4.m) super.parseFrom(bArr);
    }
}
