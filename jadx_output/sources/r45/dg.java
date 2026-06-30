package r45;

/* loaded from: classes7.dex */
public class dg extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j14 f372408d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f372409e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372410f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372411g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372412h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dg)) {
            return false;
        }
        r45.dg dgVar = (r45.dg) fVar;
        return n51.f.a(this.BaseResponse, dgVar.BaseResponse) && n51.f.a(this.f372408d, dgVar.f372408d) && n51.f.a(this.f372409e, dgVar.f372409e) && n51.f.a(this.f372410f, dgVar.f372410f) && n51.f.a(this.f372411g, dgVar.f372411g) && n51.f.a(this.f372412h, dgVar.f372412h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372409e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.j14 j14Var = this.f372408d;
            if (j14Var != null) {
                fVar.i(2, j14Var.computeSize());
                this.f372408d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f372410f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f372411g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f372412h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.j14 j14Var2 = this.f372408d;
            if (j14Var2 != null) {
                i18 += b36.f.i(2, j14Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            java.lang.String str4 = this.f372410f;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f372411g;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f372412h;
            return str6 != null ? g17 + b36.f.j(6, str6) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.dg dgVar = (r45.dg) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    dgVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.j14 j14Var3 = new r45.j14();
                    if (bArr3 != null && bArr3.length > 0) {
                        j14Var3.parseFrom(bArr3);
                    }
                    dgVar.f372408d = j14Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.dz dzVar = new r45.dz();
                    if (bArr4 != null && bArr4.length > 0) {
                        dzVar.parseFrom(bArr4);
                    }
                    dgVar.f372409e.add(dzVar);
                }
                return 0;
            case 4:
                dgVar.f372410f = aVar2.k(intValue);
                return 0;
            case 5:
                dgVar.f372411g = aVar2.k(intValue);
                return 0;
            case 6:
                dgVar.f372412h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
