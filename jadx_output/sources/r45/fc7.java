package r45;

/* loaded from: classes7.dex */
public class fc7 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374210d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374211e;

    /* renamed from: f, reason: collision with root package name */
    public int f374212f;

    /* renamed from: g, reason: collision with root package name */
    public int f374213g;

    /* renamed from: h, reason: collision with root package name */
    public int f374214h;

    /* renamed from: i, reason: collision with root package name */
    public int f374215i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374216m;

    /* renamed from: n, reason: collision with root package name */
    public r45.tt3 f374217n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fc7)) {
            return false;
        }
        r45.fc7 fc7Var = (r45.fc7) fVar;
        return n51.f.a(this.BaseResponse, fc7Var.BaseResponse) && n51.f.a(this.f374210d, fc7Var.f374210d) && n51.f.a(this.f374211e, fc7Var.f374211e) && n51.f.a(java.lang.Integer.valueOf(this.f374212f), java.lang.Integer.valueOf(fc7Var.f374212f)) && n51.f.a(java.lang.Integer.valueOf(this.f374213g), java.lang.Integer.valueOf(fc7Var.f374213g)) && n51.f.a(java.lang.Integer.valueOf(this.f374214h), java.lang.Integer.valueOf(fc7Var.f374214h)) && n51.f.a(java.lang.Integer.valueOf(this.f374215i), java.lang.Integer.valueOf(fc7Var.f374215i)) && n51.f.a(this.f374216m, fc7Var.f374216m) && n51.f.a(this.f374217n, fc7Var.f374217n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f374210d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374211e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f374212f);
            fVar.e(5, this.f374213g);
            fVar.e(6, this.f374214h);
            fVar.e(7, this.f374215i);
            java.lang.String str3 = this.f374216m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            r45.tt3 tt3Var = this.f374217n;
            if (tt3Var != null) {
                fVar.i(9, tt3Var.computeSize());
                this.f374217n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f374210d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f374211e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f374212f) + b36.f.e(5, this.f374213g) + b36.f.e(6, this.f374214h) + b36.f.e(7, this.f374215i);
            java.lang.String str6 = this.f374216m;
            if (str6 != null) {
                e17 += b36.f.j(8, str6);
            }
            r45.tt3 tt3Var2 = this.f374217n;
            return tt3Var2 != null ? e17 + b36.f.i(9, tt3Var2.computeSize()) : e17;
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
        r45.fc7 fc7Var = (r45.fc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    fc7Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                fc7Var.f374210d = aVar2.k(intValue);
                return 0;
            case 3:
                fc7Var.f374211e = aVar2.k(intValue);
                return 0;
            case 4:
                fc7Var.f374212f = aVar2.g(intValue);
                return 0;
            case 5:
                fc7Var.f374213g = aVar2.g(intValue);
                return 0;
            case 6:
                fc7Var.f374214h = aVar2.g(intValue);
                return 0;
            case 7:
                fc7Var.f374215i = aVar2.g(intValue);
                return 0;
            case 8:
                fc7Var.f374216m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.tt3 tt3Var3 = new r45.tt3();
                    if (bArr2 != null && bArr2.length > 0) {
                        tt3Var3.parseFrom(bArr2);
                    }
                    fc7Var.f374217n = tt3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
