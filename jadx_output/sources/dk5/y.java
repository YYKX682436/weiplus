package dk5;

@j95.b
/* loaded from: classes.dex */
public final class y extends i95.w implements n13.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f234998d = "MicroMsg.ForwardDialogFeatureService";

    public boolean Ai(android.content.Context context, co.a model, java.util.List usernameList, n13.t info) {
        ek5.b bVar;
        java.lang.Class f17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        kotlin.jvm.internal.o.g(info, "info");
        java.util.List list = ek5.g.f253690a;
        java.util.Iterator it = ek5.g.f253690a.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = (ek5.b) it.next();
            if (kotlin.jvm.internal.o.b(model.getClass(), bVar.h())) {
                break;
            }
        }
        com.tencent.mars.xlog.Log.i(this.f234998d, "showHalfScreenForwardView config:" + bVar);
        if (bVar == null || (f17 = bVar.f()) == null) {
            return false;
        }
        com.tencent.mm.ui.widget.dialog.i iVar = info.f334135c;
        n13.a0.V0.getClass();
        boolean z17 = !kotlin.jvm.internal.o.b(iVar, n13.y.f334141a);
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String i17 = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.i();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(usernameList, 10));
        java.util.Iterator it6 = usernameList.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            arrayList.add("{'RecieveType':" + com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.j(str, i17) + ";'ToUserId':" + str + ";'ToUserFrom':" + com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209299f + '}');
        }
        bundle.putString("ForwardParams_ReportForwardObjList", kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null));
        bundle.putInt("ForwardParams_ReportConfirmScreenFrom", 2);
        bundle.putInt("ForwardParams_ReportFromScene", info.f334138f.f334139a);
        bundle.putInt("ForwardParams_ForwardMsgType", 4);
        m50.x.f323511r.a(context, model, usernameList, f17, z17, bundle, info.f334135c, info.f334137e, new dk5.x(info));
        return true;
    }

    public boolean wi(android.content.Context context, co.a model, java.lang.String str, n13.t info) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(info, "info");
        if (str == null) {
            str = "";
        }
        return Ai(context, model, r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null), info);
    }
}
