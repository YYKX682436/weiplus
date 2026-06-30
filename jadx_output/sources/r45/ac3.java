package r45;

/* loaded from: classes8.dex */
public class ac3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f369915d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369916e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f369917f;

    /* renamed from: g, reason: collision with root package name */
    public int f369918g;

    /* renamed from: h, reason: collision with root package name */
    public int f369919h;

    /* renamed from: i, reason: collision with root package name */
    public r45.iu f369920i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f369921m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ac3)) {
            return false;
        }
        r45.ac3 ac3Var = (r45.ac3) fVar;
        return n51.f.a(this.BaseResponse, ac3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f369915d), java.lang.Integer.valueOf(ac3Var.f369915d)) && n51.f.a(this.f369916e, ac3Var.f369916e) && n51.f.a(java.lang.Boolean.valueOf(this.f369917f), java.lang.Boolean.valueOf(ac3Var.f369917f)) && n51.f.a(java.lang.Integer.valueOf(this.f369918g), java.lang.Integer.valueOf(ac3Var.f369918g)) && n51.f.a(java.lang.Integer.valueOf(this.f369919h), java.lang.Integer.valueOf(ac3Var.f369919h)) && n51.f.a(this.f369920i, ac3Var.f369920i) && n51.f.a(java.lang.Boolean.valueOf(this.f369921m), java.lang.Boolean.valueOf(ac3Var.f369921m));
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
            fVar.e(2, this.f369915d);
            java.lang.String str = this.f369916e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f369917f);
            fVar.e(5, this.f369918g);
            fVar.e(6, this.f369919h);
            r45.iu iuVar = this.f369920i;
            if (iuVar != null) {
                fVar.i(7, iuVar.computeSize());
                this.f369920i.writeFields(fVar);
            }
            fVar.a(8, this.f369921m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f369915d);
            java.lang.String str2 = this.f369916e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int a17 = i18 + b36.f.a(4, this.f369917f) + b36.f.e(5, this.f369918g) + b36.f.e(6, this.f369919h);
            r45.iu iuVar2 = this.f369920i;
            if (iuVar2 != null) {
                a17 += b36.f.i(7, iuVar2.computeSize());
            }
            return a17 + b36.f.a(8, this.f369921m);
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
        r45.ac3 ac3Var = (r45.ac3) objArr[1];
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
                    ac3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ac3Var.f369915d = aVar2.g(intValue);
                return 0;
            case 3:
                ac3Var.f369916e = aVar2.k(intValue);
                return 0;
            case 4:
                ac3Var.f369917f = aVar2.c(intValue);
                return 0;
            case 5:
                ac3Var.f369918g = aVar2.g(intValue);
                return 0;
            case 6:
                ac3Var.f369919h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr2 != null && bArr2.length > 0) {
                        iuVar3.parseFrom(bArr2);
                    }
                    ac3Var.f369920i = iuVar3;
                }
                return 0;
            case 8:
                ac3Var.f369921m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
