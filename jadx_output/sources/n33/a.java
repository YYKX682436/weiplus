package n33;

/* loaded from: classes4.dex */
public class a extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f334477d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f334478e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f334479f;

    /* renamed from: g, reason: collision with root package name */
    public long f334480g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof n33.a)) {
            return false;
        }
        n33.a aVar = (n33.a) fVar;
        return n51.f.a(this.BaseRequest, aVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f334477d), java.lang.Integer.valueOf(aVar.f334477d)) && n51.f.a(this.f334478e, aVar.f334478e) && n51.f.a(this.f334479f, aVar.f334479f) && n51.f.a(java.lang.Long.valueOf(this.f334480g), java.lang.Long.valueOf(aVar.f334480g));
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
            fVar.e(2, this.f334477d);
            java.lang.String str = this.f334478e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f334479f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f334480g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f334477d);
            java.lang.String str3 = this.f334478e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f334479f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.h(5, this.f334480g);
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
        n33.a aVar3 = (n33.a) objArr[1];
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
                aVar3.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            aVar3.f334477d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            aVar3.f334478e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            aVar3.f334479f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        aVar3.f334480g = aVar2.i(intValue);
        return 0;
    }
}
