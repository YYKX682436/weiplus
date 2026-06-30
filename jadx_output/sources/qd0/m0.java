package qd0;

/* loaded from: classes11.dex */
public class m0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd0.n0 f361547d;

    public m0(qd0.n0 n0Var) {
        this.f361547d = n0Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        java.lang.Object obj;
        int i17 = vVar.f351158c;
        qd0.n0 n0Var = this.f361547d;
        p13.u uVar = vVar.f351156a;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            if (uVar.f351141c.equals(n0Var.f361563n)) {
                n0Var.b();
                return;
            }
            return;
        }
        if (i17 == 0 && (obj = n0Var.f361562m) != null && obj.equals(obj)) {
            n0Var.f361565p = vVar.f351159d;
            java.util.List list = vVar.f351160e;
            int i18 = 0;
            if (n0Var.f361566q != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    p13.y yVar = (p13.y) list.get(size);
                    if (!n0Var.f361566q.contains(yVar.f351187e)) {
                        int i19 = yVar.f351184b;
                        if (i19 == 131072 || i19 == 131075 || i19 == 131076 || i19 == 2097171 || i19 == 2097173 || i19 == 131081) {
                        }
                    }
                    list.remove(size);
                }
            }
            rd0.b1 b1Var = n0Var.f361571v;
            if (b1Var != null) {
                b1Var.a(list);
            }
            int[] iArr = uVar.f351145g;
            if (iArr != null && iArr.length > 0) {
                i18 = iArr[0];
            }
            if (vVar.f351160e.size() > 0) {
                switch (i18) {
                    case 131072:
                    case 131081:
                        qd0.n0.a(n0Var, vVar.f351160e, i18);
                        break;
                    case 131075:
                        java.util.List list2 = vVar.f351160e;
                        if (n0Var.f361569t && !com.tencent.mm.sdk.platformtools.t8.L0(list2)) {
                            int size2 = list2.size();
                            int size3 = list2.size();
                            while (true) {
                                size3--;
                                if (size3 < 0) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSearchContactAdapter", "checkFilterAssociateChatRoom: originCount:%d, final count:%d", java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(list2.size()));
                                } else if (c01.e2.E(((p13.y) list2.get(size3)).f351187e)) {
                                    list2.remove(size3);
                                }
                            }
                        }
                        n0Var.f361560k = vVar.f351160e;
                        break;
                    case 131076:
                    case 2097171:
                    case 2097173:
                        n0Var.f361561l = vVar.f351160e;
                        break;
                    default:
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMSearchContactAdapter", "not support search");
                        break;
                }
            } else {
                switch (i18) {
                    case 131072:
                    case 131081:
                        qd0.n0.a(n0Var, null, i18);
                        break;
                    case 131075:
                        n0Var.f361560k = null;
                        break;
                    case 131076:
                    case 2097171:
                    case 2097173:
                        n0Var.f361561l = null;
                        break;
                }
            }
            n0Var.j(uVar.f351141c, n0Var.b(), true);
        }
    }
}
