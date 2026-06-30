package yj5;

/* loaded from: classes5.dex */
public final class a0 extends yj5.a {

    /* renamed from: f, reason: collision with root package name */
    public xj5.l f462704f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f462705g = new yj5.z(this);

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f454885g;
        return xj5.a.f454895t;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkerInfo, "talkerInfo");
        long c17 = c01.id.c();
        xj5.l lVar = this.f462704f;
        if (lVar != null) {
            long j17 = lVar.f454913x - c17;
            if (j17 > 0 && j17 < 5000) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(lVar);
                return linkedList;
            }
            this.f462704f = null;
        }
        return null;
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.a0(ui6, tipsBarContext, this);
    }
}
