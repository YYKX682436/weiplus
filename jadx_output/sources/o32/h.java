package o32;

/* loaded from: classes8.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public o32.c f342710d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f342711e;

    /* renamed from: f, reason: collision with root package name */
    public int f342712f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof o32.h)) {
            return false;
        }
        o32.h hVar = (o32.h) fVar;
        return n51.f.a(this.f342710d, hVar.f342710d) && n51.f.a(this.f342711e, hVar.f342711e) && n51.f.a(java.lang.Integer.valueOf(this.f342712f), java.lang.Integer.valueOf(hVar.f342712f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.c cVar = this.f342710d;
            if (cVar != null) {
                fVar.i(1, cVar.computeSize());
                this.f342710d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f342711e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f342712f);
            return 0;
        }
        if (i17 == 1) {
            o32.c cVar2 = this.f342710d;
            int i18 = cVar2 != null ? 0 + b36.f.i(1, cVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f342711e;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.e(3, this.f342712f);
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
        o32.h hVar = (o32.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                hVar.f342711e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            hVar.f342712f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            o32.c cVar3 = new o32.c();
            if (bArr != null && bArr.length > 0) {
                cVar3.parseFrom(bArr);
            }
            hVar.f342710d = cVar3;
        }
        return 0;
    }
}
