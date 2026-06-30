package mj0;

/* loaded from: classes8.dex */
public class e extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f326992d;

    /* renamed from: e, reason: collision with root package name */
    public int f326993e;

    /* renamed from: f, reason: collision with root package name */
    public int f326994f;

    /* renamed from: g, reason: collision with root package name */
    public int f326995g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f326996h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f326997i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof mj0.e)) {
            return false;
        }
        mj0.e eVar = (mj0.e) fVar;
        return n51.f.a(this.BaseRequest, eVar.BaseRequest) && n51.f.a(this.f326992d, eVar.f326992d) && n51.f.a(java.lang.Integer.valueOf(this.f326993e), java.lang.Integer.valueOf(eVar.f326993e)) && n51.f.a(java.lang.Integer.valueOf(this.f326994f), java.lang.Integer.valueOf(eVar.f326994f)) && n51.f.a(java.lang.Integer.valueOf(this.f326995g), java.lang.Integer.valueOf(eVar.f326995g)) && n51.f.a(this.f326996h, eVar.f326996h) && n51.f.a(this.f326997i, eVar.f326997i);
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
            java.lang.String str = this.f326992d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f326993e);
            fVar.e(4, this.f326994f);
            fVar.e(5, this.f326995g);
            java.lang.String str2 = this.f326996h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f326997i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f326992d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f326993e) + b36.f.e(4, this.f326994f) + b36.f.e(5, this.f326995g);
            java.lang.String str5 = this.f326996h;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f326997i;
            return str6 != null ? e17 + b36.f.j(7, str6) : e17;
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
        mj0.e eVar = (mj0.e) objArr[1];
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
                    eVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                eVar.f326992d = aVar2.k(intValue);
                return 0;
            case 3:
                eVar.f326993e = aVar2.g(intValue);
                return 0;
            case 4:
                eVar.f326994f = aVar2.g(intValue);
                return 0;
            case 5:
                eVar.f326995g = aVar2.g(intValue);
                return 0;
            case 6:
                eVar.f326996h = aVar2.k(intValue);
                return 0;
            case 7:
                eVar.f326997i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
