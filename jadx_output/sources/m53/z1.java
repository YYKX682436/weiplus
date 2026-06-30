package m53;

/* loaded from: classes8.dex */
public class z1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324219d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f324220e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324221f;

    /* renamed from: g, reason: collision with root package name */
    public m53.h0 f324222g;

    /* renamed from: h, reason: collision with root package name */
    public int f324223h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f324224i;

    /* renamed from: m, reason: collision with root package name */
    public int f324225m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.z1)) {
            return false;
        }
        m53.z1 z1Var = (m53.z1) fVar;
        return n51.f.a(this.BaseRequest, z1Var.BaseRequest) && n51.f.a(this.f324219d, z1Var.f324219d) && n51.f.a(this.f324220e, z1Var.f324220e) && n51.f.a(this.f324221f, z1Var.f324221f) && n51.f.a(this.f324222g, z1Var.f324222g) && n51.f.a(java.lang.Integer.valueOf(this.f324223h), java.lang.Integer.valueOf(z1Var.f324223h)) && n51.f.a(java.lang.Boolean.valueOf(this.f324224i), java.lang.Boolean.valueOf(z1Var.f324224i)) && n51.f.a(java.lang.Integer.valueOf(this.f324225m), java.lang.Integer.valueOf(z1Var.f324225m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f324219d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f324220e);
            java.lang.String str2 = this.f324221f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            m53.h0 h0Var = this.f324222g;
            if (h0Var != null) {
                fVar.i(5, h0Var.computeSize());
                this.f324222g.writeFields(fVar);
            }
            fVar.e(6, this.f324223h);
            fVar.a(7, this.f324224i);
            fVar.e(8, this.f324225m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f324219d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f324220e);
            java.lang.String str4 = this.f324221f;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            m53.h0 h0Var2 = this.f324222g;
            if (h0Var2 != null) {
                g17 += b36.f.i(5, h0Var2.computeSize());
            }
            return g17 + b36.f.e(6, this.f324223h) + b36.f.a(7, this.f324224i) + b36.f.e(8, this.f324225m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f324220e.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        m53.z1 z1Var = (m53.z1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    z1Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                z1Var.f324219d = aVar2.k(intValue);
                return 0;
            case 3:
                z1Var.f324220e.add(aVar2.k(intValue));
                return 0;
            case 4:
                z1Var.f324221f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    m53.h0 h0Var3 = new m53.h0();
                    if (bArr3 != null && bArr3.length > 0) {
                        h0Var3.parseFrom(bArr3);
                    }
                    z1Var.f324222g = h0Var3;
                }
                return 0;
            case 6:
                z1Var.f324223h = aVar2.g(intValue);
                return 0;
            case 7:
                z1Var.f324224i = aVar2.c(intValue);
                return 0;
            case 8:
                z1Var.f324225m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
