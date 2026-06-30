package ud2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud2.o f426613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ud2.o oVar) {
        super(0);
        this.f426613d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        ud2.o oVar = this.f426613d;
        ud2.a aVar = oVar.f426635b;
        android.content.Context context = aVar.f426576d;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = oVar.f426637d;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = finderItem != null ? finderItem.getFinderObject() : null;
        java.lang.String str2 = oVar.f426636c;
        if (finderObject == null) {
            com.tencent.mars.xlog.Log.e(str2, "try enter live when finder object is null");
        } else {
            long id6 = finderObject.getId();
            java.lang.String objectNonceId = finderObject.getObjectNonceId();
            r45.nw1 liveInfo = finderObject.getLiveInfo();
            long j17 = liveInfo != null ? liveInfo.getLong(0) : 0L;
            com.tencent.mars.xlog.Log.i(str2, "enter live with feedId:" + pm0.v.u(id6) + ", nonceId:" + objectNonceId + ", contextId:" + context);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_enter_live_param_visitor_enter_scene", 1);
            intent.putExtra("LAUNCH_WITH_ANIM", true);
            r45.m84 m84Var = new r45.m84();
            m84Var.set(0, java.lang.Long.valueOf(id6));
            m84Var.set(1, java.lang.Long.valueOf(j17));
            m84Var.set(2, objectNonceId);
            m84Var.set(3, aVar.f426578f);
            m84Var.set(4, finderObject.getSessionBuffer());
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
            if (objectDesc == null || (str = objectDesc.getDescription()) == null) {
                str = "";
            }
            m84Var.set(5, str);
            m84Var.set(6, null);
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, "");
            wk0Var.set(1, "");
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((vd2.f1) e0Var).Ri(context2, intent, m84Var, true, wk0Var, null);
        }
        return jz5.f0.f302826a;
    }
}
