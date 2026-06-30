package r45;

/* loaded from: classes9.dex */
public class qw extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.pw f384306d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pw f384307e;

    /* renamed from: f, reason: collision with root package name */
    public r45.pw f384308f;

    /* renamed from: g, reason: collision with root package name */
    public r45.pw f384309g;

    /* renamed from: h, reason: collision with root package name */
    public r45.pw f384310h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qw)) {
            return false;
        }
        r45.qw qwVar = (r45.qw) fVar;
        return n51.f.a(this.f384306d, qwVar.f384306d) && n51.f.a(this.f384307e, qwVar.f384307e) && n51.f.a(this.f384308f, qwVar.f384308f) && n51.f.a(this.f384309g, qwVar.f384309g) && n51.f.a(this.f384310h, qwVar.f384310h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.pw pwVar = this.f384306d;
            if (pwVar != null) {
                fVar.i(1, pwVar.computeSize());
                this.f384306d.writeFields(fVar);
            }
            r45.pw pwVar2 = this.f384307e;
            if (pwVar2 != null) {
                fVar.i(2, pwVar2.computeSize());
                this.f384307e.writeFields(fVar);
            }
            r45.pw pwVar3 = this.f384308f;
            if (pwVar3 != null) {
                fVar.i(3, pwVar3.computeSize());
                this.f384308f.writeFields(fVar);
            }
            r45.pw pwVar4 = this.f384309g;
            if (pwVar4 != null) {
                fVar.i(4, pwVar4.computeSize());
                this.f384309g.writeFields(fVar);
            }
            r45.pw pwVar5 = this.f384310h;
            if (pwVar5 != null) {
                fVar.i(5, pwVar5.computeSize());
                this.f384310h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.pw pwVar6 = this.f384306d;
            int i18 = pwVar6 != null ? 0 + b36.f.i(1, pwVar6.computeSize()) : 0;
            r45.pw pwVar7 = this.f384307e;
            if (pwVar7 != null) {
                i18 += b36.f.i(2, pwVar7.computeSize());
            }
            r45.pw pwVar8 = this.f384308f;
            if (pwVar8 != null) {
                i18 += b36.f.i(3, pwVar8.computeSize());
            }
            r45.pw pwVar9 = this.f384309g;
            if (pwVar9 != null) {
                i18 += b36.f.i(4, pwVar9.computeSize());
            }
            r45.pw pwVar10 = this.f384310h;
            return pwVar10 != null ? i18 + b36.f.i(5, pwVar10.computeSize()) : i18;
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
        r45.qw qwVar = (r45.qw) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.pw pwVar11 = new r45.pw();
                if (bArr != null && bArr.length > 0) {
                    pwVar11.parseFrom(bArr);
                }
                qwVar.f384306d = pwVar11;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.pw pwVar12 = new r45.pw();
                if (bArr2 != null && bArr2.length > 0) {
                    pwVar12.parseFrom(bArr2);
                }
                qwVar.f384307e = pwVar12;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.pw pwVar13 = new r45.pw();
                if (bArr3 != null && bArr3.length > 0) {
                    pwVar13.parseFrom(bArr3);
                }
                qwVar.f384308f = pwVar13;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                r45.pw pwVar14 = new r45.pw();
                if (bArr4 != null && bArr4.length > 0) {
                    pwVar14.parseFrom(bArr4);
                }
                qwVar.f384309g = pwVar14;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            r45.pw pwVar15 = new r45.pw();
            if (bArr5 != null && bArr5.length > 0) {
                pwVar15.parseFrom(bArr5);
            }
            qwVar.f384310h = pwVar15;
        }
        return 0;
    }
}
