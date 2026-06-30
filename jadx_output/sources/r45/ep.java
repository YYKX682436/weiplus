package r45;

/* loaded from: classes9.dex */
public class ep extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f373629d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373630e;

    /* renamed from: f, reason: collision with root package name */
    public long f373631f;

    /* renamed from: g, reason: collision with root package name */
    public a36.c f373632g;

    /* renamed from: h, reason: collision with root package name */
    public long f373633h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f373634i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f373635m;

    /* renamed from: n, reason: collision with root package name */
    public int f373636n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f373637o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f373638p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f373639q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f373640r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ep)) {
            return false;
        }
        r45.ep epVar = (r45.ep) fVar;
        return n51.f.a(this.BaseResponse, epVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f373629d), java.lang.Integer.valueOf(epVar.f373629d)) && n51.f.a(this.f373630e, epVar.f373630e) && n51.f.a(java.lang.Long.valueOf(this.f373631f), java.lang.Long.valueOf(epVar.f373631f)) && n51.f.a(this.f373632g, epVar.f373632g) && n51.f.a(java.lang.Long.valueOf(this.f373633h), java.lang.Long.valueOf(epVar.f373633h)) && n51.f.a(this.f373634i, epVar.f373634i) && n51.f.a(java.lang.Integer.valueOf(this.f373635m), java.lang.Integer.valueOf(epVar.f373635m)) && n51.f.a(java.lang.Integer.valueOf(this.f373636n), java.lang.Integer.valueOf(epVar.f373636n)) && n51.f.a(this.f373637o, epVar.f373637o) && n51.f.a(this.f373638p, epVar.f373638p) && n51.f.a(this.f373639q, epVar.f373639q) && n51.f.a(java.lang.Boolean.valueOf(this.f373640r), java.lang.Boolean.valueOf(epVar.f373640r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f373629d);
            java.lang.String str = this.f373630e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f373631f);
            a36.c cVar = this.f373632g;
            if (cVar != null) {
                fVar.i(5, cVar.computeSize());
                this.f373632g.writeFields(fVar);
            }
            fVar.h(6, this.f373633h);
            fVar.g(7, 1, this.f373634i);
            fVar.e(8, this.f373635m);
            fVar.e(9, this.f373636n);
            java.lang.String str2 = this.f373637o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f373638p;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f373639q;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.a(13, this.f373640r);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f373629d);
            java.lang.String str5 = this.f373630e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int h17 = i18 + b36.f.h(4, this.f373631f);
            a36.c cVar2 = this.f373632g;
            if (cVar2 != null) {
                h17 += b36.f.i(5, cVar2.computeSize());
            }
            int h18 = h17 + b36.f.h(6, this.f373633h) + b36.f.g(7, 1, this.f373634i) + b36.f.e(8, this.f373635m) + b36.f.e(9, this.f373636n);
            java.lang.String str6 = this.f373637o;
            if (str6 != null) {
                h18 += b36.f.j(10, str6);
            }
            java.lang.String str7 = this.f373638p;
            if (str7 != null) {
                h18 += b36.f.j(11, str7);
            }
            java.lang.String str8 = this.f373639q;
            if (str8 != null) {
                h18 += b36.f.j(12, str8);
            }
            return h18 + b36.f.a(13, this.f373640r);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f373634i.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.ep epVar = (r45.ep) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    epVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                epVar.f373629d = aVar2.g(intValue);
                return 0;
            case 3:
                epVar.f373630e = aVar2.k(intValue);
                return 0;
            case 4:
                epVar.f373631f = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    a36.c cVar3 = new a36.c();
                    if (bArr3 != null && bArr3.length > 0) {
                        cVar3.parseFrom(bArr3);
                    }
                    epVar.f373632g = cVar3;
                }
                return 0;
            case 6:
                epVar.f373633h = aVar2.i(intValue);
                return 0;
            case 7:
                epVar.f373634i.add(aVar2.k(intValue));
                return 0;
            case 8:
                epVar.f373635m = aVar2.g(intValue);
                return 0;
            case 9:
                epVar.f373636n = aVar2.g(intValue);
                return 0;
            case 10:
                epVar.f373637o = aVar2.k(intValue);
                return 0;
            case 11:
                epVar.f373638p = aVar2.k(intValue);
                return 0;
            case 12:
                epVar.f373639q = aVar2.k(intValue);
                return 0;
            case 13:
                epVar.f373640r = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
