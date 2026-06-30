package r45;

/* loaded from: classes4.dex */
public class rg extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f384823d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.pg f384824e;

    /* renamed from: f, reason: collision with root package name */
    public int f384825f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rg)) {
            return false;
        }
        r45.rg rgVar = (r45.rg) fVar;
        return n51.f.a(this.f384823d, rgVar.f384823d) && n51.f.a(this.f384824e, rgVar.f384824e) && n51.f.a(java.lang.Integer.valueOf(this.f384825f), java.lang.Integer.valueOf(rgVar.f384825f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f384823d);
            r45.pg pgVar = this.f384824e;
            if (pgVar != null) {
                fVar.i(2, pgVar.computeSize());
                this.f384824e.writeFields(fVar);
            }
            fVar.e(3, this.f384825f);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f384823d) + 0;
            r45.pg pgVar2 = this.f384824e;
            if (pgVar2 != null) {
                g17 += b36.f.i(2, pgVar2.computeSize());
            }
            return g17 + b36.f.e(3, this.f384825f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f384823d.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.rg rgVar = (r45.rg) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.qg qgVar = new r45.qg();
                if (bArr2 != null && bArr2.length > 0) {
                    qgVar.parseFrom(bArr2);
                }
                rgVar.f384823d.add(qgVar);
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            rgVar.f384825f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.pg pgVar3 = new r45.pg();
            if (bArr3 != null && bArr3.length > 0) {
                pgVar3.parseFrom(bArr3);
            }
            rgVar.f384824e = pgVar3;
        }
        return 0;
    }
}
