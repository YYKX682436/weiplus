package r45;

/* loaded from: classes4.dex */
public class qe6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383916d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f383917e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public long f383918f;

    /* renamed from: g, reason: collision with root package name */
    public int f383919g;

    /* renamed from: h, reason: collision with root package name */
    public int f383920h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qe6)) {
            return false;
        }
        r45.qe6 qe6Var = (r45.qe6) fVar;
        return n51.f.a(this.BaseResponse, qe6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f383916d), java.lang.Integer.valueOf(qe6Var.f383916d)) && n51.f.a(this.f383917e, qe6Var.f383917e) && n51.f.a(java.lang.Long.valueOf(this.f383918f), java.lang.Long.valueOf(qe6Var.f383918f)) && n51.f.a(java.lang.Integer.valueOf(this.f383919g), java.lang.Integer.valueOf(qe6Var.f383919g)) && n51.f.a(java.lang.Integer.valueOf(this.f383920h), java.lang.Integer.valueOf(qe6Var.f383920h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383917e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f383916d);
            fVar.g(3, 8, linkedList);
            fVar.h(4, this.f383918f);
            fVar.e(5, this.f383919g);
            fVar.e(6, this.f383920h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f383916d) + b36.f.g(3, 8, linkedList) + b36.f.h(4, this.f383918f) + b36.f.e(5, this.f383919g) + b36.f.e(6, this.f383920h);
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
        r45.qe6 qe6Var = (r45.qe6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    qe6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                qe6Var.f383916d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.df6 df6Var = new r45.df6();
                    if (bArr3 != null && bArr3.length > 0) {
                        df6Var.parseFrom(bArr3);
                    }
                    qe6Var.f383917e.add(df6Var);
                }
                return 0;
            case 4:
                qe6Var.f383918f = aVar2.i(intValue);
                return 0;
            case 5:
                qe6Var.f383919g = aVar2.g(intValue);
                return 0;
            case 6:
                qe6Var.f383920h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
