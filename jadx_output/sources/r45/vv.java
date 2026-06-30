package r45;

/* loaded from: classes8.dex */
public class vv extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388593d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388594e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388595f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388596g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f388597h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f388598i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vv)) {
            return false;
        }
        r45.vv vvVar = (r45.vv) fVar;
        return n51.f.a(this.BaseResponse, vvVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f388593d), java.lang.Integer.valueOf(vvVar.f388593d)) && n51.f.a(this.f388594e, vvVar.f388594e) && n51.f.a(this.f388595f, vvVar.f388595f) && n51.f.a(this.f388596g, vvVar.f388596g) && n51.f.a(this.f388597h, vvVar.f388597h) && n51.f.a(java.lang.Integer.valueOf(this.f388598i), java.lang.Integer.valueOf(vvVar.f388598i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388597h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f388593d);
            java.lang.String str = this.f388594e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f388595f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f388596g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f388598i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f388593d);
            java.lang.String str4 = this.f388594e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f388595f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f388596g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            return i18 + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f388598i);
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
        r45.vv vvVar = (r45.vv) objArr[1];
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
                    vvVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                vvVar.f388593d = aVar2.g(intValue);
                return 0;
            case 3:
                vvVar.f388594e = aVar2.k(intValue);
                return 0;
            case 4:
                vvVar.f388595f = aVar2.k(intValue);
                return 0;
            case 5:
                vvVar.f388596g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.sn0 sn0Var = new r45.sn0();
                    if (bArr3 != null && bArr3.length > 0) {
                        sn0Var.parseFrom(bArr3);
                    }
                    vvVar.f388597h.add(sn0Var);
                }
                return 0;
            case 7:
                vvVar.f388598i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
