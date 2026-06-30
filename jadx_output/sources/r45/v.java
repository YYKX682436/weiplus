package r45;

/* loaded from: classes8.dex */
public class v extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387771d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387772e = "请求不成功，请稍候再试";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387773f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387774g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387775h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387776i;

    /* renamed from: m, reason: collision with root package name */
    public r45.a f387777m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387778n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v)) {
            return false;
        }
        r45.v vVar = (r45.v) fVar;
        return n51.f.a(this.BaseResponse, vVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f387771d), java.lang.Integer.valueOf(vVar.f387771d)) && n51.f.a(this.f387772e, vVar.f387772e) && n51.f.a(this.f387773f, vVar.f387773f) && n51.f.a(this.f387774g, vVar.f387774g) && n51.f.a(this.f387775h, vVar.f387775h) && n51.f.a(this.f387776i, vVar.f387776i) && n51.f.a(this.f387777m, vVar.f387777m) && n51.f.a(this.f387778n, vVar.f387778n);
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
            fVar.e(2, this.f387771d);
            java.lang.String str = this.f387772e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f387773f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f387774g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f387775h;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f387776i;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            r45.a aVar = this.f387777m;
            if (aVar != null) {
                fVar.i(9, aVar.computeSize());
                this.f387777m.writeFields(fVar);
            }
            java.lang.String str6 = this.f387778n;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f387771d);
            java.lang.String str7 = this.f387772e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f387773f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f387774g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f387775h;
            if (str10 != null) {
                i18 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f387776i;
            if (str11 != null) {
                i18 += b36.f.j(8, str11);
            }
            r45.a aVar2 = this.f387777m;
            if (aVar2 != null) {
                i18 += b36.f.i(9, aVar2.computeSize());
            }
            java.lang.String str12 = this.f387778n;
            return str12 != null ? i18 + b36.f.j(10, str12) : i18;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        r45.v vVar = (r45.v) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    vVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                vVar.f387771d = aVar4.g(intValue);
                return 0;
            case 3:
                vVar.f387772e = aVar4.k(intValue);
                return 0;
            case 4:
                vVar.f387773f = aVar4.k(intValue);
                return 0;
            case 5:
                vVar.f387774g = aVar4.k(intValue);
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                vVar.f387775h = aVar4.k(intValue);
                return 0;
            case 8:
                vVar.f387776i = aVar4.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.a aVar5 = new r45.a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar5.parseFrom(bArr2);
                    }
                    vVar.f387777m = aVar5;
                }
                return 0;
            case 10:
                vVar.f387778n = aVar4.k(intValue);
                return 0;
        }
    }
}
