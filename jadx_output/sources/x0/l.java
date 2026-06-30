package x0;

/* loaded from: classes14.dex */
public final class l {
    public l(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.Object a(yz5.l lVar, yz5.l lVar2, yz5.a block) {
        x0.m d1Var;
        kotlin.jvm.internal.o.g(block, "block");
        if (lVar == null && lVar2 == null) {
            return block.invoke();
        }
        x0.m mVar = (x0.m) x0.z.f450962a.a();
        if (mVar == null || (mVar instanceof x0.e)) {
            d1Var = new x0.d1(mVar instanceof x0.e ? (x0.e) mVar : null, lVar, lVar2, true);
        } else {
            if (lVar == null) {
                return block.invoke();
            }
            d1Var = mVar.r(lVar);
        }
        try {
            x0.m i17 = d1Var.i();
            try {
                return block.invoke();
            } finally {
                d1Var.o(i17);
            }
        } finally {
            d1Var.c();
        }
    }
}
