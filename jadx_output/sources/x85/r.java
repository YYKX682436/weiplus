package x85;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lx85/r;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-sticker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class r implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        new x85.b(data.getInt("type"), data.getByteArray("page_buff"), data.getByteArray("ctx_buff")).l().H(new x85.l(new x85.q(rVar)));
    }
}
