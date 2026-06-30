package r45;

/* loaded from: classes8.dex */
public class y70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f390833d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390834e;

    /* renamed from: f, reason: collision with root package name */
    public int f390835f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f390836g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f390837h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y70)) {
            return false;
        }
        r45.y70 y70Var = (r45.y70) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f390833d), java.lang.Long.valueOf(y70Var.f390833d)) && n51.f.a(this.f390834e, y70Var.f390834e) && n51.f.a(java.lang.Integer.valueOf(this.f390835f), java.lang.Integer.valueOf(y70Var.f390835f)) && n51.f.a(this.f390836g, y70Var.f390836g) && n51.f.a(java.lang.Boolean.valueOf(this.f390837h), java.lang.Boolean.valueOf(y70Var.f390837h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390836g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f390833d);
            java.lang.String str = this.f390834e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f390835f);
            fVar.g(4, 8, linkedList);
            fVar.a(5, this.f390837h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f390833d) + 0;
            java.lang.String str2 = this.f390834e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.e(3, this.f390835f) + b36.f.g(4, 8, linkedList) + b36.f.a(5, this.f390837h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.y70 y70Var = (r45.y70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y70Var.f390833d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            y70Var.f390834e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            y70Var.f390835f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            y70Var.f390837h = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.x70 x70Var = new r45.x70();
            if (bArr2 != null && bArr2.length > 0) {
                x70Var.parseFrom(bArr2);
            }
            y70Var.f390836g.add(x70Var);
        }
        return 0;
    }
}
