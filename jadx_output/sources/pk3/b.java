package pk3;

/* loaded from: classes8.dex */
public interface b extends pf5.g {
    default boolean M9(int i17) {
        return false;
    }

    default boolean Mb(com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(info, "info");
        return true;
    }

    pk3.a i0();

    default void p9(o75.c event) {
        kotlin.jvm.internal.o.g(event, "event");
    }
}
