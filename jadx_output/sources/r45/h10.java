package r45;

/* loaded from: classes2.dex */
public class h10 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f375745d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375746e;

    /* renamed from: f, reason: collision with root package name */
    public long f375747f;

    /* renamed from: g, reason: collision with root package name */
    public r45.e90 f375748g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h10)) {
            return false;
        }
        r45.h10 h10Var = (r45.h10) fVar;
        return n51.f.a(this.BaseResponse, h10Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f375745d), java.lang.Integer.valueOf(h10Var.f375745d)) && n51.f.a(this.f375746e, h10Var.f375746e) && n51.f.a(java.lang.Long.valueOf(this.f375747f), java.lang.Long.valueOf(h10Var.f375747f)) && n51.f.a(this.f375748g, h10Var.f375748g);
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
            fVar.e(2, this.f375745d);
            java.lang.String str = this.f375746e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f375747f);
            r45.e90 e90Var = this.f375748g;
            if (e90Var != null) {
                fVar.i(5, e90Var.computeSize());
                this.f375748g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f375745d);
            java.lang.String str2 = this.f375746e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int h17 = i18 + b36.f.h(4, this.f375747f);
            r45.e90 e90Var2 = this.f375748g;
            return e90Var2 != null ? h17 + b36.f.i(5, e90Var2.computeSize()) : h17;
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
        r45.h10 h10Var = (r45.h10) objArr[1];
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
                h10Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            h10Var.f375745d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            h10Var.f375746e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            h10Var.f375747f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.e90 e90Var3 = new r45.e90();
            if (bArr2 != null && bArr2.length > 0) {
                e90Var3.parseFrom(bArr2);
            }
            h10Var.f375748g = e90Var3;
        }
        return 0;
    }
}
