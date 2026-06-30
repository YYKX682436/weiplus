package sp2;

/* loaded from: classes2.dex */
public interface k {
    default java.util.List a() {
        return kz5.p0.f313996d;
    }

    default com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView b() {
        return null;
    }

    default void c(android.os.Bundle chnlExtraBundle, so2.j5 j5Var) {
        kotlin.jvm.internal.o.g(chnlExtraBundle, "chnlExtraBundle");
    }

    default void d(vp2.s data) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    int e();

    com.tencent.mm.protobuf.g f();

    default r45.dk2 g() {
        return null;
    }

    void h(int i17, com.tencent.mm.protobuf.g gVar, int i18, yz5.l lVar);

    default boolean i() {
        return false;
    }

    default void j(boolean z17) {
    }

    default boolean k() {
        return false;
    }

    default void l(so2.j5 feed, int i17, org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
    }

    r45.h81 m();

    default void n(dk2.ic option, int i17, vp2.h0 item) {
        kotlin.jvm.internal.o.g(option, "option");
        kotlin.jvm.internal.o.g(item, "item");
    }

    default void o(so2.j5 item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
    }

    default void p(vp2.s data) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    default org.json.JSONObject q(android.view.View view, int i17, so2.j5 feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        return new org.json.JSONObject();
    }
}
