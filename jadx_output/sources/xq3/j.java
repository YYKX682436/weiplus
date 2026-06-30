package xq3;

/* loaded from: classes2.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456092d;

    /* renamed from: e, reason: collision with root package name */
    public xq3.g f456093e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456094f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.j)) {
            return false;
        }
        xq3.j jVar = (xq3.j) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456092d), java.lang.Integer.valueOf(jVar.f456092d)) && n51.f.a(this.f456093e, jVar.f456093e) && n51.f.a(this.f456094f, jVar.f456094f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456092d);
            xq3.g gVar = this.f456093e;
            if (gVar != null) {
                fVar.i(2, gVar.computeSize());
                this.f456093e.writeFields(fVar);
            }
            java.lang.String str = this.f456094f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f456092d) + 0;
            xq3.g gVar2 = this.f456093e;
            if (gVar2 != null) {
                e17 += b36.f.i(2, gVar2.computeSize());
            }
            java.lang.String str2 = this.f456094f;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
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
        xq3.j jVar = (xq3.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jVar.f456092d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            jVar.f456094f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            xq3.g gVar3 = new xq3.g();
            if (bArr != null && bArr.length > 0) {
                gVar3.parseFrom(bArr);
            }
            jVar.f456093e = gVar3;
        }
        return 0;
    }
}
