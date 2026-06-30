package r45;

/* loaded from: classes10.dex */
public class u35 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386987d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386988e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zz6 f386989f;

    /* renamed from: g, reason: collision with root package name */
    public r45.bi0 f386990g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u35)) {
            return false;
        }
        r45.u35 u35Var = (r45.u35) fVar;
        return n51.f.a(this.f386987d, u35Var.f386987d) && n51.f.a(this.f386988e, u35Var.f386988e) && n51.f.a(this.f386989f, u35Var.f386989f) && n51.f.a(this.f386990g, u35Var.f386990g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386987d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386988e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.zz6 zz6Var = this.f386989f;
            if (zz6Var != null) {
                fVar.i(3, zz6Var.computeSize());
                this.f386989f.writeFields(fVar);
            }
            r45.bi0 bi0Var = this.f386990g;
            if (bi0Var != null) {
                fVar.i(4, bi0Var.computeSize());
                this.f386990g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f386987d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f386988e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.zz6 zz6Var2 = this.f386989f;
            if (zz6Var2 != null) {
                j17 += b36.f.i(3, zz6Var2.computeSize());
            }
            r45.bi0 bi0Var2 = this.f386990g;
            return bi0Var2 != null ? j17 + b36.f.i(4, bi0Var2.computeSize()) : j17;
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
        r45.u35 u35Var = (r45.u35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u35Var.f386987d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            u35Var.f386988e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.zz6 zz6Var3 = new r45.zz6();
                if (bArr != null && bArr.length > 0) {
                    zz6Var3.parseFrom(bArr);
                }
                u35Var.f386989f = zz6Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.bi0 bi0Var3 = new r45.bi0();
            if (bArr2 != null && bArr2.length > 0) {
                bi0Var3.parseFrom(bArr2);
            }
            u35Var.f386990g = bi0Var3;
        }
        return 0;
    }
}
