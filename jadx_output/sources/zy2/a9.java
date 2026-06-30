package zy2;

/* loaded from: classes10.dex */
public interface a9 {
    static boolean h(zy2.a9 a9Var, ya2.b2 ct6, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceContactIngoreInteract");
        }
        boolean z18 = true;
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.storage.na0 na0Var = (com.tencent.mm.plugin.finder.storage.na0) a9Var;
        na0Var.getClass();
        kotlin.jvm.internal.o.g(ct6, "ct");
        if (z17) {
            ct6.field_updateTime = c01.id.c();
        }
        ya2.b2 y07 = na0Var.y0(ct6.D0());
        if (y07 == null) {
            long z07 = na0Var.z0(ct6);
            ct6.systemRowid = z07;
            if (z07 <= 0) {
                z18 = false;
            }
        } else {
            ct6.field_badgeInfoList = y07.field_badgeInfoList;
            ct6.field_interactionCount = y07.field_interactionCount;
            ct6.field_rewardTotalAmountInWecoin = y07.field_rewardTotalAmountInWecoin;
            z18 = na0Var.L0(ct6);
        }
        if (z18) {
            na0Var.D0(ct6);
            na0Var.doNotify("FinderMsgContactStorage", 4, ct6.D0());
        }
        return z18;
    }
}
