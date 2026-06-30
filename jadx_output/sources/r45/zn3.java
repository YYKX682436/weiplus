package r45;

/* loaded from: classes2.dex */
public class zn3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392238d;

    /* renamed from: e, reason: collision with root package name */
    public int f392239e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392240f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392241g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zn3)) {
            return false;
        }
        r45.zn3 zn3Var = (r45.zn3) fVar;
        return n51.f.a(this.BaseRequest, zn3Var.BaseRequest) && n51.f.a(this.f392238d, zn3Var.f392238d) && n51.f.a(java.lang.Integer.valueOf(this.f392239e), java.lang.Integer.valueOf(zn3Var.f392239e)) && n51.f.a(this.f392240f, zn3Var.f392240f) && n51.f.a(this.f392241g, zn3Var.f392241g);
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
            java.lang.String str = this.f392238d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f392239e);
            java.lang.String str2 = this.f392240f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f392241g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f392238d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f392239e);
            java.lang.String str5 = this.f392240f;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f392241g;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
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
        r45.zn3 zn3Var = (r45.zn3) objArr[1];
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
                zn3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            zn3Var.f392238d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zn3Var.f392239e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            zn3Var.f392240f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        zn3Var.f392241g = aVar2.k(intValue);
        return 0;
    }
}
