package r45;

/* loaded from: classes4.dex */
public class mo5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380713d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f380714e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f380715f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f380716g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f380717h;

    /* renamed from: i, reason: collision with root package name */
    public long f380718i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mo5)) {
            return false;
        }
        r45.mo5 mo5Var = (r45.mo5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380713d), java.lang.Integer.valueOf(mo5Var.f380713d)) && n51.f.a(this.f380714e, mo5Var.f380714e) && n51.f.a(this.f380715f, mo5Var.f380715f) && n51.f.a(this.f380716g, mo5Var.f380716g) && n51.f.a(this.f380717h, mo5Var.f380717h) && n51.f.a(java.lang.Long.valueOf(this.f380718i), java.lang.Long.valueOf(mo5Var.f380718i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380713d);
            r45.cu5 cu5Var = this.f380714e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f380714e.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f380715f;
            if (cu5Var2 != null) {
                fVar.i(3, cu5Var2.computeSize());
                this.f380715f.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f380716g;
            if (cu5Var3 != null) {
                fVar.i(4, cu5Var3.computeSize());
                this.f380716g.writeFields(fVar);
            }
            r45.cu5 cu5Var4 = this.f380717h;
            if (cu5Var4 != null) {
                fVar.i(5, cu5Var4.computeSize());
                this.f380717h.writeFields(fVar);
            }
            fVar.h(6, this.f380718i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380713d) + 0;
            r45.cu5 cu5Var5 = this.f380714e;
            if (cu5Var5 != null) {
                e17 += b36.f.i(2, cu5Var5.computeSize());
            }
            r45.cu5 cu5Var6 = this.f380715f;
            if (cu5Var6 != null) {
                e17 += b36.f.i(3, cu5Var6.computeSize());
            }
            r45.cu5 cu5Var7 = this.f380716g;
            if (cu5Var7 != null) {
                e17 += b36.f.i(4, cu5Var7.computeSize());
            }
            r45.cu5 cu5Var8 = this.f380717h;
            if (cu5Var8 != null) {
                e17 += b36.f.i(5, cu5Var8.computeSize());
            }
            return e17 + b36.f.h(6, this.f380718i);
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
        r45.mo5 mo5Var = (r45.mo5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mo5Var.f380713d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var9.b(bArr);
                    }
                    mo5Var.f380714e = cu5Var9;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var10 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var10.b(bArr2);
                    }
                    mo5Var.f380715f = cu5Var10;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var11.b(bArr3);
                    }
                    mo5Var.f380716g = cu5Var11;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var12.b(bArr4);
                    }
                    mo5Var.f380717h = cu5Var12;
                }
                return 0;
            case 6:
                mo5Var.f380718i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
