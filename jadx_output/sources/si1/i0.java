package si1;

/* loaded from: classes7.dex */
public interface i0 {
    default fl1.g2 i(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<this>");
        fl1.g2 authorizeDialogContainer = lVar.getAuthorizeDialogContainer();
        kotlin.jvm.internal.o.d(authorizeDialogContainer);
        return authorizeDialogContainer;
    }

    void p(com.tencent.mm.plugin.appbrand.jsapi.l lVar);

    void r(com.tencent.mm.plugin.appbrand.jsapi.l lVar);
}
