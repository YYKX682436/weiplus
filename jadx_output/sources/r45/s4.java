package r45;

/* loaded from: classes8.dex */
public class s4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385486d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385487e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385488f;

    /* renamed from: g, reason: collision with root package name */
    public r45.l05 f385489g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385490h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s4)) {
            return false;
        }
        r45.s4 s4Var = (r45.s4) fVar;
        return n51.f.a(this.f385486d, s4Var.f385486d) && n51.f.a(this.f385487e, s4Var.f385487e) && n51.f.a(this.f385488f, s4Var.f385488f) && n51.f.a(this.f385489g, s4Var.f385489g) && n51.f.a(this.f385490h, s4Var.f385490h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385486d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385487e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385488f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            r45.l05 l05Var = this.f385489g;
            if (l05Var != null) {
                fVar.i(4, l05Var.computeSize());
                this.f385489g.writeFields(fVar);
            }
            java.lang.String str4 = this.f385490h;
            if (str4 != null) {
                fVar.j(100, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f385486d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f385487e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f385488f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            r45.l05 l05Var2 = this.f385489g;
            if (l05Var2 != null) {
                j17 += b36.f.i(4, l05Var2.computeSize());
            }
            java.lang.String str8 = this.f385490h;
            return str8 != null ? j17 + b36.f.j(100, str8) : j17;
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
        r45.s4 s4Var = (r45.s4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s4Var.f385486d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            s4Var.f385487e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            s4Var.f385488f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 100) {
                return -1;
            }
            s4Var.f385490h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.l05 l05Var3 = new r45.l05();
            if (bArr != null && bArr.length > 0) {
                l05Var3.parseFrom(bArr);
            }
            s4Var.f385489g = l05Var3;
        }
        return 0;
    }
}
