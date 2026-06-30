package r45;

/* loaded from: classes2.dex */
public class sb5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385610d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385612f;

    /* renamed from: g, reason: collision with root package name */
    public int f385613g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385614h;

    /* renamed from: m, reason: collision with root package name */
    public int f385616m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f385611e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f385615i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sb5)) {
            return false;
        }
        r45.sb5 sb5Var = (r45.sb5) fVar;
        return n51.f.a(this.BaseResponse, sb5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385610d), java.lang.Integer.valueOf(sb5Var.f385610d)) && n51.f.a(this.f385611e, sb5Var.f385611e) && n51.f.a(this.f385612f, sb5Var.f385612f) && n51.f.a(java.lang.Integer.valueOf(this.f385613g), java.lang.Integer.valueOf(sb5Var.f385613g)) && n51.f.a(this.f385614h, sb5Var.f385614h) && n51.f.a(this.f385615i, sb5Var.f385615i) && n51.f.a(java.lang.Integer.valueOf(this.f385616m), java.lang.Integer.valueOf(sb5Var.f385616m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385615i;
        java.util.LinkedList linkedList2 = this.f385611e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f385610d);
            fVar.g(3, 8, linkedList2);
            java.lang.String str = this.f385612f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f385613g);
            java.lang.String str2 = this.f385614h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f385616m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385610d) + b36.f.g(3, 8, linkedList2);
            java.lang.String str3 = this.f385612f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f385613g);
            java.lang.String str4 = this.f385614h;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f385616m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.sb5 sb5Var = (r45.sb5) objArr[1];
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
                    sb5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                sb5Var.f385610d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.gm0 gm0Var = new r45.gm0();
                    if (bArr3 != null && bArr3.length > 0) {
                        gm0Var.parseFrom(bArr3);
                    }
                    sb5Var.f385611e.add(gm0Var);
                }
                return 0;
            case 4:
                sb5Var.f385612f = aVar2.k(intValue);
                return 0;
            case 5:
                sb5Var.f385613g = aVar2.g(intValue);
                return 0;
            case 6:
                sb5Var.f385614h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.n1 n1Var = new r45.n1();
                    if (bArr4 != null && bArr4.length > 0) {
                        n1Var.parseFrom(bArr4);
                    }
                    sb5Var.f385615i.add(n1Var);
                }
                return 0;
            case 8:
                sb5Var.f385616m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
