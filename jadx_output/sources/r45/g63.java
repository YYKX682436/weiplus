package r45;

/* loaded from: classes4.dex */
public class g63 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f374912d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f374913e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374914f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374915g;

    /* renamed from: h, reason: collision with root package name */
    public int f374916h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g63)) {
            return false;
        }
        r45.g63 g63Var = (r45.g63) fVar;
        return n51.f.a(this.BaseRequest, g63Var.BaseRequest) && n51.f.a(this.f374912d, g63Var.f374912d) && n51.f.a(this.f374913e, g63Var.f374913e) && n51.f.a(this.f374914f, g63Var.f374914f) && n51.f.a(this.f374915g, g63Var.f374915g) && n51.f.a(java.lang.Integer.valueOf(this.f374916h), java.lang.Integer.valueOf(g63Var.f374916h));
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
            fVar.g(2, 1, this.f374912d);
            fVar.g(3, 1, this.f374913e);
            java.lang.String str = this.f374914f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f374915g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f374916h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 1, this.f374912d) + b36.f.g(3, 1, this.f374913e);
            java.lang.String str3 = this.f374914f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f374915g;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            return i18 + b36.f.e(6, this.f374916h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f374912d.clear();
            this.f374913e.clear();
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
        r45.g63 g63Var = (r45.g63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    g63Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                g63Var.f374912d.add(aVar2.k(intValue));
                return 0;
            case 3:
                g63Var.f374913e.add(aVar2.k(intValue));
                return 0;
            case 4:
                g63Var.f374914f = aVar2.k(intValue);
                return 0;
            case 5:
                g63Var.f374915g = aVar2.k(intValue);
                return 0;
            case 6:
                g63Var.f374916h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
