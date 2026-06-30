package r45;

/* loaded from: classes4.dex */
public class ax6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f370340d;

    /* renamed from: e, reason: collision with root package name */
    public double f370341e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370342f;

    /* renamed from: g, reason: collision with root package name */
    public r45.h74 f370343g;

    /* renamed from: h, reason: collision with root package name */
    public long f370344h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ax6)) {
            return false;
        }
        r45.ax6 ax6Var = (r45.ax6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f370340d), java.lang.Long.valueOf(ax6Var.f370340d)) && n51.f.a(java.lang.Double.valueOf(this.f370341e), java.lang.Double.valueOf(ax6Var.f370341e)) && n51.f.a(this.f370342f, ax6Var.f370342f) && n51.f.a(this.f370343g, ax6Var.f370343g) && n51.f.a(java.lang.Long.valueOf(this.f370344h), java.lang.Long.valueOf(ax6Var.f370344h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f370340d);
            fVar.c(2, this.f370341e);
            java.lang.String str = this.f370342f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.h74 h74Var = this.f370343g;
            if (h74Var != null) {
                fVar.i(4, h74Var.computeSize());
                this.f370343g.writeFields(fVar);
            }
            fVar.h(5, this.f370344h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f370340d) + 0 + b36.f.c(2, this.f370341e);
            java.lang.String str2 = this.f370342f;
            if (str2 != null) {
                h17 += b36.f.j(3, str2);
            }
            r45.h74 h74Var2 = this.f370343g;
            if (h74Var2 != null) {
                h17 += b36.f.i(4, h74Var2.computeSize());
            }
            return h17 + b36.f.h(5, this.f370344h);
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
        r45.ax6 ax6Var = (r45.ax6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ax6Var.f370340d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            ax6Var.f370341e = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 3) {
            ax6Var.f370342f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            ax6Var.f370344h = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.h74 h74Var3 = new r45.h74();
            if (bArr != null && bArr.length > 0) {
                h74Var3.parseFrom(bArr);
            }
            ax6Var.f370343g = h74Var3;
        }
        return 0;
    }
}
