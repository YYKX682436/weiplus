package vh0;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvh0/z1;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Landroid/os/Bundle;", "<init>", "()V", "feature-yuanbao_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class z1 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString data = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.util.List Ai = ((vh0.f2) ((vh0.d1) i95.n0.c(vh0.d1.class))).Ai(data.f68406d);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.setClassLoader(vh0.z1.class.getClassLoader());
        bundle.putParcelableArrayList("agreements", new java.util.ArrayList<>(Ai));
        return bundle;
    }
}
