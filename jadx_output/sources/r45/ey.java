package r45;

/* loaded from: classes8.dex */
public class ey extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373794d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373795e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373796f;

    /* renamed from: g, reason: collision with root package name */
    public int f373797g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373798h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373799i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ey)) {
            return false;
        }
        r45.ey eyVar = (r45.ey) fVar;
        return n51.f.a(this.BaseRequest, eyVar.BaseRequest) && n51.f.a(this.f373794d, eyVar.f373794d) && n51.f.a(this.f373795e, eyVar.f373795e) && n51.f.a(this.f373796f, eyVar.f373796f) && n51.f.a(java.lang.Integer.valueOf(this.f373797g), java.lang.Integer.valueOf(eyVar.f373797g)) && n51.f.a(this.f373798h, eyVar.f373798h) && n51.f.a(this.f373799i, eyVar.f373799i);
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
            java.lang.String str = this.f373794d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f373795e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f373796f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f373797g);
            java.lang.String str4 = this.f373798h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f373799i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f373794d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f373795e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f373796f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            int e17 = i18 + b36.f.e(5, this.f373797g);
            java.lang.String str9 = this.f373798h;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f373799i;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        r45.ey eyVar = (r45.ey) objArr[1];
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
                    eyVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                eyVar.f373794d = aVar2.k(intValue);
                return 0;
            case 3:
                eyVar.f373795e = aVar2.k(intValue);
                return 0;
            case 4:
                eyVar.f373796f = aVar2.k(intValue);
                return 0;
            case 5:
                eyVar.f373797g = aVar2.g(intValue);
                return 0;
            case 6:
                eyVar.f373798h = aVar2.k(intValue);
                return 0;
            case 7:
                eyVar.f373799i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
