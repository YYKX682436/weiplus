package r45;

/* loaded from: classes2.dex */
public class oj5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382302d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382303e;

    /* renamed from: f, reason: collision with root package name */
    public int f382304f;

    /* renamed from: g, reason: collision with root package name */
    public r45.yt5 f382305g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oj5)) {
            return false;
        }
        r45.oj5 oj5Var = (r45.oj5) fVar;
        return n51.f.a(this.BaseResponse, oj5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f382302d), java.lang.Integer.valueOf(oj5Var.f382302d)) && n51.f.a(this.f382303e, oj5Var.f382303e) && n51.f.a(java.lang.Integer.valueOf(this.f382304f), java.lang.Integer.valueOf(oj5Var.f382304f)) && n51.f.a(this.f382305g, oj5Var.f382305g);
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
            fVar.e(2, this.f382302d);
            java.lang.String str = this.f382303e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f382304f);
            r45.yt5 yt5Var = this.f382305g;
            if (yt5Var != null) {
                fVar.i(5, yt5Var.computeSize());
                this.f382305g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f382302d);
            java.lang.String str2 = this.f382303e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f382304f);
            r45.yt5 yt5Var2 = this.f382305g;
            return yt5Var2 != null ? e17 + b36.f.i(5, yt5Var2.computeSize()) : e17;
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
        r45.oj5 oj5Var = (r45.oj5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                oj5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            oj5Var.f382302d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            oj5Var.f382303e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            oj5Var.f382304f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.yt5 yt5Var3 = new r45.yt5();
            if (bArr2 != null && bArr2.length > 0) {
                yt5Var3.parseFrom(bArr2);
            }
            oj5Var.f382305g = yt5Var3;
        }
        return 0;
    }
}
