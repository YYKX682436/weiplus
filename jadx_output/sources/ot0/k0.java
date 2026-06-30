package ot0;

/* loaded from: classes2.dex */
public class k0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f348559d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f348560e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348561f;

    /* renamed from: g, reason: collision with root package name */
    public ot0.j0 f348562g;

    /* renamed from: h, reason: collision with root package name */
    public ot0.i0 f348563h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f348564i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ot0.k0)) {
            return false;
        }
        ot0.k0 k0Var = (ot0.k0) fVar;
        return n51.f.a(this.f348559d, k0Var.f348559d) && n51.f.a(this.f348560e, k0Var.f348560e) && n51.f.a(this.f348561f, k0Var.f348561f) && n51.f.a(this.f348562g, k0Var.f348562g) && n51.f.a(this.f348563h, k0Var.f348563h) && n51.f.a(this.f348564i, k0Var.f348564i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f348559d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f348560e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f348561f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            ot0.j0 j0Var = this.f348562g;
            if (j0Var != null) {
                fVar.i(4, j0Var.computeSize());
                this.f348562g.writeFields(fVar);
            }
            ot0.i0 i0Var = this.f348563h;
            if (i0Var != null) {
                fVar.i(5, i0Var.computeSize());
                this.f348563h.writeFields(fVar);
            }
            java.lang.String str4 = this.f348564i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f348559d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f348560e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f348561f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            ot0.j0 j0Var2 = this.f348562g;
            if (j0Var2 != null) {
                j17 += b36.f.i(4, j0Var2.computeSize());
            }
            ot0.i0 i0Var2 = this.f348563h;
            if (i0Var2 != null) {
                j17 += b36.f.i(5, i0Var2.computeSize());
            }
            java.lang.String str8 = this.f348564i;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        ot0.k0 k0Var = (ot0.k0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k0Var.f348559d = aVar2.k(intValue);
                return 0;
            case 2:
                k0Var.f348560e = aVar2.k(intValue);
                return 0;
            case 3:
                k0Var.f348561f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    ot0.j0 j0Var3 = new ot0.j0();
                    if (bArr != null && bArr.length > 0) {
                        j0Var3.parseFrom(bArr);
                    }
                    k0Var.f348562g = j0Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    ot0.i0 i0Var3 = new ot0.i0();
                    if (bArr2 != null && bArr2.length > 0) {
                        i0Var3.parseFrom(bArr2);
                    }
                    k0Var.f348563h = i0Var3;
                }
                return 0;
            case 6:
                k0Var.f348564i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
