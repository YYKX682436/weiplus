package r45;

/* loaded from: classes11.dex */
public class ka extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ma f378523d;

    /* renamed from: e, reason: collision with root package name */
    public r45.la f378524e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378525f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ka)) {
            return false;
        }
        r45.ka kaVar = (r45.ka) fVar;
        return n51.f.a(this.f378523d, kaVar.f378523d) && n51.f.a(this.f378524e, kaVar.f378524e) && n51.f.a(this.f378525f, kaVar.f378525f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ma maVar = this.f378523d;
            if (maVar != null) {
                fVar.i(1, maVar.computeSize());
                this.f378523d.writeFields(fVar);
            }
            r45.la laVar = this.f378524e;
            if (laVar != null) {
                fVar.i(2, laVar.computeSize());
                this.f378524e.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f378525f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ma maVar2 = this.f378523d;
            int i18 = maVar2 != null ? 0 + b36.f.i(1, maVar2.computeSize()) : 0;
            r45.la laVar2 = this.f378524e;
            if (laVar2 != null) {
                i18 += b36.f.i(2, laVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f378525f;
            return gVar2 != null ? i18 + b36.f.b(3, gVar2) : i18;
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
        r45.ka kaVar = (r45.ka) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ma maVar3 = new r45.ma();
                if (bArr != null && bArr.length > 0) {
                    maVar3.parseFrom(bArr);
                }
                kaVar.f378523d = maVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            kaVar.f378525f = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.la laVar3 = new r45.la();
            if (bArr2 != null && bArr2.length > 0) {
                laVar3.parseFrom(bArr2);
            }
            kaVar.f378524e = laVar3;
        }
        return 0;
    }
}
