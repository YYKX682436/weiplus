package ie3;

/* loaded from: classes7.dex */
public abstract class j extends ea5.l {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        jc3.u0 u0Var = jc3.u0.f298996a;
        if (((java.util.ArrayList) jc3.u0.f299000e).contains(resource.getName())) {
            he3.e eVar = (he3.e) ((ie3.i) i95.n0.c(ie3.i.class));
            eVar.getClass();
            jc3.w0 w0Var = jc3.w0.f299010a;
            java.lang.String d17 = resource.d();
            kotlin.jvm.internal.o.f(d17, "getProjectId(...)");
            java.lang.String str = (java.lang.String) jc3.u0.f299007l.get(d17);
            if (str != null) {
                d17 = str;
            }
            long j18 = resource.f217590e;
            java.lang.String path = resource.getPath();
            kotlin.jvm.internal.o.d(path);
            eVar.oj(d17, (int) j18, path);
        }
    }
}
