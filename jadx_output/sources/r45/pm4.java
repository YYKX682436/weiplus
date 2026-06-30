package r45;

/* loaded from: classes9.dex */
public class pm4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383179d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383180e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383181f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383182g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383183h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pm4)) {
            return false;
        }
        r45.pm4 pm4Var = (r45.pm4) fVar;
        return n51.f.a(this.f383179d, pm4Var.f383179d) && n51.f.a(this.f383180e, pm4Var.f383180e) && n51.f.a(this.f383181f, pm4Var.f383181f) && n51.f.a(this.f383182g, pm4Var.f383182g) && n51.f.a(this.f383183h, pm4Var.f383183h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383179d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383180e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f383181f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f383182g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f383183h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f383179d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f383180e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f383181f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f383182g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f383183h;
            return str10 != null ? j17 + b36.f.j(5, str10) : j17;
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
        r45.pm4 pm4Var = (r45.pm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pm4Var.f383179d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            pm4Var.f383180e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            pm4Var.f383181f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            pm4Var.f383182g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        pm4Var.f383183h = aVar2.k(intValue);
        return 0;
    }
}
