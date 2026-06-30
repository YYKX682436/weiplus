package o33;

/* loaded from: classes2.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f342741d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f342742e;

    /* renamed from: f, reason: collision with root package name */
    public o33.e f342743f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof o33.g)) {
            return false;
        }
        o33.g gVar = (o33.g) fVar;
        return n51.f.a(this.f342741d, gVar.f342741d) && n51.f.a(java.lang.Boolean.valueOf(this.f342742e), java.lang.Boolean.valueOf(gVar.f342742e)) && n51.f.a(this.f342743f, gVar.f342743f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f342741d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f342742e);
            o33.e eVar = this.f342743f;
            if (eVar != null) {
                fVar.i(3, eVar.computeSize());
                this.f342743f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f342741d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.a(2, this.f342742e);
            o33.e eVar2 = this.f342743f;
            return eVar2 != null ? j17 + b36.f.i(3, eVar2.computeSize()) : j17;
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
        o33.g gVar = (o33.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gVar.f342741d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            gVar.f342742e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            o33.e eVar3 = new o33.e();
            if (bArr != null && bArr.length > 0) {
                eVar3.parseFrom(bArr);
            }
            gVar.f342743f = eVar3;
        }
        return 0;
    }
}
