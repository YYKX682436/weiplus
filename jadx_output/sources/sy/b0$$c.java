package sy;

/* loaded from: classes5.dex */
public final /* synthetic */ class b0$$c implements java.util.function.BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str) == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.L().putLong("plugin_msg_report_unread_" + str + gm0.j1.b().j(), r5.d1());
    }
}
