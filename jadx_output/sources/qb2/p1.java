package qb2;

/* loaded from: classes8.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(java.lang.String str) {
        super(1);
        this.f361268d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        qb2.z0 it = (qb2.z0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.Map map = it.f361319b;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.content.task_id");
        if (str == null) {
            str = "";
        }
        boolean z17 = false;
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.content.action_type"), 0);
        if (kotlin.jvm.internal.o.b(str, this.f361268d) && D1 == 1) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
