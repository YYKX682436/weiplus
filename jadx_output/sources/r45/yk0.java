package r45;

/* loaded from: classes8.dex */
public class yk0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391172d;

    /* renamed from: e, reason: collision with root package name */
    public r45.h05 f391173e;

    /* renamed from: f, reason: collision with root package name */
    public r45.k05 f391174f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yk0)) {
            return false;
        }
        r45.yk0 yk0Var = (r45.yk0) fVar;
        return n51.f.a(this.BaseResponse, yk0Var.BaseResponse) && n51.f.a(this.f391172d, yk0Var.f391172d) && n51.f.a(this.f391173e, yk0Var.f391173e) && n51.f.a(this.f391174f, yk0Var.f391174f);
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
            java.lang.String str = this.f391172d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.h05 h05Var = this.f391173e;
            if (h05Var != null) {
                fVar.i(3, h05Var.computeSize());
                this.f391173e.writeFields(fVar);
            }
            r45.k05 k05Var = this.f391174f;
            if (k05Var != null) {
                fVar.i(4, k05Var.computeSize());
                this.f391174f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f391172d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.h05 h05Var2 = this.f391173e;
            if (h05Var2 != null) {
                i18 += b36.f.i(3, h05Var2.computeSize());
            }
            r45.k05 k05Var2 = this.f391174f;
            return k05Var2 != null ? i18 + b36.f.i(4, k05Var2.computeSize()) : i18;
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
        r45.yk0 yk0Var = (r45.yk0) objArr[1];
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
                yk0Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            yk0Var.f391172d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.h05 h05Var3 = new r45.h05();
                if (bArr2 != null && bArr2.length > 0) {
                    h05Var3.parseFrom(bArr2);
                }
                yk0Var.f391173e = h05Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.k05 k05Var3 = new r45.k05();
            if (bArr3 != null && bArr3.length > 0) {
                k05Var3.parseFrom(bArr3);
            }
            yk0Var.f391174f = k05Var3;
        }
        return 0;
    }
}
