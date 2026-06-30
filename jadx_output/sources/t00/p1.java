package t00;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt00/p1;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCSelectConvParams;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class p1 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c01.z1.r());
        sb6.append(",");
        java.util.Iterator it = c01.e2.i().iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            sb6.append(",");
        }
        return new com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSelectConvParams(sb6.toString());
    }
}
