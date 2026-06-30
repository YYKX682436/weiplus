package r45;

/* loaded from: classes2.dex */
public class wi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.db7 f389191d;

    /* renamed from: e, reason: collision with root package name */
    public long f389192e;

    /* renamed from: f, reason: collision with root package name */
    public long f389193f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389194g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wi0)) {
            return false;
        }
        r45.wi0 wi0Var = (r45.wi0) fVar;
        return n51.f.a(this.f389191d, wi0Var.f389191d) && n51.f.a(java.lang.Long.valueOf(this.f389192e), java.lang.Long.valueOf(wi0Var.f389192e)) && n51.f.a(java.lang.Long.valueOf(this.f389193f), java.lang.Long.valueOf(wi0Var.f389193f)) && n51.f.a(this.f389194g, wi0Var.f389194g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.db7 db7Var = this.f389191d;
            if (db7Var != null) {
                fVar.i(1, db7Var.computeSize());
                this.f389191d.writeFields(fVar);
            }
            fVar.h(2, this.f389192e);
            fVar.h(3, this.f389193f);
            java.lang.String str = this.f389194g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.db7 db7Var2 = this.f389191d;
            int i18 = (db7Var2 != null ? 0 + b36.f.i(1, db7Var2.computeSize()) : 0) + b36.f.h(2, this.f389192e) + b36.f.h(3, this.f389193f);
            java.lang.String str2 = this.f389194g;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.wi0 wi0Var = (r45.wi0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                wi0Var.f389192e = aVar2.i(intValue);
                return 0;
            }
            if (intValue == 3) {
                wi0Var.f389193f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            wi0Var.f389194g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.db7 db7Var3 = new r45.db7();
            if (bArr != null && bArr.length > 0) {
                db7Var3.parseFrom(bArr);
            }
            wi0Var.f389191d = db7Var3;
        }
        return 0;
    }
}
