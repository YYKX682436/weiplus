package m53;

/* loaded from: classes7.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f323664d;

    /* renamed from: e, reason: collision with root package name */
    public m53.h f323665e;

    /* renamed from: f, reason: collision with root package name */
    public m53.d f323666f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323667g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.f)) {
            return false;
        }
        m53.f fVar2 = (m53.f) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f323664d), java.lang.Integer.valueOf(fVar2.f323664d)) && n51.f.a(this.f323665e, fVar2.f323665e) && n51.f.a(this.f323666f, fVar2.f323666f) && n51.f.a(this.f323667g, fVar2.f323667g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f323664d);
            m53.h hVar = this.f323665e;
            if (hVar != null) {
                fVar.i(2, hVar.computeSize());
                this.f323665e.writeFields(fVar);
            }
            m53.d dVar = this.f323666f;
            if (dVar != null) {
                fVar.i(3, dVar.computeSize());
                this.f323666f.writeFields(fVar);
            }
            java.lang.String str = this.f323667g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f323664d) + 0;
            m53.h hVar2 = this.f323665e;
            if (hVar2 != null) {
                e17 += b36.f.i(2, hVar2.computeSize());
            }
            m53.d dVar2 = this.f323666f;
            if (dVar2 != null) {
                e17 += b36.f.i(3, dVar2.computeSize());
            }
            java.lang.String str2 = this.f323667g;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        m53.f fVar2 = (m53.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fVar2.f323664d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                m53.h hVar3 = new m53.h();
                if (bArr != null && bArr.length > 0) {
                    hVar3.parseFrom(bArr);
                }
                fVar2.f323665e = hVar3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            fVar2.f323667g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            m53.d dVar3 = new m53.d();
            if (bArr2 != null && bArr2.length > 0) {
                dVar3.parseFrom(bArr2);
            }
            fVar2.f323666f = dVar3;
        }
        return 0;
    }
}
