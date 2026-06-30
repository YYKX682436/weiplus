package f21;

/* loaded from: classes11.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f258847d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f258848e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f258849f;

    /* renamed from: g, reason: collision with root package name */
    public f21.h0 f258850g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f258851h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof f21.d)) {
            return false;
        }
        f21.d dVar = (f21.d) fVar;
        return n51.f.a(this.f258847d, dVar.f258847d) && n51.f.a(this.f258848e, dVar.f258848e) && n51.f.a(this.f258849f, dVar.f258849f) && n51.f.a(this.f258850g, dVar.f258850g) && n51.f.a(this.f258851h, dVar.f258851h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f258847d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f258848e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f258849f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            f21.h0 h0Var = this.f258850g;
            if (h0Var != null) {
                fVar.i(4, h0Var.computeSize());
                this.f258850g.writeFields(fVar);
            }
            java.lang.String str4 = this.f258851h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f258847d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f258848e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f258849f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            f21.h0 h0Var2 = this.f258850g;
            if (h0Var2 != null) {
                j17 += b36.f.i(4, h0Var2.computeSize());
            }
            java.lang.String str8 = this.f258851h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        f21.d dVar = (f21.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dVar.f258847d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            dVar.f258848e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            dVar.f258849f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            dVar.f258851h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            f21.h0 h0Var3 = new f21.h0();
            if (bArr != null && bArr.length > 0) {
                h0Var3.parseFrom(bArr);
            }
            dVar.f258850g = h0Var3;
        }
        return 0;
    }
}
