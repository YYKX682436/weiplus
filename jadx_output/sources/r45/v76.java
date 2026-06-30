package r45;

/* loaded from: classes4.dex */
public class v76 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387971d;

    /* renamed from: e, reason: collision with root package name */
    public long f387972e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387973f;

    /* renamed from: g, reason: collision with root package name */
    public int f387974g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v76)) {
            return false;
        }
        r45.v76 v76Var = (r45.v76) fVar;
        return n51.f.a(this.BaseRequest, v76Var.BaseRequest) && n51.f.a(this.f387971d, v76Var.f387971d) && n51.f.a(java.lang.Long.valueOf(this.f387972e), java.lang.Long.valueOf(v76Var.f387972e)) && n51.f.a(this.f387973f, v76Var.f387973f) && n51.f.a(java.lang.Integer.valueOf(this.f387974g), java.lang.Integer.valueOf(v76Var.f387974g));
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
            java.lang.String str = this.f387971d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f387972e);
            java.lang.String str2 = this.f387973f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f387974g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f387971d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int h17 = i18 + b36.f.h(3, this.f387972e);
            java.lang.String str4 = this.f387973f;
            if (str4 != null) {
                h17 += b36.f.j(4, str4);
            }
            return h17 + b36.f.e(5, this.f387974g);
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
        r45.v76 v76Var = (r45.v76) objArr[1];
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
                v76Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            v76Var.f387971d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            v76Var.f387972e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            v76Var.f387973f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        v76Var.f387974g = aVar2.g(intValue);
        return 0;
    }
}
