package r45;

/* loaded from: classes4.dex */
public class mz extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380936d;

    /* renamed from: e, reason: collision with root package name */
    public r45.oh f380937e;

    /* renamed from: f, reason: collision with root package name */
    public r45.j8 f380938f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mz)) {
            return false;
        }
        r45.mz mzVar = (r45.mz) fVar;
        return n51.f.a(this.BaseResponse, mzVar.BaseResponse) && n51.f.a(this.f380936d, mzVar.f380936d) && n51.f.a(this.f380937e, mzVar.f380937e) && n51.f.a(this.f380938f, mzVar.f380938f);
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
            java.lang.String str = this.f380936d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.oh ohVar = this.f380937e;
            if (ohVar != null) {
                fVar.i(3, ohVar.computeSize());
                this.f380937e.writeFields(fVar);
            }
            r45.j8 j8Var = this.f380938f;
            if (j8Var != null) {
                fVar.i(4, j8Var.computeSize());
                this.f380938f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f380936d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.oh ohVar2 = this.f380937e;
            if (ohVar2 != null) {
                i18 += b36.f.i(3, ohVar2.computeSize());
            }
            r45.j8 j8Var2 = this.f380938f;
            return j8Var2 != null ? i18 + b36.f.i(4, j8Var2.computeSize()) : i18;
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
        r45.mz mzVar = (r45.mz) objArr[1];
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
                mzVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            mzVar.f380936d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.oh ohVar3 = new r45.oh();
                if (bArr2 != null && bArr2.length > 0) {
                    ohVar3.parseFrom(bArr2);
                }
                mzVar.f380937e = ohVar3;
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
            r45.j8 j8Var3 = new r45.j8();
            if (bArr3 != null && bArr3.length > 0) {
                j8Var3.parseFrom(bArr3);
            }
            mzVar.f380938f = j8Var3;
        }
        return 0;
    }
}
