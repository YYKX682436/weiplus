package cp2;

/* loaded from: classes2.dex */
public final class b extends az2.o {

    /* renamed from: w, reason: collision with root package name */
    public static boolean f220774w;

    /* renamed from: x, reason: collision with root package name */
    public static r45.fd1 f220775x;

    /* renamed from: t, reason: collision with root package name */
    public final cp2.l f220776t;

    /* renamed from: u, reason: collision with root package name */
    public final cp2.a f220777u;

    /* renamed from: v, reason: collision with root package name */
    public cp2.g f220778v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(cp2.l r19, cp2.a r20, cp2.g r21, r45.qt2 r22) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp2.b.<init>(cp2.l, cp2.a, cp2.g, r45.qt2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0574 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x067c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x060e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0672 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ca A[SYNTHETIC] */
    @Override // az2.o, az2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(int r35, int r36, java.lang.String r37, com.tencent.mm.protobuf.f r38, com.tencent.mm.modelbase.m1 r39) {
        /*
            Method dump skipped, instructions count: 1921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp2.b.A(int, int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.modelbase.m1):void");
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        r45.fd1 resp = (r45.fd1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        r45.kv0 kv0Var;
        com.tencent.mm.protobuf.f fVar = this.f70646f.f70710a.f70684a;
        r45.ed1 ed1Var = fVar instanceof r45.ed1 ? (r45.ed1) fVar : null;
        if (ed1Var == null || (kv0Var = (r45.kv0) ed1Var.getCustom(1)) == null) {
            return 0L;
        }
        return kv0Var.getLong(5);
    }

    @Override // com.tencent.mm.modelbase.i, im5.a
    public void dead() {
        super.dead();
        this.f220778v = null;
    }
}
