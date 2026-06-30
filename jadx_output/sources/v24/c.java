package v24;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final v24.c f432903a = new v24.c();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f432904b;

    public final boolean a() {
        java.lang.Boolean bool = f432904b;
        if (bool != null) {
            return bool.booleanValue();
        }
        android.database.Cursor B = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().B(1, new java.util.ArrayList(), "*", true);
        kotlin.jvm.internal.o.f(B, "getNecessaryCursorWithConversation(...)");
        while (B.moveToNext()) {
            com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
            l4Var.convertFrom(B);
            if (l4Var.w0() > c01.id.c()) {
                B.close();
                ot5.g.c("MicroMsg.ChatMsgTimeFixer", "[getWrongConversation] collect wrong conversation: " + l4Var.h1() + ' ' + l4Var.w0());
                f432904b = java.lang.Boolean.TRUE;
                return true;
            }
        }
        B.close();
        f432904b = java.lang.Boolean.FALSE;
        return false;
    }
}
