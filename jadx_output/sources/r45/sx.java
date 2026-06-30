package r45;

/* loaded from: classes2.dex */
public class sx extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385997d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385998e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385999f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386000g;

    /* renamed from: h, reason: collision with root package name */
    public long f386001h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386002i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sx)) {
            return false;
        }
        r45.sx sxVar = (r45.sx) fVar;
        return n51.f.a(this.BaseRequest, sxVar.BaseRequest) && n51.f.a(this.f385997d, sxVar.f385997d) && n51.f.a(this.f385998e, sxVar.f385998e) && n51.f.a(this.f385999f, sxVar.f385999f) && n51.f.a(this.f386000g, sxVar.f386000g) && n51.f.a(java.lang.Long.valueOf(this.f386001h), java.lang.Long.valueOf(sxVar.f386001h)) && n51.f.a(this.f386002i, sxVar.f386002i);
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
            java.lang.String str = this.f385997d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f385998e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f385999f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f386000g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.h(6, this.f386001h);
            java.lang.String str5 = this.f386002i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f385997d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f385998e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f385999f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f386000g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            int h17 = i18 + b36.f.h(6, this.f386001h);
            java.lang.String str10 = this.f386002i;
            return str10 != null ? h17 + b36.f.j(7, str10) : h17;
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
        r45.sx sxVar = (r45.sx) objArr[1];
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
                    sxVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                sxVar.f385997d = aVar2.k(intValue);
                return 0;
            case 3:
                sxVar.f385998e = aVar2.k(intValue);
                return 0;
            case 4:
                sxVar.f385999f = aVar2.k(intValue);
                return 0;
            case 5:
                sxVar.f386000g = aVar2.k(intValue);
                return 0;
            case 6:
                sxVar.f386001h = aVar2.i(intValue);
                return 0;
            case 7:
                sxVar.f386002i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
