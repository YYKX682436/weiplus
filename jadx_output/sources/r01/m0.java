package r01;

/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f368153a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.b f368154b;

    public m0(java.lang.String curBiz, com.tencent.wechat.mm.biz.b bVar, int i17, kotlin.jvm.internal.i iVar) {
        curBiz = (i17 & 1) != 0 ? "" : curBiz;
        bVar = (i17 & 2) != 0 ? null : bVar;
        kotlin.jvm.internal.o.g(curBiz, "curBiz");
        this.f368153a = curBiz;
        this.f368154b = bVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01.m0)) {
            return false;
        }
        r01.m0 m0Var = (r01.m0) obj;
        return kotlin.jvm.internal.o.b(this.f368153a, m0Var.f368153a) && kotlin.jvm.internal.o.b(this.f368154b, m0Var.f368154b);
    }

    public int hashCode() {
        int hashCode = this.f368153a.hashCode() * 31;
        com.tencent.wechat.mm.biz.b bVar = this.f368154b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public java.lang.String toString() {
        return "AccountCache(curBiz=" + this.f368153a + ", acctResp=" + this.f368154b + ')';
    }
}
