package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class y9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f196384d;

    /* renamed from: e, reason: collision with root package name */
    public long f196385e;

    /* renamed from: f, reason: collision with root package name */
    public long f196386f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f196387g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.storage.y9)) {
            return false;
        }
        com.tencent.mm.storage.y9 y9Var = (com.tencent.mm.storage.y9) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f196384d), java.lang.Long.valueOf(y9Var.f196384d)) && n51.f.a(java.lang.Long.valueOf(this.f196385e), java.lang.Long.valueOf(y9Var.f196385e)) && n51.f.a(java.lang.Long.valueOf(this.f196386f), java.lang.Long.valueOf(y9Var.f196386f)) && n51.f.a(this.f196387g, y9Var.f196387g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f196384d);
            fVar.h(2, this.f196385e);
            fVar.h(3, this.f196386f);
            java.lang.String str = this.f196387g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f196384d) + 0 + b36.f.h(2, this.f196385e) + b36.f.h(3, this.f196386f);
            java.lang.String str2 = this.f196387g;
            return str2 != null ? h17 + b36.f.j(4, str2) : h17;
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
        com.tencent.mm.storage.y9 y9Var = (com.tencent.mm.storage.y9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y9Var.f196384d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            y9Var.f196385e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            y9Var.f196386f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        y9Var.f196387g = aVar2.k(intValue);
        return 0;
    }
}
