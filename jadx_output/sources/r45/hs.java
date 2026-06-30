package r45;

/* loaded from: classes9.dex */
public class hs extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f376403d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376404e;

    /* renamed from: f, reason: collision with root package name */
    public a36.c f376405f;

    /* renamed from: g, reason: collision with root package name */
    public long f376406g;

    /* renamed from: h, reason: collision with root package name */
    public int f376407h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f376408i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f376409m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376410n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f376411o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f376412p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f376413q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hs)) {
            return false;
        }
        r45.hs hsVar = (r45.hs) fVar;
        return n51.f.a(this.BaseResponse, hsVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f376403d), java.lang.Integer.valueOf(hsVar.f376403d)) && n51.f.a(this.f376404e, hsVar.f376404e) && n51.f.a(this.f376405f, hsVar.f376405f) && n51.f.a(java.lang.Long.valueOf(this.f376406g), java.lang.Long.valueOf(hsVar.f376406g)) && n51.f.a(java.lang.Integer.valueOf(this.f376407h), java.lang.Integer.valueOf(hsVar.f376407h)) && n51.f.a(this.f376408i, hsVar.f376408i) && n51.f.a(java.lang.Integer.valueOf(this.f376409m), java.lang.Integer.valueOf(hsVar.f376409m)) && n51.f.a(this.f376410n, hsVar.f376410n) && n51.f.a(this.f376411o, hsVar.f376411o) && n51.f.a(this.f376412p, hsVar.f376412p) && n51.f.a(this.f376413q, hsVar.f376413q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376408i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f376403d);
            java.lang.String str = this.f376404e;
            if (str != null) {
                fVar.j(3, str);
            }
            a36.c cVar = this.f376405f;
            if (cVar != null) {
                fVar.i(4, cVar.computeSize());
                this.f376405f.writeFields(fVar);
            }
            fVar.h(5, this.f376406g);
            fVar.e(6, this.f376407h);
            fVar.g(7, 1, linkedList);
            fVar.e(8, this.f376409m);
            java.lang.String str2 = this.f376410n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f376411o;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f376412p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f376413q;
            if (str5 == null) {
                return 0;
            }
            fVar.j(12, str5);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f376403d);
            java.lang.String str6 = this.f376404e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            a36.c cVar2 = this.f376405f;
            if (cVar2 != null) {
                i18 += b36.f.i(4, cVar2.computeSize());
            }
            int h17 = i18 + b36.f.h(5, this.f376406g) + b36.f.e(6, this.f376407h) + b36.f.g(7, 1, linkedList) + b36.f.e(8, this.f376409m);
            java.lang.String str7 = this.f376410n;
            if (str7 != null) {
                h17 += b36.f.j(9, str7);
            }
            java.lang.String str8 = this.f376411o;
            if (str8 != null) {
                h17 += b36.f.j(10, str8);
            }
            java.lang.String str9 = this.f376412p;
            if (str9 != null) {
                h17 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f376413q;
            return str10 != null ? h17 + b36.f.j(12, str10) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.hs hsVar = (r45.hs) objArr[1];
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
                    hsVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                hsVar.f376403d = aVar2.g(intValue);
                return 0;
            case 3:
                hsVar.f376404e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    a36.c cVar3 = new a36.c();
                    if (bArr3 != null && bArr3.length > 0) {
                        cVar3.parseFrom(bArr3);
                    }
                    hsVar.f376405f = cVar3;
                }
                return 0;
            case 5:
                hsVar.f376406g = aVar2.i(intValue);
                return 0;
            case 6:
                hsVar.f376407h = aVar2.g(intValue);
                return 0;
            case 7:
                hsVar.f376408i.add(aVar2.k(intValue));
                return 0;
            case 8:
                hsVar.f376409m = aVar2.g(intValue);
                return 0;
            case 9:
                hsVar.f376410n = aVar2.k(intValue);
                return 0;
            case 10:
                hsVar.f376411o = aVar2.k(intValue);
                return 0;
            case 11:
                hsVar.f376412p = aVar2.k(intValue);
                return 0;
            case 12:
                hsVar.f376413q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
