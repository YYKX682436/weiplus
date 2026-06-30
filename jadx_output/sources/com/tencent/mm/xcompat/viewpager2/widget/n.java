package com.tencent.mm.xcompat.viewpager2.widget;

/* loaded from: classes15.dex */
public class n extends com.tencent.mm.xcompat.recyclerview.widget.e0 {
    public final /* synthetic */ com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2, android.content.Context context) {
        super(context);
        this.A = viewPager2;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.e0
    public void E(com.tencent.mm.xcompat.recyclerview.widget.u1 u1Var, int[] iArr) {
        int i17;
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = this.A;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit != -1) {
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
            return;
        }
        int j17 = u1Var.f214646a != -1 ? this.f214495p.j() : 0;
        if (this.f214494o.f214479f == -1) {
            i17 = 0;
        } else {
            i17 = j17;
            j17 = 0;
        }
        iArr[0] = j17;
        iArr[1] = i17;
    }
}
