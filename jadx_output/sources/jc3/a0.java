package jc3;

/* loaded from: classes7.dex */
public interface a0 {
    com.tencent.mm.plugin.magicbrush.MBBuildConfig b0();

    default void h(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    default void n() {
    }

    default void onCreated() {
    }

    default void onDestroy() {
    }

    default void w(int i17) {
    }

    default void x0(jc3.b0 dispatcher) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
    }
}
