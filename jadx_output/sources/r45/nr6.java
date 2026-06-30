package r45;

/* loaded from: classes2.dex */
public class nr6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ae f381631d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381632e;

    /* renamed from: f, reason: collision with root package name */
    public long f381633f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nr6)) {
            return false;
        }
        r45.nr6 nr6Var = (r45.nr6) fVar;
        return n51.f.a(this.BaseRequest, nr6Var.BaseRequest) && n51.f.a(this.f381631d, nr6Var.f381631d) && n51.f.a(this.f381632e, nr6Var.f381632e) && n51.f.a(java.lang.Long.valueOf(this.f381633f), java.lang.Long.valueOf(nr6Var.f381633f));
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
            r45.ae aeVar = this.f381631d;
            if (aeVar != null) {
                fVar.i(2, aeVar.computeSize());
                this.f381631d.writeFields(fVar);
            }
            java.lang.String str = this.f381632e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f381633f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.ae aeVar2 = this.f381631d;
            if (aeVar2 != null) {
                i18 += b36.f.i(2, aeVar2.computeSize());
            }
            java.lang.String str2 = this.f381632e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.h(4, this.f381633f);
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
        r45.nr6 nr6Var = (r45.nr6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                nr6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                nr6Var.f381632e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            nr6Var.f381633f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ae aeVar3 = new r45.ae();
            if (bArr2 != null && bArr2.length > 0) {
                aeVar3.parseFrom(bArr2);
            }
            nr6Var.f381631d = aeVar3;
        }
        return 0;
    }
}
