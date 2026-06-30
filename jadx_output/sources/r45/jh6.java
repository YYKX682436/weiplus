package r45;

/* loaded from: classes4.dex */
public class jh6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377814d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f377815e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377816f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377817g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377818h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jh6)) {
            return false;
        }
        r45.jh6 jh6Var = (r45.jh6) fVar;
        return n51.f.a(this.BaseRequest, jh6Var.BaseRequest) && n51.f.a(this.f377814d, jh6Var.f377814d) && n51.f.a(this.f377815e, jh6Var.f377815e) && n51.f.a(this.f377816f, jh6Var.f377816f) && n51.f.a(this.f377817g, jh6Var.f377817g) && n51.f.a(this.f377818h, jh6Var.f377818h);
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
            java.lang.String str = this.f377814d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 2, this.f377815e);
            java.lang.String str2 = this.f377816f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f377817g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f377818h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f377814d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int g17 = i18 + b36.f.g(3, 2, this.f377815e);
            java.lang.String str6 = this.f377816f;
            if (str6 != null) {
                g17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f377817g;
            if (str7 != null) {
                g17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f377818h;
            return str8 != null ? g17 + b36.f.j(6, str8) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377815e.clear();
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
        r45.jh6 jh6Var = (r45.jh6) objArr[1];
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
                    jh6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                jh6Var.f377814d = aVar2.k(intValue);
                return 0;
            case 3:
                jh6Var.f377815e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 4:
                jh6Var.f377816f = aVar2.k(intValue);
                return 0;
            case 5:
                jh6Var.f377817g = aVar2.k(intValue);
                return 0;
            case 6:
                jh6Var.f377818h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
