package r45;

/* loaded from: classes8.dex */
public class cs4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371808d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371809e;

    /* renamed from: f, reason: collision with root package name */
    public r45.as4 f371810f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371811g;

    /* renamed from: h, reason: collision with root package name */
    public int f371812h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f371813i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371814m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cs4)) {
            return false;
        }
        r45.cs4 cs4Var = (r45.cs4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371808d), java.lang.Integer.valueOf(cs4Var.f371808d)) && n51.f.a(this.f371809e, cs4Var.f371809e) && n51.f.a(this.f371810f, cs4Var.f371810f) && n51.f.a(this.f371811g, cs4Var.f371811g) && n51.f.a(java.lang.Integer.valueOf(this.f371812h), java.lang.Integer.valueOf(cs4Var.f371812h)) && n51.f.a(java.lang.Boolean.valueOf(this.f371813i), java.lang.Boolean.valueOf(cs4Var.f371813i)) && n51.f.a(this.f371814m, cs4Var.f371814m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371808d);
            java.lang.String str = this.f371809e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.as4 as4Var = this.f371810f;
            if (as4Var != null) {
                fVar.i(3, as4Var.computeSize());
                this.f371810f.writeFields(fVar);
            }
            java.lang.String str2 = this.f371811g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f371812h);
            fVar.a(6, this.f371813i);
            java.lang.String str3 = this.f371814m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371808d) + 0;
            java.lang.String str4 = this.f371809e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            r45.as4 as4Var2 = this.f371810f;
            if (as4Var2 != null) {
                e17 += b36.f.i(3, as4Var2.computeSize());
            }
            java.lang.String str5 = this.f371811g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            int e18 = e17 + b36.f.e(5, this.f371812h) + b36.f.a(6, this.f371813i);
            java.lang.String str6 = this.f371814m;
            return str6 != null ? e18 + b36.f.j(7, str6) : e18;
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
        r45.cs4 cs4Var = (r45.cs4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cs4Var.f371808d = aVar2.g(intValue);
                return 0;
            case 2:
                cs4Var.f371809e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.as4 as4Var3 = new r45.as4();
                    if (bArr != null && bArr.length > 0) {
                        as4Var3.parseFrom(bArr);
                    }
                    cs4Var.f371810f = as4Var3;
                }
                return 0;
            case 4:
                cs4Var.f371811g = aVar2.k(intValue);
                return 0;
            case 5:
                cs4Var.f371812h = aVar2.g(intValue);
                return 0;
            case 6:
                cs4Var.f371813i = aVar2.c(intValue);
                return 0;
            case 7:
                cs4Var.f371814m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
