package vh0;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvh0/w2;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "(Ljava/lang/String;)V", "feature-yuanbao_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class w2 implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436993d;

    public w2(java.lang.String chatbotUsername) {
        kotlin.jvm.internal.o.g(chatbotUsername, "$chatbotUsername");
        this.f436993d = chatbotUsername;
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String string = data.getString("chatbotUsername");
        kotlin.jvm.internal.o.d(string);
        vh0.f3.hj(this.f436993d, string, data.getInt("cmd"));
    }
}
