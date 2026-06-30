package pr;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpr/d1;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class d1 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle != null) {
            if (bundle.getInt("custom_type") == 1) {
                pr.k0.f357723q.a(false).e();
            } else {
                pr.k0.f357723q.b(false).e();
            }
        }
        return bundle2;
    }
}
