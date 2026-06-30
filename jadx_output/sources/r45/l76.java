package r45;

/* loaded from: classes4.dex */
public class l76 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f379203d;

    /* renamed from: e, reason: collision with root package name */
    public long f379204e;

    /* renamed from: f, reason: collision with root package name */
    public r45.k76 f379205f;

    /* renamed from: g, reason: collision with root package name */
    public r45.k76 f379206g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379207h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l76)) {
            return false;
        }
        r45.l76 l76Var = (r45.l76) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f379203d), java.lang.Long.valueOf(l76Var.f379203d)) && n51.f.a(java.lang.Long.valueOf(this.f379204e), java.lang.Long.valueOf(l76Var.f379204e)) && n51.f.a(this.f379205f, l76Var.f379205f) && n51.f.a(this.f379206g, l76Var.f379206g) && n51.f.a(this.f379207h, l76Var.f379207h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f379203d);
            fVar.h(2, this.f379204e);
            r45.k76 k76Var = this.f379205f;
            if (k76Var != null) {
                fVar.i(3, k76Var.computeSize());
                this.f379205f.writeFields(fVar);
            }
            r45.k76 k76Var2 = this.f379206g;
            if (k76Var2 != null) {
                fVar.i(4, k76Var2.computeSize());
                this.f379206g.writeFields(fVar);
            }
            java.lang.String str = this.f379207h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f379203d) + 0 + b36.f.h(2, this.f379204e);
            r45.k76 k76Var3 = this.f379205f;
            if (k76Var3 != null) {
                h17 += b36.f.i(3, k76Var3.computeSize());
            }
            r45.k76 k76Var4 = this.f379206g;
            if (k76Var4 != null) {
                h17 += b36.f.i(4, k76Var4.computeSize());
            }
            java.lang.String str2 = this.f379207h;
            return str2 != null ? h17 + b36.f.j(5, str2) : h17;
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
        r45.l76 l76Var = (r45.l76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l76Var.f379203d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            l76Var.f379204e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.k76 k76Var5 = new r45.k76();
                if (bArr != null && bArr.length > 0) {
                    k76Var5.parseFrom(bArr);
                }
                l76Var.f379205f = k76Var5;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            l76Var.f379207h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.k76 k76Var6 = new r45.k76();
            if (bArr2 != null && bArr2.length > 0) {
                k76Var6.parseFrom(bArr2);
            }
            l76Var.f379206g = k76Var6;
        }
        return 0;
    }
}
