package uq;

/* loaded from: classes4.dex */
public class p extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public uq.a f430180d;

    /* renamed from: e, reason: collision with root package name */
    public uq.t f430181e;

    /* renamed from: f, reason: collision with root package name */
    public uq.m f430182f;

    /* renamed from: g, reason: collision with root package name */
    public uq.d f430183g;

    /* renamed from: h, reason: collision with root package name */
    public uq.c f430184h;

    /* renamed from: i, reason: collision with root package name */
    public uq.b f430185i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof uq.p)) {
            return false;
        }
        uq.p pVar = (uq.p) fVar;
        return n51.f.a(this.f430180d, pVar.f430180d) && n51.f.a(this.f430181e, pVar.f430181e) && n51.f.a(this.f430182f, pVar.f430182f) && n51.f.a(this.f430183g, pVar.f430183g) && n51.f.a(this.f430184h, pVar.f430184h) && n51.f.a(this.f430185i, pVar.f430185i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            uq.a aVar = this.f430180d;
            if (aVar != null) {
                fVar.i(1, aVar.computeSize());
                this.f430180d.writeFields(fVar);
            }
            uq.t tVar = this.f430181e;
            if (tVar != null) {
                fVar.i(2, tVar.computeSize());
                this.f430181e.writeFields(fVar);
            }
            uq.m mVar = this.f430182f;
            if (mVar != null) {
                fVar.i(3, mVar.computeSize());
                this.f430182f.writeFields(fVar);
            }
            uq.d dVar = this.f430183g;
            if (dVar != null) {
                fVar.i(4, dVar.computeSize());
                this.f430183g.writeFields(fVar);
            }
            uq.c cVar = this.f430184h;
            if (cVar != null) {
                fVar.i(5, cVar.computeSize());
                this.f430184h.writeFields(fVar);
            }
            uq.b bVar = this.f430185i;
            if (bVar != null) {
                fVar.i(6, bVar.computeSize());
                this.f430185i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            uq.a aVar2 = this.f430180d;
            int i18 = aVar2 != null ? 0 + b36.f.i(1, aVar2.computeSize()) : 0;
            uq.t tVar2 = this.f430181e;
            if (tVar2 != null) {
                i18 += b36.f.i(2, tVar2.computeSize());
            }
            uq.m mVar2 = this.f430182f;
            if (mVar2 != null) {
                i18 += b36.f.i(3, mVar2.computeSize());
            }
            uq.d dVar2 = this.f430183g;
            if (dVar2 != null) {
                i18 += b36.f.i(4, dVar2.computeSize());
            }
            uq.c cVar2 = this.f430184h;
            if (cVar2 != null) {
                i18 += b36.f.i(5, cVar2.computeSize());
            }
            uq.b bVar2 = this.f430185i;
            return bVar2 != null ? i18 + b36.f.i(6, bVar2.computeSize()) : i18;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        uq.p pVar = (uq.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    uq.a aVar5 = new uq.a();
                    if (bArr != null && bArr.length > 0) {
                        aVar5.parseFrom(bArr);
                    }
                    pVar.f430180d = aVar5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    uq.t tVar3 = new uq.t();
                    if (bArr2 != null && bArr2.length > 0) {
                        tVar3.parseFrom(bArr2);
                    }
                    pVar.f430181e = tVar3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    uq.m mVar3 = new uq.m();
                    if (bArr3 != null && bArr3.length > 0) {
                        mVar3.parseFrom(bArr3);
                    }
                    pVar.f430182f = mVar3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar4.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    uq.d dVar3 = new uq.d();
                    if (bArr4 != null && bArr4.length > 0) {
                        dVar3.parseFrom(bArr4);
                    }
                    pVar.f430183g = dVar3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar4.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    uq.c cVar3 = new uq.c();
                    if (bArr5 != null && bArr5.length > 0) {
                        cVar3.parseFrom(bArr5);
                    }
                    pVar.f430184h = cVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar4.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    uq.b bVar3 = new uq.b();
                    if (bArr6 != null && bArr6.length > 0) {
                        bVar3.parseFrom(bArr6);
                    }
                    pVar.f430185i = bVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
