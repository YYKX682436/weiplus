package r45;

/* loaded from: classes11.dex */
public class df extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f372369d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.pd6 f372370e;

    /* renamed from: f, reason: collision with root package name */
    public int f372371f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.df)) {
            return false;
        }
        r45.df dfVar = (r45.df) fVar;
        return n51.f.a(this.BaseRequest, dfVar.BaseRequest) && n51.f.a(this.f372369d, dfVar.f372369d) && n51.f.a(this.f372370e, dfVar.f372370e) && n51.f.a(java.lang.Integer.valueOf(this.f372371f), java.lang.Integer.valueOf(dfVar.f372371f));
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
            fVar.g(2, 8, this.f372369d);
            r45.pd6 pd6Var = this.f372370e;
            if (pd6Var != null) {
                fVar.i(3, pd6Var.computeSize());
                this.f372370e.writeFields(fVar);
            }
            fVar.e(4, this.f372371f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 8, this.f372369d);
            r45.pd6 pd6Var2 = this.f372370e;
            if (pd6Var2 != null) {
                i18 += b36.f.i(3, pd6Var2.computeSize());
            }
            return i18 + b36.f.e(4, this.f372371f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f372369d.clear();
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
        r45.df dfVar = (r45.df) objArr[1];
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
                dfVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.wu wuVar = new r45.wu();
                if (bArr3 != null && bArr3.length > 0) {
                    wuVar.parseFrom(bArr3);
                }
                dfVar.f372369d.add(wuVar);
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            dfVar.f372371f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.pd6 pd6Var3 = new r45.pd6();
            if (bArr4 != null && bArr4.length > 0) {
                pd6Var3.parseFrom(bArr4);
            }
            dfVar.f372370e = pd6Var3;
        }
        return 0;
    }
}
