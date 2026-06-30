package r45;

/* loaded from: classes10.dex */
public class si0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385753d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385754e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zz6 f385755f;

    /* renamed from: g, reason: collision with root package name */
    public r45.zz6 f385756g;

    /* renamed from: h, reason: collision with root package name */
    public r45.bi0 f385757h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.si0)) {
            return false;
        }
        r45.si0 si0Var = (r45.si0) fVar;
        return n51.f.a(this.f385753d, si0Var.f385753d) && n51.f.a(this.f385754e, si0Var.f385754e) && n51.f.a(this.f385755f, si0Var.f385755f) && n51.f.a(this.f385756g, si0Var.f385756g) && n51.f.a(this.f385757h, si0Var.f385757h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385753d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385754e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.zz6 zz6Var = this.f385755f;
            if (zz6Var != null) {
                fVar.i(3, zz6Var.computeSize());
                this.f385755f.writeFields(fVar);
            }
            r45.zz6 zz6Var2 = this.f385756g;
            if (zz6Var2 != null) {
                fVar.i(4, zz6Var2.computeSize());
                this.f385756g.writeFields(fVar);
            }
            r45.bi0 bi0Var = this.f385757h;
            if (bi0Var != null) {
                fVar.i(5, bi0Var.computeSize());
                this.f385757h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f385753d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f385754e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.zz6 zz6Var3 = this.f385755f;
            if (zz6Var3 != null) {
                j17 += b36.f.i(3, zz6Var3.computeSize());
            }
            r45.zz6 zz6Var4 = this.f385756g;
            if (zz6Var4 != null) {
                j17 += b36.f.i(4, zz6Var4.computeSize());
            }
            r45.bi0 bi0Var2 = this.f385757h;
            return bi0Var2 != null ? j17 + b36.f.i(5, bi0Var2.computeSize()) : j17;
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
        r45.si0 si0Var = (r45.si0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            si0Var.f385753d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            si0Var.f385754e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.zz6 zz6Var5 = new r45.zz6();
                if (bArr != null && bArr.length > 0) {
                    zz6Var5.parseFrom(bArr);
                }
                si0Var.f385755f = zz6Var5;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.zz6 zz6Var6 = new r45.zz6();
                if (bArr2 != null && bArr2.length > 0) {
                    zz6Var6.parseFrom(bArr2);
                }
                si0Var.f385756g = zz6Var6;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.bi0 bi0Var3 = new r45.bi0();
            if (bArr3 != null && bArr3.length > 0) {
                bi0Var3.parseFrom(bArr3);
            }
            si0Var.f385757h = bi0Var3;
        }
        return 0;
    }
}
