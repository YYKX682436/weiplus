package r45;

/* loaded from: classes8.dex */
public class s07 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385370d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385371e;

    /* renamed from: f, reason: collision with root package name */
    public r45.y07 f385372f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f385373g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s07)) {
            return false;
        }
        r45.s07 s07Var = (r45.s07) fVar;
        return n51.f.a(this.BaseRequest, s07Var.BaseRequest) && n51.f.a(this.f385370d, s07Var.f385370d) && n51.f.a(this.f385371e, s07Var.f385371e) && n51.f.a(this.f385372f, s07Var.f385372f) && n51.f.a(this.f385373g, s07Var.f385373g);
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
            java.lang.String str = this.f385370d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f385371e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.y07 y07Var = this.f385372f;
            if (y07Var != null) {
                fVar.i(4, y07Var.computeSize());
                this.f385372f.writeFields(fVar);
            }
            fVar.g(5, 8, this.f385373g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f385370d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f385371e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.y07 y07Var2 = this.f385372f;
            if (y07Var2 != null) {
                i18 += b36.f.i(4, y07Var2.computeSize());
            }
            return i18 + b36.f.g(5, 8, this.f385373g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f385373g.clear();
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
        r45.s07 s07Var = (r45.s07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                s07Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            s07Var.f385370d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            s07Var.f385371e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.y07 y07Var3 = new r45.y07();
                if (bArr3 != null && bArr3.length > 0) {
                    y07Var3.parseFrom(bArr3);
                }
                s07Var.f385372f = y07Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.r07 r07Var = new r45.r07();
            if (bArr4 != null && bArr4.length > 0) {
                r07Var.parseFrom(bArr4);
            }
            s07Var.f385373g.add(r07Var);
        }
        return 0;
    }
}
