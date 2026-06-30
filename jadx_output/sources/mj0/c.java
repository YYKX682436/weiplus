package mj0;

/* loaded from: classes8.dex */
public class c extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f326985d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f326986e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f326987f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f326988g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f326989h;

    /* renamed from: i, reason: collision with root package name */
    public int f326990i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f326991m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof mj0.c)) {
            return false;
        }
        mj0.c cVar = (mj0.c) fVar;
        return n51.f.a(this.BaseRequest, cVar.BaseRequest) && n51.f.a(this.f326985d, cVar.f326985d) && n51.f.a(this.f326986e, cVar.f326986e) && n51.f.a(this.f326987f, cVar.f326987f) && n51.f.a(this.f326988g, cVar.f326988g) && n51.f.a(this.f326989h, cVar.f326989h) && n51.f.a(java.lang.Integer.valueOf(this.f326990i), java.lang.Integer.valueOf(cVar.f326990i)) && n51.f.a(this.f326991m, cVar.f326991m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f326985d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f326986e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f326987f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f326988g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f326989h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f326990i);
            java.lang.String str6 = this.f326991m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f326985d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f326986e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f326987f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f326988g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f326989h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            int e17 = i18 + b36.f.e(7, this.f326990i);
            java.lang.String str12 = this.f326991m;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        mj0.c cVar = (mj0.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    cVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                cVar.f326985d = aVar2.k(intValue);
                return 0;
            case 3:
                cVar.f326986e = aVar2.k(intValue);
                return 0;
            case 4:
                cVar.f326987f = aVar2.k(intValue);
                return 0;
            case 5:
                cVar.f326988g = aVar2.k(intValue);
                return 0;
            case 6:
                cVar.f326989h = aVar2.k(intValue);
                return 0;
            case 7:
                cVar.f326990i = aVar2.g(intValue);
                return 0;
            case 8:
                cVar.f326991m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
