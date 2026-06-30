package r45;

/* loaded from: classes4.dex */
public class yi extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f391112d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391113e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391114f;

    /* renamed from: g, reason: collision with root package name */
    public long f391115g;

    /* renamed from: h, reason: collision with root package name */
    public int f391116h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yi)) {
            return false;
        }
        r45.yi yiVar = (r45.yi) fVar;
        return n51.f.a(this.BaseRequest, yiVar.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f391112d), java.lang.Long.valueOf(yiVar.f391112d)) && n51.f.a(this.f391113e, yiVar.f391113e) && n51.f.a(this.f391114f, yiVar.f391114f) && n51.f.a(java.lang.Long.valueOf(this.f391115g), java.lang.Long.valueOf(yiVar.f391115g)) && n51.f.a(java.lang.Integer.valueOf(this.f391116h), java.lang.Integer.valueOf(yiVar.f391116h));
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
            fVar.h(2, this.f391112d);
            java.lang.String str = this.f391113e;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f391114f;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(18, this.f391115g);
            fVar.e(22, this.f391116h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f391112d);
            java.lang.String str3 = this.f391113e;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f391114f;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            return i18 + b36.f.h(18, this.f391115g) + b36.f.e(22, this.f391116h);
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
        r45.yi yiVar = (r45.yi) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                yiVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            yiVar.f391112d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            yiVar.f391113e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            yiVar.f391114f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 18) {
            yiVar.f391115g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 22) {
            return -1;
        }
        yiVar.f391116h = aVar2.g(intValue);
        return 0;
    }
}
