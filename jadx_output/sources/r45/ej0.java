package r45;

/* loaded from: classes8.dex */
public class ej0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f373564d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f373565e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f373566f;

    /* renamed from: g, reason: collision with root package name */
    public int f373567g;

    /* renamed from: h, reason: collision with root package name */
    public int f373568h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f373569i;

    static {
        new r45.ej0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ej0)) {
            return false;
        }
        r45.ej0 ej0Var = (r45.ej0) fVar;
        return n51.f.a(this.f373564d, ej0Var.f373564d) && n51.f.a(java.lang.Integer.valueOf(this.f373565e), java.lang.Integer.valueOf(ej0Var.f373565e)) && n51.f.a(java.lang.Boolean.valueOf(this.f373566f), java.lang.Boolean.valueOf(ej0Var.f373566f)) && n51.f.a(java.lang.Integer.valueOf(this.f373567g), java.lang.Integer.valueOf(ej0Var.f373567g)) && n51.f.a(java.lang.Integer.valueOf(this.f373568h), java.lang.Integer.valueOf(ej0Var.f373568h)) && n51.f.a(java.lang.Boolean.valueOf(this.f373569i), java.lang.Boolean.valueOf(ej0Var.f373569i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.ej0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373564d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f373565e);
            fVar.a(3, this.f373566f);
            fVar.e(4, this.f373567g);
            fVar.e(5, this.f373568h);
            fVar.a(6, this.f373569i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f373565e) + b36.f.a(3, this.f373566f) + b36.f.e(4, this.f373567g) + b36.f.e(5, this.f373568h) + b36.f.a(6, this.f373569i);
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.vt6 vt6Var = new r45.vt6();
                    if (bArr != null && bArr.length > 0) {
                        vt6Var.parseFrom(bArr);
                    }
                    linkedList.add(vt6Var);
                }
                return 0;
            case 2:
                this.f373565e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f373566f = aVar2.c(intValue);
                return 0;
            case 4:
                this.f373567g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f373568h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f373569i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.ej0) super.parseFrom(bArr);
    }
}
