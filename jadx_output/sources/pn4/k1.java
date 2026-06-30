package pn4;

/* loaded from: classes4.dex */
public final class k1 extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public static int f357138d;

    public final void N6(int i17, java.lang.String targetLan, java.lang.String chatRoomId, java.lang.String prefixContent, int i18, java.lang.String textMsg) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        kotlin.jvm.internal.o.g(targetLan, "targetLan");
        kotlin.jvm.internal.o.g(chatRoomId, "chatRoomId");
        kotlin.jvm.internal.o.g(prefixContent, "prefixContent");
        kotlin.jvm.internal.o.g(textMsg, "textMsg");
        if ((textMsg.length() == 0) || (lifecycleScope = gm0.j1.b().f273245h.f273145e) == null) {
            return;
        }
        v65.i.b(lifecycleScope, null, new pn4.j1(targetLan, chatRoomId, i17, prefixContent, i18, textMsg, this, null), 1, null);
    }
}
