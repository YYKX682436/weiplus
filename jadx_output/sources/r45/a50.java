package r45;

/* loaded from: classes2.dex */
public class a50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f369726d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f369727e;

    /* renamed from: f, reason: collision with root package name */
    public r45.r75 f369728f;

    /* renamed from: g, reason: collision with root package name */
    public r45.yt5 f369729g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ms5 f369730h;

    /* renamed from: i, reason: collision with root package name */
    public int f369731i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a50)) {
            return false;
        }
        r45.a50 a50Var = (r45.a50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f369726d), java.lang.Integer.valueOf(a50Var.f369726d)) && n51.f.a(this.f369727e, a50Var.f369727e) && n51.f.a(this.f369728f, a50Var.f369728f) && n51.f.a(this.f369729g, a50Var.f369729g) && n51.f.a(this.f369730h, a50Var.f369730h) && n51.f.a(java.lang.Integer.valueOf(this.f369731i), java.lang.Integer.valueOf(a50Var.f369731i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f369726d);
            com.tencent.mm.protobuf.g gVar = this.f369727e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            r45.r75 r75Var = this.f369728f;
            if (r75Var != null) {
                fVar.i(3, r75Var.computeSize());
                this.f369728f.writeFields(fVar);
            }
            r45.yt5 yt5Var = this.f369729g;
            if (yt5Var != null) {
                fVar.i(4, yt5Var.computeSize());
                this.f369729g.writeFields(fVar);
            }
            r45.ms5 ms5Var = this.f369730h;
            if (ms5Var != null) {
                fVar.i(5, ms5Var.computeSize());
                this.f369730h.writeFields(fVar);
            }
            fVar.e(6, this.f369731i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f369726d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f369727e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            r45.r75 r75Var2 = this.f369728f;
            if (r75Var2 != null) {
                e17 += b36.f.i(3, r75Var2.computeSize());
            }
            r45.yt5 yt5Var2 = this.f369729g;
            if (yt5Var2 != null) {
                e17 += b36.f.i(4, yt5Var2.computeSize());
            }
            r45.ms5 ms5Var2 = this.f369730h;
            if (ms5Var2 != null) {
                e17 += b36.f.i(5, ms5Var2.computeSize());
            }
            return e17 + b36.f.e(6, this.f369731i);
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
        r45.a50 a50Var = (r45.a50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a50Var.f369726d = aVar2.g(intValue);
                return 0;
            case 2:
                a50Var.f369727e = aVar2.d(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.r75 r75Var3 = new r45.r75();
                    if (bArr != null && bArr.length > 0) {
                        r75Var3.parseFrom(bArr);
                    }
                    a50Var.f369728f = r75Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr2 != null && bArr2.length > 0) {
                        yt5Var3.parseFrom(bArr2);
                    }
                    a50Var.f369729g = yt5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.ms5 ms5Var3 = new r45.ms5();
                    if (bArr3 != null && bArr3.length > 0) {
                        ms5Var3.parseFrom(bArr3);
                    }
                    a50Var.f369730h = ms5Var3;
                }
                return 0;
            case 6:
                a50Var.f369731i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
