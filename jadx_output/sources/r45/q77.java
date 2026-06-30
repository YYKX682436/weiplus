package r45;

/* loaded from: classes7.dex */
public class q77 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.r77 f383750d;

    /* renamed from: e, reason: collision with root package name */
    public r45.r77 f383751e;

    /* renamed from: f, reason: collision with root package name */
    public r45.r77 f383752f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q77)) {
            return false;
        }
        r45.q77 q77Var = (r45.q77) fVar;
        return n51.f.a(this.BaseResponse, q77Var.BaseResponse) && n51.f.a(this.f383750d, q77Var.f383750d) && n51.f.a(this.f383751e, q77Var.f383751e) && n51.f.a(this.f383752f, q77Var.f383752f);
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
            r45.r77 r77Var = this.f383750d;
            if (r77Var != null) {
                fVar.i(2, r77Var.computeSize());
                this.f383750d.writeFields(fVar);
            }
            r45.r77 r77Var2 = this.f383751e;
            if (r77Var2 != null) {
                fVar.i(3, r77Var2.computeSize());
                this.f383751e.writeFields(fVar);
            }
            r45.r77 r77Var3 = this.f383752f;
            if (r77Var3 != null) {
                fVar.i(4, r77Var3.computeSize());
                this.f383752f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.r77 r77Var4 = this.f383750d;
            if (r77Var4 != null) {
                i18 += b36.f.i(2, r77Var4.computeSize());
            }
            r45.r77 r77Var5 = this.f383751e;
            if (r77Var5 != null) {
                i18 += b36.f.i(3, r77Var5.computeSize());
            }
            r45.r77 r77Var6 = this.f383752f;
            return r77Var6 != null ? i18 + b36.f.i(4, r77Var6.computeSize()) : i18;
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
        r45.q77 q77Var = (r45.q77) objArr[1];
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
                q77Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.r77 r77Var7 = new r45.r77();
                if (bArr2 != null && bArr2.length > 0) {
                    r77Var7.parseFrom(bArr2);
                }
                q77Var.f383750d = r77Var7;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.r77 r77Var8 = new r45.r77();
                if (bArr3 != null && bArr3.length > 0) {
                    r77Var8.parseFrom(bArr3);
                }
                q77Var.f383751e = r77Var8;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.r77 r77Var9 = new r45.r77();
            if (bArr4 != null && bArr4.length > 0) {
                r77Var9.parseFrom(bArr4);
            }
            q77Var.f383752f = r77Var9;
        }
        return 0;
    }
}
