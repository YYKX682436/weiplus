package v02;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv02/d;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-dupcheck_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class d implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String string = data.getString("targetChatUsername");
        if (string == null) {
            return;
        }
        ((v02.f0) ((a00.j) i95.n0.c(a00.j.class))).uj(string);
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
        }
    }
}
