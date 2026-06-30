package r45;

/* loaded from: classes8.dex */
public class mn5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380694d;

    /* renamed from: e, reason: collision with root package name */
    public r45.vt4 f380695e;

    /* renamed from: f, reason: collision with root package name */
    public int f380696f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mn5)) {
            return false;
        }
        r45.mn5 mn5Var = (r45.mn5) fVar;
        return n51.f.a(this.BaseResponse, mn5Var.BaseResponse) && n51.f.a(this.f380694d, mn5Var.f380694d) && n51.f.a(this.f380695e, mn5Var.f380695e) && n51.f.a(java.lang.Integer.valueOf(this.f380696f), java.lang.Integer.valueOf(mn5Var.f380696f));
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
            java.lang.String str = this.f380694d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.vt4 vt4Var = this.f380695e;
            if (vt4Var != null) {
                fVar.i(3, vt4Var.computeSize());
                this.f380695e.writeFields(fVar);
            }
            fVar.e(4, this.f380696f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f380694d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.vt4 vt4Var2 = this.f380695e;
            if (vt4Var2 != null) {
                i18 += b36.f.i(3, vt4Var2.computeSize());
            }
            return i18 + b36.f.e(4, this.f380696f);
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
        r45.mn5 mn5Var = (r45.mn5) objArr[1];
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
                mn5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            mn5Var.f380694d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            mn5Var.f380696f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.vt4 vt4Var3 = new r45.vt4();
            if (bArr2 != null && bArr2.length > 0) {
                vt4Var3.parseFrom(bArr2);
            }
            mn5Var.f380695e = vt4Var3;
        }
        return 0;
    }
}
