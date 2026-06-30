package r45;

/* loaded from: classes4.dex */
public class ki extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378705d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378706e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378707f;

    /* renamed from: g, reason: collision with root package name */
    public long f378708g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ki)) {
            return false;
        }
        r45.ki kiVar = (r45.ki) fVar;
        return n51.f.a(this.BaseRequest, kiVar.BaseRequest) && n51.f.a(this.f378705d, kiVar.f378705d) && n51.f.a(this.f378706e, kiVar.f378706e) && n51.f.a(this.f378707f, kiVar.f378707f) && n51.f.a(java.lang.Long.valueOf(this.f378708g), java.lang.Long.valueOf(kiVar.f378708g));
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
            java.lang.String str = this.f378705d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378706e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f378707f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.h(5, this.f378708g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f378705d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f378706e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f378707f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            return i18 + b36.f.h(5, this.f378708g);
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
        r45.ki kiVar = (r45.ki) objArr[1];
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
                kiVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            kiVar.f378705d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            kiVar.f378706e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            kiVar.f378707f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        kiVar.f378708g = aVar2.i(intValue);
        return 0;
    }
}
