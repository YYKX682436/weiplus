package r45;

/* loaded from: classes9.dex */
public class h7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375892d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375893e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375894f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375895g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375896h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h7)) {
            return false;
        }
        r45.h7 h7Var = (r45.h7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375892d), java.lang.Integer.valueOf(h7Var.f375892d)) && n51.f.a(this.f375893e, h7Var.f375893e) && n51.f.a(this.f375894f, h7Var.f375894f) && n51.f.a(this.f375895g, h7Var.f375895g) && n51.f.a(this.f375896h, h7Var.f375896h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375892d);
            java.lang.String str = this.f375893e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375894f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f375895g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f375896h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375892d) + 0;
            java.lang.String str5 = this.f375893e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f375894f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f375895g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f375896h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.h7 h7Var = (r45.h7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h7Var.f375892d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            h7Var.f375893e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            h7Var.f375894f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            h7Var.f375895g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        h7Var.f375896h = aVar2.k(intValue);
        return 0;
    }
}
