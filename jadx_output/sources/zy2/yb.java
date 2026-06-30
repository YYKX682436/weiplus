package zy2;

/* loaded from: classes2.dex */
public interface yb {
    default void a(java.lang.String source, java.lang.String username, boolean z17, boolean z18, boolean z19, ya2.b2 b2Var, java.lang.String highLightNotice) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(highLightNotice, "highLightNotice");
        ((com.tencent.mm.plugin.finder.profile.widget.s1) this).f(source, username, z17, z18, z19, b2Var, highLightNotice, "");
    }
}
