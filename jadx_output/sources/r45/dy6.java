package r45;

/* loaded from: classes11.dex */
public class dy6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372860d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gc6 f372861e;

    /* renamed from: f, reason: collision with root package name */
    public r45.hc6 f372862f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ic6 f372863g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dy6)) {
            return false;
        }
        r45.dy6 dy6Var = (r45.dy6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372860d), java.lang.Integer.valueOf(dy6Var.f372860d)) && n51.f.a(this.f372861e, dy6Var.f372861e) && n51.f.a(this.f372862f, dy6Var.f372862f) && n51.f.a(this.f372863g, dy6Var.f372863g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372860d);
            r45.gc6 gc6Var = this.f372861e;
            if (gc6Var != null) {
                fVar.i(2, gc6Var.computeSize());
                this.f372861e.writeFields(fVar);
            }
            r45.hc6 hc6Var = this.f372862f;
            if (hc6Var != null) {
                fVar.i(3, hc6Var.computeSize());
                this.f372862f.writeFields(fVar);
            }
            r45.ic6 ic6Var = this.f372863g;
            if (ic6Var != null) {
                fVar.i(4, ic6Var.computeSize());
                this.f372863g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372860d) + 0;
            r45.gc6 gc6Var2 = this.f372861e;
            if (gc6Var2 != null) {
                e17 += b36.f.i(2, gc6Var2.computeSize());
            }
            r45.hc6 hc6Var2 = this.f372862f;
            if (hc6Var2 != null) {
                e17 += b36.f.i(3, hc6Var2.computeSize());
            }
            r45.ic6 ic6Var2 = this.f372863g;
            return ic6Var2 != null ? e17 + b36.f.i(4, ic6Var2.computeSize()) : e17;
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
        r45.dy6 dy6Var = (r45.dy6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dy6Var.f372860d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.gc6 gc6Var3 = new r45.gc6();
                if (bArr != null && bArr.length > 0) {
                    gc6Var3.parseFrom(bArr);
                }
                dy6Var.f372861e = gc6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.hc6 hc6Var3 = new r45.hc6();
                if (bArr2 != null && bArr2.length > 0) {
                    hc6Var3.parseFrom(bArr2);
                }
                dy6Var.f372862f = hc6Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            r45.ic6 ic6Var3 = new r45.ic6();
            if (bArr3 != null && bArr3.length > 0) {
                ic6Var3.parseFrom(bArr3);
            }
            dy6Var.f372863g = ic6Var3;
        }
        return 0;
    }
}
