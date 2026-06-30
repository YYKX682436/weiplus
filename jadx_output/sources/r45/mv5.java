package r45;

/* loaded from: classes7.dex */
public class mv5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380852d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f380853e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f380854f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f380855g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f380856h;

    /* renamed from: i, reason: collision with root package name */
    public r45.nv5 f380857i;

    /* renamed from: m, reason: collision with root package name */
    public int f380858m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mv5)) {
            return false;
        }
        r45.mv5 mv5Var = (r45.mv5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380852d), java.lang.Integer.valueOf(mv5Var.f380852d)) && n51.f.a(this.f380853e, mv5Var.f380853e) && n51.f.a(this.f380854f, mv5Var.f380854f) && n51.f.a(this.f380855g, mv5Var.f380855g) && n51.f.a(this.f380856h, mv5Var.f380856h) && n51.f.a(this.f380857i, mv5Var.f380857i) && n51.f.a(java.lang.Integer.valueOf(this.f380858m), java.lang.Integer.valueOf(mv5Var.f380858m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380852d);
            com.tencent.mm.protobuf.g gVar = this.f380853e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f380854f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f380855g;
            if (gVar3 != null) {
                fVar.b(4, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f380856h;
            if (gVar4 != null) {
                fVar.b(5, gVar4);
            }
            r45.nv5 nv5Var = this.f380857i;
            if (nv5Var != null) {
                fVar.i(6, nv5Var.computeSize());
                this.f380857i.writeFields(fVar);
            }
            fVar.e(7, this.f380858m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380852d) + 0;
            com.tencent.mm.protobuf.g gVar5 = this.f380853e;
            if (gVar5 != null) {
                e17 += b36.f.b(2, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f380854f;
            if (gVar6 != null) {
                e17 += b36.f.b(3, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.f380855g;
            if (gVar7 != null) {
                e17 += b36.f.b(4, gVar7);
            }
            com.tencent.mm.protobuf.g gVar8 = this.f380856h;
            if (gVar8 != null) {
                e17 += b36.f.b(5, gVar8);
            }
            r45.nv5 nv5Var2 = this.f380857i;
            if (nv5Var2 != null) {
                e17 += b36.f.i(6, nv5Var2.computeSize());
            }
            return e17 + b36.f.e(7, this.f380858m);
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
        r45.mv5 mv5Var = (r45.mv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mv5Var.f380852d = aVar2.g(intValue);
                return 0;
            case 2:
                mv5Var.f380853e = aVar2.d(intValue);
                return 0;
            case 3:
                mv5Var.f380854f = aVar2.d(intValue);
                return 0;
            case 4:
                mv5Var.f380855g = aVar2.d(intValue);
                return 0;
            case 5:
                mv5Var.f380856h = aVar2.d(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.nv5 nv5Var3 = new r45.nv5();
                    if (bArr != null && bArr.length > 0) {
                        nv5Var3.parseFrom(bArr);
                    }
                    mv5Var.f380857i = nv5Var3;
                }
                return 0;
            case 7:
                mv5Var.f380858m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
