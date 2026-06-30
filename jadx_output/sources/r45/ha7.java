package r45;

/* loaded from: classes8.dex */
public class ha7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375991d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ja7 f375992e;

    /* renamed from: f, reason: collision with root package name */
    public long f375993f;

    /* renamed from: g, reason: collision with root package name */
    public int f375994g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ha7)) {
            return false;
        }
        r45.ha7 ha7Var = (r45.ha7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375991d), java.lang.Integer.valueOf(ha7Var.f375991d)) && n51.f.a(this.f375992e, ha7Var.f375992e) && n51.f.a(java.lang.Long.valueOf(this.f375993f), java.lang.Long.valueOf(ha7Var.f375993f)) && n51.f.a(java.lang.Integer.valueOf(this.f375994g), java.lang.Integer.valueOf(ha7Var.f375994g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375991d);
            r45.ja7 ja7Var = this.f375992e;
            if (ja7Var != null) {
                fVar.i(2, ja7Var.computeSize());
                this.f375992e.writeFields(fVar);
            }
            fVar.h(3, this.f375993f);
            fVar.e(4, this.f375994g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375991d) + 0;
            r45.ja7 ja7Var2 = this.f375992e;
            if (ja7Var2 != null) {
                e17 += b36.f.i(2, ja7Var2.computeSize());
            }
            return e17 + b36.f.h(3, this.f375993f) + b36.f.e(4, this.f375994g);
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
        r45.ha7 ha7Var = (r45.ha7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ha7Var.f375991d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                ha7Var.f375993f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            ha7Var.f375994g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.ja7 ja7Var3 = new r45.ja7();
            if (bArr != null && bArr.length > 0) {
                ja7Var3.parseFrom(bArr);
            }
            ha7Var.f375992e = ja7Var3;
        }
        return 0;
    }
}
