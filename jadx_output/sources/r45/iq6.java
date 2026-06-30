package r45;

/* loaded from: classes8.dex */
public class iq6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377271d;

    /* renamed from: e, reason: collision with root package name */
    public int f377272e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377273f;

    /* renamed from: g, reason: collision with root package name */
    public r45.h05 f377274g;

    /* renamed from: h, reason: collision with root package name */
    public r45.k05 f377275h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iq6)) {
            return false;
        }
        r45.iq6 iq6Var = (r45.iq6) fVar;
        return n51.f.a(this.BaseResponse, iq6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f377271d), java.lang.Integer.valueOf(iq6Var.f377271d)) && n51.f.a(java.lang.Integer.valueOf(this.f377272e), java.lang.Integer.valueOf(iq6Var.f377272e)) && n51.f.a(this.f377273f, iq6Var.f377273f) && n51.f.a(this.f377274g, iq6Var.f377274g) && n51.f.a(this.f377275h, iq6Var.f377275h);
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
            fVar.e(2, this.f377271d);
            fVar.e(3, this.f377272e);
            java.lang.String str = this.f377273f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.h05 h05Var = this.f377274g;
            if (h05Var != null) {
                fVar.i(5, h05Var.computeSize());
                this.f377274g.writeFields(fVar);
            }
            r45.k05 k05Var = this.f377275h;
            if (k05Var != null) {
                fVar.i(6, k05Var.computeSize());
                this.f377275h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f377271d) + b36.f.e(3, this.f377272e);
            java.lang.String str2 = this.f377273f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            r45.h05 h05Var2 = this.f377274g;
            if (h05Var2 != null) {
                i18 += b36.f.i(5, h05Var2.computeSize());
            }
            r45.k05 k05Var2 = this.f377275h;
            return k05Var2 != null ? i18 + b36.f.i(6, k05Var2.computeSize()) : i18;
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
        r45.iq6 iq6Var = (r45.iq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    iq6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                iq6Var.f377271d = aVar2.g(intValue);
                return 0;
            case 3:
                iq6Var.f377272e = aVar2.g(intValue);
                return 0;
            case 4:
                iq6Var.f377273f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.h05 h05Var3 = new r45.h05();
                    if (bArr2 != null && bArr2.length > 0) {
                        h05Var3.parseFrom(bArr2);
                    }
                    iq6Var.f377274g = h05Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.k05 k05Var3 = new r45.k05();
                    if (bArr3 != null && bArr3.length > 0) {
                        k05Var3.parseFrom(bArr3);
                    }
                    iq6Var.f377275h = k05Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
