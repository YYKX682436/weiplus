package pj4;

/* loaded from: classes8.dex */
public class m2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public pj4.q f355183d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355184e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355185f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.m2)) {
            return false;
        }
        pj4.m2 m2Var = (pj4.m2) fVar;
        return n51.f.a(this.f355183d, m2Var.f355183d) && n51.f.a(this.f355184e, m2Var.f355184e) && n51.f.a(this.f355185f, m2Var.f355185f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            pj4.q qVar = this.f355183d;
            if (qVar != null) {
                fVar.i(1, qVar.computeSize());
                this.f355183d.writeFields(fVar);
            }
            java.lang.String str = this.f355184e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f355185f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            pj4.q qVar2 = this.f355183d;
            int i18 = qVar2 != null ? 0 + b36.f.i(1, qVar2.computeSize()) : 0;
            java.lang.String str3 = this.f355184e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f355185f;
            return str4 != null ? i18 + b36.f.j(3, str4) : i18;
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
        pj4.m2 m2Var = (pj4.m2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                m2Var.f355184e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            m2Var.f355185f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            pj4.q qVar3 = new pj4.q();
            if (bArr != null && bArr.length > 0) {
                qVar3.parseFrom(bArr);
            }
            m2Var.f355183d = qVar3;
        }
        return 0;
    }
}
