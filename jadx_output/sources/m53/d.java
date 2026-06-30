package m53;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.h f323609d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323610e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323611f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.d)) {
            return false;
        }
        m53.d dVar = (m53.d) fVar;
        return n51.f.a(this.f323609d, dVar.f323609d) && n51.f.a(this.f323610e, dVar.f323610e) && n51.f.a(this.f323611f, dVar.f323611f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.h hVar = this.f323609d;
            if (hVar != null) {
                fVar.i(1, hVar.computeSize());
                this.f323609d.writeFields(fVar);
            }
            java.lang.String str = this.f323610e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f323611f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.h hVar2 = this.f323609d;
            int i18 = hVar2 != null ? 0 + b36.f.i(1, hVar2.computeSize()) : 0;
            java.lang.String str3 = this.f323610e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f323611f;
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
        m53.d dVar = (m53.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                dVar.f323610e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            dVar.f323611f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            m53.h hVar3 = new m53.h();
            if (bArr != null && bArr.length > 0) {
                hVar3.parseFrom(bArr);
            }
            dVar.f323609d = hVar3;
        }
        return 0;
    }
}
