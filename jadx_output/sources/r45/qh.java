package r45;

/* loaded from: classes8.dex */
public class qh extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383983d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383984e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ka5 f383985f;

    /* renamed from: g, reason: collision with root package name */
    public r45.x15 f383986g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qh)) {
            return false;
        }
        r45.qh qhVar = (r45.qh) fVar;
        return n51.f.a(this.BaseResponse, qhVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f383983d), java.lang.Integer.valueOf(qhVar.f383983d)) && n51.f.a(this.f383984e, qhVar.f383984e) && n51.f.a(this.f383985f, qhVar.f383985f) && n51.f.a(this.f383986g, qhVar.f383986g);
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
            fVar.e(2, this.f383983d);
            java.lang.String str = this.f383984e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.ka5 ka5Var = this.f383985f;
            if (ka5Var != null) {
                fVar.i(6, ka5Var.computeSize());
                this.f383985f.writeFields(fVar);
            }
            r45.x15 x15Var = this.f383986g;
            if (x15Var != null) {
                fVar.i(7, x15Var.computeSize());
                this.f383986g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f383983d);
            java.lang.String str2 = this.f383984e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.ka5 ka5Var2 = this.f383985f;
            if (ka5Var2 != null) {
                i18 += b36.f.i(6, ka5Var2.computeSize());
            }
            r45.x15 x15Var2 = this.f383986g;
            return x15Var2 != null ? i18 + b36.f.i(7, x15Var2.computeSize()) : i18;
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
        r45.qh qhVar = (r45.qh) objArr[1];
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
                qhVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qhVar.f383983d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            qhVar.f383984e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.ka5 ka5Var3 = new r45.ka5();
                if (bArr2 != null && bArr2.length > 0) {
                    ka5Var3.parseFrom(bArr2);
                }
                qhVar.f383985f = ka5Var3;
            }
            return 0;
        }
        if (intValue != 7) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.x15 x15Var3 = new r45.x15();
            if (bArr3 != null && bArr3.length > 0) {
                x15Var3.parseFrom(bArr3);
            }
            qhVar.f383986g = x15Var3;
        }
        return 0;
    }
}
