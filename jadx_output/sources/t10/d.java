package t10;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f414552a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f414553b = "";

    /* renamed from: c, reason: collision with root package name */
    public bw5.x7 f414554c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f414555d;

    public final bw5.n8 a(bw5.o8 ret) {
        kotlin.jvm.internal.o.g(ret, "ret");
        bw5.n8 n8Var = new bw5.n8();
        n8Var.f30539f = ret.f31012d;
        boolean[] zArr = n8Var.f30544n;
        zArr[3] = true;
        n8Var.f30537d = bw5.k8.EcsOpenPlatform_Native;
        zArr[1] = true;
        n8Var.f30538e = this.f414552a;
        zArr[2] = true;
        return n8Var;
    }

    public final void b(bw5.n8 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        if (this.f414555d == null) {
            com.tencent.mars.xlog.Log.e("ECS_O.callback", "callback 可能被执行多次, name: " + this.f414552a + ", type: " + this.f414553b + ", jumpInfo: " + this.f414554c);
            return;
        }
        if (resp.f30539f == -1) {
            com.tencent.mars.xlog.Log.e("ECS_O.callback", "callback failed, name: " + this.f414552a + ", type: " + this.f414553b + ", jumpInfo: " + this.f414554c + ", errMsg: " + resp.getErrMsg());
        } else {
            com.tencent.mars.xlog.Log.i("ECS_O.callback", "callback success, name: " + this.f414552a + ", type: " + this.f414553b + ", jumpInfo: " + this.f414554c);
        }
        yz5.l lVar = this.f414555d;
        if (lVar != null) {
            lVar.invoke(resp);
        }
        this.f414555d = null;
    }

    public final void c(java.lang.String str) {
        bw5.n8 a17 = a(bw5.o8.EcsOpenRespRet_Fail);
        a17.f30540g = str;
        a17.f30544n[4] = true;
        b(a17);
    }

    public final void d(yz5.l lVar) {
        bw5.n8 a17 = a(bw5.o8.EcsOpenRespRet_Success);
        if (lVar != null) {
            lVar.invoke(a17);
        }
        b(a17);
    }
}
