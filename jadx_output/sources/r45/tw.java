package r45;

/* loaded from: classes8.dex */
public class tw extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386826d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386827e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386828f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386829g;

    /* renamed from: h, reason: collision with root package name */
    public int f386830h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tw)) {
            return false;
        }
        r45.tw twVar = (r45.tw) fVar;
        return n51.f.a(this.BaseRequest, twVar.BaseRequest) && n51.f.a(this.f386826d, twVar.f386826d) && n51.f.a(this.f386827e, twVar.f386827e) && n51.f.a(this.f386828f, twVar.f386828f) && n51.f.a(this.f386829g, twVar.f386829g) && n51.f.a(java.lang.Integer.valueOf(this.f386830h), java.lang.Integer.valueOf(twVar.f386830h));
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
            java.lang.String str = this.f386826d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386827e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f386828f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f386829g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f386830h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f386826d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f386827e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f386828f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f386829g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            return i18 + b36.f.e(6, this.f386830h);
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
        r45.tw twVar = (r45.tw) objArr[1];
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
                    twVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                twVar.f386826d = aVar2.k(intValue);
                return 0;
            case 3:
                twVar.f386827e = aVar2.k(intValue);
                return 0;
            case 4:
                twVar.f386828f = aVar2.k(intValue);
                return 0;
            case 5:
                twVar.f386829g = aVar2.k(intValue);
                return 0;
            case 6:
                twVar.f386830h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
