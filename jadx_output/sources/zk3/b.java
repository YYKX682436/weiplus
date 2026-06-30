package zk3;

/* loaded from: classes8.dex */
public interface b {
    default java.lang.Object a() {
        return null;
    }

    default boolean b() {
        return true;
    }

    default boolean c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Di(context);
    }

    default boolean d() {
        return false;
    }

    default boolean e() {
        return false;
    }

    default int f() {
        return -1;
    }

    default void g(int i17, int i18) {
    }

    default void h(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskCallback", "multiTaskTabChanged, curIndex: %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.autogen.events.MultiTaskTabChangedEvent multiTaskTabChangedEvent = new com.tencent.mm.autogen.events.MultiTaskTabChangedEvent();
        multiTaskTabChangedEvent.f54507g.f6562a = i17;
        multiTaskTabChangedEvent.e();
    }
}
