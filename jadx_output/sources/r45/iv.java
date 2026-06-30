package r45;

/* loaded from: classes4.dex */
public class iv extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377349d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377350e;

    /* renamed from: f, reason: collision with root package name */
    public int f377351f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f377352g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iv)) {
            return false;
        }
        r45.iv ivVar = (r45.iv) fVar;
        return n51.f.a(this.BaseRequest, ivVar.BaseRequest) && n51.f.a(this.f377349d, ivVar.f377349d) && n51.f.a(this.f377350e, ivVar.f377350e) && n51.f.a(java.lang.Integer.valueOf(this.f377351f), java.lang.Integer.valueOf(ivVar.f377351f)) && n51.f.a(this.f377352g, ivVar.f377352g);
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
            java.lang.String str = this.f377349d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f377350e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f377351f);
            fVar.g(5, 1, this.f377352g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f377349d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f377350e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f377351f) + b36.f.g(5, 1, this.f377352g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377352g.clear();
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
        r45.iv ivVar = (r45.iv) objArr[1];
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
                ivVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ivVar.f377349d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ivVar.f377350e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ivVar.f377351f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ivVar.f377352g.add(aVar2.k(intValue));
        return 0;
    }
}
