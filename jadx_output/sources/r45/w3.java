package r45;

/* loaded from: classes4.dex */
public class w3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.j4 f388826d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388827e;

    /* renamed from: f, reason: collision with root package name */
    public long f388828f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388829g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f388830h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w3)) {
            return false;
        }
        r45.w3 w3Var = (r45.w3) fVar;
        return n51.f.a(this.f388826d, w3Var.f388826d) && n51.f.a(this.f388827e, w3Var.f388827e) && n51.f.a(java.lang.Long.valueOf(this.f388828f), java.lang.Long.valueOf(w3Var.f388828f)) && n51.f.a(this.f388829g, w3Var.f388829g) && n51.f.a(java.lang.Boolean.valueOf(this.f388830h), java.lang.Boolean.valueOf(w3Var.f388830h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.j4 j4Var = this.f388826d;
            if (j4Var != null) {
                fVar.i(1, j4Var.computeSize());
                this.f388826d.writeFields(fVar);
            }
            java.lang.String str = this.f388827e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f388828f);
            com.tencent.mm.protobuf.g gVar = this.f388829g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.a(5, this.f388830h);
            return 0;
        }
        if (i17 == 1) {
            r45.j4 j4Var2 = this.f388826d;
            int i18 = j4Var2 != null ? 0 + b36.f.i(1, j4Var2.computeSize()) : 0;
            java.lang.String str2 = this.f388827e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int h17 = i18 + b36.f.h(3, this.f388828f);
            com.tencent.mm.protobuf.g gVar2 = this.f388829g;
            if (gVar2 != null) {
                h17 += b36.f.b(4, gVar2);
            }
            return h17 + b36.f.a(5, this.f388830h);
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
        r45.w3 w3Var = (r45.w3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.j4 j4Var3 = new r45.j4();
                if (bArr != null && bArr.length > 0) {
                    j4Var3.parseFrom(bArr);
                }
                w3Var.f388826d = j4Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            w3Var.f388827e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            w3Var.f388828f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            w3Var.f388829g = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        w3Var.f388830h = aVar2.c(intValue);
        return 0;
    }
}
