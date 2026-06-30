package xv5;

/* loaded from: classes11.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f457464d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f457465e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f457466f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f457467g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f457468h;

    /* renamed from: i, reason: collision with root package name */
    public xv5.g f457469i;

    /* renamed from: m, reason: collision with root package name */
    public xv5.e f457470m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f457471n = new boolean[8];

    static {
        new xv5.f();
    }

    public xv5.e b() {
        return this.f457471n[7] ? this.f457470m : new xv5.e();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public xv5.f parseFrom(byte[] bArr) {
        return (xv5.f) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xv5.f)) {
            return false;
        }
        xv5.f fVar2 = (xv5.f) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f457464d), java.lang.Long.valueOf(fVar2.f457464d)) && n51.f.a(java.lang.Boolean.valueOf(this.f457465e), java.lang.Boolean.valueOf(fVar2.f457465e)) && n51.f.a(java.lang.Boolean.valueOf(this.f457466f), java.lang.Boolean.valueOf(fVar2.f457466f)) && n51.f.a(java.lang.Boolean.valueOf(this.f457467g), java.lang.Boolean.valueOf(fVar2.f457467g)) && n51.f.a(java.lang.Boolean.valueOf(this.f457468h), java.lang.Boolean.valueOf(fVar2.f457468h)) && n51.f.a(this.f457469i, fVar2.f457469i) && n51.f.a(this.f457470m, fVar2.f457470m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new xv5.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        xv5.g gVar;
        boolean[] zArr = this.f457471n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f457464d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f457465e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f457466f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f457467g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f457468h);
            }
            xv5.g gVar2 = this.f457469i;
            if (gVar2 != null && zArr[6]) {
                fVar.e(6, gVar2.f457480d);
            }
            xv5.e eVar = this.f457470m;
            if (eVar != null && zArr[7]) {
                fVar.i(7, eVar.computeSize());
                this.f457470m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f457464d) : 0;
            if (zArr[2]) {
                h17 += b36.f.a(2, this.f457465e);
            }
            if (zArr[3]) {
                h17 += b36.f.a(3, this.f457466f);
            }
            if (zArr[4]) {
                h17 += b36.f.a(4, this.f457467g);
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f457468h);
            }
            xv5.g gVar3 = this.f457469i;
            if (gVar3 != null && zArr[6]) {
                h17 += b36.f.e(6, gVar3.f457480d);
            }
            xv5.e eVar2 = this.f457470m;
            return (eVar2 == null || !zArr[7]) ? h17 : h17 + b36.f.i(7, eVar2.computeSize());
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
                this.f457464d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f457465e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f457466f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f457467g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f457468h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                switch (aVar2.g(intValue)) {
                    case 0:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_None;
                        break;
                    case 1:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_H1;
                        break;
                    case 2:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_H2;
                        break;
                    case 3:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_H3;
                        break;
                    case 4:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_H4;
                        break;
                    case 5:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_H5;
                        break;
                    case 6:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_H6;
                        break;
                    default:
                        gVar = null;
                        break;
                }
                this.f457469i = gVar;
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    xv5.e eVar3 = new xv5.e();
                    if (bArr != null && bArr.length > 0) {
                        eVar3.parseFrom(bArr);
                    }
                    this.f457470m = eVar3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
