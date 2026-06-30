package r45;

/* loaded from: classes2.dex */
public class xm extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390220d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390221e;

    /* renamed from: f, reason: collision with root package name */
    public r45.gi5 f390222f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xm)) {
            return false;
        }
        r45.xm xmVar = (r45.xm) fVar;
        return n51.f.a(this.BaseResponse, xmVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f390220d), java.lang.Integer.valueOf(xmVar.f390220d)) && n51.f.a(this.f390221e, xmVar.f390221e) && n51.f.a(this.f390222f, xmVar.f390222f);
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
            fVar.e(2, this.f390220d);
            com.tencent.mm.protobuf.g gVar = this.f390221e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.gi5 gi5Var = this.f390222f;
            if (gi5Var != null) {
                fVar.i(4, gi5Var.computeSize());
                this.f390222f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f390220d);
            com.tencent.mm.protobuf.g gVar2 = this.f390221e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            r45.gi5 gi5Var2 = this.f390222f;
            return gi5Var2 != null ? i18 + b36.f.i(4, gi5Var2.computeSize()) : i18;
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
        r45.xm xmVar = (r45.xm) objArr[1];
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
                xmVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            xmVar.f390220d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            xmVar.f390221e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.gi5 gi5Var3 = new r45.gi5();
            if (bArr2 != null && bArr2.length > 0) {
                gi5Var3.parseFrom(bArr2);
            }
            xmVar.f390222f = gi5Var3;
        }
        return 0;
    }
}
